package com.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 文章状态枚举
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:06
 */
@Getter
@AllArgsConstructor
public enum ArticleStatusEnum {
    /**
     * 公开
     */
    PUBLIC(1, "公开"),
    /**
     * 私密
     */
    SECRET(2, "私密"),
    /**
     * 草稿
     */
    DRAFT(3, "草稿");

    /**
     * 状态
     */
    private final Integer status;

    /**
     * 描述
     */
    private final String desc;

}
