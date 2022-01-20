package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.Category;
import com.blog.model.dto.CategoryBackDTO;
import com.blog.model.dto.CategoryDTO;
import com.blog.model.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Category)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {
    /**
     * 查询分类和对应文章数量
     *
     * @return 分类列表
     */
    List<CategoryDTO> listCategoryDTO();

    /**
     * 查询后台分类列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List<CategoryBackDTO>} 分类列表
     */
    List<CategoryBackDTO> listCategoryBackDTO(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

}

