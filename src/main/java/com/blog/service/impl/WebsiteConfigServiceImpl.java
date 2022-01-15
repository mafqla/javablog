package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.dao.WebsiteConfigDao;
import com.blog.entity.WebsiteConfig;
import com.blog.service.WebsiteConfigService;
import org.springframework.stereotype.Service;

/**
 * (WebsiteConfig)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 17:49:18
 */
@Service("websiteConfigService")
public class WebsiteConfigServiceImpl extends ServiceImpl<WebsiteConfigDao, WebsiteConfig> implements WebsiteConfigService {

}

