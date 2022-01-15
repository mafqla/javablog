package com.blog.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blog.entity.Page;
import com.blog.service.PageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 页面(Page)表控制层
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@RestController
@RequestMapping("page")
public class PageController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PageService pageService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param page 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Page> page, Page page) {
        return success(this.pageService.page(page, new QueryWrapper<>(page)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.pageService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param page 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Page page) {
        return success(this.pageService.save(page));
    }

    /**
     * 修改数据
     *
     * @param page 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Page page) {
        return success(this.pageService.updateById(page));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.pageService.removeByIds(idList));
    }
}

