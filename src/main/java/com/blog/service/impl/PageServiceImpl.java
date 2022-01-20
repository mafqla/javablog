package com.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.PageMapper;
import com.blog.entity.Page;
import com.blog.model.vo.PageVO;
import com.blog.service.PageService;
import com.blog.service.RedisService;
import com.blog.util.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

import static com.blog.constant.RedisPrefixConst.PAGE_COVER;

/**
 * 页面服务
 *
 * @author fuqianlin
 * @date 2022-01-20
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private PageMapper pageMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveOrUpdatePage(PageVO pageVO) {
        Page page = BeanCopyUtils.copyObject(pageVO, Page.class);
        this.saveOrUpdate(page);
        // 删除缓存
        redisService.del(PAGE_COVER);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deletePage(Integer pageId) {
        pageMapper.deleteById(pageId);
        // 删除缓存
        redisService.del(PAGE_COVER);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<PageVO> listPages() {
        List<PageVO> pageVOList;
        // 查找缓存信息，不存在则从mysql读取，更新缓存
        Object pageList = redisService.get(PAGE_COVER);
        if (Objects.nonNull(pageList)) {
            pageVOList = JSON.parseObject(pageList.toString(), List.class);
        } else {
            pageVOList = BeanCopyUtils.copyList(pageMapper.selectList(null), PageVO.class);
            redisService.set(PAGE_COVER, JSON.toJSONString(pageVOList));
        }
        return pageVOList;
    }

}




