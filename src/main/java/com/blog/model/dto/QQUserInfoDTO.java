package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * qq用户信息dto
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QQUserInfoDTO {

    /**
     * 昵称
     */
    private String nickname;

    /**
     * qq头像
     */
    private String figureurl_qq_1;


}
