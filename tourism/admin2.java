/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourism;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Kaium Ahmed
 */
public class admin2 extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement stt=null;
    ResultSet rs=null;
    public admin2() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from packages";
            stt=conn.prepareStatement(Sql);
            rs=stt.executeQuery();
            table4.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from registrationform";
            stt=conn.prepareStatement(Sql);
            rs=stt.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
         try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from payment";
            stt=conn.prepareStatement(Sql);
            rs=stt.executeQuery();
            tablepay.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        staycost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        foodprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buscost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        traincost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        flightcost = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        searchs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableb = new javax.swing.JTable();
        searchb = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablec = new javax.swing.JTable();
        searchc = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabler = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        searchr = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        searchuser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablepay = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        searchpay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLACE NAME");

        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\policy-cover.png")); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DURATION");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STAYCOST");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FOOD PRICE");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BUS COST");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TRAIN COST");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FLIGHT COST");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("INSERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 255, 102));

        table4.setBackground(new java.awt.Color(255, 255, 0));
        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(staycost, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(foodprice, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buscost, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(traincost, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(flightcost, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staycost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodprice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(traincost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightcost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("EDIT PACKAGES", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SEARCH");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(310, 230, 180, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\النمر الهندي.jpg")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(30, 20, 850, 160);

        tables.setBackground(new java.awt.Color(102, 255, 102));
        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tables);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(350, 300, 452, 280);

        searchs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsActionPerformed(evt);
            }
        });
        searchs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchsKeyReleased(evt);
            }
        });
        jPanel8.add(searchs);
        searchs.setBounds(470, 230, 280, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\unnamed.png")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel8.add(jLabel11);
        jLabel11.setBounds(70, 240, 190, 280);

        jTabbedPane2.addTab("SUNDORBON", jPanel8);

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));
        jPanel7.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SEARCH");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(40, 250, 140, 30);

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\off-track-bandarban-cover.jpg")); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(50, 20, 800, 190);

        tableb.setBackground(new java.awt.Color(255, 204, 204));
        tableb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableb);

        jPanel7.add(jScrollPane5);
        jScrollPane5.setBounds(40, 290, 480, 290);

        searchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbActionPerformed(evt);
            }
        });
        searchb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbKeyReleased(evt);
            }
        });
        jPanel7.add(searchb);
        searchb.setBounds(180, 250, 290, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\641119_car_512x512.png")); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(540, 270, 330, 310);

        jTabbedPane2.addTab("BANDARBAN", jPanel7);

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));
        jPanel9.setLayout(null);

        tablec.setBackground(new java.awt.Color(255, 51, 51));
        tablec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablec);

        jPanel9.add(jScrollPane7);
        jScrollPane7.setBounds(370, 260, 490, 330);

        searchc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchcKeyReleased(evt);
            }
        });
        jPanel9.add(searchc);
        searchc.setBounds(560, 220, 270, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("SEARCH");
        jPanel9.add(jLabel22);
        jLabel22.setBounds(420, 220, 140, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\slide01.jpg")); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel9.add(jLabel23);
        jLabel23.setBounds(20, 20, 860, 160);

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\12-512.png")); // NOI18N
        jLabel26.setText("jLabel26");
        jPanel9.add(jLabel26);
        jLabel26.setBounds(-70, 200, 430, 390);

        jTabbedPane2.addTab("COX'S BAZAR", jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(null);

        tabler.setBackground(new java.awt.Color(0, 153, 51));
        tabler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tabler);

        jPanel10.add(jScrollPane6);
        jScrollPane6.setBounds(420, 250, 440, 340);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SEARCH");
        jPanel10.add(jLabel20);
        jLabel20.setBounds(430, 210, 140, 30);

        searchr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchrKeyReleased(evt);
            }
        });
        jPanel10.add(searchr);
        searchr.setBounds(560, 210, 270, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\High_Desert_Fog.jpg")); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel10.add(jLabel21);
        jLabel21.setBounds(20, 20, 860, 160);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\Icons8_flat_landscape.svg.png")); // NOI18N
        jLabel27.setText("jLabel27");
        jPanel10.add(jLabel27);
        jLabel27.setBounds(-240, 250, 650, 330);

        jTabbedPane2.addTab("RANGAMTI", jPanel10);

        jPanel3.add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 0, 910, 640);

        jTabbedPane1.addTab("VIEW PACKAGE DETAILS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);

        table2.setBackground(new java.awt.Color(255, 255, 0));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(20, 340, 410, 290);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\OneWorldBanner_2.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 20, 860, 200);

        jPanel6.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(450, 220, 10, 410);

        searchuser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchuserActionPerformed(evt);
            }
        });
        searchuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchuserKeyReleased(evt);
            }
        });
        jPanel4.add(searchuser);
        searchuser.setBounds(170, 290, 240, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("USERs");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(140, 230, 170, 30);

        tablepay.setBackground(new java.awt.Color(255, 51, 51));
        tablepay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablepay);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(480, 340, 400, 290);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SEARCH");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(40, 290, 110, 30);

        searchpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpayActionPerformed(evt);
            }
        });
        searchpay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchpayKeyReleased(evt);
            }
        });
        jPanel4.add(searchpay);
        searchpay.setBounds(610, 290, 260, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("SEARCH");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(490, 290, 110, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PAYMENT");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(590, 230, 170, 30);

        jTabbedPane1.addTab("VIEW USERS DETAILS", jPanel4);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("LOG OUT ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(570, 420, 248, 48);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\pic-cover.png")); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(2, 30, 910, 202);

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("DONE YOUR WORK ?");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(410, 300, 570, 110);

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaium Ahmed\\Desktop\\New folder (2)\\Logout-512.png")); // NOI18N
        jLabel28.setText("jLabel28");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(10, 250, 570, 380);

        jTabbedPane1.addTab("LOG OUT", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            conn=mysql_connect.connectDB();
            Statement stt = conn.createStatement();
            PreparedStatement update_std = conn.prepareStatement("DELETE from packages WHERE place=? ");
            update_std.setString(1,place.getText());
            update_std.executeUpdate();

            JOptionPane.showMessageDialog(null,"deleted SUCCESSFULLY");
            conn.close();

        }
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - ERROR:"+e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            conn=mysql_connect.connectDB();
            Statement stt = conn.createStatement();
            PreparedStatement update_std = conn.prepareStatement("UPDATE packages SET duration=?,staycost=?,foodprice=?,buscost=?,traincost=?,flightcost=? WHERE place=? ");
            update_std.setString(1,place.getText());
            update_std.setString(2,duration.getText());
            update_std.setString(3,staycost.getText());
            update_std.setString(4,foodprice.getText());
            update_std.setString(5,buscost.getText());
            update_std.setString(6,traincost.getText());
            update_std.setString(7,flightcost.getText());
            update_std.executeUpdate();

            JOptionPane.showMessageDialog(null,"updated SUCCESSFULLY");
            conn.close();

        }
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - ERROR:"+e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            conn=mysql_connect.connectDB();
            Statement stt = conn.createStatement();
            PreparedStatement update_std = conn.prepareStatement("INSERT INTO packages (place, duration,staycost,foodprice,buscost,traincost,flightcost) VALUES (?,?,?,?,?,?,?)");
            update_std.setString(1,place.getText());
            update_std.setString(2,duration.getText());
            update_std.setString(3,staycost.getText());
            update_std.setString(4,foodprice.getText());
            update_std.setString(5,buscost.getText());
            update_std.setString(6,traincost.getText());
            update_std.setString(7,flightcost.getText());

            update_std.executeUpdate();
            conn.close();

        }
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - ERROR:"+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cover p= new cover();
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchuserActionPerformed

    private void searchuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchuserKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from registrationform where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchuser.getText());
            rs=stt.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchuserKeyReleased

    private void searchpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpayActionPerformed

    private void searchpayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchpayKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from payment where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchpay.getText());
            rs=stt.executeQuery();
            tablepay.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchpayKeyReleased

    private void searchsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchsKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from bazar where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchs.getText());
            rs=stt.executeQuery();
            tables.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchsKeyReleased

    private void searchsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchsActionPerformed

    private void searchbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from bandorbon where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchb.getText());
            rs=stt.executeQuery();
            tableb.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchbKeyReleased

    private void searchrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchrKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from rangamati where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchr.getText());
            rs=stt.executeQuery();
            tabler.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchrKeyReleased

    private void searchcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchcKeyReleased
        try
        {
            conn=mysql_connect.connectDB();
            //Statement stt = conn.createStatement();
            String Sql="Select * from cbazar where id=?";
            stt=conn.prepareStatement(Sql);
            stt.setString(1,searchc.getText());
            rs=stt.executeQuery();
            tablec.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchcKeyReleased

    private void searchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbActionPerformed

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
            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscost;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField flightcost;
    private javax.swing.JTextField foodprice;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField place;
    private javax.swing.JTextField searchb;
    private javax.swing.JTextField searchc;
    private javax.swing.JTextField searchpay;
    private javax.swing.JTextField searchr;
    private javax.swing.JTextField searchs;
    private javax.swing.JTextField searchuser;
    private javax.swing.JTextField staycost;
    private javax.swing.JTable table2;
    private javax.swing.JTable table4;
    private javax.swing.JTable tableb;
    private javax.swing.JTable tablec;
    private javax.swing.JTable tablepay;
    private javax.swing.JTable tabler;
    private javax.swing.JTable tables;
    private javax.swing.JTextField traincost;
    // End of variables declaration//GEN-END:variables
}
