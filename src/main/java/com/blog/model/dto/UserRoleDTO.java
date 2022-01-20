package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色选项
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDTO {

    /**
     * 角色id
     */
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

}
