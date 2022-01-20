package com.blog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 访问量
 *
 * @author fuqianlin
 * @since 2022-01-15 22:03:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UniqueViewDTO {

    /**
     * 日期
     */
    private String day;

    /**
     * 访问量
     */
    private Integer viewsCount;

}
