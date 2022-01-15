package com.blog.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;


/**
 * (FriendLink)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("friend_link")
public class FriendLink{

    private Integer id;
    /**
     * 链接名
     */
    private String linkName;
    /**
     * 链接头像
     */
    private String linkAvatar;
    /**
     * 链接地址
     */
    private String linkAddress;
    /**
     * 链接介绍
     */
    private String linkIntro;
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

