package com.dadaibaio.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/8 15:03
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)  //开启链式编程
public class User implements Serializable {//Dept 实体类 orm 类表关系映射  需要转成二进制字节进行传输
    private int userid;   //主键
    private String username;
    //这个数据库存在那个数据库的字段~ 微服务  一个服务对应一个数据库 可能存在不同的数据库
    private String db_source;
    public User(String username){
        this.username = username;
    }
}