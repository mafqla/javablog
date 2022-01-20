package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 邮件
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {

    /**
     * 邮箱号
     */
    private String email;

    /**
     * 主题
     */
    private String subject;

    /**
     * 内容
     */
    private String content;

}
