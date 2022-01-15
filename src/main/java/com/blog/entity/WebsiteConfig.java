package com.blog.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (WebsiteConfig)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value = "website_config")
public class WebsiteConfig  {

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 配置信息
     */
    private String config;
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

