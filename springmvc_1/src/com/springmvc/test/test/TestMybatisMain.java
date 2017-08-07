package com.springmvc.test.test;

import com.springmvc.test.inter.IUserModelOperation;
import com.springmvc.test.model.UserModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by gaofeng on 2017/7/28.
 */
public class TestMybatisMain {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try{
            sqlSession = sqlSessionFactory.openSession();

//        UserModel userModel = sqlSession.selectOne("com.springmvc.test.model.UserModelMapper.selectUserById",
//                2);
            IUserModelOperation iUserModelOperation = sqlSession.getMapper(IUserModelOperation.class);
            UserModel userModel = iUserModelOperation.selectUserById(2);

            if(userModel == null){
                System.out.println("<>userModel==null");
                return;
            }
            System.out.println("<userModel!=null>" + userModel.getAddress()
                    +"<>" + userModel.getName() + "<>" + userModel.getSex());


            UserModel userModel1 = new UserModel();

//            userModel1.setUserName(new String("王五".getBytes(),"utf-8"));
            userModel1.setName("王五");
            userModel1.setUserSex("boy");
            userModel1.setUserAddress("china hangzhou");

//            String s = new String("");
            userModel1.setName("王五");
            userModel1.setSex("男");
            userModel1.setAddress("中国浙江杭州西湖");

            iUserModelOperation.addUser(userModel1);

            System.out.println("添加用户后的id是:" + userModel1.getUserId());

            List<UserModel> list = iUserModelOperation.selectAllUser("");

            for(UserModel userModel2:list){
                System.out.println("列表展示:" + userModel2.getId() + "<>" + userModel2.getName() + "<>" + userModel2.getAddress());
            }
        }catch (Exception e){

        } finally {
            if(sqlSession!=null){
                sqlSession.commit();
                sqlSession.close();
            }
        }

    }
}
