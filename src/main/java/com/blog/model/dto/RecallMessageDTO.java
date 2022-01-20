package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 撤回消息dto
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecallMessageDTO {

    /**
     * 消息id
     */
    private Integer id;

    /**
     * 是否为语音
     */
    private Boolean isVoice;

}
