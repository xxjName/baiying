package com.btc.feigin;

import com.btc.feigin.imp.ProductFeiginImp;
import com.btc.main.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
/**
 * TODO: 服务类
 * @author xiexiaojun
 * @date 2019/7/15 18:31
 */

@FeignClient(value = "baiscdata",fallback = ProductFeiginImp.class)
public interface ProductFeigin {


      @GetMapping("/getProductList")
      List<Product> getProductList(@RequestParam("map") Map<String,Object> map);
}
