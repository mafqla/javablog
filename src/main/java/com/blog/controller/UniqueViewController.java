package com.blog.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blog.entity.UniqueView;
import com.blog.service.UniqueViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UniqueView)表控制层
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@RestController
@RequestMapping("uniqueView")
public class UniqueViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UniqueViewService uniqueViewService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uniqueView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UniqueView> page, UniqueView uniqueView) {
        return success(this.uniqueViewService.page(page, new QueryWrapper<>(uniqueView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uniqueViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uniqueView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UniqueView uniqueView) {
        return success(this.uniqueViewService.save(uniqueView));
    }

    /**
     * 修改数据
     *
     * @param uniqueView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UniqueView uniqueView) {
        return success(this.uniqueViewService.updateById(uniqueView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uniqueViewService.removeByIds(idList));
    }
}

