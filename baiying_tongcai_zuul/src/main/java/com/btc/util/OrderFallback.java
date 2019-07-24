package com.btc.util;

import java.io.InputStream;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * TODO: 设置zuul的熔断实现FallbackProvider接口出现熔断的情况如下：
 * 1、当请求的服务响应超时
 * 2、当请求的服务不能正常提供服务
 * @author xiexiaojun
 * @date 2019/7/24 9:47
 */
@Configuration
public class OrderFallback implements FallbackProvider {
    /**

     * 这个方法返回的是serviceId，如果返回的单个服务，那么只针对一个服务熔断

     * 如果想要针对所有的服务进行配置熔断，只需要返回*即可

     */

    @Override
    public String getRoute() {
        return "order-provider";
    }

    /**
     * 发生熔断的响应方法
     */
    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {

        return new ClientHttpResponse() {

            @Override

            public HttpStatus getStatusCode() throws IOException {

                return HttpStatus.OK;

            }

            @Override

            public int getRawStatusCode() throws IOException {

                return 200;

            }

            @Override

            public String getStatusText() throws IOException {

                return "OK";

            }

            @Override

            public void close() {

            }

//设置响应的内容
            @Override
            public InputStream getBody() throws IOException {

                return new ByteArrayInputStream("fallback".getBytes());

            }

            @Override

            public HttpHeaders getHeaders() {

                HttpHeaders headers = new HttpHeaders();

                headers.setContentType(MediaType.APPLICATION_JSON);

                return headers;

            }

        };

    }

}