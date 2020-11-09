package com.yjf.dao;

import com.yjf.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 余俊锋
 * @date 2020/10/21 15:44
 * @Description
 */
@Repository
public interface UserDao {
    public User getUserById(Integer id);
}
