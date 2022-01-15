package com.blog.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (OperationLog)表实体类
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("operation_log")
public class OperationLog  {
    /**
     * 日志id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 操作模块
     */
    private String optModule;
    /**
     * 操作类型
     */
    private String optType;
    /**
     * 操作url
     */
    private String optUrl;
    /**
     * 操作方法
     */
    private String optMethod;
    /**
     * 操作描述
     */
    private String optDesc;
    /**
     * 请求参数
     */
    private String requestParam;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 返回数据
     */
    private String responseData;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 操作ip
     */
    private String ipAddress;
    /**
     * 操作地址
     */
    private String ipSource;
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

