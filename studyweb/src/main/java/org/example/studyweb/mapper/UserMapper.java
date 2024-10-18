package org.example.studyweb.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.studyweb.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(username, password, phone)values (#{username},#{password},#{phone})")
    void insertUser(User user);

    @Select("select * from user where username=#{username}")
    User findByUsername(User user);

    @Select("select * from user where username=#{username} and password=#{password}")
    User findByUsernameAndPassword(User user);

    @Update("update user set password=#{password} , phone=#{phone} , image=#{image} , state=#{state} where username=#{username} ")
    void updateUser(User user);

}
