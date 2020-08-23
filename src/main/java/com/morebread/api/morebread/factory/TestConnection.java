package com.morebread.api.morebread.factory;

import java.sql.Connection; 
import java.sql.SQLException; 

public class TestConnection {     
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		connection.close();
	}
}