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
import java.awt.Color;

public class bj extends javax.swing.JFrame {

    String cardFolder = "C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\cards\\";
        //otvaranie folderu
        File folder = new File(cardFolder);
    String cardFolder1 = "C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\cards\\";
        //otvaranie folderu
        File folder1 = new File(cardFolder1);
    //C:\\Users\\adoli\\Desktop\\blackjack1\\blackjack\\src\\main\\java\\com\\img\\cards\\
    
    String[] cardPath = new String[52];
    String[] cardPath1 = new String[52];
    
    List<String> balicek = new ArrayList<>();
    List<String> vRuke = new ArrayList<>();
    List<String> balicek1 = new ArrayList<>();
    List<String> vRuke1 = new ArrayList<>();
    
    int[] cardValues = new int[52];
    int[] cardValues1 = new int[52];
    int score = 0;
    int score1 = 0;
     
    public bj() {
        initComponents();

        
        //folder(52 kariet)- ziskavanie vsetkych kariet
        File[] listOfFiles = folder.listFiles();
        //prejdenie celeho folderu kazdej karty
        for (int i = 0; i < cardPath.length; i++ ){
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
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        
        //folder(52 kariet)- ziskavanie vsetkych kariet
        folder1.listFiles();                            //File[] listOfFiles = folder1.listFiles();
        //prejdenie celeho folderu kazdej karty
        for (int i = 0; i < cardPath1.length; i++ ){
            cardPath1[i] = listOfFiles[i].getName();
            String tempNum1 = "";
            boolean readyToRead1 = false;
            //hladam cislice (podtrzitka, bodky)
            for (int j = 0; j < cardPath1[i].length(); j++) {
                if(cardPath1[i].charAt(j) == '_'){
                    readyToRead1 = true;
                }
                else if(readyToRead1){
                    if(cardPath1[i].charAt(j) == '.'){
                        readyToRead1 = false;
                        cardValues1[i] = Integer.parseInt(tempNum1);
                    }
                    tempNum1 += String.valueOf(cardPath1[i].charAt(j));  
                }
            }
        }
        setup1();

        
    }
        
    private void setup(){ 
        score = 0;
        jTextField2.setText(String.valueOf(score));
        
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel10.setVisible(false);
        jLabel9.setVisible(false);
        jLabel12.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel13.setVisible(false);
        jLabel11.setVisible(false);
        
        balicek.clear();
        vRuke.clear();
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        //jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        //jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        //jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        //jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        //jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        //jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        
        // pridavam karty do balicka
        for (int i = 0; i < cardPath.length; i++) {
            balicek.add(cardPath[i]);
            
        
        }  
      /*  for (int i = 0; i < 2; i++) {
            // taham 2 karty
            takeCard();
        } */
        
    }
    private void setup1(){ 
        score1 = 0;
        jTextField1.setText(String.valueOf(score1));
        
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel10.setVisible(false);
        jLabel9.setVisible(false);
        jLabel12.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel13.setVisible(false);
        jLabel11.setVisible(false);
        
        balicek1.clear();
        vRuke1.clear();
        //jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
       // jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
       // jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
       // jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
       // jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
       // jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\back.png"));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png"));
        
        // pridavam karty do balicka
        for (int i = 0; i < cardPath1.length; i++) {
            balicek1.add(cardPath1[i]);
            
        
        }  
      /*  for (int i = 0; i < 2; i++) {
            // taham 2 karty
            takeCard(); 
        } */
        
    } 
    
    private void lose(){
        
       if(score1 == 21 && score == 21){
             JOptionPane.showMessageDialog(null, " remiza nova hra: ");
        setup();
        setup1();
        }
       if(score1 > score && score1 <= 21 ){  
             JOptionPane.showMessageDialog(null, " dealer vyhral ");
        setup();
        setup1();
        }
       if(score > score1 && score <= 21 ){
             JOptionPane.showMessageDialog(null, " vyhral si ");
        setup();
        setup1();
        }
       if(score > 21 ){
             JOptionPane.showMessageDialog(null, " Mas viac ako 21 " + "\n Prehral si ");
        setup1();
        setup();
        }
        if(score1 > 21 ){
             JOptionPane.showMessageDialog(null, " Dealer ma viac ako 21 " + "\n Vyhral si ");
        setup1();
        setup();
        }
    }
    private void lose1(){
        //JOptionPane.showMessageDialog(null, "prehral si s bodmi: "+String.valueOf(score1));
        //setup();      + String.valueOf(score1) + String.valueOf(score)
        
       if(score1 == 21 && score == 21){
             JOptionPane.showMessageDialog(null, " remiza nova hra: ");
        setup();
        setup1();
        }
       if(score1 > score && score1<= 21){
             JOptionPane.showMessageDialog(null, " dealer vyhral ");
        setup();
        setup1();
        }
       if(score > score1 && score<= 21){
             JOptionPane.showMessageDialog(null, " vyhral si ");
        setup();
        setup1();
        }
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
        
        jTextField2.setText(String.valueOf(score));
        /*System.out.println(vRuke);
        System.out.println(jLabel3.getIcon().toString().endsWith("back.png"));
        System.out.println(cardFolder+balicek.get(temp)); */
        
        // nablizsia volna karta sa zmeni na random z balicka
        if(jLabel5.getIcon().toString().endsWith("back.png")){
            jLabel5.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel5.setVisible(true);
        }
        else if(jLabel6.getIcon().toString().endsWith("back.png")){
            jLabel6.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel6.setVisible(true);
        }
        else if(jLabel3.getIcon().toString().endsWith("back.png")){
            jLabel3.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel3.setVisible(true);
        }
        else if(jLabel7.getIcon().toString().endsWith("back.png")){
            jLabel7.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel7.setVisible(true);
        }
        else if(jLabel8.getIcon().toString().endsWith("back.png")){
            jLabel8.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel8.setVisible(true);
        }
        else if(jLabel10.getIcon().toString().endsWith("back.png")){
            jLabel10.setIcon(new javax.swing.ImageIcon(cardFolder+balicek.get(temp)));
            jLabel10.setVisible(true);
        }
        /* else if(jLabel9.getIcon().toString().endsWith("back.png")){
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
        }*/
        
        balicek.remove(temp);
        
       if(score > 21){
            lose();
       }
      
     
        /* else if (score == 21) {
        JOptionPane.showMessageDialog(null, "vyhral si s 21 bodmi ");
        setup();
        } */
    }
    private void takeCard1(){
        
        Random rand = new Random();
        int temp1 = rand.nextInt(balicek1.size());
        vRuke1.add(balicek1.get(temp1));
        for (int i = 0; i < cardPath1.length; i++) {
            //hladanie pozadovanej karty
            if(cardPath1[i] == balicek1.get(temp1)){
                score1+= cardValues1[i];
                break;
            }
        }
        
        jTextField1.setText(String.valueOf(score1));
        System.out.println(vRuke);
        /*System.out.println(jLabel3.getIcon().toString().endsWith("back.png"));
        System.out.println(cardFolder+balicek.get(temp)); */
        
        // nablizsia volna karta sa zmeni na random z balicka
       /* if(jLabel5.getIcon().toString().endsWith("back.png")){
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
        } */
        if(jLabel9.getIcon().toString().endsWith("back.png")){
            jLabel9.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel9.setVisible(true);
        }
        else if(jLabel12.getIcon().toString().endsWith("back.png")){
            jLabel12.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel12.setVisible(true);
        }
        else if(jLabel2.getIcon().toString().endsWith("back.png")){
            jLabel2.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel2.setVisible(true);
        }
        else if(jLabel4.getIcon().toString().endsWith("back.png")){
            jLabel4.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel4.setVisible(true);
        }
        else if(jLabel13.getIcon().toString().endsWith("back.png")){
            jLabel13.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel13.setVisible(true);
        }
        else if(jLabel11.getIcon().toString().endsWith("back.png")){
            jLabel11.setIcon(new javax.swing.ImageIcon(cardFolder1+balicek1.get(temp1)));
            jLabel11.setVisible(true);
        }
        
        balicek1.remove(temp1);
        
       if(score1 > 21){
            lose();
       }
       
             
                
                
        /*else if (score1 == 21) {
        JOptionPane.showMessageDialog(null, "vyhral si s 21 bodmi ");
        setup();
        } */
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
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 140, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 140, 190));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 140, 190));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 140, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 140, 190));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, 190));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 140, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel10.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 140, 190));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, 190));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack1\\src\\main\\java\\com\\img\\back.png")); // NOI18N
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 140, 190));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\cardBack.png")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 140, 190));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 120, 57));

        jButton2.setText("nova hra");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 460, 120, 57));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 100, 54));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, 120, 57));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 100, 54));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("JA");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, 30));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("DEALER");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 70, 30));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("JA");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 70, 30));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("DEALER");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 70, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\cardBack.png")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 140, 190));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoli\\Desktop\\blackjack\\blackjack\\src\\main\\java\\com\\img\\cardBack.png")); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 140, 190));

        jLabel1.setBackground(new java.awt.Color(48, 26, 27));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, 0, 1750, 720));

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
        setup1();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        takeCard1();
        
        if (score1 > score && score1 <= 21 ) { lose(); }
        else if (score1 == 21) {lose();}
      /*  jTextField1.getText();
        jTextField2.getText();
        lose();
        
        setup();
        setup1(); */
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
