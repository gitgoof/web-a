package com.web.two.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by gaofeng on 2017/7/11.
 */
public class ActionTwo extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
