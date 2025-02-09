package com.ramki.sampleapph2inmemorydb.controller;

import com.ramki.sampleapph2inmemorydb.entity.UserEntity;
import com.ramki.sampleapph2inmemorydb.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController is a REST controller that handles HTTP requests related to user operations.
 * It is mapped to the base URL /api/v1/user.
 *
 * Author: prkrishna2091
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;
    /**
     * Handles HTTP GET requests to /api/v1/user/all.
     *
     * @return A string "All Users" indicating the endpoint is accessed.
     */
    @Operation(summary = "Get all users", description = "Returns a list indicating all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/all")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> listOfResults = userService.findAll();
        return new ResponseEntity<>(listOfResults, HttpStatus.OK);
    }
}
