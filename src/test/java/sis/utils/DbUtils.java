package sis.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class DbUtils {
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;

	// connect to DB
	public static void getConnection() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		try {
			String dbUrl = ConfigsReader.getProperty("dbUrl");
			String dbUserName = ConfigsReader.getProperty("dbUserName");
			String dbPassword = ConfigsReader.getProperty("dbPassword");

			conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			System.out.println("Can not connect to the DB!!!");
			e.printStackTrace();
		}
	}

	// get the data
	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {
		List<Map<String, String>> listOfMaps = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sqlQuery);

			ResultSetMetaData rsMetaData = rs.getMetaData();
			int colCount = rsMetaData.getColumnCount();

			Map<String, String> map;

			// iterate over the rows
			while (rs.next()) {
				// initialize the new map
				map = new LinkedHashMap<>();
				// fill the map using the meta data
				for (int i = 1; i <= colCount; i++) {
					map.put(rsMetaData.getColumnName(i), rs.getString(i));
				}

				listOfMaps.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listOfMaps;
	}

	// close the connection
	public static void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (st != null) {
				st.close();
			}

			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
