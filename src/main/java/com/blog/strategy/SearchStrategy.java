package com.blog.strategy;

import com.blog.model.dto.ArticleSearchDTO;

import java.util.List;

/**
 * 搜索策略
 *
 * @author fuqianlin
 * @date 2022-1-20
 */
public interface SearchStrategy {

    /**
     * 搜索文章
     *
     * @param keywords 关键字
     * @return {@link List<ArticleSearchDTO>} 文章列表
     */
    List<ArticleSearchDTO> searchArticle(String keywords);

}
