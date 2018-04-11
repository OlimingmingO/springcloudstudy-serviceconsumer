package com.cloud.controller;

import com.cloud.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Oliverlee on 2018/3/24.
 */
@RestController()
//@Controller
//@RequestMapping("/providerstudy")
public class ConsumerStudyCtr {
    @Autowired
    UserReponsitory userRepository;

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String Hello() {
        System.out.println("@@feign is called \r\n");
        return userRepository.Hello();
    }

    @RequestMapping(value = "/add")
    public Integer Add() {
        return userRepository.Add(2,3);
    }

}
