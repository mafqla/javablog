package com.blog.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 照片(Photo)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value ="photo")
public class Photo  {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 相册id
     */
    private Integer albumId;
    /**
     * 照片名
     */
    private String photoName;
    /**
     * 照片描述
     */
    private String photoDesc;
    /**
     * 照片地址
     */
    private String photoSrc;
    /**
     * 是否删除
     */
    private Integer isDelete;
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

