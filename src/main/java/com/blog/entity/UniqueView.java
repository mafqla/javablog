package com.blog.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (UniqueView)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("unique_view")
public class UniqueView  {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 访问量
     */
    private Integer viewsCount;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}

