/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisna Putra F
 */
public class frameInti extends javax.swing.JFrame {
    

    /**
     * Creates new form frameInti
     */
    public frameInti() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        outputp = new javax.swing.JTextField();
        temp6 = new javax.swing.JComboBox<>();
        inputp = new javax.swing.JTextField();
        temp5 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        outputm = new javax.swing.JTextField();
        temp4 = new javax.swing.JComboBox<>();
        inputm = new javax.swing.JTextField();
        temp3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        temp2 = new javax.swing.JComboBox<>();
        temp1 = new javax.swing.JComboBox<>();
        output = new javax.swing.JTextField();
        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BinnerD", 1, 36)); // NOI18N
        jLabel1.setText("CONVERTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 0, 230, 60);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jButton5.setText("Process");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(200, 180, 90, 70);

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(320, 180, 90, 70);

        outputp.setEditable(false);
        jPanel3.add(outputp);
        outputp.setBounds(30, 190, 110, 50);

        temp6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binary", "Octal", "HexaDecimal" }));
        jPanel3.add(temp6);
        temp6.setBounds(30, 140, 110, 50);
        jPanel3.add(inputp);
        inputp.setBounds(30, 60, 110, 50);

        temp5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal" }));
        jPanel3.add(temp5);
        temp5.setBounds(30, 10, 110, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salsadila\\Downloads\\KonverterKita-master\\KonverterKita-master\\image\\binary-139838_640.jpg")); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 0, 540, 400);

        jTabbedPane1.addTab("Programming", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButton3.setText("Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(200, 180, 90, 70);

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(320, 180, 90, 70);

        outputm.setEditable(false);
        jPanel4.add(outputm);
        outputm.setBounds(30, 190, 110, 50);

        temp4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Rp.) Rupiah", "($) Dollar", "(€) Euro", "(SR) Riyal", "(¥) Yen" }));
        jPanel4.add(temp4);
        temp4.setBounds(30, 140, 110, 50);

        inputm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputmActionPerformed(evt);
            }
        });
        jPanel4.add(inputm);
        inputm.setBounds(30, 60, 110, 50);

        temp3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Rp.) Rupiah", "($) Dollar", "(€) Euro", "(SR) Riyal", "(¥) Yen" }));
        temp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp3ActionPerformed(evt);
            }
        });
        jPanel4.add(temp3);
        temp3.setBounds(30, 10, 110, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salsadila\\Downloads\\KonverterKita-master\\KonverterKita-master\\image\\Ns41qXg.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(150, 0, 310, 230);

        jTabbedPane1.addTab("Money", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        temp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));
        temp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp2ActionPerformed(evt);
            }
        });
        jPanel1.add(temp2);
        temp2.setBounds(30, 140, 110, 50);

        temp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));
        temp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp1ActionPerformed(evt);
            }
        });
        jPanel1.add(temp1);
        temp1.setBounds(30, 10, 110, 50);

        output.setEditable(false);
        jPanel1.add(output);
        output.setBounds(30, 190, 110, 50);
        jPanel1.add(input);
        input.setBounds(30, 60, 110, 50);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 180, 90, 70);

        jButton2.setText("Process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 180, 90, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salsadila\\Downloads\\KonverterKita-master\\KonverterKita-master\\image\\termometro.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, -70, 80, 270);

        jTabbedPane1.addTab("Temperature", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 80, 490, 310);

        jButton7.setText("Home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(390, 10, 80, 23);

        setSize(new java.awt.Dimension(501, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String atas =temp1.getSelectedItem().toString();
        String bawah=temp2.getSelectedItem().toString();
        double Input = Double.parseDouble(input.getText()) ;
        double Hasil;
        
        //CELCIUS//
        if (temp1.getSelectedItem()=="Celcius" && temp2.getSelectedItem()=="Celcius"){
            Hasil=Input;
        output.setText(String.valueOf(Input));}
        
        if(temp1.getSelectedItem()=="Celcius" && temp2.getSelectedItem()=="Reamur"){
        Hasil=Input*4/5;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Celcius" && temp2.getSelectedItem()=="Fahrenheit"){
        Hasil=Input*9/5+32;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Celcius" && temp2.getSelectedItem()=="Kelvin"){
        Hasil=Input+273;
        output.setText(String.valueOf(Hasil));}
        //CELCIUS//
        
    //Fahrenheit//
        if(temp1.getSelectedItem()=="Fahrenheit" && temp2.getSelectedItem()=="Fahrenheit"){
        Hasil=Input;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Fahrenheit" && temp2.getSelectedItem()=="Celcius"){
        Hasil=(Input-32)*5/9;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Fahrenheit" && temp2.getSelectedItem()=="Kelvin"){
        Hasil=(Input-32)/1.8000+273.15;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Fahrenheit" && temp2.getSelectedItem()=="Reamur"){
        Hasil=(Input-32)*4/9;
        output.setText(String.valueOf(Hasil));}
    //Fahrenheit//
    
        //REAMUR//
        if(temp1.getSelectedItem()=="Reamur" && temp2.getSelectedItem()=="Reamur"){
        Hasil=Input;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Reamur" && temp2.getSelectedItem()=="Celcius"){
        Hasil=Input*5/4;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Reamur" && temp2.getSelectedItem()=="Fahrenheit"){
        Hasil=(Input*9/4)+32;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Reamur" && temp2.getSelectedItem()=="Kelvin"){
        Hasil=(Input/4*5)+273.15;
        output.setText(String.valueOf(Hasil));}
        //REAMUR//
        
    //Kelvin//
        if(temp1.getSelectedItem()=="Kelvin" && temp2.getSelectedItem()=="Kelvin"){
        Hasil=Input;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Kelvin" && temp2.getSelectedItem()=="Celcius"){
        Hasil=Input-273.15;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Kelvin" && temp2.getSelectedItem()=="Reamur"){
        Hasil=(Input-273.15)/5*4;
        output.setText(String.valueOf(Hasil));}
        
        if(temp1.getSelectedItem()=="Kelvin" && temp2.getSelectedItem()=="Fahrenheit"){
        Hasil=((Input-273.15)/5*9)+32;
        output.setText(String.valueOf(Hasil));}
    //Kelvin//
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String atasm =temp3.getSelectedItem().toString();
        String bawahm=temp4.getSelectedItem().toString();
        float Inputm = Float.parseFloat(inputm.getText()) ;
        float Hasilm;  
    //RUPIAH
         if(temp3.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasilm=Inputm;
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="($) Dollar"){
        Hasilm=(float) (Inputm/13157.8947);
        outputm.setText(String.valueOf(Hasilm));}
        
         if (temp3.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(€) Euro"){
        Hasilm=(float) (Inputm/14534.8684);
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasilm=(float) (Inputm/3519.19737);
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(Rp.) Rupiah" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasilm=(float) (Inputm/125.934211);
        outputm.setText(String.valueOf(Hasilm));}
    //RUPIAH
        //Dollar
        if (temp3.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="($) Dollar"){
        Hasilm=Inputm;
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasilm=(float) (Inputm*13157.8947);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(€) Euro"){
        Hasilm=(float) (Inputm*0.905);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasilm=(float) (Inputm*3.75);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="($) Dollar" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasilm=(float) (Inputm*104.5);
        outputm.setText(String.valueOf(Hasilm));}
        //Dollar
    //EURO
        if (temp3.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(€) Euro"){
        Hasilm=Inputm;
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasilm=(float) (Inputm*14534.8684);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="($) Dollar"){
        Hasilm=(float) (Inputm*1.10465);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasilm=(float) (Inputm*4.142);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(€) Euro" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasilm=(float) (Inputm*115.416);
        outputm.setText(String.valueOf(Hasilm));}
    //EURO
        //RIYAL
         if (temp3.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasilm=Inputm;
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasilm=(float) (Inputm*3519.19737);
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="($) Dollar"){
        Hasilm=(float) (Inputm*0.27);
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(€) Euro"){
        Hasilm=(float) (Inputm*0.24);
        outputm.setText(String.valueOf(Hasilm));}
         
         if (temp3.getSelectedItem()=="(SR) Riyal" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasilm=(float) (Inputm*27.865);
        outputm.setText(String.valueOf(Hasilm));}
        //RIYAL
    //YEN
        if (temp3.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(¥) Yen"){
        Hasilm=Inputm;
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(Rp.) Rupiah"){
        Hasilm=Inputm*126;
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="($) Dollar"){
        Hasilm=(float) (Inputm*0.009571);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(€) Euro"){
        Hasilm=(float) (Inputm*0.008664);
        outputm.setText(String.valueOf(Hasilm));}
        
        if (temp3.getSelectedItem()=="(¥) Yen" && temp4.getSelectedItem()=="(SR) Riyal"){
        Hasilm=(float) (Inputm*0.035886);
        outputm.setText(String.valueOf(Hasilm));}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void temp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temp2ActionPerformed

    private void inputmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputmActionPerformed

    private void temp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temp3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        inputm.setText("");
        outputm.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        inputp.setText("");
        outputp.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String atasm =temp5.getSelectedItem().toString();
        String bawahm=temp6.getSelectedItem().toString();
        int Inputp = Integer.parseInt(inputp.getText()) ;        
        int Hasilp; 
//decimal//
        if (temp5.getSelectedItem()=="Decimal" && temp6.getSelectedItem()=="Decimal"){
        Hasilp=Inputp;
        outputp.setText(String.valueOf(Hasilp));}
        if (temp5.getSelectedItem()=="Decimal" && temp6.getSelectedItem()=="Binary"){    
           String nampung= inputp.getText();
           int Hasil=Integer.parseInt(nampung);
           String Binary = Integer.toBinaryString(Hasil);
           outputp.setText(String.valueOf(Binary));}
         if (temp5.getSelectedItem()=="Decimal" && temp6.getSelectedItem()=="Octal"){    
           String nampung= inputp.getText();
           int Hasil=Integer.parseInt(nampung);
           String Octal = Integer.toOctalString(Hasil);
           outputp.setText(String.valueOf(Octal));}
          if (temp5.getSelectedItem()=="Decimal" && temp6.getSelectedItem()=="HexaDecimal"){    
           String nampung= inputp.getText();
           int Hasil=Integer.parseInt(nampung);
           String Hexa = Integer.toHexString(Hasil);
           outputp.setText(String.valueOf(Hexa));}
//end decimal//
    
    
    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
new frameHome().setVisible(true);
       dispose();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void temp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        input.setText("");
        output.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frameInti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JTextField inputm;
    private javax.swing.JTextField inputp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField output;
    private javax.swing.JTextField outputm;
    private javax.swing.JTextField outputp;
    private javax.swing.JComboBox<String> temp1;
    private javax.swing.JComboBox<String> temp2;
    private javax.swing.JComboBox<String> temp3;
    private javax.swing.JComboBox<String> temp4;
    private javax.swing.JComboBox<String> temp5;
    private javax.swing.JComboBox<String> temp6;
    // End of variables declaration//GEN-END:variables
}
