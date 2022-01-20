package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.UniqueView;
import com.blog.model.dto.UniqueViewDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * (UniqueView)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 */
@Repository
public interface UniqueViewMapper extends BaseMapper<UniqueView> {
    /**
     * 获取7天用户量
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

}

