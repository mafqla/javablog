package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.entity.OperationLog;
import com.blog.model.dto.OperationLogDTO;
import com.blog.model.vo.ConditionVO;
import com.blog.model.vo.PageResult;

/**
 * 操作日志服务
 *
 * @author fuqianlin
 * @date 2022-1-17
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);
}
