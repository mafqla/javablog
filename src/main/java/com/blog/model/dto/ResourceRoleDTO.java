package com.blog.model.dto;

import lombok.Data;

import java.util.List;

/**
 * 资源角色
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
public class ResourceRoleDTO {

    /**
     * 资源id
     */
    private Integer id;

    /**
     * 路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 角色名
     */
    private List<String> roleList;

}
