package com.ljy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljy.entity.Student;
import com.ljy.entity.StudentExample;
import com.ljy.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: com.ljy.controller
 * @作者:
 * @创建时间: 2019-12-02 19:59
 * @描述:
 **/
@RestController
@CrossOrigin
public class Client1Controller {

    @RequestMapping("test1")
    public String testCli() {
        return "testclient1";
    }
    @Autowired
    StudentMapper studentMapper;


    @RequestMapping("lists1")
    public PageInfo<Student> lists(@RequestParam(defaultValue = "1") Integer pageNum) {

        Integer pageSize=3;
        PageHelper.startPage(pageNum,pageSize);

        List<Student> studentList = studentMapper.selectByExample(new StudentExample());

        PageInfo<Student> info=new PageInfo<>(studentList);

        return info;
    }

}
