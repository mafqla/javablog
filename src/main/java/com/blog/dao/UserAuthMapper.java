package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.UserAuth;
import com.blog.model.dto.UserBackDTO;
import com.blog.model.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (UserAuth)表数据库访问层
 *
 * @author fuqianlin
 * @since 2022-01-15 17:49:17
 * @date 2022-01-20
 */
@Repository
public interface UserAuthMapper extends BaseMapper<UserAuth> {

    /**
     * 查询后台用户列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List <UserBackDTO>} 用户列表
     */
    List<UserBackDTO> listUsers(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

    /**
     * 查询后台用户数量
     *
     * @param condition 条件
     * @return 用户数量
     */
    Integer countUser(@Param("condition") ConditionVO condition);
}

