package com.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 页面(Page)表控制层
 *
 * @author fuqianlin
 * @since 2022-01-16 19:19:41
 */
@Api(tags = "页面(Page)") 
@Validated
@RestController
@RequestMapping("page")
public class PageController {


}
