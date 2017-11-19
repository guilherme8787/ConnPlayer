/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;
import java.sql.*;
/**
 *
 * @author Guilherme
 */
public class Conexao {
   Connection conn = null;
   public static Connection connect() {
        // SQLite atributo que recebe o caminho do banco
        String url = "jdbc:sqlite:C:\\Users\\Orion\\Documents\\GitHub\\ConnPlayer\\db\\connplayer.sqlite";
        Connection conn = null;
        try {
            //DriveManager chama o getConnection() com o endereço e o prefixo do tipo do banco de dados
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            //Em caso de erro o SQLException (SQL vem dp java.sql.*) exibe o erro que o banco retorna
            System.out.println(e.getMessage());
        }
        //o metodo retorna a conexao
        return conn;
    }
}