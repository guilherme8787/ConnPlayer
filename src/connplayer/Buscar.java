/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class Buscar {
    private String nomemusica, artista, genero, nomealbum, midia;
    private int ano;
    public void pesquisar(String busca){
        busca = busca.toUpperCase();
        String sql = "SELECT NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM"
                + "  from MUSICA "
                + "  where upper(NOME) like '%" + busca +"%' ";
        try (Connection conn = Conexao.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                artista = rs.getString("ARTISTA");
                nomemusica = rs.getString("NOME");
                genero = rs.getString("genero");
                nomealbum = rs.getString("album");
                midia = rs.getString("midia");
                ano = rs.getInt("ano");           
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       public String getArtista(){
       return artista;
       }
       public String getMusica(){
       return nomemusica;
       }
       public String getAlbum(){
       return nomealbum;
       }
       public String getGenero(){
       return genero;
       }
       public int getAno(){
       return ano;
       }
       public String getMidia(){
       return midia;
       }
}