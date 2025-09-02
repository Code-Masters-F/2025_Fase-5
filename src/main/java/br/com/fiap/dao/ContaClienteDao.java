package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ContaClienteDao {
    private Connection conexao;

    public ContaClienteDao() throws SQLException {
        this.conexao = ConnectionFactory.getConnection();
    }

}
