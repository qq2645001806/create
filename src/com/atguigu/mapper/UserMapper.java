/*
package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    */
/**
     * 查询一个
     *
     * 查询多个
     *
     *//*

    @Select("select `last_name` ,`sex` from user where id=#{id}")
    User queryUserById(Integer id);

    @Select("select `last_name` ,`sex` from user")
    List<User>queryUserAll();

    @Insert("insert into user(`last_name`,`sex`) values(#{lastName},#{sex})")
    void insertUser(User user);



}
*/
