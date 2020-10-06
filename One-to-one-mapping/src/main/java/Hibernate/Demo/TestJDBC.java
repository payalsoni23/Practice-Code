package Hibernate.Demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public TestJDBC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";

		try {
			System.out.println("Connecting to database " + url);
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
