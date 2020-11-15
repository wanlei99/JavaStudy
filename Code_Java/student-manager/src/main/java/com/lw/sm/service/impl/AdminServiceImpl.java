package com.lw.sm.service.impl;

import com.lw.sm.dao.AdminDao;
import com.lw.sm.entity.Admin;
import com.lw.sm.factory.DaoFactory;
import com.lw.sm.service.AdminService;
import com.lw.sm.utils.ResultEntity;
import org.apache.commons.codec.digest.DigestUtils;

import javax.tools.Diagnostic;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author WL
 * @Date 2020/11/15
 **/
public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Override
    public ResultEntity adminLogin(String account, String password) {
        ResultEntity resultEntity;
        Admin admin = null;
        try {
            //根据账号查询管理员信息，捕获SQL异常
            admin = adminDao.finAdminByAccount(account);
        } catch (SQLException e) {
            System.err.println("根据账号查询管理员信息出现SQL异常");
        }
        //根据账号查找到了记录
        if (admin != null) {
            //比较密码，此时需要将客户传过来的密码进行MD5加密才能比对
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())) {
                resultEntity = ResultEntity.builder().code(0).message("登陆成功！").data(admin).build();
            } else {
                resultEntity = ResultEntity.builder().code(1).message("密码错误！").build();
            }
        } else {
            //账号不存在
            resultEntity = ResultEntity.builder().code(2).message("账号不存在！").build();
        }
        return resultEntity;
    }
}
