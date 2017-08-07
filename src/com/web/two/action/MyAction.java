package com.web.two.action;

/**
 * Created by gaofeng on 2017/7/11.
 */
public class MyAction {
    public String execute() throws Exception{
        return "success";
    }
    public String getUser()throws Exception{
        return "success";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
