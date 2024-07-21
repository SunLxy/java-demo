package com.example.demo.controller;

import com.example.demo.entity.po.User;
import com.example.demo.mapper.UserInfoMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserInfoController {
  @Resource
  private UserInfoMapper userInfoMapper;

  @RequestMapping("/users/info")
  public List<User> getUser() {
    return userInfoMapper.getList(null);
  }
}
