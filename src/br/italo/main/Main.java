package br.italo.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.italo.conexao.Conexao;

public class Main {
	
	
	static Connection con;
	static PreparedStatement pmp;
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//Strings SQL
		
		String CREATE_TABLE = "create table if not exists user ("
				+ "nome varchar(20), senha int)";
		
		String INSERT_DADOS = "insert into user (nome, senha)"
				+ "values (?, ?)";
		
		String UPDATE_DADOS = "update user set senha = ? "
				+ "where nome = 'Pedro'";
		
		String DELETE_DADOS = "delete from user where senha = ?";
		
		String SELECT_DADOS = "select * from user where nome = ?";
		
		con = Conexao.conectar();
		
		if ( con != null) {
			
			//criando a tabela no banco de dados
			/*
			pmp = con.prepareStatement(CREATE_TABLE);
			
			int retorno = pmp.executeUpdate();
			System.out.println(retorno); */
			
			
			//inserindo os dados
			/*
			pmp = con.prepareStatement(INSERT_DADOS);
			pmp.setString(1,"Pedro");
			pmp.setInt(2,123);
			
			int num_linhas = pmp.executeUpdate();
			System.out.println(num_linhas);*/
			
			//atualizando os dados
			/*
			pmp = con.prepareStatement(UPDATE_DADOS);
			pmp.setInt(1,1234);
			
			int num_linhas = pmp.executeUpdate();
			System.out.println(num_linhas);*/
			
			//apagando dados na tabela 
			/*			
			pmp = con.prepareStatement(DELETE_DADOS);
			pmp.setInt(1,1234);
			
			int num_linhas = pmp.executeUpdate();
			System.out.println(num_linhas); */
			
			//selecionando os dados
			
			pmp = con.prepareStatement(SELECT_DADOS);
			pmp.setString(1,"pedro");
			
			ResultSet rs = pmp.executeQuery();
			while ( rs.next()) {
	System.out.println("Nome do usuário: " + rs.getString("nome") +
			" e  a Senha do usuario: " + rs.getString("senha"));
	
			}
			
		}
		
		else {
			
			System.out.println("Sem conexão!!");
		}

	}

}
