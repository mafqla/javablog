package com.blog.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blog.entity.RoleResource;
import com.blog.service.RoleResourceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (RoleResource)表控制层
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@RestController
@RequestMapping("roleResource")
public class RoleResourceController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RoleResourceService roleResourceService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param roleResource 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RoleResource> page, RoleResource roleResource) {
        return success(this.roleResourceService.page(page, new QueryWrapper<>(roleResource)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.roleResourceService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param roleResource 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RoleResource roleResource) {
        return success(this.roleResourceService.save(roleResource));
    }

    /**
     * 修改数据
     *
     * @param roleResource 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RoleResource roleResource) {
        return success(this.roleResourceService.updateById(roleResource));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.roleResourceService.removeByIds(idList));
    }
}

