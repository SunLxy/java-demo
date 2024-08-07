package com.example.demo.controller;

import com.example.demo.entity.po.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

  @Resource
  private UserMapper userMapper;

  @RequestMapping("/users")
  public List<User>   getUser() {
    return userMapper.selectList(null);
  }

}
