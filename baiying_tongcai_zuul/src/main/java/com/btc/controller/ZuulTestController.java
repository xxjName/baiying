package com.btc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * TODO: 网关测试类
 * @author xiexiaojun
 * @date 2019/7/8 16:42
 */
@RestController
public class ZuulTestController {
    /**
     * TODO: 方法描述
     * @author xiexiaojun
     * @date 2019/7/8 18:13
     * @param name
     * @return
     * @throws
     */
    @RequestMapping("getZuulShow")
    @ResponseBody
    public String getZuulShow(String name){
        return "成功搭建完成!";
    }

}


