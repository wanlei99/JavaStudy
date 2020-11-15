package com.lw.sm.dao;

import com.lw.sm.entity.Admin;
import com.lw.sm.factory.DaoFactory;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName AdminDaoTest
 * @Description TODO
 * @Author WL
 * @Date 2020/11/15
 **/
class AdminDaoTest {
private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

@Test
    public void findAdminByAccount() {
    Admin admin;
    try {
        admin = adminDao.finAdminByAccount("wenlei@qq.com");
        assertEquals("wanlei",admin.getAdminName());
        System.out.println(admin);
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
}

}