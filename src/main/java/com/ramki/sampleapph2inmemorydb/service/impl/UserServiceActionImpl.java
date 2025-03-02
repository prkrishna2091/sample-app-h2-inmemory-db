package com.ramki.sampleapph2inmemorydb.service.impl;

import com.ramki.sampleapph2inmemorydb.entity.UserActionEntity;
import com.ramki.sampleapph2inmemorydb.repo.UserActionRepo;
import com.ramki.sampleapph2inmemorydb.service.UserServiceAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceActionImpl implements UserServiceAction {
    @Autowired
    private UserActionRepo userActionRepo;

    @Override
    public UserActionEntity createUserAction(UserActionEntity userActionEntity) {
        return userActionRepo.save(userActionEntity);
    }
}
