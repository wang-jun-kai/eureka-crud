package com.ljy.api;

import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @类名: com.ljy.api
 * @作者:
 * @创建时间: 2019-12-02 20:05
 * @描述:
 **/
@FeignClient(name = "EUREKA-CLIENT001")
public interface Client1Api {

    @RequestMapping("test1")
    public String test01();

    @RequestMapping("lists1")
    public PageInfo lists1(@RequestParam Integer pageNum);


}
