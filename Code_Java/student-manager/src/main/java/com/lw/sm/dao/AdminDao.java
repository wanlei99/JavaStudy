package com.lw.sm.dao;

import com.lw.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description 管理员接口
 * @Author WL
 * @Date 2020/11/15
 **/
public interface AdminDao {
    /**
     * 根据账号查找管理员
     * @param account 账号入参
     * @return Admin：管理员信息
     * @throws SQLException ： 该方法会抛出SQL异常
     */
    Admin finAdminByAccount(String account) throws SQLException;
}
