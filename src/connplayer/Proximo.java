/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Orion
 */

public class Proximo {
    private String artista, nome, genero, midia, album, ano;
    private int id;

    public String getArtista() {
        return artista;
    }

    public String getNome() {
        return nome;
    }

    public String getMidia() {
        return midia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getAno() {
        return ano;
    }

    public int getId() {
        return id;
    }

    public Proximo(int id) {
        id += 1;
        String sql = "SELECT ID, NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM FROM MUSICA WHERE ID = " + id + "";
        try (Connection conn = Conexao.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                this.id = rs.getInt("ID");
                artista = rs.getString("ARTISTA");
                nome = rs.getString("NOME");
                genero = rs.getString("genero");
                album = rs.getString("album");
                midia = rs.getString("midia");
                ano = rs.getString("ano");
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}