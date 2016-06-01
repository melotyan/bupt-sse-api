package cn.sse.bupt.service;

import cn.sse.bupt.model.UserModel;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/1.
 */
public interface UserService {
    public int register(UserModel userModel);

    public boolean login(String username, String password);

    public boolean hasRegistered(String username);

    public int logout(UserModel userModel);

    public int activeAccount(int id);

    public boolean isActivated(String username);

    public UserModel findUserByUsername(String username);

    public UserModel findUserById(int id);

    public int updateUserInfo(UserModel userModel);

    public int manageUser(int id, int userType, int accountStatus);

    public List<UserModel> getAllUsers();
}
