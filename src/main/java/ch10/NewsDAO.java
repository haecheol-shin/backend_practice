package ch10;

import java.sql.Connection;
import java.sql.DriverManager;

public class NewsDAO {
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";
	
	public Connection open() { // DB 연결을 가져오는 메소드, DBCP를 사용하는 것이 좋음.
		Connection conn = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "jwbook", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
