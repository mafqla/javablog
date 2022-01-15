package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.ResourceDao;
import com.blog.entity.Resource;
import com.blog.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * (Resource)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, Resource> implements ResourceService {

}

