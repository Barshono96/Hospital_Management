/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receptionist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PSearch_Info extends javax.swing.JFrame {

    /**
     * Creates new form PSearch_Info
     */
    public PSearch_Info() {
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

        jLabel1 = new javax.swing.JLabel();
        IdInputField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1Pname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Gender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Depertment = new javax.swing.JTextField();
        jButton1Search = new javax.swing.JButton();
        jLabel6Guardian = new javax.swing.JLabel();
        jTextField1Guardian = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Contac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1Address = new javax.swing.JTextField();
        jButton1Discharge = new javax.swing.JButton();
        jButton1Back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Seat-No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 20));

        IdInputField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IdInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IdInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 58, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Patient's Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jTextField1Pname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1Pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 183, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTextField1Gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 119, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jTextField1Age.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1AgeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Depertment");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextField1Depertment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1Depertment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 183, -1));

        jButton1Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Search.setForeground(new java.awt.Color(0, 0, 204));
        jButton1Search.setText("Search");
        jButton1Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 100, 30));

        jLabel6Guardian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6Guardian.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6Guardian.setText("Guardian");
        getContentPane().add(jLabel6Guardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jTextField1Guardian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1Guardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 183, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Contac_No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jTextField1Contac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1Contac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ContacActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Contac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 183, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jTextField1Address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 397, -1));

        jButton1Discharge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Discharge.setForeground(new java.awt.Color(0, 0, 204));
        jButton1Discharge.setText("Discharge");
        jButton1Discharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DischargeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Discharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 130, 40));

        jButton1Back.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1Back.setForeground(new java.awt.Color(0, 0, 204));
        jButton1Back.setText("Back");
        jButton1Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BackActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Enter A Seat No For Searching Patient Informtion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 460, 40));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, 70));

        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\S.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        setSize(new java.awt.Dimension(855, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IdInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputFieldActionPerformed

    private void jButton1SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SearchActionPerformed
        // TODO add your handling code here:
        
         String InputSeat = (String)IdInputField.getText();
        
        File file = new File("output.txt");
        try {
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String ss = in.nextLine();
                //System.out.println(ss);
                String[] s2 = new String[8];
                
                s2 = ss.split(" ", 20);
                if (InputSeat.equals(s2[0])) {
                    jTextField1Pname.setText(s2[1]);
                    jTextField1Gender.setText(s2[2]);
                    jTextField1Age.setText(s2[3]);
                    jTextField1Depertment.setText(s2[4]);
                    jTextField1Guardian.setText(s2[5]);
                    jTextField1Contac.setText(s2[6]);
                    jTextField1Address.setText(s2[7]);
                  
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        
    }//GEN-LAST:event_jButton1SearchActionPerformed

    private void discharge()
    {
                    IdInputField.setText(null);
                    jTextField1Pname.setText(null);
                    jTextField1Gender.setText(null);
                    jTextField1Age.setText(null);
                    jTextField1Depertment.setText(null);
                    jTextField1Guardian.setText(null);
                    jTextField1Contac.setText(null);
                    jTextField1Address.setText(null);
    
    }
    private void jButton1DischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DischargeActionPerformed
        // TODO add your handling code here:
      
        String Seat=IdInputField.getText();
        String PatientName = jTextField1Pname.getText();
        String Gender = jTextField1Gender.getText();
        String Age = jTextField1Age.getText();
        String Depertment = jTextField1Depertment.getText();
        String GuardianName=jTextField1Guardian.getText();
        String Contac_no=jTextField1Contac.getText();
        String Address=jTextField1Address.getText();
      
        File file1 = new File ("d.txt");

        try {
            
            FileOutputStream f1 = new FileOutputStream(file1,true);
            PrintWriter writer = new PrintWriter (f1);
            writer .append(Seat+" "+PatientName+" "+Gender+" "+Age+" "+Depertment+" "+GuardianName+" "+Contac_no+" "+Address+"\r\n");
            writer.close();
            f1.close();
      
            } 
         catch (Exception ex) 
         {
            System.out.println(ex+"\n");
         }  
     
      discharge();
              
    }//GEN-LAST:event_jButton1DischargeActionPerformed

    private void jTextField1ContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ContacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ContacActionPerformed

    private void jButton1BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BackActionPerformed
        // TODO add your handling code here:
        new RJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1BackActionPerformed

    private void jTextField1AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1AgeActionPerformed

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
            java.util.logging.Logger.getLogger(PSearch_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PSearch_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PSearch_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PSearch_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PSearch_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdInputField;
    private javax.swing.JButton jButton1Back;
    private javax.swing.JButton jButton1Discharge;
    private javax.swing.JButton jButton1Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6Guardian;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1Address;
    private javax.swing.JTextField jTextField1Age;
    private javax.swing.JTextField jTextField1Contac;
    private javax.swing.JTextField jTextField1Depertment;
    private javax.swing.JTextField jTextField1Gender;
    private javax.swing.JTextField jTextField1Guardian;
    private javax.swing.JTextField jTextField1Pname;
    // End of variables declaration//GEN-END:variables
}
