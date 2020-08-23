package com.morebread.api.morebread.factory;

import java.sql.Connection; 

// conexão SQL para Java 
import java.sql.DriverManager; 
import java.sql.SQLException; 

// classe para tratamento de exceções 
public class ConnectionFactory {
    public Connection getConnection() {
      try {
        System.out.println("[SERVIDOR]: Conectando ao banco de dados..");

        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/morebread","root","root");

        System.out.println("[SERVIDOR]: Sucesso ao se conectar ao banco de dados!");

        return conexao;
      }         
      catch(SQLException ex) {
        throw new RuntimeException(ex);
      }
    }
}
