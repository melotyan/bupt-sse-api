package cn.sse.bupt.service;

import cn.sse.bupt.model.UserModel;

/**
 * Created by hao.yan on 2015/12/1.
 */
public interface UserService {
    public int register(UserModel userModel);

    public boolean login(String username, String password);

    public boolean hasRegistered(String username);

    public int logout(UserModel userModel);
}