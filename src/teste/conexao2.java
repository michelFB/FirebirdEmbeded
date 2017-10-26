package teste;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao2 {
	
	

public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// TODO Auto-generated method stub
	Class.forName("org.firebirdsql.jdbc.FBDriver");  
	String url = "jdbc:firebirdsql:embedded:c:/Users/michelb/git/novoagro/WebContent/WEB-INF/LOGIN.FDB";  
	Connection conexao  = DriverManager.getConnection(url,"SYSDBA","masterkey"); 
	System.out.println("Conectado!");
	conexao.close();
}}