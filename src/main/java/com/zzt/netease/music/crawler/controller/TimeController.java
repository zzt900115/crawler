package com.zzt.netease.music.crawler.controller;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeController {

    String defatultTimePattern = "yyyy-MM-dd HH:mm:ss";

    @GetMapping("time")
    public String getNowTime(){
        return DateFormatUtils.format(new Date(),defatultTimePattern);
    }


}
