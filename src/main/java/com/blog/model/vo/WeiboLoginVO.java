package com.blog.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 微博登录
 *
 * @author fuqianlin
 * @date 2022-1-17
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeiboLoginVO {

    /**
     * code
     */
    @NotBlank(message = "code不能为空")
    @ApiModelProperty(name = "openId", value = "qq openId", required = true, dataType = "String")
    private String code;

}
