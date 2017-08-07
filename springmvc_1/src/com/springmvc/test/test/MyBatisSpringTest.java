package com.springmvc.test.test;

import com.springmvc.test.inter.IUserModelOperation;
import com.springmvc.test.model.UserModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyBatisSpringTest {
    private static ApplicationContext applicationContext;
    static {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static void main(String[] args) {
        IUserModelOperation iUserModelOperation = (IUserModelOperation) applicationContext.getBean("userMapper");

        List<UserModel> ps = iUserModelOperation.selectAllUser("");
        for(UserModel userModel:ps){
            System.out.println("从数据库得到的数据:" + userModel.getName());
        }
    }
}
