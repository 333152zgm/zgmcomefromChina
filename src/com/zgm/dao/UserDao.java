package com.zgm.dao;

import com.zgm.domain.User;

import java.util.List;

/**
 * ClassName:UserDao
 *
 * @Description: 删库跑路
 * @Date: 2022/1/24 0024 12:12
 * @Author: zgm 3331529718@qq.com
 */
public interface UserDao {
    List<User> selectUsers();
}
