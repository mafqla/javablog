package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.entity.UniqueView;
import com.blog.model.dto.UniqueViewDTO;

import java.util.List;

/**
 * 用户量统计
 *
 * @author fuqianlin
 * @date 2022-01-20
 */
public interface UniqueViewService extends IService<UniqueView> {

    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();

}
