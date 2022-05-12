/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adoli
 */
//kniznice
import java.util.*;
import java.io.File;
import java.util.Random;
import javax.swing.*;

public class bj extends javax.swing.JFrame {
    
  
    
    String cardFolder = "C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\cards\\";
    //otvaranie folderu
    File folder = new File(cardFolder);
    String[] cardPath = new String[52];
    List<String> balicek = new ArrayList<>();
    List<String> vRuke = new ArrayList<>();
    int[] cardValues = new int[52];
    int score = 0;
     
    public bj() {
        initComponents();
        jTextField1.setEditable(false);
        //folder(52 kariet)- ziskavanie vsetkych kariet
        File[] listOfFiles = folder.listFiles();
        //prejdenie celeho folderu kazdej karty
        for (int i = 0; i < cardPath.length; i++) {
            cardPath[i] = listOfFiles[i].getName();
            String tempNum = "";
            boolean readyToRead = false;
            //hladam cislice (podtrzitka, bodky)
            for (int j = 0; j < cardPath[i].length(); j++) {
                if(cardPath[i].charAt(j) == '_'){
                    readyToRead = true;
                }
                else if(readyToRead){
                    if(cardPath[i].charAt(j) == '.'){
                        readyToRead = false;
                        cardValues[i] = Integer.parseInt(tempNum);
                    }
                    tempNum += String.valueOf(cardPath[i].charAt(j));  
                }
            }
        }
        setup();
    }
    
    private void setup(){
        score = 0;
        balicek.clear();
        vRuke.clear();
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        
        // pridavam karty do balicka
        for (int i = 0; i < cardPath.length; i++) {
            balicek.add(cardPath[i]);
            
        
        }  
      /*  for (int i = 0; i < 2; i++) {
            // taham 2 karty
            takeCard();
        } */
        
    }
    private void lose(){
        JOptionPane.showMessageDialog(null, "prehral si s bodmi: "+String.valueOf(score));
        setup();
    }
    private void takeCard(){
        Random rand = new Random();
        int temp = rand.nextInt(balicek.size());
        vRuke.add(balicek.get(temp));
        for (int i = 0; i < cardPath.length; i++) {
            //hladanie pozadovanej karty
            if(cardPath[i] == balicek.get(temp)){
                score+= cardValues[i];
                break;
            }
        }
        
        jTextField1.setText(String.valueOf(score));
        /*System.out.println(vRuke);
        System.out.println(jLabel3.getIcon().toString().endsWith("back.png"));
        System.out.println(cardFolder+balicek.get(temp)); */
        
        // nablizsia volna karta sa zmeni na random z balicka
        if(jLabel5.getIcon().toString().endsWith("back.png")){
            jLabel5.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel6.getIcon().toString().endsWith("back.png")){
            jLabel6.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel3.getIcon().toString().endsWith("back.png")){
            jLabel3.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel7.getIcon().toString().endsWith("back.png")){
            jLabel7.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel8.getIcon().toString().endsWith("back.png")){
            jLabel8.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel10.getIcon().toString().endsWith("back.png")){
            jLabel10.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel9.getIcon().toString().endsWith("back.png")){
            jLabel9.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel12.getIcon().toString().endsWith("back.png")){
            jLabel12.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel2.getIcon().toString().endsWith("back.png")){
            jLabel2.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel4.getIcon().toString().endsWith("back.png")){
            jLabel4.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel13.getIcon().toString().endsWith("back.png")){
            jLabel13.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        else if(jLabel11.getIcon().toString().endsWith("back.png")){
            jLabel11.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
        }
        
        balicek.remove(temp);
        
        if(score>21){
            lose();
        }
        else if (score == 21) {
        JOptionPane.showMessageDialog(null, "vyhral si s 21 bodmi ");
        setup();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\cardBack.png")); // NOI18N

        jButton1.setText("tahat");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("nova hra");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("koniec");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //tahat
        takeCard();
 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // nova hra
        setup();   
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        JOptionPane.showMessageDialog(null, "Mas " + score + " bodov");
        setup();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(bj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
