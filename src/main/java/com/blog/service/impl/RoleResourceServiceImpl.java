package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.RoleResourceDao;
import com.blog.entity.RoleResource;
import com.blog.service.RoleResourceService;
import org.springframework.stereotype.Service;

/**
 * (RoleResource)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("roleResourceService")
public class RoleResourceServiceImpl extends ServiceImpl<RoleResourceDao, RoleResource> implements RoleResourceService {

}

