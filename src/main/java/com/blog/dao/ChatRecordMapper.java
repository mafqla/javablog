package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * (ChatRecord)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Repository
public interface ChatRecordMapper extends BaseMapper<ChatRecord> {

}

