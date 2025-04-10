package com.baizhi.mapper;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDAO {

    void save(User user);

    User login(@Param("username") String username,@Param("password") String password);
}
