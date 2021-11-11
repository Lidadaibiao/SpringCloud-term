package com.lidadaibiao.dao;

import com.dadaibaio.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/11/8 16:01 **/
 @Mapper
 @Repository
public interface UserDao {
     Boolean addUser(User user);
     User queryById(int userid);
     List<User> queryAll();
}
