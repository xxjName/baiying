package com.btc.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
/**
 * TODO: 跨域
 * @author xiexiaojun
 * @date 2019/7/24 10:31
 */
@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {

        final UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();

        final CorsConfiguration config=new CorsConfiguration();

        config.setAllowCredentials(true);   //支持cookie跨域

        config.setAllowedOrigins(Arrays.asList("*"));  //配置允许跨域访问的域名，这里*表示全部

        config.setAllowedHeaders(Arrays.asList("*"));  //设置允许的头

        config.setAllowedMethods(Arrays.asList("*")); //设置允许跨域的方法，GET,POST....,这里表示允许全部

        config.setMaxAge(300l);  //缓存时间，在指定的时间内，对于相同的请求就不需要再次检查了

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);

    }

}
