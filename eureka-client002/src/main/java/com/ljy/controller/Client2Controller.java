package com.ljy.controller;

import com.github.pagehelper.PageInfo;
import com.ljy.api.Client1Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.controller
 * @作者:
 * @创建时间: 2019-12-02 20:21
 * @描述:
 **/
@RestController
@CrossOrigin
public class Client2Controller {

    @Autowired
    Client1Api client1Api;


    @RequestMapping("lll")
    public String test1() {
    	String s=client1Api.test01();
    	return s;
    }
    @RequestMapping("lists")
    public PageInfo lists(@RequestParam(defaultValue = "1") Integer pageNum) {

        PageInfo pageInfo = client1Api.lists1(pageNum);

        return pageInfo;
    }

}
