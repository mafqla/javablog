package com.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * (Comment)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("comment")
public class Comment{
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 评论用户Id
     */
    private Integer userId;
    /**
     * 评论文章id
     */
    private Integer articleId;
    /**
     * 评论内容
     */
    private String commentContent;
    /**
     * 回复用户id
     */
    private Integer replyUserId;
    /**
     * 父评论id
     */
    private Integer parentId;
    /**
     * 是否删除  0否 1是
     */
    private Integer isDelete;
    /**
     * 是否审核
     */
    private Integer isReview;
    /**
     * 评论时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}

