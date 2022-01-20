package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文章上下篇
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticlePaginationDTO {

    /**
     * id
     */
    private Integer id;

    /**
     * 文章缩略图
     */
    private String articleCover;

    /**
     * 标题
     */
    private String articleTitle;

}
