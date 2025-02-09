package com.ramki.sampleapph2inmemorydb.service.impl;

import com.ramki.sampleapph2inmemorydb.entity.UserEntity;
import com.ramki.sampleapph2inmemorydb.repo.UserRepo;
import com.ramki.sampleapph2inmemorydb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepo.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return userRepo.save(user);
    }
}