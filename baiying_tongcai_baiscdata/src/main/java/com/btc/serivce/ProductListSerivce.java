package com.btc.serivce;

import com.btc.main.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
/**
 * TODO: 产品业务类
 * @author xiexiaojun
 * @date 2019/7/9 18:12
 */
public interface ProductListSerivce {

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
