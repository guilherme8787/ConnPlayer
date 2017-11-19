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
        ArrayList<String> musica = new ArrayList();
        String sql = "SELECT nm_musica, ano_musica, genero, nm_album, ano_album, midia, nm_artista "
                + "  from MUSICA "
                + "  inner join ALBUM on musica.id_album = album.id_album "
                + "  inner join ARTISTA on musica.id_artista = artista.id_artista"
                + "  where upper(nm_musica) like '%" + busca +"%' ";
        
        try (Connection conn = Conexao.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            int i = 0;
            // loop through the result set
            while (rs.next()) {
                /*System.out.println(rs.getInt("ano_musica") +  "\t" +
                rs.getString("nm_artista"));*/
                musica.add(rs.getString("nm_musica"));
                
                artista = rs.getString("nm_artista");
                nomemusica = rs.getString("nm_musica");
                genero = rs.getString("genero");
                nomealbum = rs.getString("nm_album");
                midia = rs.getString("midia");
                ano = rs.getInt("ano_musica");
                i++;
                if(i > 3)
                for(int f = 0; f < 4; f++){
                    System.out.println(musica.get(f));
                }              
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