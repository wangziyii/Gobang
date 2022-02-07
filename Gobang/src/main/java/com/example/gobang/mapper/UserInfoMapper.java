package com.example.gobang.mapper;

import com.example.gobang.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@Mapper
@Component
public interface UserInfoMapper {

    @Select("SELECT id,username,email,phone_number,STATUS FROM user_info WHERE username=${username}")
    UserInfo getUsername(String username);

    @Select("SELECT id,username,email,phone_number,STATUS FROM user_info WHERE username=${username} AND `password`=${password}")
    UserInfo Login(String username, String pawwword);
}
