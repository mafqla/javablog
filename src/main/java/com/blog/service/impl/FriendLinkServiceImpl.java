package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.FriendLinkDao;
import com.blog.entity.FriendLink;
import com.blog.service.FriendLinkService;
import org.springframework.stereotype.Service;

/**
 * (FriendLink)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:16
 */
@Service("friendLinkService")
public class FriendLinkServiceImpl extends ServiceImpl<FriendLinkDao, FriendLink> implements FriendLinkService {

}

