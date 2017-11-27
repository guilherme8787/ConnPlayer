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
public class Temp {
    public int tam;
    public int[] id = new int[999];
    
    int i = 0;
        public Temp(){
        String sql = "SELECT ID FROM MUSICA";
            try (Connection conn = Conexao.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                while(rs.next()){
                    id[i] = rs.getInt("ID");
                    //System.out.println(id[i]);
                    i += 1;
                    
                } 
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    public int[] getId() {
        return id;
    }
    
    public void Count(){
        String sql = "SELECT count(ID) as ct FROM MUSICA";
            try (Connection conn = Conexao.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                if(rs.next()){
                  tam = rs.getInt("ct");
                } 
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(tam);
        }
}