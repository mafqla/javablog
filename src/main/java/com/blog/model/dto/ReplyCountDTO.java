package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 回复数量
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyCountDTO {

    /**
     * 评论id
     */
    private Integer commentId;

    /**
     * 回复数量
     */
    private Integer replyCount;

}
