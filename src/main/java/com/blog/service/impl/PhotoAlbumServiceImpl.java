package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.PhotoAlbumDao;
import com.blog.entity.PhotoAlbum;
import com.blog.service.PhotoAlbumService;
import org.springframework.stereotype.Service;

/**
 * 相册(PhotoAlbum)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("photoAlbumService")
public class PhotoAlbumServiceImpl extends ServiceImpl<PhotoAlbumDao, PhotoAlbum> implements PhotoAlbumService {

}

