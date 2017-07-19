import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class FirstPage extends javax.swing.JFrame {
String txtdata;
    public FirstPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What Is Your Residence");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Submit First Data");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Select Class To:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setToolTipText("Do not use 'or . or other special character");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "LKG_1", "UKG_2", "FirstClass3", "SecondClass_4", "ThirdClass_5", "ForthClass_6", "FifthClass_7", "SixthClass_8", "SeventhClass_9", "EightClass_10", "NinthClass_11", "TenthClass_12", "EleventhClass_13", "TwelthClass_14", "PostGraduation_15", "Graduation_16", "Diploma_17" }));
        jComboBox2.setToolTipText("Start Class");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Enter School Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Select Class From::");

        jComboBox3.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "LKG_1", "UKG_2", "FirstClass_3", "SecondClass_4", "ThirdClass_5", "ForthClass_6", "FifthClass_7", "SixthClass_8", "SeventhClass_9", "EightClass_10", "NinthClass_11", "TenthClass_12", "EleventhClass_13", "TwelthClass_14", "PostGraduation_15", "Graduation_16", "Diploma_17" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s=jTextField2.getText();
        String s1=jComboBox2.getSelectedItem().toString();
        String s2=jComboBox3.getSelectedItem().toString();
int m=0,n=0,l1=s1.length(),l2=s2.length();
if(s.equals("")){
            JOptionPane.showMessageDialog(jPanel1, "Enter Your School Name");
            this.dispose();
            new FirstPage().show();}
        else
        {
           if(s1.equals("Select Class"))
           {
               JOptionPane.showMessageDialog(jPanel1, "Enter Your Classes");
               this.dispose();
               new FirstPage().show();
       return;
           }
           else
           {
                       if(s2.equals("Select Class"))
           {
               JOptionPane.showMessageDialog(jPanel1, "Enter Your Classes");
               this.dispose();
               new FirstPage().show();
       return;

           }
        }
        }
        s=s.replace(' ','_');
 if(s2.charAt(l2-2)>='0'&&s2.charAt(l2-2)<='9')
        n=Integer.parseInt(s2.substring(l2-2));
    else
        n=Integer.parseInt(s2.charAt(l2-1)+"");           
       if(s1.charAt(l1-2)>='0'&&s1.charAt(l1-2)<='9')
        m=Integer.parseInt(s1.substring(l1-2)+"");
    else
        m=Integer.parseInt(s1.charAt(l1-1)+"");
                System.out.println(m+" "+n);
                if(n<m){
                    JOptionPane.showMessageDialog(jPanel1,"From Class  is greater than to class");this.dispose();
                    new FirstPage().show();
                    return;
                }
                try{    DatabaseConnection dbc=new DatabaseConnection();
               Connection con=dbc.connect();
               Statement st=con.createStatement();
                  System.out.println(st.executeUpdate("create database "+s+""));
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+s+"","root","");
         st=con.createStatement();
        System.out.println(st.executeUpdate("create table school_details("+s1+" bigint,"+s2+" bigint,schoolname varchar(200))"));
        System.out.println(st.executeUpdate("create table Handler(user_id smallint,username varchar(20),pass varchar(20),petName varchar(10))"));
        System.out.println(st.executeUpdate("Insert into school_details values("+m+","+n+",'"+s+"')"));
           File f=new  File("tmpfile.txt");
        FileWriter fw=new  FileWriter(f);
        FileOutputStream fout=new FileOutputStream(f);
        DataOutputStream dout=new DataOutputStream(fout);
        dout.writeBytes(s);
for(int i=m;i<=n;i++)
{
    st.executeUpdate("create table class"+i+"(user_id bigint,date varchar(20),amount bigint,recipt_no bigint,remarks varchar(20),stu_name varchar(20),stu_father_name varchar(20),occupation varchar(20),Religion varchar(10),gender varchar(10),category varchar(10),contact_no varchar(20),email_id varchar(20),Address varchar(50),LastInstituteName varchar(20),Registration_date varchar(10),dateofbirth varchar(10),attendence varchar(5))");
}
    st.executeUpdate("create table staff(staff_id bigint,name varchar(20),amount bigint,recipt_no bigint,remarks varchar(20),stu_name varchar(20),stu_father_name varchar(20),occupation varchar(20),Religion varchar(10),gender varchar(10),category varchar(10),contact_no varchar(20),email_id varchar(20),Address varchar(50),LastInstituteName varchar(20),Registration_date varchar(10),dateofbirth varchar(10),attendence varchar(5))");
    st.executeUpdate("create table stocks(S_no varchar(20),Item_name varchar(20),rate bigint,remaining_quantity bigint)");
        new NewUser().show();
this.dispose();
              }
    catch(Exception e){            
        System.out.println(e);
    new FirstPage().show();
    }    
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
