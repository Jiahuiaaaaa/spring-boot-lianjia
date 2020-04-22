package com.yi.lianjia;

import com.yi.lianjia.service.LianjiaInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLianjiaApplicationTests {
    @Autowired
    LianjiaInfoService lianjiaInfoService;

    /**
     * 启动爬虫
     */
    @Test
    void contextLoads() {
        for (int i = 61; i <= 100; i++) {
            lianjiaInfoService.cronTask(i);
            System.out.println("---------------------------------当前爬取到了第"+i+"页--------------------------");
        }
    }

}
