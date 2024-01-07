package ems;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class registration extends javax.swing.JFrame {
    Statement st;
    Connection con; 
    PreparedStatement pst; 
    ResultSet rs;
    public registration() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?zeroDateTimeBehavior=CONVERT_TO_NULL ","root","");
            st = con.createStatement();
        }catch(Exception e){
            System.exit(0);
        }
    
    }
     public void register(){
             try{
            String Pass = new String(pw.getPassword());
            String d = "INSERT INTO `login_admin`( `username`, `password`) VALUES ('"+un.getText()+"','"+Pass+"')";
            st.executeUpdate (d);
            if(un.getText().isEmpty()||pw.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"ERROR, FILL UP THE MISSING INFORMATION");
            }else{
                JOptionPane.showMessageDialog(null, "You are now register!!");
                this.dispose();
                admin ad = new admin();
                ad.setVisible(true);
                ad.setLocationRelativeTo(null);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Try Another Username");
            un.setText("");
            pw.setText("");
        }
     }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        checkbox = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        un.setBackground(new java.awt.Color(239, 239, 239));
        un.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        un.setForeground(new java.awt.Color(0, 0, 0));
        un.setBorder(null);
        jPanel1.add(un);
        un.setBounds(170, 370, 290, 40);

        pw.setBackground(new java.awt.Color(239, 239, 239));
        pw.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pw.setForeground(new java.awt.Color(0, 0, 0));
        pw.setBorder(null);
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwKeyPressed(evt);
            }
        });
        jPanel1.add(pw);
        pw.setBounds(170, 500, 290, 40);

        checkbox.setBackground(new java.awt.Color(255, 255, 255));
        checkbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkbox.setForeground(new java.awt.Color(0, 0, 0));
        checkbox.setText("Show Password");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox);
        checkbox.setBounds(340, 550, 170, 40);

        jButton2.setBackground(new java.awt.Color(147, 187, 150));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 600, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/Black and Red Minimalist Modern Registration Gym Website Prototype (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyPressed
      if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            register();
        }
    }//GEN-LAST:event_pwKeyPressed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        if (checkbox.isSelected()) {
            pw.setEchoChar((char) 0);
            checkbox.setText("Hide Password");
        } else {
            pw.setEchoChar('\u2022');
            checkbox.setText("Show Password");
            checkbox.setSelected(false);
        }
    }//GEN-LAST:event_checkboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           register();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
