/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connplayer;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Firmas
 */
public class LayoutConnPlayer extends javax.swing.JFrame {
    
    private int id;
    /**
     * Creates new form LayoutConnPlayer
     */
    public LayoutConnPlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        albumArt = new javax.swing.JFrame();
        connPlayerPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        anoTextField = new javax.swing.JTextField();
        anoLabel = new javax.swing.JLabel();
        midiaComboBox = new javax.swing.JComboBox<>();
        midiaLabel = new javax.swing.JLabel();
        artistaLabel = new javax.swing.JLabel();
        artistaTextField = new javax.swing.JTextField();
        generoLabel = new javax.swing.JLabel();
        generoComboBox = new javax.swing.JComboBox<>();
        primeiraButton = new javax.swing.JButton();
        anteriorButton = new javax.swing.JButton();
        proximaButton = new javax.swing.JButton();
        ultimaButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        albumTextField = new javax.swing.JTextField();
        albumLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout albumArtLayout = new javax.swing.GroupLayout(albumArt.getContentPane());
        albumArt.getContentPane().setLayout(albumArtLayout);
        albumArtLayout.setHorizontalGroup(
            albumArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        albumArtLayout.setVerticalGroup(
            albumArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        connPlayerPanel.setBackground(new java.awt.Color(51, 51, 51));
        connPlayerPanel.setPreferredSize(new java.awt.Dimension(624, 198));

        nomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("Nome");

        anoLabel.setBackground(new java.awt.Color(255, 255, 255));
        anoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        anoLabel.setForeground(new java.awt.Color(255, 255, 255));
        anoLabel.setText("Ano");

        midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Google Music", "Spotify", "HD 5.1", "CD", "DVD", "Itunes", "Vinil", "Fita K7" }));
        midiaComboBox.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                midiaComboBoxInputMethodTextChanged(evt);
            }
        });
        midiaComboBox.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                midiaComboBoxVetoableChange(evt);
            }
        });

        midiaLabel.setBackground(new java.awt.Color(255, 255, 255));
        midiaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        midiaLabel.setForeground(new java.awt.Color(255, 255, 255));
        midiaLabel.setText("Mídia");

        artistaLabel.setBackground(new java.awt.Color(255, 255, 255));
        artistaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        artistaLabel.setForeground(new java.awt.Color(255, 255, 255));
        artistaLabel.setText("Artista");

        generoLabel.setBackground(new java.awt.Color(255, 255, 255));
        generoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        generoLabel.setForeground(new java.awt.Color(255, 255, 255));
        generoLabel.setText("Genêro");

        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Pop", "Rock", "Samba", "Funk", "Instrumental", "Sertanejo", "Black", "Rap", "Eletronica", "Reggae" }));

        primeiraButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        primeiraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/primeira.png"))); // NOI18N
        primeiraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        primeiraButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                primeiraButtonMouseMoved(evt);
            }
        });
        primeiraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeiraButtonMouseClicked(evt);
            }
        });
        primeiraButton.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                primeiraButtonInputMethodTextChanged(evt);
            }
        });
        primeiraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiraButtonActionPerformed(evt);
            }
        });

        anteriorButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        anteriorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/anterior.png"))); // NOI18N
        anteriorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anteriorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorButtonMouseClicked(evt);
            }
        });

        proximaButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        proximaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/proxima.png"))); // NOI18N
        proximaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proximaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proximaButtonMouseClicked(evt);
            }
        });

        ultimaButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        ultimaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/ultima.png"))); // NOI18N
        ultimaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ultimaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ultimaButtonMouseClicked(evt);
            }
        });

        deletarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        deletarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/deletar.png"))); // NOI18N
        deletarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarButtonMouseClicked(evt);
            }
        });

        editarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/editar.png"))); // NOI18N
        editarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        salvarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/salvar.png"))); // NOI18N
        salvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarButtonMouseClicked(evt);
            }
        });
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        novoButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        novoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/add.png"))); // NOI18N
        novoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoButtonMouseClicked(evt);
            }
        });
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        buscarButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        buscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connplayer/buscar.png"))); // NOI18N
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarButtonMouseClicked(evt);
            }
        });
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        albumLabel.setBackground(new java.awt.Color(255, 255, 255));
        albumLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        albumLabel.setForeground(new java.awt.Color(255, 255, 255));
        albumLabel.setText("Album");

        javax.swing.GroupLayout connPlayerPanelLayout = new javax.swing.GroupLayout(connPlayerPanel);
        connPlayerPanel.setLayout(connPlayerPanelLayout);
        connPlayerPanelLayout.setHorizontalGroup(
            connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connPlayerPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(primeiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anteriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proximaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ultimaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(connPlayerPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(artistaLabel)
                    .addComponent(nomeLabel))
                .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(connPlayerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(midiaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(midiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(connPlayerPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(artistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 56, Short.MAX_VALUE))
        );
        connPlayerPanelLayout.setVerticalGroup(
            connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connPlayerPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoLabel)
                    .addComponent(midiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midiaLabel))
                .addGap(18, 18, 18)
                .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistaLabel)
                    .addComponent(artistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoLabel)
                    .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(albumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(albumLabel))
                .addGap(30, 30, 30)
                .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anteriorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proximaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ultimaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primeiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(deletarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(connPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(connPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primeiraButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void primeiraButtonInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_primeiraButtonInputMethodTextChanged

    }//GEN-LAST:event_primeiraButtonInputMethodTextChanged

    private void primeiraButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeiraButtonMouseClicked
        String sql = "SELECT ID, NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM FROM MUSICA ORDER BY ID ASC LIMIT 1";
        try (Connection conn = Conexao.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                this.id = rs.getInt("ID");
                artistaTextField.setText(rs.getString("ARTISTA"));
                nomeTextField.setText(rs.getString("NOME"));
                generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("genero") }));
                midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("midia") }));
                albumTextField.setText(rs.getString("album"));
                anoTextField.setText(String.valueOf(rs.getInt("ano")));           
            }
            catch (SQLException e) {
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_primeiraButtonMouseClicked

    private void primeiraButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeiraButtonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_primeiraButtonMouseMoved

    private void buscarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseClicked
        Buscar x = new Buscar();
        x.pesquisar(String.valueOf(nomeTextField.getText()));
        //System.out.println(String.valueOf(nomeTextField.getText()));
        this.id = x.getId();
        artistaTextField.setText(x.getArtista());
        nomeTextField.setText(x.getMusica());
        anoTextField.setText(String.valueOf(x.getAno()));
        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getGenero() }));
        midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getMidia() }));
        albumTextField.setText(x.getAlbum());
    }//GEN-LAST:event_buscarButtonMouseClicked

    private void midiaComboBoxVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_midiaComboBoxVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_midiaComboBoxVetoableChange

    private void midiaComboBoxInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_midiaComboBoxInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_midiaComboBoxInputMethodTextChanged

    private void novoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoButtonMouseClicked
        artistaTextField.setText("");
        nomeTextField.setText("");
        anoTextField.setText("");
        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Pop", "Rock", "Samba", "Funk", "Instrumental", "Sertanejo", "Black", "Rap", "Eletronica", "Reggae" }));
        midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Google Music", "Spotify", "HD 5.1", "CD", "DVD", "Itunes", "Vinil", "Fita K7" }));
        albumTextField.setText("");
    }//GEN-LAST:event_novoButtonMouseClicked

    private void salvarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarButtonMouseClicked
        String nome = null, midia  = null, artista = null, genero = null, album = null;
        int ano = 0;
        if(!midiaComboBox.getSelectedItem().equals("Selecione") &&  !generoComboBox.getSelectedItem().equals("Selecione")){
            if(!nomeTextField.getText().equals("") &&  !artistaTextField.getText().equals("")){
                nome = nomeTextField.getText();
                artista = artistaTextField.getText();
                midia = String.valueOf(midiaComboBox.getSelectedItem());
                genero = String.valueOf(generoComboBox.getSelectedItem());
                album = albumTextField.getText();
                ano = Integer.parseInt(anoTextField.getText());
            }
            else if(nomeTextField.getText().equals("") &&  artistaTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Falta o nome da musica e do artista");
            }
            else if(nomeTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Falta o nome da musica");
            }
            else if(artistaTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Falta o nome do artista");
            }
        }
        else if(midiaComboBox.getSelectedItem().equals("Selecione") && generoComboBox.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "Entre com o genero e a midía!");
        }
        else if(midiaComboBox.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "Entre com a midía!");
        }
        else if(generoComboBox.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "Entre com o genero!");
        }
        Salvar add = new Salvar(nome, ano, midia, artista, genero, album);
    }//GEN-LAST:event_salvarButtonMouseClicked

    private void ultimaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ultimaButtonMouseClicked
        String sql = "SELECT ID, NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM FROM MUSICA ORDER BY ID DESC LIMIT 1";
        try (Connection conn = Conexao.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                this.id = rs.getInt("ID");
                artistaTextField.setText(rs.getString("ARTISTA"));
                nomeTextField.setText(rs.getString("NOME"));
                generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("genero") }));
                midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("midia") }));
                albumTextField.setText(rs.getString("album"));
                anoTextField.setText(String.valueOf(rs.getInt("ano")));           
            }
            catch (SQLException e) {
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_ultimaButtonMouseClicked

    private void deletarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarButtonMouseClicked
        String nome = nomeTextField.getText();
        int id = 0;
        String pegaoid = "SELECT ID, upper(NOME)as nome FROM MUSICA WHERE NOME = '"+ nome +"'";
        String deleta = "DELETE FROM MUSICA WHERE NOME = '"+nome+"'";
        try(Connection conn = Conexao.connect();
            PreparedStatement pstmt = conn.prepareStatement(deleta);
            Statement stmt  = conn.createStatement();
            ResultSet rs = stmt.executeQuery(pegaoid)){
            id = rs.getInt("ID");
            nome = rs.getString("NOME");
            int serio = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir a seguinte musica: " + nome);
            if(serio == JOptionPane.YES_OPTION)
                pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deletado");
                    this.dispose();
                    new LayoutConnPlayer().setVisible(true);
            if(serio == JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_deletarButtonMouseClicked

    private void anteriorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorButtonMouseClicked
        this.id -= 1;
        String sql = "SELECT ID, NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM FROM MUSICA WHERE ID = " + this.id + "";
        try (Connection conn = Conexao.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                this.id = rs.getInt("ID");
                artistaTextField.setText(rs.getString("ARTISTA"));
                nomeTextField.setText(rs.getString("NOME"));
                generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("genero") }));
                midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("midia") }));
                albumTextField.setText(rs.getString("album"));
                anoTextField.setText(String.valueOf(rs.getInt("ano")));           
            }
            catch (SQLException e) {
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_anteriorButtonMouseClicked

    private void proximaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proximaButtonMouseClicked
        this.id += 1;
        String sql = "SELECT ID, NOME, ANO, MIDIA, ARTISTA, GENERO, ALBUM FROM MUSICA WHERE ID = " + this.id + "";
        try (Connection conn = Conexao.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                this.id = rs.getInt("ID");
                artistaTextField.setText(rs.getString("ARTISTA"));
                nomeTextField.setText(rs.getString("NOME"));
                generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("genero") }));
                midiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { rs.getString("midia") }));
                albumTextField.setText(rs.getString("album"));
                anoTextField.setText(String.valueOf(rs.getInt("ano")));           
            }
            catch (SQLException e) {
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_proximaButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LayoutConnPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutConnPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutConnPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutConnPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutConnPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame albumArt;
    private javax.swing.JLabel albumLabel;
    private javax.swing.JTextField albumTextField;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField anoTextField;
    private javax.swing.JButton anteriorButton;
    private javax.swing.JLabel artistaLabel;
    private javax.swing.JTextField artistaTextField;
    private javax.swing.JButton buscarButton;
    private javax.swing.JPanel connPlayerPanel;
    private javax.swing.JButton deletarButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JComboBox<String> midiaComboBox;
    private javax.swing.JLabel midiaLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton primeiraButton;
    private javax.swing.JButton proximaButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton ultimaButton;
    // End of variables declaration//GEN-END:variables

    private void System(String pause) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}