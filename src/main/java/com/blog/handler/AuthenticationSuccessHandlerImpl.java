package com.blog.handler;

import com.alibaba.fastjson.JSON;
import com.blog.dao.UserAuthMapper;
import com.blog.entity.UserAuth;
import com.blog.model.dto.UserInfoDTO;
import com.blog.model.vo.Result;
import com.blog.util.BeanCopyUtils;
import com.blog.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 登录成功处理
 *
 * @author fuqianlin
 * @date 2022-1-20
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Autowired
    private UserAuthMapper userAuthDao;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        // 返回登录信息
        UserInfoDTO userLoginDTO = BeanCopyUtils.copyObject(UserUtils.getLoginUser(), UserInfoDTO.class);
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.ok(userLoginDTO)));
        // 更新用户ip，最近登录时间
        updateUserInfo();
    }

    /**
     * 更新用户信息
     */
    @Async
    public void updateUserInfo() {
        UserAuth userAuth = UserAuth.builder()
                .id(UserUtils.getLoginUser().getId())
                .ipAddress(UserUtils.getLoginUser().getIpAddress())
                .ipSource(UserUtils.getLoginUser().getIpSource())
                .lastLoginTime(UserUtils.getLoginUser().getLastLoginTime())
                .build();
        userAuthDao.updateById(userAuth);
    }

}
