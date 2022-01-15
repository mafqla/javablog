package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.ChatRecordDao;
import com.blog.entity.ChatRecord;
import com.blog.service.ChatRecordService;
import org.springframework.stereotype.Service;

/**
 * (ChatRecord)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:16
 */
@Service("chatRecordService")
public class ChatRecordServiceImpl extends ServiceImpl<ChatRecordDao, ChatRecord> implements ChatRecordService {

}

