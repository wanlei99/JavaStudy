package com.lw.sm.dao.impl;

import com.lw.sm.dao.AdminDao;
import com.lw.sm.entity.Admin;
import com.lw.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminDaoImpl
 * @Description TODO
 * @Author WL
 * @Date 2020/11/15
 **/
public class AdminDaoImpl implements AdminDao {
    @Override
    public Admin finAdminByAccount(String account) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM t_admin WHERE account = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,account);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        while (rs.next()) {
            int id = rs.getInt("id");
            String adminAccount = rs.getString("account");
            String password = rs.getString("password");
            String adminName = rs.getString("admin_name");
            admin = new Admin();
            admin.setId(id);
            admin.setPassword(password);
            admin.setAccount(adminAccount);
            admin.setAdminName(adminName);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return admin;
    }
}
