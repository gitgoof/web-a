package com.springmvc.test.service;

import com.springmvc.test.model.PeopleModel;

import java.util.List;

/**
 * Created by gaofeng on 2017/7/25.
 */
public interface PeopleManager {
    public List<PeopleModel> getPeopleList();
}
