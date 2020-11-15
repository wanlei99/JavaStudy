package com.lw.sm.factory;

import com.lw.sm.service.AdminService;
import com.lw.sm.service.impl.AdminServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author WL
 * @Date 2020/11/15
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }
}
