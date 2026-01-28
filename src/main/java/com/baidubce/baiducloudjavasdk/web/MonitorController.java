/*
 * Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
 */
package com.baidubce.baiducloudjavasdk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/health")
public class MonitorController {

    @ResponseBody
    @GetMapping
    public String health() {
        return "OK!";
    }
}