package com.springmvc.test.handlers;

import com.springmvc.test.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这里可以实现多个Controller来实现。可以根据功能来做Controller的实现
 * Created by gaofeng on 2017/7/26.
 */
@Controller
public class LoginControl {
    @RequestMapping("/doLogin")
    public String doLogin(LoginModel loginModel){
        System.out.println("界面传递过来的 controler>" + loginModel.getName());
        return "success";
    }
}
