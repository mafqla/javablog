package com.blog.entity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 页面(Page)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value ="page")
public class Page  {
    /**
     * 页面id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 页面名
     */
    private String pageName;
    /**
     * 页面标签
     */
    private String pageLabel;
    /**
     * 页面封面
     */
    private String pageCover;
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

