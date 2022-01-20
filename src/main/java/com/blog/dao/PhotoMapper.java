package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.Photo;
import org.springframework.stereotype.Repository;

/**
 * 照片(Photo)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Repository
public interface PhotoMapper extends BaseMapper<Photo> {

}

