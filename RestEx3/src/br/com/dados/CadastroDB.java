package br.com.dados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ex3.teste.Pessoa;
import br.com.util.Conexao;

public class CadastroDB {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public CadastroDB() {
		connection = Conexao.getConnection();
	}

	public boolean inserir(Pessoa cadastro) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO CADASTRO! (nome, idade, peso, altura) values (?, ?,?,?)");

			stmt.setString(1, cadastro.getNome());
			stmt.setInt(2, cadastro.getIdade());
			stmt.setDouble(3, cadastro.getPeso());
			stmt.setDouble(4, cadastro.getAltura());

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}
	
	public boolean alterar(Pessoa cadastro) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("UPDATE CADASTRO1 SET nome = ?,WHERE idade = ? WHERE peso = ?WHERE altura = ?\"");

			stmt.setString(1, cadastro.getNome());
			stmt.setInt(2, cadastro.getIdade());
            stmt.setDouble(3, cadastro.getPeso());
            stmt.setDouble(4, cadastro.getAltura());
            
			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}

	public List<Pessoa> getAll() {

		List<Pessoa> lstCadastro = new ArrayList<>();
		try {
			ps = this.connection.prepareStatement("SELECT  nome, idade, peso, altura FROM Cadastro1");
			rs = ps.executeQuery();

			while (rs.next()) {
				lstCadastro.add(new Pessoa(rs.getString("nome"), rs.getInt("idade"), rs.getDouble("peso"), rs.getDouble("Altura")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lstCadastro;
	}
	
	/*public boolean excluir(int codigo) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("DELETE FROM CADASTRO1 WHERE NOME =?");

			stmt.setInt(1, codigo);

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}*/
}
