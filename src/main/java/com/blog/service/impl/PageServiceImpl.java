package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.PageDao;
import com.blog.entity.Page;
import com.blog.service.PageService;
import org.springframework.stereotype.Service;

/**
 * 页面(Page)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("pageService")
public class PageServiceImpl extends ServiceImpl<PageDao, Page> implements PageService {

}

