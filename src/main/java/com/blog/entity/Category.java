package com.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * (Category)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("category")
public class Category  {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 分类名
     */
    private String categoryName;
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


}

