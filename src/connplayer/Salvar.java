/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;
import java.sql.*;

/**
 *
 * @author Orion
 */
public class Salvar {
    public Salvar(String nmmusica, int ano, String midia, String nmartista, String genero, String album){
        try(Connection conn = Conexao.connect()){
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
