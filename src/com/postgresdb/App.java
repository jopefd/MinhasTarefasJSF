package com.postgresdb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.ufrn.imd.dominio.Tarefa;

public class App {
	private final String url = "jdbc:postgresql://localhost/tarefas";
	private final String user = "postgres";
	private final String password = "postgres";
	
	public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
	
	public void insertTarefa(Tarefa tarefa) {
		String SQL = "INSERT INTO minhas_tarefas(titulo, descricao, responsavel, prioridade, deadline) "
				+ "VALUES(?, ?, ?, ?, ?)";
		
		try (Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(SQL,
						Statement.RETURN_GENERATED_KEYS)) {
			
			pstmt.setString(1, tarefa.getTitulo());
			pstmt.setString(2, tarefa.getDescricao());
			pstmt.setString(3, tarefa.getResponsavel());
			pstmt.setString(4, tarefa.getPrioridade());
			pstmt.setDate(5, (Date) tarefa.getDeadline());
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.connect();
	}
}
