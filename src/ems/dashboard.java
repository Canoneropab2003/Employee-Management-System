package ems;
import com.mysql.cj.jdbc.Blob;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableRowSorter;

public class dashboard extends javax.swing.JFrame {
    Statement st;
    Connection con; 
    PreparedStatement pst; 
    ResultSet rs;
    private static Set<Character> allowedSymbols = new HashSet<>();
     
    public dashboard(String uname) {
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
         update_panel.setVisible(false);
         view_panel.setVisible(false);
         add_panel.setVisible(false);
         remove_panel.setVisible(false);
         Update_table();
         id.setText(Integer.toString(getNextIdFromDB()));

         String formattedUsername = uname.substring(0, 1).toUpperCase() + uname.substring(1).toLowerCase();
         un.setText(formattedUsername);
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
        un = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        add_panel = new javax.swing.JPanel();
        stat = new javax.swing.JComboBox<>();
        fb = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        position = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        birthday = new com.toedter.calendar.JDateChooser();
        id = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        remove_panel = new javax.swing.JPanel();
        stat1 = new javax.swing.JComboBox<>();
        fb1 = new javax.swing.JTextField();
        number1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        position1 = new javax.swing.JComboBox<>();
        name1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        birthday1 = new com.toedter.calendar.JDateChooser();
        id1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablee = new javax.swing.JTable();
        search1 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        update_panel = new javax.swing.JPanel();
        stat3 = new javax.swing.JComboBox<>();
        fb3 = new javax.swing.JTextField();
        number3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        address3 = new javax.swing.JTextField();
        email3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        position3 = new javax.swing.JComboBox<>();
        name3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        birthday3 = new com.toedter.calendar.JDateChooser();
        id3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablee1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        view_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        photo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(147, 187, 150));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(1140, 763));
        jPanel1.setMinimumSize(new java.awt.Dimension(1140, 763));
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 763));
        jPanel1.setLayout(null);

        un.setBackground(new java.awt.Color(201, 228, 203));
        un.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        un.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(un);
        un.setBounds(690, 370, 260, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/Purple Modern Personal Portfolio Blog Desktop Prototype.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(220, 110, 884, 605);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setMaximumSize(new java.awt.Dimension(1334, 71));
        jPanel2.setMinimumSize(new java.awt.Dimension(1334, 71));
        jPanel2.setPreferredSize(new java.awt.Dimension(1334, 71));
        jPanel2.setLayout(null);

        time.setBackground(new java.awt.Color(0, 0, 0));
        time.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("TIME:");
        jPanel2.add(time);
        time.setBounds(960, 20, 90, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMPLOYEE MANGEMENT SYSTEM");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 20, 470, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIME:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(900, 20, 80, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(700, 20, 90, 30);

        date.setBackground(new java.awt.Color(0, 0, 0));
        date.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("DATE:");
        jPanel2.add(date);
        date.setBounds(770, 20, 110, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 20, 1080, 71);

        jPanel3.setBackground(new java.awt.Color(60, 130, 86));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setMaximumSize(new java.awt.Dimension(160, 490));
        jPanel3.setMinimumSize(new java.awt.Dimension(160, 490));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 490));
        jPanel3.setLayout(null);

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("REMOVE");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(30, 240, 100, 30);

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("VIEW");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(30, 90, 100, 30);

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
        jPanel3.add(jButton3);
        jButton3.setBounds(30, 140, 100, 30);

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
        jPanel3.add(jButton4);
        jButton4.setBounds(30, 190, 100, 30);

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("REFRESH");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(30, 370, 100, 30);

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
        jPanel3.add(jButton7);
        jButton7.setBounds(30, 410, 100, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(36, 160, 160, 490);

        jPanel4.setBackground(new java.awt.Color(147, 187, 150));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setMaximumSize(new java.awt.Dimension(884, 605));
        jPanel4.setMinimumSize(new java.awt.Dimension(884, 605));
        jPanel4.setPreferredSize(new java.awt.Dimension(884, 605));
        jPanel4.setLayout(null);

        add_panel.setBackground(new java.awt.Color(147, 187, 150));
        add_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        add_panel.setMaximumSize(new java.awt.Dimension(884, 605));
        add_panel.setMinimumSize(new java.awt.Dimension(884, 605));
        add_panel.setLayout(null);

        stat.setBackground(new java.awt.Color(147, 187, 150));
        stat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(255, 255, 255));
        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Employee", "Resign" }));
        stat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        stat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add_panel.add(stat);
        stat.setBounds(220, 510, 140, 30);

        fb.setBackground(new java.awt.Color(147, 187, 150));
        fb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fb.setForeground(new java.awt.Color(255, 255, 255));
        fb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fbKeyTyped(evt);
            }
        });
        add_panel.add(fb);
        fb.setBounds(220, 460, 180, 30);

        number.setBackground(new java.awt.Color(147, 187, 150));
        number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number.setForeground(new java.awt.Color(255, 255, 255));
        number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });
        add_panel.add(number);
        number.setBounds(220, 410, 180, 30);

        jLabel18.setBackground(new java.awt.Color(147, 187, 150));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Status:");
        add_panel.add(jLabel18);
        jLabel18.setBounds(80, 510, 70, 30);

        jLabel10.setBackground(new java.awt.Color(147, 187, 150));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cellphone No.: ");
        add_panel.add(jLabel10);
        jLabel10.setBounds(80, 410, 150, 30);

        jLabel12.setBackground(new java.awt.Color(147, 187, 150));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Facebook:");
        add_panel.add(jLabel12);
        jLabel12.setBounds(80, 460, 110, 30);

        address.setBackground(new java.awt.Color(147, 187, 150));
        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        add_panel.add(address);
        address.setBounds(220, 360, 180, 30);

        email.setBackground(new java.awt.Color(147, 187, 150));
        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        add_panel.add(email);
        email.setBounds(220, 310, 180, 30);

        jLabel11.setBackground(new java.awt.Color(147, 187, 150));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        add_panel.add(jLabel11);
        jLabel11.setBounds(80, 310, 90, 30);

        jLabel13.setBackground(new java.awt.Color(147, 187, 150));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address:");
        add_panel.add(jLabel13);
        jLabel13.setBounds(80, 360, 100, 30);

        position.setBackground(new java.awt.Color(147, 187, 150));
        position.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        position.setForeground(new java.awt.Color(255, 255, 255));
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Senior Executive", "Executive", "Senior Director", "Director", "Senior Manager", "Manager", "Senior Advisor", "Advisor", "Senior", "Intermediate", "Associate" }));
        position.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        add_panel.add(position);
        position.setBounds(220, 260, 170, 30);

        name.setBackground(new java.awt.Color(147, 187, 150));
        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        add_panel.add(name);
        name.setBounds(220, 210, 170, 30);

        jLabel8.setBackground(new java.awt.Color(147, 187, 150));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        add_panel.add(jLabel8);
        jLabel8.setBounds(80, 210, 100, 30);

        jLabel9.setBackground(new java.awt.Color(147, 187, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Position:");
        add_panel.add(jLabel9);
        jLabel9.setBounds(80, 260, 90, 30);

        birthday.setBackground(new java.awt.Color(147, 187, 150));
        birthday.setForeground(new java.awt.Color(255, 255, 255));
        add_panel.add(birthday);
        birthday.setBounds(220, 160, 160, 30);

        id.setBackground(new java.awt.Color(147, 187, 150));
        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        add_panel.add(id);
        id.setBounds(220, 110, 160, 30);

        jLabel15.setBackground(new java.awt.Color(147, 187, 150));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Employee ID:");
        add_panel.add(jLabel15);
        jLabel15.setBounds(80, 110, 130, 30);

        jLabel14.setBackground(new java.awt.Color(147, 187, 150));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth:");
        add_panel.add(jLabel14);
        jLabel14.setBounds(80, 160, 120, 30);

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("ADD");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add_panel.add(jButton10);
        jButton10.setBounds(500, 440, 130, 40);

        photo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        photo.setPreferredSize(new java.awt.Dimension(134, 172));
        add_panel.add(photo);
        photo.setBounds(500, 120, 134, 172);

        jButton14.setBackground(new java.awt.Color(0, 51, 51));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("UPLOAD");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        add_panel.add(jButton14);
        jButton14.setBounds(500, 320, 130, 30);

        jPanel4.add(add_panel);
        add_panel.setBounds(0, 0, 884, 605);

        remove_panel.setBackground(new java.awt.Color(147, 187, 150));
        remove_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.setForeground(new java.awt.Color(255, 255, 255));
        remove_panel.setMaximumSize(new java.awt.Dimension(884, 605));
        remove_panel.setMinimumSize(new java.awt.Dimension(884, 605));
        remove_panel.setPreferredSize(new java.awt.Dimension(884, 605));
        remove_panel.setLayout(null);

        stat1.setBackground(new java.awt.Color(147, 187, 150));
        stat1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stat1.setForeground(new java.awt.Color(255, 255, 255));
        stat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Employee", "Resign" }));
        stat1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        stat1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        stat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stat1ActionPerformed(evt);
            }
        });
        remove_panel.add(stat1);
        stat1.setBounds(660, 490, 140, 30);

        fb1.setBackground(new java.awt.Color(147, 187, 150));
        fb1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fb1.setForeground(new java.awt.Color(255, 255, 255));
        fb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(fb1);
        fb1.setBounds(660, 440, 180, 30);

        number1.setBackground(new java.awt.Color(147, 187, 150));
        number1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number1.setForeground(new java.awt.Color(255, 255, 255));
        number1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(number1);
        number1.setBounds(660, 390, 180, 30);

        jLabel19.setBackground(new java.awt.Color(147, 187, 150));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Status:");
        remove_panel.add(jLabel19);
        jLabel19.setBounds(520, 490, 70, 30);

        jLabel16.setBackground(new java.awt.Color(147, 187, 150));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cellphone No.: ");
        remove_panel.add(jLabel16);
        jLabel16.setBounds(520, 390, 150, 30);

        jLabel17.setBackground(new java.awt.Color(147, 187, 150));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Facebook:");
        remove_panel.add(jLabel17);
        jLabel17.setBounds(520, 440, 110, 30);

        address1.setBackground(new java.awt.Color(147, 187, 150));
        address1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address1.setForeground(new java.awt.Color(255, 255, 255));
        address1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(address1);
        address1.setBounds(660, 340, 180, 30);

        email1.setBackground(new java.awt.Color(147, 187, 150));
        email1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(email1);
        email1.setBounds(660, 290, 180, 30);

        jLabel20.setBackground(new java.awt.Color(147, 187, 150));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email:");
        remove_panel.add(jLabel20);
        jLabel20.setBounds(520, 290, 90, 30);

        jLabel21.setBackground(new java.awt.Color(147, 187, 150));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Address:");
        remove_panel.add(jLabel21);
        jLabel21.setBounds(520, 340, 100, 30);

        position1.setBackground(new java.awt.Color(147, 187, 150));
        position1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        position1.setForeground(new java.awt.Color(255, 255, 255));
        position1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Senior Executive", "Executive", "Senior Director", "Director", "Senior Manager", "Manager", "Senior Advisor", "Advisor", "Senior", "Intermediate", "Associate" }));
        position1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        position1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                position1ActionPerformed(evt);
            }
        });
        remove_panel.add(position1);
        position1.setBounds(660, 240, 170, 30);

        name1.setBackground(new java.awt.Color(147, 187, 150));
        name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(name1);
        name1.setBounds(660, 190, 170, 30);

        jLabel22.setBackground(new java.awt.Color(147, 187, 150));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name:");
        remove_panel.add(jLabel22);
        jLabel22.setBounds(520, 190, 100, 30);

        jLabel23.setBackground(new java.awt.Color(147, 187, 150));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Position:");
        remove_panel.add(jLabel23);
        jLabel23.setBounds(520, 240, 90, 30);

        birthday1.setBackground(new java.awt.Color(147, 187, 150));
        birthday1.setForeground(new java.awt.Color(255, 255, 255));
        remove_panel.add(birthday1);
        birthday1.setBounds(660, 140, 160, 30);

        id1.setBackground(new java.awt.Color(147, 187, 150));
        id1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        remove_panel.add(id1);
        id1.setBounds(660, 90, 160, 30);

        jLabel24.setBackground(new java.awt.Color(147, 187, 150));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Employee ID:");
        remove_panel.add(jLabel24);
        jLabel24.setBounds(520, 90, 130, 30);

        jLabel25.setBackground(new java.awt.Color(147, 187, 150));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date of Birth:");
        remove_panel.add(jLabel25);
        jLabel25.setBounds(520, 140, 120, 30);

        jButton11.setBackground(new java.awt.Color(0, 51, 51));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("REMOVE");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        remove_panel.add(jButton11);
        jButton11.setBounds(610, 540, 130, 40);

        tablee.setBackground(new java.awt.Color(255, 255, 255));
        tablee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tablee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablee.setForeground(new java.awt.Color(0, 0, 0));
        tablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Position", "Status"
            }
        ));
        tablee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablee);

        remove_panel.add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 440, 490);

        search1.setBackground(new java.awt.Color(147, 187, 150));
        search1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search1.setForeground(new java.awt.Color(255, 255, 255));
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search1KeyTyped(evt);
            }
        });
        remove_panel.add(search1);
        search1.setBounds(80, 30, 240, 40);

        jButton12.setBackground(new java.awt.Color(0, 51, 51));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("SEARCH");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        remove_panel.add(jButton12);
        jButton12.setBounds(350, 40, 90, 20);

        jPanel4.add(remove_panel);
        remove_panel.setBounds(0, 0, 884, 605);

        update_panel.setBackground(new java.awt.Color(147, 187, 150));
        update_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        update_panel.setMaximumSize(new java.awt.Dimension(884, 605));
        update_panel.setMinimumSize(new java.awt.Dimension(884, 605));
        update_panel.setPreferredSize(new java.awt.Dimension(884, 605));
        update_panel.setLayout(null);

        stat3.setBackground(new java.awt.Color(147, 187, 150));
        stat3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stat3.setForeground(new java.awt.Color(255, 255, 255));
        stat3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Employee", "Resign" }));
        stat3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        stat3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update_panel.add(stat3);
        stat3.setBounds(650, 490, 140, 30);

        fb3.setBackground(new java.awt.Color(147, 187, 150));
        fb3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fb3.setForeground(new java.awt.Color(255, 255, 255));
        fb3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fb3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fb3KeyTyped(evt);
            }
        });
        update_panel.add(fb3);
        fb3.setBounds(650, 440, 180, 30);

        number3.setBackground(new java.awt.Color(147, 187, 150));
        number3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number3.setForeground(new java.awt.Color(255, 255, 255));
        number3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        number3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                number3KeyTyped(evt);
            }
        });
        update_panel.add(number3);
        number3.setBounds(650, 390, 180, 30);

        jLabel35.setBackground(new java.awt.Color(147, 187, 150));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Status:");
        update_panel.add(jLabel35);
        jLabel35.setBounds(510, 490, 70, 30);

        jLabel36.setBackground(new java.awt.Color(147, 187, 150));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Cellphone No.: ");
        update_panel.add(jLabel36);
        jLabel36.setBounds(510, 390, 150, 30);

        jLabel37.setBackground(new java.awt.Color(147, 187, 150));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Facebook:");
        update_panel.add(jLabel37);
        jLabel37.setBounds(510, 440, 110, 30);

        address3.setBackground(new java.awt.Color(147, 187, 150));
        address3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address3.setForeground(new java.awt.Color(255, 255, 255));
        address3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        address3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                address3KeyTyped(evt);
            }
        });
        update_panel.add(address3);
        address3.setBounds(650, 340, 180, 30);

        email3.setBackground(new java.awt.Color(147, 187, 150));
        email3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email3.setForeground(new java.awt.Color(255, 255, 255));
        email3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        email3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                email3KeyTyped(evt);
            }
        });
        update_panel.add(email3);
        email3.setBounds(650, 290, 180, 30);

        jLabel38.setBackground(new java.awt.Color(147, 187, 150));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Email:");
        update_panel.add(jLabel38);
        jLabel38.setBounds(510, 290, 90, 30);

        jLabel39.setBackground(new java.awt.Color(147, 187, 150));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Address:");
        update_panel.add(jLabel39);
        jLabel39.setBounds(510, 340, 100, 30);

        position3.setBackground(new java.awt.Color(147, 187, 150));
        position3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        position3.setForeground(new java.awt.Color(255, 255, 255));
        position3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Senior Executive", "Executive", "Senior Director", "Director", "Senior Manager", "Manager", "Senior Advisor", "Advisor", "Senior", "Intermediate", "Associate" }));
        position3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        position3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                position3ActionPerformed(evt);
            }
        });
        update_panel.add(position3);
        position3.setBounds(650, 240, 170, 30);

        name3.setBackground(new java.awt.Color(147, 187, 150));
        name3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        name3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name3KeyTyped(evt);
            }
        });
        update_panel.add(name3);
        name3.setBounds(650, 190, 170, 30);

        jLabel40.setBackground(new java.awt.Color(147, 187, 150));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Name:");
        update_panel.add(jLabel40);
        jLabel40.setBounds(510, 190, 100, 30);

        jLabel41.setBackground(new java.awt.Color(147, 187, 150));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Position:");
        update_panel.add(jLabel41);
        jLabel41.setBounds(510, 240, 90, 30);

        birthday3.setBackground(new java.awt.Color(147, 187, 150));
        birthday3.setForeground(new java.awt.Color(255, 255, 255));
        update_panel.add(birthday3);
        birthday3.setBounds(650, 140, 160, 30);

        id3.setBackground(new java.awt.Color(147, 187, 150));
        id3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id3.setForeground(new java.awt.Color(255, 255, 255));
        id3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        update_panel.add(id3);
        id3.setBounds(650, 90, 160, 30);

        jLabel42.setBackground(new java.awt.Color(147, 187, 150));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Employee ID:");
        update_panel.add(jLabel42);
        jLabel42.setBounds(510, 90, 130, 30);

        jLabel43.setBackground(new java.awt.Color(147, 187, 150));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Date of Birth:");
        update_panel.add(jLabel43);
        jLabel43.setBounds(510, 140, 120, 30);

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("UPDATE");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        update_panel.add(jButton13);
        jButton13.setBounds(590, 540, 130, 40);

        tablee1.setBackground(new java.awt.Color(255, 255, 255));
        tablee1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tablee1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablee1.setForeground(new java.awt.Color(0, 0, 0));
        tablee1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Position", "Status"
            }
        ));
        tablee1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablee1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablee1MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(tablee1);

        update_panel.add(jScrollPane3);
        jScrollPane3.setBounds(20, 90, 440, 480);

        search.setBackground(new java.awt.Color(147, 187, 150));
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
        update_panel.add(search);
        search.setBounds(80, 30, 240, 40);

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("SEARCH");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 153, 153), null, null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        update_panel.add(jButton6);
        jButton6.setBounds(350, 40, 90, 20);

        jPanel4.add(update_panel);
        update_panel.setBounds(0, 0, 884, 605);

        view_panel.setBackground(new java.awt.Color(147, 187, 150));
        view_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        view_panel.setMaximumSize(new java.awt.Dimension(884, 605));
        view_panel.setMinimumSize(new java.awt.Dimension(884, 605));
        view_panel.setPreferredSize(new java.awt.Dimension(884, 605));
        view_panel.setLayout(null);

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

        view_panel.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 650, 530);

        photo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        photo1.setPreferredSize(new java.awt.Dimension(134, 172));
        view_panel.add(photo1);
        photo1.setBounds(700, 50, 134, 172);

        jPanel4.add(view_panel);
        view_panel.setBounds(0, 0, 884, 605);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(220, 110, 884, 605);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
        String sql = "SELECT ID, Name, Position, Status FROM details WHERE 1";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        tablee.setModel(DbUtils.resultSetToTableModel(rs));

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
        tablee.getColumnModel().getColumn(tablee.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
      update_panel.setVisible(false);
      view_panel.setVisible(false);
      add_panel.setVisible(false);
      remove_panel.setVisible(true);
      
  
      position1.setEnabled(false);
      name1.setEditable(false);
      email1.setEditable(false);
      number1.setEditable(false);
      birthday1.setEnabled(false);
      address1.setEditable(false);
      fb1.setEditable(false);
      stat1.setEnabled(false);
      un.setVisible(false);
      bg.setVisible(false);
      search1.setText("");
      search.setText("");
      name.setText("");
      email.setText("");
      number.setText("");
      birthday.setDate(null);
      position.setSelectedIndex(0);
      address.setText("");
      fb.setText("");
      stat.setSelectedIndex(0);
      id1.setText("");
      name1.setText("");
      email1.setText("");
      number1.setText("");
      birthday1.setDate(null);
      position1.setSelectedIndex(0);
      address1.setText("");
      fb1.setText("");
      stat1.setSelectedIndex(0);
      id3.setText("");
      name3.setText("");
      email3.setText("");
      number3.setText("");
      birthday3.setDate(null);
      position3.setSelectedIndex(0);
      address3.setText("");
      fb3.setText("");
      stat3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      update_panel.setVisible(false);
      view_panel.setVisible(false);
      add_panel.setVisible(true);
      remove_panel.setVisible(false);
      un.setVisible(false);
      bg.setVisible(false);
      search1.setText("");
      search.setText("");
      name.setText("");
      email.setText("");
      number.setText("");
      birthday.setDate(null);
      position.setSelectedIndex(0);
      address.setText("");
      fb.setText("");
      stat.setSelectedIndex(0);
      id1.setText("");
      name1.setText("");
      email1.setText("");
      number1.setText("");
      birthday1.setDate(null);
      position1.setSelectedIndex(0);
      address1.setText("");
      fb1.setText("");
      stat1.setSelectedIndex(0);
      id3.setText("");
      name3.setText("");
      email3.setText("");
      number3.setText("");
      birthday3.setDate(null);
      position3.setSelectedIndex(0);
      address3.setText("");
      fb3.setText("");
      stat3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
        String sql = "SELECT ID, Name, Position, Status FROM details WHERE 1";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        tablee1.setModel(DbUtils.resultSetToTableModel(rs));

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
        tablee1.getColumnModel().getColumn(tablee1.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
      
      
      update_panel.setVisible(true);
      view_panel.setVisible(false);
      add_panel.setVisible(false);
      remove_panel.setVisible(false);
      un.setVisible(false);
      bg.setVisible(false);
      search1.setText("");
      search.setText("");
      name.setText("");
      email.setText("");
      number.setText("");
      birthday.setDate(null);
      position.setSelectedIndex(0);
      address.setText("");
      fb.setText("");
      stat.setSelectedIndex(0);
      id1.setText("");
      name1.setText("");
      email1.setText("");
      number1.setText("");
      birthday1.setDate(null);
      position1.setSelectedIndex(0);
      address1.setText("");
      fb1.setText("");
      stat1.setSelectedIndex(0);
      id3.setText("");
      name3.setText("");
      email3.setText("");
      number3.setText("");
      birthday3.setDate(null);
      position3.setSelectedIndex(0);
      address3.setText("");
      fb3.setText("");
      stat3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      update_panel.setVisible(false);
      view_panel.setVisible(true);
      add_panel.setVisible(false);
      remove_panel.setVisible(false);
      un.setVisible(false);
      bg.setVisible(false);
      search1.setText("");
      search.setText("");
      name.setText("");
      email.setText("");
      number.setText("");
      birthday.setDate(null);
      position.setSelectedIndex(0);
      address.setText("");
      fb.setText("");
      stat.setSelectedIndex(0);
      id1.setText("");
      name1.setText("");
      email1.setText("");
      number1.setText("");
      birthday1.setDate(null);
      position1.setSelectedIndex(0);
      address1.setText("");
      fb1.setText("");
      stat1.setSelectedIndex(0);
      id3.setText("");
      name3.setText("");
      email3.setText("");
      number3.setText("");
      birthday3.setDate(null);
      position3.setSelectedIndex(0);
      address3.setText("");
      fb3.setText("");
      stat3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.setVisible(false);
        String currentUsername = un.getText();
        dashboard refresh = new dashboard(currentUsername);
        refresh.setVisible(true);
        refresh.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date = sdf.format(birthday.getDate());

    if (name.getText().isEmpty() || email.getText().isEmpty() || number.getText().isEmpty() || date.equals("") || position.getSelectedIndex() == 0
            || address.getText().isEmpty() || fb.getText().isEmpty() || stat.getSelectedIndex() == 0 ) {
        JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
    } else {
        if (isValidNumber(number.getText())) {
            if (isAgeAbove18(birthday.getDate())) {
                if (isValidEmail(email.getText())) {
                    // Get the image from the JLabel
                    Icon icon = photo.getIcon();
                    BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                    Graphics g = bufferedImage.createGraphics();
                    icon.paintIcon(null, g, 0, 0);
                    g.dispose();

                    // Convert the image to a byte array
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(bufferedImage, "jpg", baos);
                    byte[] photoBytes = baos.toByteArray();

                    String insert = "INSERT INTO `details`(`ID`, `Name`, `Email`, `Cellphone No.`, `Date of Birth`, `Position`, `Address`, `Facebook`, `Status`, `Photo`)"
                            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement pst = con.prepareStatement(insert)) {
                        pst.setString(1, id.getText());
                        pst.setString(2, name.getText());
                        pst.setString(3, email.getText());
                        pst.setString(4, number.getText());
                        pst.setString(5, date);
                        pst.setString(6, position.getSelectedItem().toString());
                        pst.setString(7, address.getText());
                        pst.setString(8, fb.getText());
                        pst.setString(9, stat.getSelectedItem().toString());
                        pst.setBytes(10, photoBytes);

                        pst.executeUpdate();
                    }

                    // Update the table
                    String sql = "SELECT * FROM `details` WHERE 1";
                    pst = con.prepareStatement(sql);
                    rs = pst.executeQuery();
                    table.setModel(DbUtils.resultSetToTableModel(rs));

                    // Set cell renderer
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

                    // Clear input fields
                    id.setText(Integer.toString(getNextIdFromDB()));
                    name.setText("");
                    email.setText("");
                    number.setText("");
                    birthday.setDate(null);
                    position.setSelectedIndex(0);
                    address.setText("");
                    fb.setText("");
                    stat.setSelectedIndex(0);
                    photo.setIcon(null);
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
    JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage());
}

    }//GEN-LAST:event_jButton10ActionPerformed

    private void position1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_position1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_position1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      try {
            if (!id1.getText().isEmpty()) {
                int confirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

                if (confirmDialog == JOptionPane.YES_OPTION) {
                    String deleteQuery = "DELETE FROM `details` WHERE ID = '" + id1.getText() + "'";
                    st = con.createStatement();
                    st.executeUpdate(deleteQuery);

                    try {
                        String selectQuery = "SELECT * FROM `details`";
                        rs = st.executeQuery(selectQuery);
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

                        id1.setText("");
                        name1.setText("");
                        email1.setText("");
                        number1.setText("");
                        birthday1.setDate(null);
                        position1.setSelectedIndex(0);
                        address1.setText("");
                        fb1.setText("");
                        stat1.setSelectedIndex(0);

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                 try {
                String sql = "SELECT ID, Name, Position, Status FROM details WHERE 1";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                tablee.setModel(DbUtils.resultSetToTableModel(rs));

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
                tablee.getColumnModel().getColumn(tablee.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a record to delete.");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
}

    }//GEN-LAST:event_jButton11ActionPerformed

    private void position3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_position3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_position3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(birthday3.getDate());

        if (name3.getText().isEmpty() || email3.getText().isEmpty() || number3.getText().isEmpty() || date.equals("") || position3.getSelectedIndex() == 0
                || address3.getText().isEmpty() || fb3.getText().isEmpty() || stat3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
        }else if (position3.getSelectedIndex() == 0 || stat3.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(null, "Select position or status");
        } else {
            if (isValidNumber(number3.getText())) {
                if (isAgeAbove18(birthday3.getDate())) {
                    if (isValidEmail(email3.getText())) {
                        String update = "UPDATE `details` SET  `Name`='" + name3.getText() + "',`Email`='" + email3.getText() + "',`Cellphone No.`='" + number3.getText() + "',`Date of Birth`='" + date + "',`Position`='" + position3.getSelectedItem() + "',`Address`='" + address3.getText() + "',`Facebook`='" + fb3.getText() + "',`Status`='" + stat3.getSelectedItem() + "' WHERE ID ='" + id3.getText() + "'";
                        st = con.createStatement();
                        st.executeUpdate(update);

            
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

                            id3.setText("");
                            name3.setText("");
                            email3.setText("");
                            number3.setText("");
                            birthday3.setDate(null);
                            position3.setSelectedIndex(0);
                            address3.setText("");
                            fb3.setText("");
                            stat3.setSelectedIndex(0);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    
         try {
        String sql = "SELECT ID, Name, Position, Status FROM details WHERE 1";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        tablee1.setModel(DbUtils.resultSetToTableModel(rs));

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                Object statusValue = tablee1.getModel().getValueAt(row, tablee1.getColumn("Status").getModelIndex());
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
        tablee1.getColumnModel().getColumn(tablee1.getColumn("Status").getModelIndex()).setCellRenderer(renderer);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
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
    }//GEN-LAST:event_jButton13ActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
       String currentText = name.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
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

    private void name3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name3KeyTyped
       String currentText = name3.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
           getToolkit().beep();
           evt.consume();
       } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
           name3.setText(currentText + Character.toUpperCase(a));
           evt.consume();
       }
    }//GEN-LAST:event_name3KeyTyped

    private void email3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email3KeyTyped
        allowedSymbols.add('.');
        allowedSymbols.add('@');
        allowedSymbols.add('_');     
        char a = evt.getKeyChar();
           if (allowedSymbols.contains(a) && email3.getText().contains(String.valueOf(a))) {
                evt.consume(); 
           }
    }//GEN-LAST:event_email3KeyTyped

    private void address3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address3KeyTyped
        String currentText = address3.getText();
        char a = evt.getKeyChar();
        if (!(Character.isLetter(a) || Character.isDigit(a) || a == ' ' || a == ',' || (a == '.' && !currentText.contains(".")))) {
            evt.consume();
        } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
            address3.setText(currentText + Character.toUpperCase(a));
            evt.consume();
        } else if (Character.isDigit(a) && currentText.length() == 6) {
            evt.consume(); 
        }
    }//GEN-LAST:event_address3KeyTyped

    private void number3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number3KeyTyped
     String currentText = number3.getText();
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
    }//GEN-LAST:event_number3KeyTyped

    private void fb3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fb3KeyTyped
       String currentText = fb3.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
           getToolkit().beep();
           evt.consume();
       } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
           fb3.setText(currentText + Character.toUpperCase(a));
           evt.consume();
       }
    }//GEN-LAST:event_fb3KeyTyped

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void tableeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableeMouseClicked
      try {
            int selectedRow = tablee.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tablee.getModel();


         id1.setText(model.getValueAt(selectedRow, 0).toString());
         name1.setText(model.getValueAt(selectedRow, 1).toString());
         position1.setSelectedItem(model.getValueAt(selectedRow, 2));
         stat1.setSelectedItem(model.getValueAt(selectedRow, 3));
            
            String idFromDatabase = model.getValueAt(selectedRow, 0).toString();
            String sql = "SELECT * FROM details WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, idFromDatabase);
            rs = pst.executeQuery();

            if (rs.next()) {
                email1.setText(rs.getString("Email"));
                number1.setText(rs.getString("Cellphone No."));
                birthday1.setDate(rs.getDate("Date of Birth"));
                address1.setText(rs.getString("Address"));
                fb1.setText( rs.getString("Facebook"));
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tableeMouseClicked

    private void tablee1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablee1MouseClicked
     try {
            int selectedRow = tablee1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tablee1.getModel();


         id3.setText(model.getValueAt(selectedRow, 0).toString());
         name3.setText(model.getValueAt(selectedRow, 1).toString());
         position3.setSelectedItem(model.getValueAt(selectedRow, 2));
         stat3.setSelectedItem(model.getValueAt(selectedRow, 3));
            
            String idFromDatabase = model.getValueAt(selectedRow, 0).toString();
            String sql = "SELECT * FROM details WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, idFromDatabase);
            rs = pst.executeQuery();

            if (rs.next()) {
                email3.setText(rs.getString("Email"));
                number3.setText(rs.getString("Cellphone No."));
                birthday3.setDate(rs.getDate("Date of Birth"));
                address3.setText(rs.getString("Address"));
                fb3.setText( rs.getString("Facebook"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tablee1MouseClicked

    private void tablee1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablee1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablee1MouseEntered

    private void stat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stat1ActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
         DefaultTableModel model=(DefaultTableModel)tablee1.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee1.setRowSorter(tr);
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

        tablee1.getColumnModel().getColumn(tablee1.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    
    }//GEN-LAST:event_searchKeyPressed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
     DefaultTableModel model=(DefaultTableModel)tablee1.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee1.setRowSorter(tr);
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

        tablee1.getColumnModel().getColumn(tablee1.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    
    }//GEN-LAST:event_searchKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model=(DefaultTableModel)tablee1.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee1.setRowSorter(tr);
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

        tablee1.getColumnModel().getColumn(tablee1.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void search1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyPressed
         DefaultTableModel model=(DefaultTableModel)tablee.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search1.getText()));
         tr.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(search1.getText())));
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

        tablee.getColumnModel().getColumn(tablee.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    
    }//GEN-LAST:event_search1KeyPressed

    private void search1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyTyped
         DefaultTableModel model=(DefaultTableModel)tablee.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search1.getText()));
         tr.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(search1.getText())));
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

        tablee.getColumnModel().getColumn(tablee.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    }//GEN-LAST:event_search1KeyTyped

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         DefaultTableModel model=(DefaultTableModel)tablee.getModel();
         TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
         tablee.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search1.getText()));
         tr.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(search1.getText())));
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

        tablee.getColumnModel().getColumn(tablee.getColumn("Status").getModelIndex()).setCellRenderer(renderer);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);

File file = chooser.getSelectedFile();
if (file != null) {
    try {
        BufferedImage originalImage = ImageIO.read(file);
        int targetWidth = 134;
        int targetHeight = 172;
        Image resizedImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resizedImage);
        photo.setIcon(icon);
    } catch (IOException ex) {
        Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_panel;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField address3;
    private javax.swing.JLabel bg;
    private com.toedter.calendar.JDateChooser birthday;
    private com.toedter.calendar.JDateChooser birthday1;
    private com.toedter.calendar.JDateChooser birthday3;
    private javax.swing.JLabel date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField email3;
    private javax.swing.JTextField fb;
    private javax.swing.JTextField fb1;
    private javax.swing.JTextField fb3;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField number;
    private javax.swing.JTextField number1;
    private javax.swing.JTextField number3;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JComboBox<String> position1;
    private javax.swing.JComboBox<String> position3;
    private javax.swing.JPanel remove_panel;
    private javax.swing.JTextField search;
    private javax.swing.JTextField search1;
    private javax.swing.JComboBox<String> stat;
    private javax.swing.JComboBox<String> stat1;
    private javax.swing.JComboBox<String> stat3;
    private javax.swing.JTable table;
    private javax.swing.JTable tablee;
    private javax.swing.JTable tablee1;
    private javax.swing.JLabel time;
    private javax.swing.JLabel un;
    private javax.swing.JPanel update_panel;
    private javax.swing.JPanel view_panel;
    // End of variables declaration//GEN-END:variables

private void Update_table() {
    try {
        String sql = "SELECT `ID`, `Name`, `Email`, `Cellphone No.`, `Date of Birth`, `Position`, `Address`, `Facebook`, `Status` FROM `details` WHERE 1";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));

        // Add a listener for row selection in the table
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    displaySelectedRowPhoto();
                }
            }
        });

        // Set cell renderer for the 'Status' column
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
    private void displaySelectedRowPhoto() {
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        try {
            // Assuming that the 'ID' column is the first column in the ResultSet
            int selectedID = (int) table.getValueAt(selectedRow, 0);

            // Query to retrieve the photo based on the selected ID
            String photoQuery = "SELECT `Photo` FROM `details` WHERE `ID` = ?";
            pst = con.prepareStatement(photoQuery);
            pst.setInt(1, selectedID);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Assuming that the 'Photo' column is of type BLOB
                Blob blob = (Blob) rs.getBlob("Photo");
                if (blob != null) {
                    byte[] photoBytes = blob.getBytes(1, (int) blob.length());
                    BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(photoBytes));

                    if (bufferedImage != null) {
                        // Image resizing
                        Image resizedImage = bufferedImage.getScaledInstance(134, 172, Image.SCALE_SMOOTH);

                        // Set the resized and smoothed image to the JLabel
                        photo1.setIcon(new ImageIcon(resizedImage));
                        photo1.setText(null); // Clear any existing text
                    } else {
                        // Set a placeholder image or message when the photo is null
                        ImageIcon placeholderIcon = new ImageIcon("path/to/placeholder_image.png");
                        photo1.setIcon(placeholderIcon);
                        photo1.setText("No Photo Uploaded");
                        photo1.setHorizontalTextPosition(JLabel.CENTER);
                        photo1.setVerticalTextPosition(JLabel.CENTER);
                    }
                } else {
                    // Set a placeholder image or message when the photo is null
                    ImageIcon placeholderIcon = new ImageIcon("path/to/placeholder_image.png");
                    photo1.setIcon(placeholderIcon);
                    photo1.setText("No Photo Uploaded");
                    photo1.setHorizontalTextPosition(JLabel.CENTER);
                    photo1.setVerticalTextPosition(JLabel.CENTER);
                }
            } else {
                // Handle the case when there is no photo data for the selected ID
                // Display a placeholder image or message
                ImageIcon placeholderIcon = new ImageIcon("path/to/placeholder_image.png");
                photo1.setIcon(placeholderIcon);
                photo1.setText("No Photo Uploaded");
                photo1.setHorizontalTextPosition(JLabel.CENTER);
                photo1.setVerticalTextPosition(JLabel.CENTER);
            }
        } catch (IOException | SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



    private int getColumnIndexByName(JTable table, String columnName) {
        for (int i = 0; i < table.getColumnCount(); i++) {
            if (table.getColumnName(i).equals(columnName)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Column with name " + columnName + " not found");
    }


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
     
 }