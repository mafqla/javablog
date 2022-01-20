package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.ArticleTagMapper;
import com.blog.entity.ArticleTag;
import com.blog.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 * @author fuqianlin
 * @date 2022-01-20
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}
