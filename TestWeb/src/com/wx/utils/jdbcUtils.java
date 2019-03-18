package com.wx.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class jdbcUtils {
	private static DataSource dataSource=null;
	static {
		dataSource=new ComboPooledDataSource("mysql");
	}
    public static Connection getConn() {
    	Connection conn=null;
    	try {
			conn= dataSource.getConnection();
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return conn;
    }
    public static void closeConn(Connection conn) {
    	if(conn!=null) {
    		try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    }
}
