package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * 博客后台信息
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogBackInfoDTO {
    /**
     * 访问量
     */
    private Integer viewsCount;

    /**
     * 留言量
     */
    private Integer messageCount;

    /**
     * 用户量
     */
    private Integer userCount;

    /**
     * 文章量
     */
    private Integer articleCount;

    /**
     * 分类统计
     */
    private List<com.blog.model.dto.CategoryDTO> categoryDTOList;

    /**
     * 标签列表
     */
    private List<com.blog.model.dto.TagDTO> tagDTOList;

    /**
     * 文章统计列表
     */
    private List<com.blog.model.dto.ArticleStatisticsDTO> articleStatisticsList;

    /**
     * 一周用户量集合
     */
    private List<UniqueViewDTO> uniqueViewDTOList;

    /**
     * 文章浏览量排行
     */
    private List<com.blog.model.dto.ArticleRankDTO> articleRankDTOList;

}
