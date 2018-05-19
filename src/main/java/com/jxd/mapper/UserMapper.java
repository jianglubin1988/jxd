package com.jxd.mapper;

import com.jxd.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    User findUserById(@Param("id") Integer id);

    @Insert("insert into t_user(name, password, phone) values(#{name}, #{password}, #{phone})")
    int insert(User user);
}
