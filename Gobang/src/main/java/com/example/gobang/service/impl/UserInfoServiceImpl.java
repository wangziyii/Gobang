package com.example.gobang.service.impl;

import com.example.gobang.entity.UserInfo;
import com.example.gobang.mapper.UserInfoMapper;
import com.example.gobang.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUsername(String username) {

        return userInfoMapper.getUsername(username);
    }

    @Override
    public UserInfo Login(String username, String pawwword) {

        return userInfoMapper.Login(username,pawwword);
    }

}
