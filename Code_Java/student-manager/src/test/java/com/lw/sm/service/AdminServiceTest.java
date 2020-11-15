package com.lw.sm.service;

import com.lw.sm.factory.ServiceFactory;
import com.lw.sm.utils.ResultEntity;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName AdminServiceTest
 * @Description TODO
 * @Author WL
 * @Date 2020/11/15
 **/
class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("wanlei@qq.com","123456");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}