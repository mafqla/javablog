package com.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.entity.PhotoAlbum;
import com.blog.model.dto.PhotoAlbumBackDTO;
import com.blog.model.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 相册(PhotoAlbum)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Repository
public interface PhotoAlbumMapper extends BaseMapper<PhotoAlbum> {
    /**
     * 查询后台相册列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List < PhotoAlbumBackDTO >} 相册列表
     */
    List<PhotoAlbumBackDTO> listPhotoAlbumBacks(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

}

