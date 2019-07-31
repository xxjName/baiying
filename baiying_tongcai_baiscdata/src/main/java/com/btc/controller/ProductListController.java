package com.btc.controller;

import com.btc.main.Product;
import com.btc.serivce.ProductListSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * TODO: 产品信息类
 * @author xiexiaojun
 * @date 2019/7/9 17:40
 */
@RestController
public class ProductListController {

   @Autowired
   ProductListSerivce productListSerivce;
  @RequestMapping(value = "/getProductList",method = RequestMethod.GET)
  @ResponseBody
   public List<Product> getProductList(Map<String,Object> map){
      System.out.println("eeee");
    return  productListSerivce.getProductList(map);
   }



}
