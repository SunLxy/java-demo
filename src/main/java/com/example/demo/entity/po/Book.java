package com.example.demo.entity.po;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class Book {
  private Long id;
  private String name;
  private String author;
}
