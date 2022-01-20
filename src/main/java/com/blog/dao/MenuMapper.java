package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Menu)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:16
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 根据用户id查询菜单
     * @param userInfoId 用户信息id
     * @return 菜单列表
     */
    List<Menu> listMenusByUserInfoId(Integer userInfoId);

}

