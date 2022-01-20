package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * (UserInfo)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:18
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}

