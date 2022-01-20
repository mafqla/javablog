package com.blog.strategy;

import com.blog.model.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @author fuqianlin
 * @date 2022-1-20
 */
public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);

}
