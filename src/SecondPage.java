import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
public class SecondPage extends javax.swing.JFrame implements ActionListener{
    public SecondPage() {
   Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int h=(int)d.getHeight();
        int w=(int)d.getWidth();
        setLocation((w-933)/2,(h-553)/2);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Default = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        studentsubmit = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        classes = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fathername = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        occupationoffather = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        religion = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lastinstitutename = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        registraiondate = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        dateofbrth = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        StudentUpate = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox();
        Attendence = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        FeeDetails = new javax.swing.JPanel();
        Attendence1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        StudentDetails = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton29 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        NewStaff = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton26 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        UpdateStaff = new javax.swing.JPanel();
        NewStaff1 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox();
        jComboBox21 = new javax.swing.JComboBox();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton28 = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        DeleteStaff = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jTextField30 = new javax.swing.JTextField();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        StaffDetails = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        StaffAttendence = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jButton27 = new javax.swing.JButton();
        stocks = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_students.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deyes-High-School_icons_19.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("User_Name:");

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_48px.png"))); // NOI18N
        jButton2.setToolTipText("Back To home\n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Shutdown_32px.png"))); // NOI18N
        jButton3.setToolTipText("LogOut\n");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel9.setBackground(new java.awt.Color(0, 255, 255));

        jButton13.setBackground(new java.awt.Color(51, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 255));
        jButton13.setText("New Admmision");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(51, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 51, 255));
        jButton14.setText("Attendence");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(51, 51, 255));
        jButton15.setText("Update Details");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 51, 255));
        jButton16.setText("Fee Details");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(51, 255, 255));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 51, 255));
        jButton17.setText("Student Details");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addGap(29, 29, 29)
                .addComponent(jButton14)
                .addGap(41, 41, 41)
                .addComponent(jButton16)
                .addGap(28, 28, 28)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9, "card2");

        jPanel10.setBackground(new java.awt.Color(0, 255, 255));

        jButton18.setBackground(new java.awt.Color(51, 255, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 51, 255));
        jButton18.setText("New Staff");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 255, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 255));
        jButton19.setText("Attendence");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(51, 255, 255));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 51, 255));
        jButton20.setText("Update Details");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 255, 255));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(51, 51, 255));
        jButton21.setText("Delete Staff");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(51, 255, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(51, 51, 255));
        jButton22.setText("Staff Details");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(18, 18, 18)
                .addComponent(jButton19)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(34, 34, 34)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel10, "card3");

        jPanel11.setBackground(new java.awt.Color(0, 255, 255));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 255));
        jLabel37.setText("Harcourt  Butler Technical University");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel11, "card3");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new java.awt.CardLayout());

        Default.setBackground(new java.awt.Color(0, 255, 255));

        jLabel40.setBackground(new java.awt.Color(0, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Welcome TO Our College ....");

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jPanel1.add(Default, "card3");

        studentsubmit.setBackground(new java.awt.Color(0, 255, 255));

        name.setBackground(new java.awt.Color(0, 255, 255));
        name.setForeground(new java.awt.Color(51, 51, 255));
        name.setToolTipText("Useful Information\n");
        name.setEnabled(false);

        classes.setBackground(new java.awt.Color(0, 255, 255));
        classes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        classes.setForeground(new java.awt.Color(51, 51, 255));
        classes.setToolTipText("Useful Information\n");
        classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(0, 255, 255));
        jLabel22.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("*Name :");
        jLabel22.setToolTipText("Useful Information\n");

        jLabel23.setBackground(new java.awt.Color(0, 255, 255));
        jLabel23.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("*Father Name :");
        jLabel23.setToolTipText("Useful Information\n");

        Fathername.setBackground(new java.awt.Color(0, 255, 255));
        Fathername.setForeground(new java.awt.Color(51, 51, 255));
        Fathername.setToolTipText("Useful Information\n");
        Fathername.setEnabled(false);
        Fathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathernameActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 255, 255));
        jLabel24.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("Occupation of Father :");
        jLabel24.setToolTipText("Useful Information\n");

        occupationoffather.setBackground(new java.awt.Color(0, 255, 255));
        occupationoffather.setForeground(new java.awt.Color(51, 51, 255));
        occupationoffather.setToolTipText("Useful Information\n");
        occupationoffather.setEnabled(false);

        jLabel26.setBackground(new java.awt.Color(0, 255, 255));
        jLabel26.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Date Of Birth :");
        jLabel26.setToolTipText("Useful Information\n");

        jLabel27.setBackground(new java.awt.Color(0, 255, 255));
        jLabel27.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("Religion :");
        jLabel27.setToolTipText("Useful Information\n");

        religion.setBackground(new java.awt.Color(0, 255, 255));
        religion.setForeground(new java.awt.Color(51, 51, 255));
        religion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hindu", "Muslim", "Sikh", "Isai", "Other" }));
        religion.setToolTipText("Useful Information\n");
        religion.setEnabled(false);
        religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religionActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 255, 255));
        jLabel28.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("Gender :");
        jLabel28.setToolTipText("Useful Information\n");

        gender.setBackground(new java.awt.Color(0, 255, 255));
        gender.setForeground(new java.awt.Color(51, 51, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        gender.setToolTipText("Useful Information\n");
        gender.setEnabled(false);
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(0, 255, 255));
        jLabel29.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 255));
        jLabel29.setText("Category :");
        jLabel29.setToolTipText("Useful Information\n");

        Category.setBackground(new java.awt.Color(0, 255, 255));
        Category.setForeground(new java.awt.Color(51, 51, 255));
        Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "OBC", "SC", "ST", "Other" }));
        Category.setToolTipText("Useful Information\n");
        Category.setEnabled(false);
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 255, 255));
        jLabel30.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("Contact No. :");
        jLabel30.setToolTipText("Useful Information\n");

        contact.setBackground(new java.awt.Color(0, 255, 255));
        contact.setForeground(new java.awt.Color(51, 51, 255));
        contact.setToolTipText("Useful Information\n");
        contact.setEnabled(false);

        jLabel31.setBackground(new java.awt.Color(0, 255, 255));
        jLabel31.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 255));
        jLabel31.setText("Email :");
        jLabel31.setToolTipText("Useful Information\n");

        email.setBackground(new java.awt.Color(0, 255, 255));
        email.setForeground(new java.awt.Color(51, 51, 255));
        email.setToolTipText("Useful Information\n");
        email.setEnabled(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(0, 255, 255));
        jLabel32.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("Address :");
        jLabel32.setToolTipText("Useful Information\n");

        jLabel33.setBackground(new java.awt.Color(0, 255, 255));
        jLabel33.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("Last Institute Name:");
        jLabel33.setToolTipText("Useful Information\n");

        lastinstitutename.setBackground(new java.awt.Color(0, 255, 255));
        lastinstitutename.setForeground(new java.awt.Color(51, 51, 255));
        lastinstitutename.setToolTipText("Useful Information\n");
        lastinstitutename.setEnabled(false);
        lastinstitutename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastinstitutenameActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(0, 255, 255));
        jLabel34.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 255));
        jLabel34.setText("Registration Date:");
        jLabel34.setToolTipText("Useful Information\n");

        registraiondate.setBackground(new java.awt.Color(0, 255, 255));
        registraiondate.setForeground(new java.awt.Color(51, 51, 255));
        registraiondate.setToolTipText("Useful Information\n");
        registraiondate.setEnabled(false);
        registraiondate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraiondateActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(51, 51, 255));
        jButton23.setText("Check class validation");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        dateofbrth.setBackground(new java.awt.Color(0, 255, 255));
        dateofbrth.setForeground(new java.awt.Color(51, 51, 255));
        dateofbrth.setToolTipText("Useful Information\n");
        dateofbrth.setEnabled(false);
        dateofbrth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateofbrthMouseClicked(evt);
            }
        });
        dateofbrth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateofbrthActionPerformed(evt);
            }
        });

        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel88.setBackground(new java.awt.Color(0, 255, 255));
        jLabel88.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 51, 255));
        jLabel88.setText("DD/MM/YY");
        jLabel88.setToolTipText("Useful Information\n");

        jLabel109.setBackground(new java.awt.Color(0, 255, 255));
        jLabel109.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 255));
        jLabel109.setText("DD/MM/YY");
        jLabel109.setToolTipText("Useful Information\n");

        jLabel69.setBackground(new java.awt.Color(0, 255, 255));
        jLabel69.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 255));
        jLabel69.setText("Class");
        jLabel69.setToolTipText("Useful Information\n");

        submit.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(51, 51, 255));
        submit.setText("Submit ");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        address.setForeground(new java.awt.Color(51, 51, 255));
        address.setToolTipText("Useful Information\n");
        address.setEnabled(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsubmitLayout = new javax.swing.GroupLayout(studentsubmit);
        studentsubmit.setLayout(studentsubmitLayout);
        studentsubmitLayout.setHorizontalGroup(
            studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsubmitLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsubmitLayout.createSequentialGroup()
                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGap(34, 34, 34)
                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentsubmitLayout.createSequentialGroup()
                                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registraiondate, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(lastinstitutename))
                                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(studentsubmitLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(studentsubmitLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89))))
                            .addGroup(studentsubmitLayout.createSequentialGroup()
                                .addGap(504, 504, 504)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(236, Short.MAX_VALUE))))
                    .addGroup(studentsubmitLayout.createSequentialGroup()
                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel28)
                            .addGroup(studentsubmitLayout.createSequentialGroup()
                                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(74, 74, 74)
                                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(studentsubmitLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(occupationoffather, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(studentsubmitLayout.createSequentialGroup()
                                                .addComponent(Fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel26)
                                                .addGap(42, 42, 42)
                                                .addComponent(dateofbrth, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel88))))
                                    .addGroup(studentsubmitLayout.createSequentialGroup()
                                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel22))
                        .addGap(23, 23, 23))))
            .addGroup(studentsubmitLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(classes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        studentsubmitLayout.setVerticalGroup(
            studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsubmitLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(classes)
                        .addComponent(jButton23)))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addGap(38, 38, 38)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(dateofbrth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(occupationoffather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(religion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(studentsubmitLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsubmitLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastinstitutename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addGroup(studentsubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(registraiondate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel109)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsubmitLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addComponent(jLabel36)
                .addGap(57, 57, 57))
        );

        jPanel1.add(studentsubmit, "card2");

        StudentUpate.setBackground(new java.awt.Color(0, 255, 255));

        jTextField1.setBackground(new java.awt.Color(0, 255, 255));
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jTextField1.setToolTipText("Useful Information\n");

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("*Name :");
        jLabel9.setToolTipText("Useful Information\n");

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("*Father Name :");
        jLabel11.setToolTipText("Useful Information\n");

        jTextField2.setBackground(new java.awt.Color(0, 255, 255));
        jTextField2.setForeground(new java.awt.Color(51, 51, 255));
        jTextField2.setToolTipText("Useful Information\n");

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Occupation of Father :");
        jLabel13.setToolTipText("Useful Information\n");

        jTextField7.setBackground(new java.awt.Color(0, 255, 255));
        jTextField7.setForeground(new java.awt.Color(51, 51, 255));
        jTextField7.setToolTipText("Useful Information\n");

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("DD/MM/YY");
        jLabel14.setToolTipText("Useful Information\n");

        jLabel15.setBackground(new java.awt.Color(0, 255, 255));
        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Religion :");
        jLabel15.setToolTipText("Useful Information\n");

        jComboBox4.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox4.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hindu", "Muslim", "Sikh", "Isai", "Other" }));
        jComboBox4.setToolTipText("Useful Information\n");
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 255, 255));
        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Gender :");
        jLabel16.setToolTipText("Useful Information\n");

        jComboBox5.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox5.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jComboBox5.setToolTipText("Useful Information\n");
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 255, 255));
        jLabel17.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Category :");
        jLabel17.setToolTipText("Useful Information\n");

        jComboBox6.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox6.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "OBC", "SC", "ST", "Other" }));
        jComboBox6.setToolTipText("Useful Information\n");
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 255, 255));
        jLabel18.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Contact No. :");
        jLabel18.setToolTipText("Useful Information\n");

        jTextField8.setBackground(new java.awt.Color(0, 255, 255));
        jTextField8.setForeground(new java.awt.Color(51, 51, 255));
        jTextField8.setToolTipText("Useful Information\n");

        jLabel19.setBackground(new java.awt.Color(0, 255, 255));
        jLabel19.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Email :");
        jLabel19.setToolTipText("Useful Information\n");

        jTextField9.setBackground(new java.awt.Color(0, 255, 255));
        jTextField9.setForeground(new java.awt.Color(51, 51, 255));
        jTextField9.setToolTipText("Useful Information\n");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(0, 255, 255));
        jLabel20.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("Address :");
        jLabel20.setToolTipText("Useful Information\n");

        jScrollPane2.setBackground(new java.awt.Color(0, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 255));
        jScrollPane2.setToolTipText("Useful Information\n");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel21.setBackground(new java.awt.Color(0, 255, 255));
        jLabel21.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Last Institute Name:");
        jLabel21.setToolTipText("Useful Information\n");

        jTextField11.setBackground(new java.awt.Color(0, 255, 255));
        jTextField11.setForeground(new java.awt.Color(51, 51, 255));
        jTextField11.setToolTipText("Useful Information\n");

        jLabel25.setBackground(new java.awt.Color(0, 255, 255));
        jLabel25.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("Registration Date:");
        jLabel25.setToolTipText("Useful Information\n");

        jTextField6.setBackground(new java.awt.Color(0, 255, 255));
        jTextField6.setForeground(new java.awt.Color(51, 51, 255));
        jTextField6.setToolTipText("Useful Information\n");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 255));
        jButton8.setText("Update Things");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 255, 255));
        jTextField3.setForeground(new java.awt.Color(51, 51, 255));
        jTextField3.setToolTipText("Useful Information\n");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(0, 255, 255));
        jLabel47.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 255));
        jLabel47.setText("Date Of Birth :");
        jLabel47.setToolTipText("Useful Information\n");

        jLabel90.setBackground(new java.awt.Color(0, 255, 255));
        jLabel90.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(51, 51, 255));
        jLabel90.setText("Selecct Class");
        jLabel90.setToolTipText("Useful Information\n");

        jComboBox17.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox17.setForeground(new java.awt.Color(51, 51, 255));
        jComboBox17.setToolTipText("Useful Information\n");
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentUpateLayout = new javax.swing.GroupLayout(StudentUpate);
        StudentUpate.setLayout(StudentUpateLayout);
        StudentUpateLayout.setHorizontalGroup(
            StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentUpateLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(StudentUpateLayout.createSequentialGroup()
                                    .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))
                                    .addGap(87, 87, 87))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StudentUpateLayout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(StudentUpateLayout.createSequentialGroup()
                                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentUpateLayout.createSequentialGroup()
                                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(StudentUpateLayout.createSequentialGroup()
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel47)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(StudentUpateLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(StudentUpateLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel14))))
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(StudentUpateLayout.createSequentialGroup()
                                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(140, 140, 140)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(130, Short.MAX_VALUE))
                            .addGroup(StudentUpateLayout.createSequentialGroup()
                                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(StudentUpateLayout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 483, Short.MAX_VALUE))))
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(74, 74, 74)
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        StudentUpateLayout.setVerticalGroup(
            StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentUpateLayout.createSequentialGroup()
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentUpateLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(15, 15, 15)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(StudentUpateLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(StudentUpateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(118, 118, 118))
        );

        jPanel1.add(StudentUpate, "card2");

        Attendence.setBackground(new java.awt.Color(0, 255, 255));

        jLabel42.setBackground(new java.awt.Color(51, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 204));
        jLabel42.setText("*Student_Id:");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Attendence.jpg"))); // NOI18N

        jLabel44.setBackground(new java.awt.Color(51, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 204));
        jLabel44.setText("*Class:");

        jComboBox2.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", " " }));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Submit");

        jTextField17.setBackground(new java.awt.Color(0, 255, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 51, 255));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setToolTipText("Roll_number");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jLabel45.setBackground(new java.awt.Color(51, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 204));
        jLabel45.setText("*Put Attendence:");

        jComboBox3.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Put Attendence", "A", "P" }));

        jTable3.setBackground(new java.awt.Color(0, 255, 255));
        jTable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.cyan, java.awt.Color.cyan));
        jTable3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable3.setForeground(new java.awt.Color(51, 51, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Attendence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(0, 255, 255));
        jScrollPane6.setViewportView(jTable3);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh_32px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AttendenceLayout = new javax.swing.GroupLayout(Attendence);
        Attendence.setLayout(AttendenceLayout);
        AttendenceLayout.setHorizontalGroup(
            AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendenceLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AttendenceLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(384, 384, 384)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AttendenceLayout.createSequentialGroup()
                        .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AttendenceLayout.createSequentialGroup()
                                .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))
                            .addGroup(AttendenceLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );
        AttendenceLayout.setVerticalGroup(
            AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttendenceLayout.createSequentialGroup()
                        .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel1.add(Attendence, "card3");

        FeeDetails.setBackground(new java.awt.Color(0, 255, 255));

        Attendence1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel46.setBackground(new java.awt.Color(51, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 204));
        jLabel46.setText("*Student_Id:");

        jLabel48.setBackground(new java.awt.Color(51, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 204));
        jLabel48.setText("*Class:");

        jComboBox12.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", " " }));

        jButton9.setBackground(new java.awt.Color(0, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 255));
        jButton9.setText("Get Fee Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(0, 255, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(0, 51, 255));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setToolTipText("Roll_number");
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jTable4.setBackground(new java.awt.Color(0, 255, 255));
        jTable4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.cyan, java.awt.Color.cyan));
        jTable4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable4.setForeground(new java.awt.Color(51, 51, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount", "Recipt No.", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(0, 255, 255));
        jScrollPane7.setViewportView(jTable4);

        jButton11.setBackground(new java.awt.Color(0, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 255));
        jButton11.setText("Pay Fee ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField19.setBackground(new java.awt.Color(0, 255, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(0, 51, 255));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setToolTipText("Roll_number");
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jLabel51.setBackground(new java.awt.Color(51, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 204));
        jLabel51.setText("Amount");

        jLabel52.setBackground(new java.awt.Color(51, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 204));
        jLabel52.setText("Date:");

        jTextField20.setBackground(new java.awt.Color(0, 255, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(0, 51, 255));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setToolTipText("Roll_number");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jLabel53.setBackground(new java.awt.Color(51, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 204));
        jLabel53.setText("Remarks");

        jTextField21.setBackground(new java.awt.Color(0, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(0, 51, 255));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setToolTipText("Roll_number");
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jLabel68.setBackground(new java.awt.Color(51, 255, 255));
        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 204));
        jLabel68.setText("Recipt  No");

        jTextField22.setBackground(new java.awt.Color(0, 255, 255));
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(0, 51, 255));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setToolTipText("Roll_number");
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jButton12.setBackground(new java.awt.Color(0, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 255));
        jButton12.setText("For Submitting Fee ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh_32px.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Attendence1Layout = new javax.swing.GroupLayout(Attendence1);
        Attendence1.setLayout(Attendence1Layout);
        Attendence1Layout.setHorizontalGroup(
            Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(25, 25, 25)
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Attendence1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                        .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Attendence1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton11)))
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Attendence1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Attendence1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Attendence1Layout.setVerticalGroup(
            Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Attendence1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Attendence1Layout.createSequentialGroup()
                        .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Attendence1Layout.createSequentialGroup()
                                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Attendence1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schoolFee.jpg"))); // NOI18N

        javax.swing.GroupLayout FeeDetailsLayout = new javax.swing.GroupLayout(FeeDetails);
        FeeDetails.setLayout(FeeDetailsLayout);
        FeeDetailsLayout.setHorizontalGroup(
            FeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeeDetailsLayout.createSequentialGroup()
                .addComponent(Attendence1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
            .addGroup(FeeDetailsLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeeDetailsLayout.setVerticalGroup(
            FeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeeDetailsLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Attendence1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(FeeDetails, "card3");

        StudentDetails.setBackground(new java.awt.Color(0, 255, 255));

        jLabel50.setBackground(new java.awt.Color(51, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 204));
        jLabel50.setText("*Class:");

        jComboBox13.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", " " }));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh_32px.png"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTable5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.cyan, java.awt.Color.cyan));
        jTable5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable5.setForeground(new java.awt.Color(51, 51, 255));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Name", "Father Name", "Date Of Birth", "Contact No.", "Gender", "Category", "Religion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.setGridColor(new java.awt.Color(0, 255, 255));
        jTable5.setPreferredSize(new java.awt.Dimension(600, 320));
        jScrollPane8.setViewportView(jTable5);

        jComboBox14.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Medium", "Hindi  Medium", "English Medium" }));

        jLabel71.setBackground(new java.awt.Color(51, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 0, 204));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Student Details");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jLabel70.setBackground(new java.awt.Color(51, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 204));
        jLabel70.setText("*Medium");

        jButton25.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhis\\Documents\\Received Files\\DeskCollege\\src\\images\\Refresh_32px.png")); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentDetailsLayout = new javax.swing.GroupLayout(StudentDetails);
        StudentDetails.setLayout(StudentDetailsLayout);
        StudentDetailsLayout.setHorizontalGroup(
            StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentDetailsLayout.createSequentialGroup()
                .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton25)
                    .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudentDetailsLayout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StudentDetailsLayout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(StudentDetailsLayout.createSequentialGroup()
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(StudentDetailsLayout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(StudentDetailsLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentDetailsLayout.createSequentialGroup()
                    .addContainerGap(584, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(347, 347, 347)))
            .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentDetailsLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(847, Short.MAX_VALUE)))
        );
        StudentDetailsLayout.setVerticalGroup(
            StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentDetailsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentDetailsLayout.createSequentialGroup()
                    .addContainerGap(372, Short.MAX_VALUE)
                    .addComponent(jButton29)
                    .addGap(232, 232, 232)))
            .addGroup(StudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentDetailsLayout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );

        jPanel1.add(StudentDetails, "card3");

        NewStaff.setBackground(new java.awt.Color(51, 255, 255));

        jLabel66.setBackground(new java.awt.Color(0, 255, 255));
        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 204));
        jLabel66.setText(" Contact no.:");

        jLabel72.setBackground(new java.awt.Color(0, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 51, 204));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel72.setText(" E-mail:");

        jTextField33.setBackground(new java.awt.Color(0, 255, 255));
        jTextField33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(0, 51, 204));

        jLabel73.setBackground(new java.awt.Color(0, 255, 255));
        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 204));
        jLabel73.setText("Date of Birth:");

        jLabel74.setBackground(new java.awt.Color(0, 255, 255));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 204));
        jLabel74.setText("Father Name:");

        jLabel75.setBackground(new java.awt.Color(0, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 51, 204));
        jLabel75.setText(" Name:");

        jLabel76.setBackground(new java.awt.Color(0, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 0, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Staff Registration");
        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jTextField34.setBackground(new java.awt.Color(0, 255, 255));
        jTextField34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(0, 51, 204));
        jTextField34.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField34FocusLost(evt);
            }
        });
        jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField34KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField34KeyTyped(evt);
            }
        });

        jTextField35.setBackground(new java.awt.Color(0, 255, 255));
        jTextField35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(0, 51, 204));
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jTextField36.setBackground(new java.awt.Color(0, 255, 255));
        jTextField36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(0, 51, 204));

        jTextField37.setBackground(new java.awt.Color(0, 255, 255));
        jTextField37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(0, 51, 204));
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jLabel77.setBackground(new java.awt.Color(0, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 51, 204));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Gender:");

        jComboBox15.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox15.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        jComboBox16.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Principal", "Teacher", "Worker" }));

        jLabel78.setBackground(new java.awt.Color(0, 255, 255));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 51, 204));
        jLabel78.setText("Designation:");

        jLabel79.setBackground(new java.awt.Color(0, 255, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 51, 204));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Working since:");

        jLabel80.setBackground(new java.awt.Color(0, 255, 255));
        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 51, 204));
        jLabel80.setText("   Salary:");

        jTextField39.setBackground(new java.awt.Color(0, 255, 255));
        jTextField39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(0, 51, 204));

        jLabel81.setBackground(new java.awt.Color(0, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 51, 204));
        jLabel81.setText("Address:");

        jTextArea5.setBackground(new java.awt.Color(0, 255, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(0, 51, 204));
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jButton26.setBackground(new java.awt.Color(0, 255, 255));
        jButton26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 51, 204));
        jButton26.setText("Submit");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel82.setBackground(new java.awt.Color(0, 255, 255));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 51, 204));
        jLabel82.setText("Staff ID:");

        jTextField40.setBackground(new java.awt.Color(0, 255, 255));
        jTextField40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(0, 51, 204));
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(0, 255, 255));
        jTextField49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout NewStaffLayout = new javax.swing.GroupLayout(NewStaff);
        NewStaff.setLayout(NewStaffLayout);
        NewStaffLayout.setHorizontalGroup(
            NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewStaffLayout.createSequentialGroup()
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(NewStaffLayout.createSequentialGroup()
                                    .addComponent(jLabel81)
                                    .addGap(100, 100, 100))
                                .addGroup(NewStaffLayout.createSequentialGroup()
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100))
                                .addGroup(NewStaffLayout.createSequentialGroup()
                                    .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel74)
                                        .addComponent(jLabel75)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel72)
                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel78)
                                        .addComponent(jLabel82))
                                    .addGap(60, 60, 60)))
                            .addGroup(NewStaffLayout.createSequentialGroup()
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewStaffLayout.createSequentialGroup()
                                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField37, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addComponent(jTextField36)
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jButton26)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewStaffLayout.setVerticalGroup(
            NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addGap(20, 20, 20)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(18, 18, 18)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NewStaffLayout.createSequentialGroup()
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(NewStaffLayout.createSequentialGroup()
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel72))
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addGap(18, 18, 18)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel81))
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(NewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(NewStaffLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(NewStaff, "card3");

        UpdateStaff.setBackground(new java.awt.Color(51, 255, 255));

        NewStaff1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel95.setBackground(new java.awt.Color(0, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 51, 204));
        jLabel95.setText(" Contact no.:");

        jLabel96.setBackground(new java.awt.Color(0, 255, 255));
        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 51, 204));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel96.setText(" E-mail:");

        jTextField41.setBackground(new java.awt.Color(0, 255, 255));
        jTextField41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(0, 51, 204));

        jLabel97.setBackground(new java.awt.Color(0, 255, 255));
        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 51, 204));
        jLabel97.setText("Date of Birth:");

        jLabel98.setBackground(new java.awt.Color(0, 255, 255));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 51, 204));
        jLabel98.setText("Father Name:");

        jLabel99.setBackground(new java.awt.Color(0, 255, 255));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 51, 204));
        jLabel99.setText(" Name:");

        jLabel100.setBackground(new java.awt.Color(0, 255, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 0, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Staff Updation");
        jLabel100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jTextField42.setBackground(new java.awt.Color(0, 255, 255));
        jTextField42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(0, 51, 204));
        jTextField42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField42FocusLost(evt);
            }
        });
        jTextField42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField42KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField42KeyTyped(evt);
            }
        });

        jTextField43.setBackground(new java.awt.Color(0, 255, 255));
        jTextField43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(0, 51, 204));
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jTextField44.setBackground(new java.awt.Color(0, 255, 255));
        jTextField44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(0, 51, 204));

        jTextField45.setBackground(new java.awt.Color(0, 255, 255));
        jTextField45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(0, 51, 204));
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jLabel101.setBackground(new java.awt.Color(0, 255, 255));
        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 51, 204));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("Gender:");

        jComboBox20.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jComboBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox20ActionPerformed(evt);
            }
        });

        jComboBox21.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox21.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Principal", "Teacher", "Worker" }));

        jLabel102.setBackground(new java.awt.Color(0, 255, 255));
        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 51, 204));
        jLabel102.setText("Designation:");

        jLabel103.setBackground(new java.awt.Color(0, 255, 255));
        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 51, 204));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Working since:");

        jTextField46.setBackground(new java.awt.Color(0, 255, 255));
        jTextField46.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(0, 51, 204));
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });

        jLabel104.setBackground(new java.awt.Color(0, 255, 255));
        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 51, 204));
        jLabel104.setText("   Salary:");

        jTextField47.setBackground(new java.awt.Color(0, 255, 255));
        jTextField47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(0, 51, 204));

        jLabel105.setBackground(new java.awt.Color(0, 255, 255));
        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 51, 204));
        jLabel105.setText("Address:");

        jTextArea6.setBackground(new java.awt.Color(0, 255, 255));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(0, 51, 204));
        jTextArea6.setRows(5);
        jScrollPane11.setViewportView(jTextArea6);

        jButton28.setBackground(new java.awt.Color(0, 255, 255));
        jButton28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 51, 204));
        jButton28.setText("Update Things");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel106.setBackground(new java.awt.Color(0, 255, 255));
        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 51, 204));
        jLabel106.setText("Staff ID:");

        jTextField48.setBackground(new java.awt.Color(0, 255, 255));
        jTextField48.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(0, 51, 204));
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewStaff1Layout = new javax.swing.GroupLayout(NewStaff1);
        NewStaff1.setLayout(NewStaff1Layout);
        NewStaff1Layout.setHorizontalGroup(
            NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewStaff1Layout.createSequentialGroup()
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaff1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewStaff1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel106)))
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel105)
                                .addComponent(jLabel104)))
                        .addGap(44, 44, 44)
                        .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jTextField48, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(118, 118, 118)
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox21, javax.swing.GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
                                    .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton28)
                                .addGap(55, 55, 55))
                            .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextField44, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewStaff1Layout.setVerticalGroup(
            NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewStaff1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addGap(20, 20, 20)
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel97)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewStaff1Layout.createSequentialGroup()
                        .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(NewStaff1Layout.createSequentialGroup()
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel96))
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewStaff1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel104))
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(NewStaff1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel102)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(NewStaff1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105)
                    .addComponent(jButton28))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout UpdateStaffLayout = new javax.swing.GroupLayout(UpdateStaff);
        UpdateStaff.setLayout(UpdateStaffLayout);
        UpdateStaffLayout.setHorizontalGroup(
            UpdateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
            .addGroup(UpdateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateStaffLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        UpdateStaffLayout.setVerticalGroup(
            UpdateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(UpdateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateStaffLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(UpdateStaff, "card3");

        DeleteStaff.setBackground(new java.awt.Color(0, 255, 255));

        jLabel54.setBackground(new java.awt.Color(0, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 51, 204));
        jLabel54.setText(" Name:");

        jLabel55.setBackground(new java.awt.Color(0, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 51, 204));
        jLabel55.setText("Father Name:");

        jLabel56.setBackground(new java.awt.Color(0, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 204));
        jLabel56.setText("Date of Birth:");

        jLabel57.setBackground(new java.awt.Color(0, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 204));
        jLabel57.setText(" Contact no.:");

        jTextField25.setBackground(new java.awt.Color(0, 255, 255));
        jTextField25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(0, 51, 204));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(0, 255, 255));
        jTextField26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(0, 51, 204));

        jTextField27.setBackground(new java.awt.Color(0, 255, 255));
        jTextField27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(0, 51, 204));

        jTextField28.setBackground(new java.awt.Color(0, 255, 255));
        jTextField28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(0, 51, 204));

        jTextField29.setBackground(new java.awt.Color(0, 255, 255));
        jTextField29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(0, 51, 204));
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(0, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 204));
        jLabel58.setText("Designation:");

        jLabel59.setBackground(new java.awt.Color(0, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 51, 204));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Working since:");

        jLabel60.setBackground(new java.awt.Color(0, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 51, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Gender:");

        jComboBox10.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Principal", "Teacher", "Worker" }));

        jTextField30.setBackground(new java.awt.Color(0, 255, 255));
        jTextField30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(0, 51, 204));
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jComboBox11.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(0, 255, 255));
        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 51, 204));
        jLabel62.setText("   Salary:");

        jTextField31.setBackground(new java.awt.Color(0, 255, 255));
        jTextField31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(0, 51, 204));

        jLabel63.setBackground(new java.awt.Color(0, 255, 255));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 204));
        jLabel63.setText("Address:");

        jTextArea4.setBackground(new java.awt.Color(0, 255, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(0, 51, 204));
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 204));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(0, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 204));
        jLabel64.setText("Staff ID:");

        jTextField32.setBackground(new java.awt.Color(0, 255, 255));
        jTextField32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(0, 51, 204));
        jTextField32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField32FocusLost(evt);
            }
        });
        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField32KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField32KeyTyped(evt);
            }
        });

        jLabel65.setForeground(new java.awt.Color(255, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel67.setBackground(new java.awt.Color(0, 255, 255));
        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 51, 204));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel67.setText(" E-mail:");

        jLabel85.setBackground(new java.awt.Color(0, 255, 255));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 0, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Staff Deletion");
        jLabel85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar_16px.png"))); // NOI18N

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar_16px.png"))); // NOI18N

        javax.swing.GroupLayout DeleteStaffLayout = new javax.swing.GroupLayout(DeleteStaff);
        DeleteStaff.setLayout(DeleteStaffLayout);
        DeleteStaffLayout.setHorizontalGroup(
            DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteStaffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jLabel61))
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel67)
                            .addComponent(jLabel55)
                            .addComponent(jLabel64)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel63)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DeleteStaffLayout.createSequentialGroup()
                                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteStaffLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87))))
                            .addGroup(DeleteStaffLayout.createSequentialGroup()
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel89)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(jTextField29))
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DeleteStaffLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DeleteStaffLayout.setVerticalGroup(
            DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGap(17, 17, 17)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))
                        .addGap(20, 20, 20)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DeleteStaffLayout.createSequentialGroup()
                                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58))
                                .addGap(18, 18, 18)
                                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel65)
                        .addGap(32, 32, 32)
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteStaffLayout.createSequentialGroup()
                        .addGroup(DeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel61))
                    .addComponent(jButton4))
                .addGap(9, 9, 9))
        );

        jPanel1.add(DeleteStaff, "card3");

        StaffDetails.setBackground(new java.awt.Color(0, 255, 255));

        jLabel41.setBackground(new java.awt.Color(0, 204, 204));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 204));
        jLabel41.setText("Staff Details");

        jTable2.setBackground(new java.awt.Color(0, 204, 204));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff_ID", "Name", "Father Name", "Date Of Birth", "Contact No.", "Email", "Designation", "Salary", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout StaffDetailsLayout = new javax.swing.GroupLayout(StaffDetails);
        StaffDetails.setLayout(StaffDetailsLayout);
        StaffDetailsLayout.setHorizontalGroup(
            StaffDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffDetailsLayout.createSequentialGroup()
                .addGroup(StaffDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffDetailsLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StaffDetailsLayout.setVerticalGroup(
            StaffDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffDetailsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanel1.add(StaffDetails, "card3");

        StaffAttendence.setBackground(new java.awt.Color(0, 255, 255));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staffattendence.jpg"))); // NOI18N

        jTable6.setBackground(new java.awt.Color(0, 255, 255));
        jTable6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.cyan, java.awt.Color.cyan));
        jTable6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable6.setForeground(new java.awt.Color(51, 51, 255));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Attendence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.setGridColor(new java.awt.Color(0, 255, 255));
        jScrollPane10.setViewportView(jTable6);

        jComboBox18.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", " " }));

        jLabel92.setBackground(new java.awt.Color(51, 255, 255));
        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 204));
        jLabel92.setText("*Class:");

        jLabel93.setBackground(new java.awt.Color(51, 255, 255));
        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 204));
        jLabel93.setText("Staff Id");

        jTextField24.setBackground(new java.awt.Color(0, 255, 255));
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(0, 51, 255));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setToolTipText("Roll_number");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jLabel94.setBackground(new java.awt.Color(51, 255, 255));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 204));
        jLabel94.setText("*Put Attendence:");

        jComboBox19.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(0, 51, 204));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Put Attendence", "A", "P" }));

        jButton27.setBackground(new java.awt.Color(0, 255, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 102, 255));
        jButton27.setText("Submit");

        javax.swing.GroupLayout StaffAttendenceLayout = new javax.swing.GroupLayout(StaffAttendence);
        StaffAttendence.setLayout(StaffAttendenceLayout);
        StaffAttendenceLayout.setHorizontalGroup(
            StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffAttendenceLayout.createSequentialGroup()
                .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffAttendenceLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StaffAttendenceLayout.createSequentialGroup()
                                .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StaffAttendenceLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffAttendenceLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel91)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        StaffAttendenceLayout.setVerticalGroup(
            StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffAttendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffAttendenceLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93)
                            .addGroup(StaffAttendenceLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(StaffAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffAttendenceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jPanel1.add(StaffAttendence, "card3");

        stocks.setBackground(new java.awt.Color(0, 255, 255));

        jLabel38.setBackground(new java.awt.Color(0, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 255));
        jLabel38.setText("Item  :-");

        jComboBox1.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.cyan, java.awt.Color.cyan));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No.", "Item Name", "Rate", "Remaining Quantities"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Add New Item");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setForeground(new java.awt.Color(0, 0, 204));
        jButton7.setText("Update Item Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 255, 255));
        jButton24.setForeground(new java.awt.Color(0, 0, 204));
        jButton24.setText("Add / Substract Quantities");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setLayout(null);

        jLabel39.setToolTipText("Refresh The Data");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout stocksLayout = new javax.swing.GroupLayout(stocks);
        stocks.setLayout(stocksLayout);
        stocksLayout.setHorizontalGroup(
            stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stocksLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(stocksLayout.createSequentialGroup()
                .addGroup(stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stocksLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stocksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6)
                        .addGap(248, 248, 248)
                        .addComponent(jButton7)
                        .addGap(97, 97, 97)
                        .addComponent(jButton24))
                    .addGroup(stocksLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stocksLayout.setVerticalGroup(
            stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stocksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38))
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton24)
                    .addComponent(jButton6))
                .addGap(27, 27, 27)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(stocks, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int day, month, year;
      int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
   day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
      int am_pm=date.get(Calendar.AM_PM);
	String dat=(day+"-"+(month+1)+"-"+year);
        String am="";
        if(am_pm==0)
            am="AM";
        else
            am="PM";
	String time=(hour+"-"+minute+"-"+second+" "+am);
        jLabel2.setText("Date :"+dat);
        jLabel3.setText("Time :"+time);
        try{
        String s="";
  String curr=new File("").getAbsolutePath();
            File f=new File(curr+"\\tmpfile.txt");
            FileInputStream fin=new FileInputStream(f);
            DataInputStream din=new DataInputStream(fin);
           s4=din.readLine();   
s4.replaceAll(" ","");
           Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+s4+"","root","");
         st=con.createStatement();
        ResultSet rt=st.executeQuery("select * from school_details");
        while(rt.next())
        {         jLabel1.setText(rt.getString(3));
             m=rt.getInt(1);
             n=rt.getInt(2);
        }
            System.out.println(m+" "+n);
for(int i=m;i<=n;i++)
{
    if(i==1)
    classes.addItem("LKG");
    else if(i==2)
        classes.addItem("UKG");
    else if(i==15)
    classes.addItem("Graduate");
    else if(i==16)
    classes.addItem("Post Graduate");        
   else if(i==17)
    classes.addItem("Diploma");        
       else
    {
        classes.addItem("class"+(i-2));
    }
}
        File f2=new File(curr+"\\tmpfile2.txt");
            FileInputStream fin2=new FileInputStream(f2);
            DataInputStream din2=new DataInputStream(fin2);
        String s6=din2.readLine();
        System.out.println(s6);
            jLabel8.setText(s6);
            
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_formWindowOpened
    int m,n;
    Connection con=null;Statement st=null;
    String s4;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new SecondPage().show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
new ExistingUser2().show();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    Timer t;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            new UpdateGif().setVisible(true);
            Thread.sleep(1000);
            new UpdateGif().setVisible(false);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }//GEN-LAST:event_jButton8ActionPerformed

    @Override
    public void actionPerformed(ActionEvent e)
    {
        new UpdateGif().show();
        this.disable();
        if(n>100)
        {new UpdateGif().show(false);
        this.dispose();
        }
        else
        {n=n+20;
                }
            }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
              UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
 jTextField3.add(datePicker);
  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
studentsubmit.show();
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
Attendence.show();        // TODO add your handling code here:
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
studentsubmit.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
StudentUpate.show();        // TODO add your handling code here:
StaffAttendence.setVisible(false);
Default.setVisible(false);
studentsubmit.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
FeeDetails.show();        // TODO add your handling code here:
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
studentsubmit.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
StudentDetails.show();      
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
studentsubmit.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
studentsubmit.setVisible(false);
        StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.show();
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
studentsubmit.setVisible(false);
StaffAttendence.show();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
StaffAttendence.setVisible(false);
Default.setVisible(false);
studentsubmit.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
        UpdateStaff.show();   
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
DeleteStaff.show();      
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
studentsubmit.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
StaffDetails.show();        // TODO add your handling code here:
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
studentsubmit.setVisible(false);
stocks.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
jLabel4.setBorder(new BevelBorder(20, Color.BLUE, Color.RED));
        jPanel10.show(false);// TODO add your handling code here:
jPanel11.show(false);// TODO add your handling code here:
jPanel9.show();
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
stocks.setVisible(false);
studentsubmit.show();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
jPanel11.show(false);// TODO add your handling code here:
jPanel9.show(false);// TODO add your handling code here:       
jPanel10.show();        // TODO add your handling code here:
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.show();
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
studentsubmit.setVisible(false);
stocks.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
jPanel11.show();
jPanel10.show(false);// TODO add your handling code here:
jPanel9.show(false);// TODO add your handling code here:
stocks.show();
StaffAttendence.setVisible(false);
Default.setVisible(false);
StudentUpate.setVisible(false);
Attendence.setVisible(false);
FeeDetails.setVisible(false);
StudentDetails.setVisible(false);
NewStaff.setVisible(false);
UpdateStaff.setVisible(false);
DeleteStaff.setVisible(false);
StaffAttendence.setVisible(false);
StaffDetails.setVisible(false);
studentsubmit.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void religionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_religionActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void registraiondateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraiondateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registraiondateActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
name.enable();
Fathername.enable();
gender.enable();
Category.enable();
occupationoffather.enable();
religion.enable();
contact.enable();
email.enable();address.enable();registraiondate.enable();lastinstitutename.enable();dateofbrth.enable();
submit.enable();
address.enable();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void dateofbrthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateofbrthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateofbrthMouseClicked

    private void dateofbrthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateofbrthActionPerformed

    }//GEN-LAST:event_dateofbrthActionPerformed

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
     updateThings();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField32FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField32FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32FocusLost

    private void jTextField32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32KeyPressed

    private void jTextField32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField34FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField34FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34FocusLost

    private void jTextField34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34KeyPressed

    private void jTextField34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34KeyTyped

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void jTextField42FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField42FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42FocusLost

    private void jTextField42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField42KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42KeyPressed

    private void jTextField42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField42KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42KeyTyped

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jComboBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox20ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
new UpdateGif().show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new UpdateGif().show();
        new UpdateGif().show(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void FathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathernameActionPerformed

    private void lastinstitutenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastinstitutenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastinstitutenameActionPerformed

    private void classesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classesActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
try{
 String eclassname=classes.getSelectedItem().toString();
    if(eclassname.equals("LKG"))
     eclassname="class1";        
    else if(eclassname.equals("UKG"))
    eclassname="class2";
    else if(eclassname.equals("graduate"))
        eclassname="class15";
    else if(eclassname.equals("postgraduate"))
 eclassname="class16";
    else if(eclassname.equals("postgraduate"))
 eclassname="class17";
    else
    {int t=eclassname.length();
        if(eclassname.charAt(t-2)>='0'&&eclassname.charAt(t-2)<='9')
            eclassname="class"+(Integer.parseInt(eclassname.substring(t-2,t-1))+2);
        else
            eclassname="class"+(Integer.parseInt(eclassname.substring(t-1))+2);            
    }
    String enameString=name.getText();
String efname=Fathername.getText();
String eoccupation=occupationoffather.getText();
String ereligion=religion.getSelectedItem().toString();
String egender=gender.getSelectedItem().toString();
String econtact=contact.getText();
String ecategory=Category.getSelectedItem().toString();
String email=this.email.getText();
String eaddress=address.getText().toString();
String elastInstitueName=lastinstitutename.getText();
String eregistrationdate=registraiondate.getText();
String edateofbirth=dateofbrth.getText();
ResultSet rt=st.executeQuery("select user_id from "+eclassname);
int exp=0;
while(rt.next())
exp=rt.getInt(1);
System.out.println(exp);
    System.out.println(eclassname);
if(exp!=0)
System.out.println(st.executeUpdate("insert into "+eclassname+"(user_id,stu_name,stu_father_name,occupation,Religion,gender,category,contact_no,email_id,Address,LastInstituteName,Registration_date,dateofbirth) values("+(exp+1)+",'"+enameString+"','"+efname+"','"+eoccupation+"','"+ereligion+"','"+egender+"','"+ecategory+"','"+econtact+"','"+email+"','"+eaddress+"','"+elastInstitueName+"','"+elastInstitueName+"','"+eregistrationdate+"','"+edateofbirth+"')"));
else
System.out.println(st.executeUpdate("insert into "+eclassname+"(user_id,stu_name,stu_father_name,occupation,Religion,gender,category,contact_no,email_id,Address,LastInstituteName,Registration_date,dateofbirth) values("+exp+1+",'"+enameString+"','"+efname+"','"+eoccupation+"','"+ereligion+"','"+egender+"','"+ecategory+"','"+econtact+"','"+email+"','"+eaddress+"','"+elastInstitueName+"','"+elastInstitueName+"','"+eregistrationdate+"','"+edateofbirth+"')"));    
}      catch (SQLException ex) {
    System.out.println(ex);
}

    }//GEN-LAST:event_submitActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed
  void  updateThings(){}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendence;
    private javax.swing.JPanel Attendence1;
    private javax.swing.JComboBox Category;
    private javax.swing.JPanel Default;
    private javax.swing.JPanel DeleteStaff;
    private javax.swing.JTextField Fathername;
    private javax.swing.JPanel FeeDetails;
    private javax.swing.JPanel NewStaff;
    private javax.swing.JPanel NewStaff1;
    private javax.swing.JPanel StaffAttendence;
    private javax.swing.JPanel StaffDetails;
    private javax.swing.JPanel StudentDetails;
    private javax.swing.JPanel StudentUpate;
    private javax.swing.JPanel UpdateStaff;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox classes;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dateofbrth;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lastinstitutename;
    private javax.swing.JTextField name;
    private javax.swing.JTextField occupationoffather;
    private javax.swing.JTextField registraiondate;
    private javax.swing.JComboBox religion;
    private javax.swing.JPanel stocks;
    private javax.swing.JPanel studentsubmit;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
