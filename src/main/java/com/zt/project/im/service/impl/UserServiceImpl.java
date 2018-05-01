package com.zt.project.im.service.impl;

import com.zt.project.im.bean.User;
import com.zt.project.im.dao.UserDao;
import com.zt.project.im.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：ZhangTao
 * @Description:
 * @Date: Created in 13:13 2018/3/26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserInfo() {
        return userDao.findUserInfo();
    }

    @Override
    public void insert(User user) {
        userDao.addUserInfo(user);
    }
}