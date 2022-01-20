package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.entity.FriendLink;
import com.blog.model.dto.FriendLinkBackDTO;
import com.blog.model.dto.FriendLinkDTO;
import com.blog.model.vo.ConditionVO;
import com.blog.model.vo.FriendLinkVO;
import com.blog.model.vo.PageResult;

import java.util.List;

/**
 * 友链服务
 *
 * @author fuqianlin
 * @date 2022-01-20
 */
public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
