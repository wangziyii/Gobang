package com.example.gobang.controller;


import com.example.gobang.entity.ApiResult;
import com.example.gobang.entity.UserInfo;
import com.example.gobang.service.impl.UserInfoServiceImpl;
import com.example.gobang.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoServiceImpl userInfoService;

    //登录
    @PatchMapping("/login")
    public ApiResult login(@RequestBody UserInfo userInfo){
    String username = userInfo.getusername();
    String password = userInfo.getPassword();
    //先验证用户存在
    UserInfo user =  userInfoService.getUsername(username);
    if (user!=null){
        //在验证用户名密码是否匹配
        UserInfo isUser = userInfoService.Login(username,password);
        if (isUser!=null){
            return ApiResultHandler.buildApiResult(200,"请求成功",isUser);
        }else {
            return ApiResultHandler.buildApiResult(400,"请求失败，请检查您的密码",null);
        }

    }else {
        return ApiResultHandler.buildApiResult(400,"请求失败，请检查您的用户名",null);
    }


    }

}
