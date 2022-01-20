package com.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

/**
 * @author fuqianlin
 * @date 2022-1-15
 */
@MapperScan("com.blog.dao")
@SpringBootApplication
@EnableScheduling
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
//        try{
//            SpringApplication.run(BlogApplication.class, args);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
