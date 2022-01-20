package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;


/**
 * 操作日志
 *
 * @author fuqianlin
 * @date 2022-1-17
 */
@Repository
public interface OperationLogMapper extends BaseMapper<OperationLog> {
}
