package stock_management;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Employee extends javax.swing.JFrame {

    public Employee() {
        initComponents();
        DisplayEmployees();
    }

    Connection Con = null;
    Statement St = null, St1= null;
    ResultSet Rs = null, Rs1= null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        EmpNameTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EmpPhoneTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        EmpPasswordTb = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeList = new javax.swing.JTable();
        Itemlbl = new javax.swing.JLabel();
        Supplierlbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Categorylbl = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Manage Employees");

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        jLabel14.setText("Employee Name");

        EmpNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameTbActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        jLabel15.setText("Employee Phone");

        EmpPhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpPhoneTbActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        jLabel16.setText("Employee Password");

        EmpPasswordTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpPasswordTbActionPerformed(evt);
            }
        });

        Addbtn.setBackground(new java.awt.Color(51, 102, 255));
        Addbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("New Item");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Updatebtn.setBackground(new java.awt.Color(0, 153, 51));
        Updatebtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(255, 51, 51));
        Deletebtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setText("Dalete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        EmployeeList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmployeeList.setForeground(new java.awt.Color(102, 0, 102));
        EmployeeList.setModel(new javax.swing.table.DefaultTableModel(
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
        EmployeeList.setRowHeight(30);
        EmployeeList.setSelectionBackground(new java.awt.Color(204, 0, 204));
        EmployeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Addbtn)
                .addGap(18, 18, 18)
                .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(EmpNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(EmpPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(EmpPasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                            .addComponent(jSeparator6))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(EmpNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(EmpPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(EmpPasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Itemlbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        Itemlbl.setForeground(new java.awt.Color(255, 255, 255));
        Itemlbl.setText("Items");
        Itemlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemlblMouseClicked(evt);
            }
        });

        Supplierlbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        Supplierlbl.setForeground(new java.awt.Color(255, 255, 255));
        Supplierlbl.setText("Suppliers");
        Supplierlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierlblMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employees");

        Categorylbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        Categorylbl.setForeground(new java.awt.Color(255, 255, 255));
        Categorylbl.setText("Categories");
        Categorylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategorylblMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-warehouse-87.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock Management System");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-shopping-cart-25.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-supplier-25.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-employee-25.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-categories-25.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock_management/icons8-logout-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Itemlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Supplierlbl)
                                    .addComponent(jLabel3)
                                    .addComponent(Categorylbl)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Logout)
                                    .addGap(89, 89, 89))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Itemlbl)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Supplierlbl)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Categorylbl)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Clear(){
        EmpNameTb.setText("");
        EmpPhoneTb.setText("");
        EmpPasswordTb.setText("");
    }
    
    private void EmpNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameTbActionPerformed

    private void EmpPhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpPhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpPhoneTbActionPerformed

    private void EmpPasswordTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpPasswordTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpPasswordTbActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        if(EmpNameTb.getText().isBlank() || EmpPhoneTb.getText().isEmpty() || EmpPasswordTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!!!");
        }
        else{
            try {
                CountEmp();
                Con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/stockdb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into EmployeeTbl values(?,?,?,?)");
                Add.setInt(1, EmpId);
                Add.setString(2, EmpNameTb.getText());
                Add.setString(3, EmpPhoneTb.getText());
                Add.setString(4, EmpPasswordTb.getText());
                
                int Row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Add Supplier?");
                Con.close();
                DisplayEmployees();
                Clear();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        if(EmpNameTb.getText().isEmpty() || EmpPhoneTb.getText().isBlank() || EmpPasswordTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Data!!!");
        }
        else{
            try {
                
                Con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/stockdb","root","");
                PreparedStatement Add = Con.prepareStatement("update EmployeeTbl set EmpName = ?, EmpPhone = ?, EmpPass = ? where EmpCode = ?");
                Add.setInt(4, key);
                Add.setString(1, EmpNameTb.getText());
                Add.setString(2, EmpPhoneTb.getText());
                Add.setString(3, EmpPasswordTb.getText());
                
                int Row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Employee?");
                Con.close();
                DisplayEmployees();
                Clear();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void EmployeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeListMouseClicked
        DefaultTableModel model = (DefaultTableModel) EmployeeList.getModel();
        int MyIndex = EmployeeList.getSelectedRow();

        EmpNameTb.setText(model.getValueAt(MyIndex,1).toString());
        EmpPhoneTb.setText(model.getValueAt(MyIndex,2).toString());
        EmpPasswordTb.setText(model.getValueAt(MyIndex,3).toString());

        if(EmpNameTb.getText().isEmpty()){
            key =0;
        }
        else{
            key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        }

    }//GEN-LAST:event_EmployeeListMouseClicked

    int EmpId;
    
    void CountEmp(){
        try{
            St1 = (Statement) Con.createStatement();
            Rs1 = St1.executeQuery("Select Max(EmpCode) from EmployeeTbl");
            Rs1.next();
            EmpId = Rs1.getInt((1)+1);
        }
        catch (Exception e){
        }
    }
    
    private void DisplayEmployees(){
        try{
            Con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/stockdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("Select * from EmployeeTbl");
            EmployeeList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch (Exception e){
        }
    }

    
    int key = 0;
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        if(key == 0)
        {
            JOptionPane.showMessageDialog(this, "Missing Data!!!");
        }
        else{
            try {
                CountEmp();
                Con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/stockdb","root","");
                PreparedStatement Add = Con.prepareStatement("delete from EmployeeTbl where EmpCode = ?");
                Add.setInt(1, key);
                
                int Row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Dalete Employee?");
                Con.close();
                DisplayEmployees();
                Clear();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void ItemlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemlblMouseClicked
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemlblMouseClicked

    private void SupplierlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierlblMouseClicked
        new Supplier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SupplierlblMouseClicked

    private void CategorylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategorylblMouseClicked
        new Categories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategorylblMouseClicked

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
    private javax.swing.JButton Addbtn;
    private javax.swing.JLabel Categorylbl;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField EmpNameTb;
    private javax.swing.JTextField EmpPasswordTb;
    private javax.swing.JTextField EmpPhoneTb;
    private javax.swing.JTable EmployeeList;
    private javax.swing.JLabel Itemlbl;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Supplierlbl;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
