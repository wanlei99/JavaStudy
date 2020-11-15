package com.lw.sm.service;

import com.lw.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description Admin业务逻辑接口
 * @Author WL
 * @Date 2020/11/15
 **/
public interface AdminService {
    /**
     * 管理员登录
     * @param account 账号
     * @param password 密码
     * @return 返回登陆结果
     */
    ResultEntity adminLogin(String account, String password);
}
