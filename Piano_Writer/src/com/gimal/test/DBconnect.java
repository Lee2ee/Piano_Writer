package com.gimal.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

	private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
	private static final String dbUrl = "jdbc:mysql://localhost:3306/login_db?serverTimzone=UTC&useUnicode=true&characterEncoding=UTF8";
	private static final String id = "root";
	private static final String pw = "1234";

	private static Connection conn = null;

	public static Connection connect() {
		
		try {
			Class.forName(dbDriver);
			try {
				conn = DriverManager.getConnection(dbUrl, id, pw);

				if (conn != null) {
					System.out.println("DB 연결 성공");
				} else {
					System.out.println("DB 연결 실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} return conn;
	}

	public static void close() {
		try {
			if (conn != null) {
				conn.close();
				System.out.println("DB 연결 해제!");
			}
		} catch (Exception e) {
			System.out.println("DB close() Error!");
		}

	}

}
