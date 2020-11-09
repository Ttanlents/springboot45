package com.yjf.services;

import com.yjf.dao.UserDao;
import com.yjf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 余俊锋
 * @date 2020/10/21 10:29
 * @Description
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(Integer id){
      return   userDao.getUserById(id);
    }
}
