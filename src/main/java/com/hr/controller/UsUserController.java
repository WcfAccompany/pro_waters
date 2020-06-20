package com.hr.controller;

import com.hr.entity.UsUser;
import com.hr.service.UsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UsUserController {
    @Autowired
    private UsUserService usUserService;

    @RequestMapping("/queryAll")
    public List<UsUser> queryAll(){
        return usUserService.selectAll();
    }
}
