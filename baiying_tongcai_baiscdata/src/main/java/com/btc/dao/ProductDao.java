package com.btc.dao;

import com.btc.main.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * TODO: 产品dao层类
 * @author xiexiaojun
 * @date 2019/7/9 18:14
 */
@Repository
public interface ProductDao {

    /**
     * TODO: 查询信息
     * @author xiexiaojun
     * @date 2019/7/9 18:11
     * @param map
     * @return
     * @throws
     */
    List<Product> getProductList(Map<String,Object> map);
}
