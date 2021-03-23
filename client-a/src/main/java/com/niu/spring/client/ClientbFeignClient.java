package com.niu.spring.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * 外部服务客户端
 *
 * @author [nza]
 * @version 1.0 [2021/03/03 21:30]
 * @createTime [2021/03/03 21:30]
 */
@FeignClient("clientb")
public interface ClientbFeignClient {

    /**
     * 查询 clientB
     *
     * @author nza
     * @createTime 2021/3/23 15:29
     * @return    {@link java.util.Map<java.lang.String,java.lang.String>}
     */
    @GetMapping(value = "/api/clientb", consumes = "application/json")
    Map<String, Object> findClientB();
}
