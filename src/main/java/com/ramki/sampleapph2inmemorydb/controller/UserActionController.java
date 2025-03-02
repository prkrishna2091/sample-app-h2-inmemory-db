package com.ramki.sampleapph2inmemorydb.controller;

import com.ramki.sampleapph2inmemorydb.dto.UserActionDTO;
import com.ramki.sampleapph2inmemorydb.entity.UserActionEntity;
import com.ramki.sampleapph2inmemorydb.service.UserServiceAction;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.BeanProperty;

@RestController
@RequestMapping("/api/v1/userAction")
@Slf4j
public class UserActionController {

    @Autowired
    private UserServiceAction userServiceAction;

    Logger logger =LoggerFactory.getLogger(UserActionController.class);


    @PostMapping("/create")
    public ResponseEntity<UserActionEntity> createUserAction(@RequestBody UserActionDTO userActionDTO) {
        logger.info("Creating user action - Start");
        logger.info("UserActionDTO: {}", userActionDTO.toString());
        UserActionEntity userActionEntity = new UserActionEntity();

        BeanUtils.copyProperties(userActionDTO,userActionEntity);

        UserActionEntity userActionEntity1 = userServiceAction.createUserAction(userActionEntity);
        logger.info("Creating user action - End");
        return new ResponseEntity<>(userActionEntity1, HttpStatus.CREATED);
    }
}
