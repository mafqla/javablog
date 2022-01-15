package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.OperationLogDao;
import com.blog.entity.OperationLog;
import com.blog.service.OperationLogService;
import org.springframework.stereotype.Service;

/**
 * (OperationLog)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("operationLogService")
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {

}

