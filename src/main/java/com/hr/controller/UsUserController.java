package com.hr.controller;

import com.hr.entity.UsUser;
import com.hr.service.UsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("user")
public class UsUserController {
    @Autowired
    private UsUserService usUserService;

    @RequestMapping("/login")
    public String login(UsUser user, HttpSession session){
        Example example = new Example(UsUser.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("userno",user.getUserno());
        c.andEqualTo("pwd",user.getPwd());
        List<UsUser> uList = usUserService.selectByExample(example);
        if(uList.size()>0){
            //保存当前用户信息到session中
            session.setAttribute("user",uList.get(0));
            return "success";
        }
        return "lose";
    }
}
