package common;

import java.sql.*;
import java.io.*;
import java.util.*;

//singleton
public class Connect {

	public static Connection getConnection() {
		Connection con = null;
		Properties prop = new Properties();

		try {
			prop.load(new FileReader("connectInfo.properties"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			Class.forName(prop.getProperty("forName"));
			con = DriverManager.getConnection(prop.getProperty("getConnection"), prop.getProperty("usr"),prop.getProperty("psw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public static void close(Connection con) {
		try {
			if (!con.isClosed())
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (!stmt.isClosed())
				stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet set) {
		try {
			if (!set.isClosed())
				set.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			if (!con.isClosed())
				con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			if (!con.isClosed())
				con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
