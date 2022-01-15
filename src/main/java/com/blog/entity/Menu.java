package com.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
/**
 * (Menu)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("menu")
public class Menu {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 菜单名
     */
    private String name;
    /**
     * 菜单路径
     */
    private String path;
    /**
     * 组件
     */
    private String component;
    /**
     * 菜单icon
     */
    private String icon;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 父id
     */
    private Integer parentId;
    /**
     * 是否隐藏  0否1是
     */
    private Integer isHidden;
}