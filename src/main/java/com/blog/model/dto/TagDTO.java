package com.blog.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 标签
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagDTO {

    /**
     * id
     */
    private Integer id;

    /**
     * 标签名
     */
    private String tagName;

}
