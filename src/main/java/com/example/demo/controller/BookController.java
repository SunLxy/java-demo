package com.example.demo.controller;

import com.example.demo.entity.po.Book;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapper.BookMapper;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
  @Resource
  private BookMapper bookMapper;

  @RequestMapping("/getBooks")
  public List<Book> getBooks() {
    return bookMapper.selectList(null);
  }
}
