package se.hs.ac.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final static String dbDriver = "com.mysql.jdbc.Driver";
	private final static String dbURL = "jdbc:mysql://localhost:3306/week5?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private final static String dbUser = "root";
	private final static String dbPassword = "0000";

	static {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(dbURL, dbUser, dbPassword);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
