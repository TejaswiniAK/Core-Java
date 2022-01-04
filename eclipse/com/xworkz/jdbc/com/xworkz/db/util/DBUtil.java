package com.xworkz.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.db.dbconstants.DBconstant;

public class DBUtil {
	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(DBconstant.MYSQL_URL, DBconstant.MYSQL_USERNAME,
					DBconstant.MYSQL_PASSWORD);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {

				connection.close();
				System.out.println("Closed the resource");

			} catch (SQLException e) {

				e.printStackTrace();
			}

	}
}
