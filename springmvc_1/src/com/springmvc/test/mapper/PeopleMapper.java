package com.springmvc.test.mapper;

import com.springmvc.test.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface PeopleMapper {
    @Select("SELECT * from user WHERE id=#{userId}")
    UserModel getUserById(@Param("userId") int id);

    @Select("select * from user")
    List<UserModel> getAllList(@Param("user") String string);
}
