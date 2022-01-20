package com.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ArticleTag)表控制层
 *
 * @author fuqianlin
 * @since 2022-01-16 19:19:28
 */
@Api(tags = "(ArticleTag)") 
@Validated
@RestController
@RequestMapping("articleTag")
public class ArticleTagController {


}
