package com.btc.serivce.imp;


import com.btc.dao.ProductDao;
import com.btc.main.Product;
import com.btc.serivce.ProductListSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
/**
 * TODO: 产品业务实现类
 * @author xiexiaojun
 * @date 2019/7/9 18:12
 */
@Service
public class ProductListSerivceImp implements ProductListSerivce {

    @Autowired
    ProductDao productDao;
    /**
     * TODO: 查询信息
     * @author xiexiaojun
     * @date 2019/7/9 18:11
     * @param map
     * @return
     * @throws
     */
    @Override
    public List<Product> getProductList(Map<String, Object> map) {
        return productDao.getProductList(map);
    }
}
