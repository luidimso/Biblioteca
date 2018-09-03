package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMCliente extends DMGeral{
	public void incluir(Object objeto) {
		
	}

	public Object consultar(Object objeto) {
		
		return null;
	}
	
	public ResultSet pesquisar(String nome) {
		try {
			Statement statement = getConnection().createStatement();
			String consultarSQL = "SELECT * FROM cliente WHERE nome like '" + nome + "%'";
			System.out.println("Enviando código SQL: " + getConnection().nativeSQL(consultarSQL));
			ResultSet resultado = statement.executeQuery(consultarSQL);
			return resultado;
		}
		
		catch(SQLException e) {
			System.out.println("Erro ao enviar o comando select"); 
			return null;
		}
	}
	
}
