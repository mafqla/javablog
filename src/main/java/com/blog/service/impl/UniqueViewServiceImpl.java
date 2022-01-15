package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.UniqueViewDao;
import com.blog.entity.UniqueView;
import com.blog.service.UniqueViewService;
import org.springframework.stereotype.Service;

/**
 * (UniqueView)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("uniqueViewService")
public class UniqueViewServiceImpl extends ServiceImpl<UniqueViewDao, UniqueView> implements UniqueViewService {

}

