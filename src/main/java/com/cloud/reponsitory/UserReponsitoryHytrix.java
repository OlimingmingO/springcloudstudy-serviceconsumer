package com.cloud.reponsitory;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Oliverlee on 2018/3/25.
 */
@Component
public class UserReponsitoryHytrix implements UserReponsitory {

    @Override
    public String Hello(){
        return "Hytrix fallback!hahah";
    };
    @Override
    public Integer Add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b){
        return -9999;
    };
}
