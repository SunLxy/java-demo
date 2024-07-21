package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//使用 RequestMapping 添加请求前缀
@RequestMapping("/api")
public class UserController {
  // http://localhost:8080/api/hello?name=zhehsi
  //使用 RequestMapping 添加请求前缀
  @RequestMapping("/hello")
  @ResponseBody
  public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {

    System.out.println("输入名："+name);

    return "我是前端，请求返回值是 " + name;
  }
}
