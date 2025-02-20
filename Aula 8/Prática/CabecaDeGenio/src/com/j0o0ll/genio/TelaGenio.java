package com.j0o0ll.genio;

import java.awt.Color;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TelaGenio extends javax.swing.JFrame {
    private int randomNum;
    
    public TelaGenio() {
        initComponents();
        
        try {
            AudioInputStream music = AudioSystem.getAudioInputStream(new File("extra/audio/disconsiderandonego.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(music);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
        }
        
        Random r = new Random();
        randomNum = r.nextInt(5);
        
        lblResult.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sValor = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        btnAdivinhar = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabeça de Gênio");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cabecadegenio.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLEITON RASTA");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CABEÇA DE GÊNIO");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("- Tô pensando num numero entre 0 e 5, qual é caba abestado?");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Cleiton Rasta");

        sValor.setMajorTickSpacing(1);
        sValor.setMaximum(5);
        sValor.setPaintLabels(true);
        sValor.setPaintTicks(true);
        sValor.setSnapToTicks(true);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Escolha o valor:");

        btnAdivinhar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnAdivinhar.setText("Adivinhar");
        btnAdivinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinharActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("ERROU!");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel7.setText("Toda vez que o botão é apertado, o valor muda. Cuidado!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdivinhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdivinhar)
                        .addGap(18, 18, 18)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinharActionPerformed
        int val = sValor.getValue();
        String res = (val == randomNum) ? "Acertou!" : "Errou!";
        
        Color c = (val == randomNum) ? Color.GREEN : Color.RED;
        
        try {
            String audio = (val == randomNum) ? "extra/audio/correto.wav" : "extra/audio/errado.wav";
            AudioInputStream music = AudioSystem.getAudioInputStream(new File(audio));
            Clip clip = AudioSystem.getClip();
            clip.open(music);
            clip.start();
        } catch (Exception e) {
        }
        
        lblResult.setText(res);
        lblResult.setForeground(c);
        lblResult.setVisible(true);
        
        Random r = new Random();
        randomNum = r.nextInt(5);
    }//GEN-LAST:event_btnAdivinharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaGenio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblResult;
    private javax.swing.JSlider sValor;
    // End of variables declaration//GEN-END:variables
}
