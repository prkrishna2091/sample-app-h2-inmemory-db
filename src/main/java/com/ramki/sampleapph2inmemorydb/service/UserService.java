package com.ramki.sampleapph2inmemorydb.service;

import com.ramki.sampleapph2inmemorydb.entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> findAll();

    public UserEntity saveUser(UserEntity user);

}