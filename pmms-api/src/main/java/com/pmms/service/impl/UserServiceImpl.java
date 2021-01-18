package com.pmms.service.impl;

import com.pmms.service.UserService;
import entity.UserEntity;
import mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserEntity> getList() {

        return userMapper.getList();
    }

    @Override
    public UserEntity getById(Integer id) {

        return userMapper.getById(id);
    }
}
