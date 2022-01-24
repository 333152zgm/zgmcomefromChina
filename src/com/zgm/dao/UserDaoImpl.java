package com.zgm.dao;

import com.zgm.domain.User;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * ClassName:UserDaoImpl
 *
 * @Description: 删库跑路
 * @Date: 2022/1/24 0024 12:14
 * @Author: zgm 3331529718@qq.com
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectUsers() {
        System.out.println("输出所有的用户信息");
        return null;
    }
}
