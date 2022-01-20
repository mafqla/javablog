package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * websocket消息
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebsocketMessageDTO {

    /**
     * 类型
     */
    private Integer type;

    /**
     * 数据
     */
    private Object data;

}
