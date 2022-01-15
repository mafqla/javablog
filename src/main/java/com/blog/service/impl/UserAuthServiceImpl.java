package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.UserAuthDao;
import com.blog.entity.UserAuth;
import com.blog.service.UserAuthService;
import org.springframework.stereotype.Service;

/**
 * (UserAuth)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:18
 */
@Service("userAuthService")
public class UserAuthServiceImpl extends ServiceImpl<UserAuthDao, UserAuth> implements UserAuthService {

}

