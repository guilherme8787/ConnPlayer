/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Orion
 */
public class Editar {

     public Editar(String nome, int ano, String midia, String artista, String genero, String album, int id){
        String sql = "UPDATE MUSICA SET NOME = ?"
                + " , ANO = ?"
                + ", MIDIA = ?"
                + ", ARTISTA = ?" 
                + ", GENERO = ?" 
                + ", ALBUM = ? where ID == ?";
        try(Connection conn = Conexao.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setInt(2, ano);
            pstmt.setString(3, midia);
            pstmt.setString(4, artista);
            pstmt.setString(5, genero);
            pstmt.setString(6, album);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
}
