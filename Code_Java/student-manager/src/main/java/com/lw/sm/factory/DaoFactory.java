package com.lw.sm.factory;

import com.lw.sm.dao.AdminDao;
import com.lw.sm.dao.impl.AdminDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description 工厂类
 * @Author WL
 * @Date 2020/11/15
 **/

public class DaoFactory {
    /**
     * 获得AdminDao实例
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }
}
