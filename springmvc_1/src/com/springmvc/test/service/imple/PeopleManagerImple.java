package com.springmvc.test.service.imple;

import com.springmvc.test.dao.PeopleDao;
import com.springmvc.test.inter.IUserModelOperation;
import com.springmvc.test.model.PeopleModel;
import com.springmvc.test.model.UserModel;
import com.springmvc.test.service.PeopleManager;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaofeng on 2017/7/25.
 */
@Service
public class PeopleManagerImple implements PeopleManager {
    @Autowired
    PeopleDao peopleDao;
    @Autowired
    private IUserModelOperation iUserModelOperation;
    @Override
    public List<PeopleModel> getPeopleList() {
        System.out.println("第二层--getList");

        if(iUserModelOperation != null){
            System.out.println("第二层--getPeopleList 初始化：iUserModelOperation!=null");
        } else {
            System.out.println("第二层--getPeopleList 初始化: iUserModelOperation==null");
        }

        UserModel userModel1 = new UserModel();

        userModel1.setName("测试添加");
        userModel1.setSex("女");
        userModel1.setAddress("中国上海普陀天地软件园");

//        iUserModelOperation.addUser(userModel1);

//        List<UserModel> ps = iUserModelOperation.selectAllUser("");
//        for(UserModel userModel:ps){
//            System.out.println("从数据库得到的数据:" + userModel.getName());
//        }


        return peopleDao.getPeopleList();
    }

//    public void setiUserModelOperation(IUserModelOperation iUserModelOperation) {
//        this.iUserModelOperation = iUserModelOperation;
//    }
}
