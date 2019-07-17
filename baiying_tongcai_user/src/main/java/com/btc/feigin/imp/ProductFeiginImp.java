package com.btc.feigin.imp;

import com.btc.feigin.ProductFeigin;
import com.btc.main.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
/**
 * TODO: 服务调用失败实现类
 * @author xiexiaojun
 * @date 2019/7/15 18:31
 */
@Component
public class ProductFeiginImp implements ProductFeigin{

    @Override
    public List<Product> getProductList(Map<String, Object> map) {
        System.out.println("查询失败!!!");
        return null;
    }
}
