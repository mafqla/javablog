package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.PhotoDao;
import com.blog.entity.Photo;
import com.blog.service.PhotoService;
import org.springframework.stereotype.Service;

/**
 * 照片(Photo)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:17
 */
@Service("photoService")
public class PhotoServiceImpl extends ServiceImpl<PhotoDao, Photo> implements PhotoService {

}

