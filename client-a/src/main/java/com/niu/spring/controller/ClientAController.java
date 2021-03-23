package com.niu.spring.controller;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Maps;
import com.niu.spring.client.ClientBRestTemplateClient;
import com.niu.spring.client.ClientbFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <功能简述>
 *
 * @author [nza]
 * @version 1.0 [2021/03/23 14:53]
 * @createTime [2021/03/23 14:53]
 */
@RestController
@RequestMapping("clients")
@AllArgsConstructor
public class ClientAController {

    private final ClientBRestTemplateClient clientBRestTemplateClient;

    private final ClientbFeignClient clientbFeignClient;


    /**
     * 获取ClientB信息
     *
     * @author nza
     * @createTime 2021/3/23 15:35
     */
    @GetMapping("clientb")
    public Map<String, Object> findClientbInfo(@RequestParam(value = "type", required = false) String type) {

        Object data;

        if (StrUtil.equals(type, "rest")) {
            data = clientBRestTemplateClient.findClientB();
        } else {
            data = clientbFeignClient.findClientB();
        }

        Map<String, Object> res = Maps.newHashMap();
        res.put("status", "1");
        res.put("data", data);
        return res;
    }


}
