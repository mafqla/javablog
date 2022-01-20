package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.Resource;
import org.springframework.stereotype.Repository;

/**
 * (Resource)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Repository
public interface ResourceMapper extends BaseMapper<Resource> {

}

