package com.springmvc.test.handlers;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.springmvc.test.model.LoginModel;
import com.springmvc.test.model.PeopleModel;
import com.springmvc.test.service.PeopleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gaofeng on 2017/7/24.
 */
@Controller
public class HelloWorld {
    @Autowired
    PeopleManager peopleManager;
    @RequestMapping("/helloworld")
    public String sayHello(){
        System.out.println("<<>>sayHello");
        return "success";
    }
    /*
    @RequestMapping("/login")
    public String toLogin(LoginModel loginModel){
        System.out.println("界面传递过来的>" + loginModel.getName());
        return "success";
    }
    */
    @RequestMapping(value="/getAll",method = RequestMethod.GET)// 限制条件用来窄化请求体
    public String getAllPeople(Model model){
        List<PeopleModel> list = peopleManager.getPeopleList();
        System.out.println("第一层--getALl>>" + list.size());
        model.addAttribute("peoplelist",list);
        return "peopleListDisplay";
    }
    @RequestMapping("/login")
    @ResponseBody // 这个用来表示返回的会被解析成json字符串
    public PeopleModel login( LoginModel loginModel){
        PeopleModel peopleModel = new PeopleModel();
        System.out.println("界面传递过来的>" + loginModel.getName());
        peopleModel.setName("张三");
        peopleModel.setAge("44");
        peopleModel.setSex(1);
        return peopleModel;
    }

    public void initC(){
        DefaultPrettyPrinter p;



    }
}
