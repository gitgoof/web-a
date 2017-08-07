package com.springmvc.test.inter;

import com.springmvc.test.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaofeng on 2017/7/28.
 * 这里通过Repository 来注册该接口文件。注册过的文件可以被自动注入到实体参数中
 */
@Repository
public interface IUserModelOperation {
    public UserModel selectUserById(int id);
    public List<UserModel> selectAllUser(String string);
    public void addUser(UserModel userModel);
}
