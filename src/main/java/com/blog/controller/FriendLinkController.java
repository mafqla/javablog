package com.blog.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blog.entity.FriendLink;
import com.blog.service.FriendLinkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (FriendLink)表控制层
 *
 * @author makejava
 * @since 2022-01-15 17:49:16
 */
@RestController
@RequestMapping("friendLink")
public class FriendLinkController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private FriendLinkService friendLinkService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param friendLink 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<FriendLink> page, FriendLink friendLink) {
        return success(this.friendLinkService.page(page, new QueryWrapper<>(friendLink)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.friendLinkService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param friendLink 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody FriendLink friendLink) {
        return success(this.friendLinkService.save(friendLink));
    }

    /**
     * 修改数据
     *
     * @param friendLink 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody FriendLink friendLink) {
        return success(this.friendLinkService.updateById(friendLink));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.friendLinkService.removeByIds(idList));
    }
}

