package com.example.gobang.service;

import com.example.gobang.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
public interface IUserInfoService {

    UserInfo getUsername(String username);

    UserInfo Login(String username,String pawwword);

}
