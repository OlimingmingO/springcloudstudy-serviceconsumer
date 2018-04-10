package com.cloud.reponsitory;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Oliverlee on 2018/3/24.
 */

@FeignClient(value = "service-provider" , fallback = UserReponsitoryHytrix.class)
/**
 * 1、	通过@FeignClient注解指定需要绑定那个服务生产者，上文中的生产者注册的名字是“service-provider”.
 */
public interface UserReponsitory {
    @RequestMapping("/hello")
    /**
     * 2、	这里的@RequestMappinig注解不是对外提供接口的注解，是后端服务提供者提供的接口，本文就是ServiceProvider工程中的UserCtrl.class中的“/hello”接口
     */
    String Hello();

    @RequestMapping("/add")
    Integer Add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
