package com.yi.lianjia.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置扫描接口路径
 * @author YI
 * @date 2019年12月26日
 */
@Configuration
@MapperScan(basePackages = {"com.yi.lianjia.mapper"})
public class Config {
    /**
     * 页面地址
     * nj 南京
     * xz 徐州
     * sjz 石家庄
     */
    public static final String PRON_URL = "https://nj.lianjia.com/ershoufang/pg{page}";
}
