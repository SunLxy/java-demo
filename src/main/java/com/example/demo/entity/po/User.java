package com.example.demo.entity.po;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
  /**
   * 主键 ID, @TableId 注解定义字段为表的主键，type 表示主键类型，IdType.AUTO 表示随着数据库 ID 自增
   */
  @TableId(type = IdType.AUTO)
  private Long id;
  private String name;
  private Integer age;
  private String email;
}
