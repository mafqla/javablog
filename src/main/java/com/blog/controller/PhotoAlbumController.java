package com.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相册(PhotoAlbum)表控制层
 *
 * @author fuqianlin
 * @since 2022-01-16 19:19:43
 */
@Api(tags = "相册(PhotoAlbum)") 
@Validated
@RestController
@RequestMapping("photoAlbum")
public class PhotoAlbumController {

}
