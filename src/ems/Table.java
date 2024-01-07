package ems;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import net.proteanit.sql.DbUtils;

public class Table extends javax.swing.JFrame {
    Statement st;
    Connection con; 
    PreparedStatement pst; 
    ResultSet rs;
    private static Set<Character> allowedSymbols = new HashSet<>();
     
    public Table() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?zeroDateTimeBehavior=CONVERT_TO_NULL ","root","");
            st = con.createStatement();
        }catch(Exception e){
            System.exit(0);
        }
         showDate();
         showTime();
         Update_table();
         id.setText(Integer.toString(getNextIdFromDB()));
      
    }
   
    void showDate() {
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("MMM dd, yyyy");
       date.setText(s.format(d));
    }

    void showTime() {
       new Timer(0,(ActionEvent ae)->{
           Date d = new Date();
           SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
           time.setText(s.format(d));
       }).start();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        fb = new javax.swing.JTextField();
        position = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        stat = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        birthday = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(null);

        time.setBackground(new java.awt.Color(0, 0, 0));
        time.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("TIME:");
        jPanel2.add(time);
        time.setBounds(1110, 20, 110, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMPLOYEE MANGEMENT SYSTEM");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 20, 470, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIME:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1050, 20, 100, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(850, 20, 110, 30);

        date.setBackground(new java.awt.Color(0, 0, 0));
        date.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("DATE:");
        jPanel2.add(date);
        date.setBounds(920, 20, 130, 30);

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("LOGOUT");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(1290, 20, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 1430, 70);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Name", "Email", "Cellphone No.", "Date of Birth", "Position", "Address", "Facebook", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 1340, 390);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(60, 310, 1380, 430);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 210, 100, 30);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Position:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, 250, 50, 30);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cellphone No.: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(840, 210, 100, 30);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 210, 50, 30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Facebook:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(840, 250, 70, 30);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 250, 50, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 250, 90, 30);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Employee ID:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(90, 210, 90, 30);

        id.setBackground(new java.awt.Color(0, 153, 153));
        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(180, 210, 130, 30);

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(470, 130, 470, 50);

        email.setBackground(new java.awt.Color(0, 153, 153));
        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(640, 210, 180, 30);

        address.setBackground(new java.awt.Color(0, 153, 153));
        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(640, 250, 180, 30);

        number.setBackground(new java.awt.Color(0, 153, 153));
        number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number.setForeground(new java.awt.Color(255, 255, 255));
        number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });
        jPanel1.add(number);
        number.setBounds(940, 210, 150, 30);

        fb.setBackground(new java.awt.Color(0, 153, 153));
        fb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fb.setForeground(new java.awt.Color(255, 255, 255));
        fb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fbKeyTyped(evt);
            }
        });
        jPanel1.add(fb);
        fb.setBounds(940, 250, 150, 30);

        position.setBackground(new java.awt.Color(0, 153, 153));
        position.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        position.setForeground(new java.awt.Color(255, 255, 255));
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Position1", "Position2", "Position3" }));
        position.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(position);
        position.setBounds(390, 250, 170, 30);

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1310, 210, 100, 30);

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1310, 260, 100, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("ADD");
        jPanel1.add(jButton6);
        jButton6.setBounds(1970, 140, 100, 30);

        stat.setBackground(new java.awt.Color(0, 153, 153));
        stat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(255, 255, 255));
        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Employee", "Resign" }));
        stat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        stat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(stat);
        stat.setBounds(1150, 210, 140, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Status:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1100, 210, 50, 30);

        name.setBackground(new java.awt.Color(0, 153, 153));
        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(390, 210, 170, 30);

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SEARCH");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(960, 140, 100, 30);

        birthday.setBackground(new java.awt.Color(0, 153, 153));
        birthday.setForeground(new java.awt.Color(255, 255, 255));
        birthday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                birthdayKeyPressed(evt);
            }
        });
        jPanel1.add(birthday);
        birthday.setBounds(180, 250, 130, 30);

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("REFRESH");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1080, 140, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        admin out = new admin();
        out.setVisible(true);
        out.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
         
    }//GEN-LAST:event_nameKeyPressed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
       String currentText = name.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
           getToolkit().beep();
           evt.consume();
       } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
           name.setText(currentText + Character.toUpperCase(a));
           evt.consume();
       }
    }//GEN-LAST:event_nameKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        allowedSymbols.add('.');
        allowedSymbols.add('@');
        allowedSymbols.add('_');     
        char a = evt.getKeyChar();
           if (allowedSymbols.contains(a) && email.getText().contains(String.valueOf(a))) {
                evt.consume(); 
           }
    }//GEN-LAST:event_emailKeyTyped

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
       String currentText = address.getText();
      char a = evt.getKeyChar();
      if (!(Character.isLetter(a) || Character.isDigit(a) || a == ' ' || a == ',' || (a == '.' && !currentText.contains(".")))) {
          evt.consume();
      } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
          address.setText(currentText + Character.toUpperCase(a));
          evt.consume();
      } else if (Character.isDigit(a) && currentText.length() == 6) {
          evt.consume(); 
      }
    }//GEN-LAST:event_addressKeyTyped

    private void numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyTyped
     String currentText = number.getText();
     char a = evt.getKeyChar();

     if (!(Character.isDigit(a) && currentText.length() < 11)) {
         evt.consume();
     } else if (currentText.length() == 0 && a != '0') {
          JOptionPane.showMessageDialog(null,"Incorrect Format (09)");
         evt.consume();
     } else if (currentText.length() == 1 && currentText.charAt(0) != '0' && a != '9') {
          JOptionPane.showMessageDialog(null,"Incorrect Format (09)");
         evt.consume();
     } else if (currentText.length() == 2 && !(currentText.startsWith("09") && a != '0')) {
         JOptionPane.showMessageDialog(null,"Incorrect Format (09)");
         evt.consume();
     } else if (currentText.length() == 11) {
         if (!Character.isDigit(a)) {
              JOptionPane.showMessageDialog(null,"Incorrect Format");
             evt.consume();
         }
     }      
    }//GEN-LAST:event_numberKeyTyped

    private void fbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fbKeyTyped
       String currentText = fb.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
           getToolkit().beep();
           evt.consume();
       } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
           fb.setText(currentText + Character.toUpperCase(a));
           evt.consume();
       }
    }//GEN-LAST:event_fbKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        search();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        search();
    }//GEN-LAST:event_searchKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date = sdf.format(birthday.getDate());

    if (name.getText().isEmpty() || email.getText().isEmpty() || number.getText().isEmpty() || date.equals("") || position.getSelectedIndex() == 0
            || address.getText().isEmpty() || fb.getText().isEmpty() || stat.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
    } else {
       if (isValidNumber(number.getText())) {
        if (isAgeAbove18(birthday.getDate())) {
            if (isValidEmail(email.getText())) {
                String insert = "INSERT INTO `details`(`ID`, `Name`, `Email`, `Cellphone No.`, `Date of Birth`, `Position`, `Address`, `Facebook`, `Status`)"
                        + " VALUES ('" + id.getText() + "','" + name.getText() + "','" + email.getText() + "','" + number.getText() + "','" + date + "','" + position.getSelectedItem() + "','" + address.getText() + "',"
                        + "'" + fb.getText() + "','" + stat.getSelectedItem() + "')";
                pst.executeUpdate(insert);

                String sql = "SELECT * FROM `details` WHERE 1";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                  table.setModel(DbUtils.resultSetToTableModel(rs));
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                        Object statusValue = table.getModel().getValueAt(row, table.getColumn("Status").getModelIndex());
                        String status = (statusValue != null) ? statusValue.toString() : "";

                        if ("Resign".equalsIgnoreCase(status)) {
                            component.setBackground(Color.RED);
                        } else if ("Employee".equalsIgnoreCase(status)) {
                            component.setBackground(Color.GREEN);
                        } else {
                            component.setBackground(table.getBackground());
                        }

                        return component;
                    }
                };

                table.getColumnModel().getColumn(table.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
                
                id.setText(Integer.toString(getNextIdFromDB()));
                name.setText("");
                email.setText("");
                number.setText("");
                birthday.setDate(null);
                position.setSelectedIndex(0);
                address.setText("");
                fb.setText("");
                stat.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email address. Email must end with '@gmail.com' or '@icloud.com'.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid birthday. Age must be 18 years old or above.");
        }
    } else {
            JOptionPane.showMessageDialog(this, "Invalid number. Number must be exactly 11 digits.");
         }
    }
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, ex);
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void birthdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_birthdayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayKeyPressed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
     search();
    }//GEN-LAST:event_searchKeyTyped

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       int selectedRow = table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       Date dateValue = (Date) model.getValueAt(selectedRow, 4);
       id.setText(model.getValueAt(selectedRow, 0).toString());
       name.setText(model.getValueAt(selectedRow, 1).toString());
       email.setText(model.getValueAt(selectedRow, 2).toString());
       number.setText(model.getValueAt(selectedRow, 3).toString());
       birthday.setDate(dateValue);
       position.setSelectedItem(model.getValueAt(selectedRow, 5));
       address.setText(model.getValueAt(selectedRow, 6).toString());
       fb.setText(model.getValueAt(selectedRow, 7).toString());
       stat.setSelectedItem(model.getValueAt(selectedRow, 8));
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date = sdf.format(birthday.getDate());

    if (name.getText().isEmpty() || email.getText().isEmpty() || number.getText().isEmpty() || date.equals("") || position.getSelectedIndex() == 0
            || address.getText().isEmpty() || fb.getText().isEmpty() || stat.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
    } else {
        if (isValidNumber(number.getText())) {
            if (isAgeAbove18(birthday.getDate())) {
                if (isValidEmail(email.getText())) {
                    String update = "UPDATE `details` SET  `Name`='" + name.getText() + "',`Email`='" + email.getText() + "',`Cellphone No.`='" + number.getText() + "',`Date of Birth`='" + date + "',`Position`='" + position.getSelectedItem() + "',`Address`='" + address.getText() + "',`Facebook`='" + fb.getText() + "',`Status`='" + stat.getSelectedItem() + "' WHERE ID ='" + id.getText() + "'";
                    st = con.createStatement();
                    st.executeUpdate(update);

                    if (position.getSelectedIndex() == 0 || stat.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Select position or status");
                    } else {
                        try {
                            String updatee = "SELECT * FROM `details` WHERE 1";
                            rs = pst.executeQuery(updatee);
                            DefaultTableModel model = (DefaultTableModel) (table.getModel());
                            model.setRowCount(0);

                            while (rs.next()) {
                                Object o[] = {
                                        rs.getInt("ID"), rs.getString("Name"), rs.getString("Email"), rs.getString("Cellphone No."), rs.getDate("Date of Birth"), rs.getString("Position"), rs.getString("Address"), rs.getString("Facebook"), rs.getString("Status")
                                };
                                model.addRow(o);
                            }
                            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
                                @Override
                                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                                    Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                                    Object statusValue = table.getModel().getValueAt(row, table.getColumn("Status").getModelIndex());
                                    String status = (statusValue != null) ? statusValue.toString() : "";

                                    if ("Resign".equalsIgnoreCase(status)) {
                                        component.setBackground(Color.RED);
                                    } else if ("Employee".equalsIgnoreCase(status)) {
                                        component.setBackground(Color.GREEN);
                                    } else {
                                        component.setBackground(table.getBackground());
                                    }

                                    return component;
                                }
                            };

                            table.getColumnModel().getColumn(table.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

                            id.setText(Integer.toString(getNextIdFromDB()));
                            name.setText("");
                            email.setText("");
                            number.setText("");
                            birthday.setDate(null);
                            position.setSelectedIndex(0);
                            address.setText("");
                            fb.setText("");
                            stat.setSelectedIndex(0);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid email address. Email must end with '@gmail.com' or '@icloud.com'.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid birthday. Age must be 18 years old or above.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid number. Number must be exactly 11 digits.");
        }
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        Table refresh = new Table();
        refresh.setVisible(true);
        refresh.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyTyped

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JLabel date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fb;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> stat;
    private javax.swing.JTable table;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
   
    private static boolean isAgeAbove18(Date birthdate) {
        Calendar birthdateCalendar = Calendar.getInstance();
        birthdateCalendar.setTime(birthdate);

        Calendar eighteenYearsAgo = Calendar.getInstance();
        eighteenYearsAgo.add(Calendar.YEAR, -18);

        return birthdateCalendar.before(eighteenYearsAgo);
    }
    
    private static boolean isValidEmail(String email) {
        return email.endsWith("@gmail.com") || email.endsWith("@icloud.com");
    }
    
     private  int getNextIdFromDB() {
        int nextId = 1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            st = con.createStatement();

            String sql = "SELECT MAX(ID) FROM details";
            try (ResultSet rs = st.executeQuery(sql)) {
                if (rs.next()) {
                    nextId = rs.getInt(1) + 1;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return nextId;
    }
     private boolean isValidNumber(String number) {
         return number.matches("\\d{11}");
     }
     private void search (){
         DefaultTableModel model=(DefaultTableModel)table.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         table.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search.getText()));
         tr.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(search.getText())));
         DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                int modelRow = table.convertRowIndexToModel(row);

                Object statusValue = table.getModel().getValueAt(modelRow, table.getColumn("Status").getModelIndex());
                String status = (statusValue != null) ? statusValue.toString() : "";

                if ("Resign".equalsIgnoreCase(status)) {
                    component.setBackground(Color.RED);
                } else if ("Employee".equalsIgnoreCase(status)) {
                    component.setBackground(Color.GREEN);
                } else {
                    component.setBackground(table.getBackground());
                }

                return component;
            }
        };

        table.getColumnModel().getColumn(table.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    }
     
     private void Update_table(){
         try {
            String sql = "SELECT * FROM `details` WHERE 1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
                        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
                            @Override
                            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);


                                Object statusValue = table.getModel().getValueAt(row, table.getColumn("Status").getModelIndex());
                                String status = (statusValue != null) ? statusValue.toString() : "";

                                if ("Resign".equalsIgnoreCase(status)) {
                                    component.setBackground(Color.RED);
                                } else if ("Employee".equalsIgnoreCase(status)) {
                                    component.setBackground(Color.GREEN);
                                } else {
                                    component.setBackground(table.getBackground());
                                }

                                return component;
                            }
                        };
                        table.getColumnModel().getColumn(table.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
     }
    }
}