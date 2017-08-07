package com.springmvc.test.dao.imple;

import com.springmvc.test.dao.PeopleDao;
import com.springmvc.test.inter.IUserModelOperation;
import com.springmvc.test.mapper.PeopleMapper;
import com.springmvc.test.model.PeopleModel;
import com.springmvc.test.model.UserModel;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaofeng on 2017/7/25.
 * repository > 贮藏室，仓库；知识库；智囊团
 */
@Repository
public class PeopleDaoImple implements PeopleDao {
    @Autowired
    private IUserModelOperation iUserModelOperation;
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<PeopleModel> getPeopleList() {
        List<PeopleModel> list = new ArrayList<>();
        for(int i = 0 ;i < 5;i++){
            PeopleModel peopleModel = new PeopleModel();
            peopleModel.setName("name:" + i);
            peopleModel.setSex(i);
            peopleModel.setAge("age:" + i);
            list.add(peopleModel);
        }
        System.out.println("第三层--getALlList");

        UserModel userModel1 = new UserModel();

        userModel1.setName("测试添加");
        userModel1.setSex("女");
        userModel1.setAddress("中国上海普陀天地软件园");

//        iUserModelOperation.addUser(userModel1);
/*
        if(iUserModelOperation != null){
            System.out.println("第三层--getALlList初始化：iUserModelOperation!=null");
        } else {
            System.out.println("第三层--getALlList 初始化: iUserModelOperation==null");
        }
        List<UserModel> ps = iUserModelOperation.selectAllUser("");
        for(UserModel userModel:ps){
            System.out.println(userModel.getId() + "从数据库得到的数据:" + userModel.getName());
        }
*/
        if(peopleMapper==null){
            System.out.println("第三层--getALlList初始化：peopleMapper!=null");
        } else {
            System.out.println("第三层--getALlList初始化：peopleMapper!=null");
        }
        
        List<UserModel> ps = peopleMapper.getAllList("");
        for(UserModel userModel:ps){
            System.out.println(userModel.getId() + "从数据库得到的数据:" + userModel.getName());
        }
        logger.error("我的debug打印输出!");
        

        return list;
    }
    private final static Logger logger = LoggerFactory.getLogger(PeopleDaoImple.class);
}
