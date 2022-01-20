package com.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (UserAuth)表控制层
 *
 * @author fuqianlin
 * @since 2022-01-16 19:19:51
 */
@Api(tags = "(UserAuth)") 
@Validated
@RestController
@RequestMapping("userAuth")
public class UserAuthController {

}
