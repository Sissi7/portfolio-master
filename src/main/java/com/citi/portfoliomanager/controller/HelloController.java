package com.citi.portfoliomanager.controller;

import com.citi.portfoliomanager.entity.User;
import com.citi.portfoliomanager.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hkz on 2017/4/23.
 */
@Controller
public class HelloController {

    private static final Logger logger= LogManager.getLogger(HelloController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        logger.info("进入index页面");
        return "index";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@RequestParam("username")String username){
        logger.info("param{}:username="+username);
        User user=userService.getUser(username);
        return user;
    }
}
