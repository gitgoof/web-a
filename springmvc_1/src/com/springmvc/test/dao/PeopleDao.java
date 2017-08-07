package com.springmvc.test.dao;

import com.springmvc.test.model.PeopleModel;

import java.util.List;

/**
 * Created by gaofeng on 2017/7/25.
 */
public interface PeopleDao {
    public List<PeopleModel> getPeopleList();
}
