// CLASSE RESPONSÁVEL PELA CONEXÃO DA APP JAVA COM O MYSQL
package sistemapdv;

import java.sql.*;
import javax.swing.*;

public class ConexaoMySQL {

    //DECLARAÇÃO DAS VARIÁVEIS DE CONEXÃO COM O BANCO DE DADOS
    private final String servidor = "localhost";
    private final String bancodados = "pdv?serverTimezone=UTC";
    private final String usuario = "root";
    private final String senha = "";
    private final String url = "jdbc:mysql://" + servidor + "/" + bancodados;

    //VARIÁVEL PARA EXECUTAR A QUERY SQL
    public Statement executa_sql;

    //VARIÁVEL PARA OBTER OS RESULTADOS DE CONSULTA SQL (SELECT)
    public ResultSet resultado;

    //VARIÁVEL PARA FAZER A CONEXÃO COM O BANCO DE DADOS
    public Connection conexao;

    //MÉTODO PRA CONECTAR APP COM O BANCO DE DADOS MYSQL
    public void ConectaBanco() {

        //TRATAMENTO DE EXCEÇÃO
        try {

            conexao = DriverManager.getConnection(url, usuario, senha);

            //JOptionPane.showMessageDialog(null, "CONEXÃO COM O BANCO REALIZADA COM SUCESSO!");

            //TESTANDO O MENU PRINCIPAL        
            MenuPrincipal menuprincipal = new MenuPrincipal();
            menuprincipal.setVisible(true);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO DE CONEXÃO COM O BANCO!\nERRO: " + ex.getMessage());

        }
    }

}
