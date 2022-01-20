package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.Page;
import org.springframework.stereotype.Repository;

/**
 * 页面(Page)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Repository
public interface PageMapper extends BaseMapper<Page> {

}

