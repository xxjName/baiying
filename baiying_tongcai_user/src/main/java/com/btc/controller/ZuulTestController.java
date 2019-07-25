package com.btc.controller;

import com.btc.feigin.ProductFeigin;
import com.btc.main.Product;
import com.btc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: 网关测试类
 *
 * @author xiexiaojun
 * @date 2019/7/8 16:42
 */
@RestController
public class ZuulTestController {
    @Autowired
    ProductFeigin productFeigin;
   @Autowired
    RedisService redisService;

    @RequestMapping("getZuulShow")
    @ResponseBody
    public List<Product> getZuulShow() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("33","333");
        redisService.set("ddd","dddd");
       String name= redisService.get("ddd");
        System.out.println("==========================="+name);
        return productFeigin.getProductList(map);
    }

}
