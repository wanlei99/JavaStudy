package com.company.classJava.week6;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author WL
 * @Date 2020/11/9
 **/
public class LoginService {
    public boolean login(String user, String password) {
        if ("admin".equals(user) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}
