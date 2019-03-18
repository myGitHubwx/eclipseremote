package com.wx.test;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.wx.utils.jdbcUtils;

class jdbcUtilsTest {

	@Test
	void testGetConn() {
		Connection conn = jdbcUtils.getConn();
		System.out.println(conn);
	}

}
