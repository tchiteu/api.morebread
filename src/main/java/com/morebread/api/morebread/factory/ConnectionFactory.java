package com.morebread.api.morebread.factory;


import java.sql.Connection; 

// conexão SQL para Java 
import java.sql.DriverManager; 
import java.sql.SQLException; 

// classe para tratamento de exceções 
public class ConnectionFactory {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","seu-nome-de-usuario","sua-senha");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}
