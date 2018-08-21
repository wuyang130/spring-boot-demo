package com.light.springboot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController注解能够使项目支持Rest
@RestController
@SpringBootApplication
//表示该controller类下所有的方法都公用的一级上下文根
@RequestMapping("/springboot")
public class UserController {
  //这里使用@RequestMapping注解表示该方法对应的二级上下文路径
  @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
  String getUserByGet(@RequestParam(value = "userName") String userName){
      return "Hello " + userName;
  }
  @RequestMapping(value = "/getUserByGet", method = RequestMethod.POST)
  String getUserIDByPost(@RequestParam(value = "userID") String userId){
      return "Hello " + userId;
  }
}