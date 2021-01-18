package com.pmms.service;

import entity.UserEntity;

import java.util.List;

public interface UserService{

    List<UserEntity> getList();

    UserEntity getById(Integer id);

}
