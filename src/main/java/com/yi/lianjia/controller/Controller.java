package com.yi.lianjia.controller;

import com.yi.lianjia.pipeline.CrawlerLianJiaPipeline;
import com.yi.lianjia.service.LianjiaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CrawlerLianJiaPipeline crawlerLianJiaPipeline;
    @Autowired
    private LianjiaInfoService lianjiaInfoService;



    @PostMapping("doMain")
    public  String doMain(){
        //一页30条数据 循环调用20次 获取第1页到第20页的内容
        for (int i = 1;i<21;i++){
            lianjiaInfoService.cronTask(i);
        }


        return  "success！";
    }
}
