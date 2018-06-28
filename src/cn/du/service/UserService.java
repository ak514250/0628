package cn.du.service;

import cn.du.dao.UserDao;

/**
 * Created by z on 2018/6/28.
 */
public class UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
