package thi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Demo extends javax.swing.JFrame implements Runnable {

    private Interface_GV qlgv;
    ArrayList<Giao_Vien> ds;
    String fileName = "src/thi/thi.txt";
    DefaultTableModel model;

    public Demo() {
        initComponents();
        this.qlgv = new QLGV();
        this.ds = this.qlgv.display();
        this.model = (DefaultTableModel) this.tblTable.getModel();
        macDinh();
        Thread t2 = new Thread(this);
        t2.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        lblQly = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblMajor = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cboMajor = new javax.swing.JComboBox<>();
        txtSalary = new javax.swing.JTextField();
        btnOpen = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnObj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Giáo Viên\n");
        setLocation(new java.awt.Point(300, 120));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name GV", "Major", "Salary", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        lblQly.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblQly.setForeground(new java.awt.Color(0, 0, 255));
        lblQly.setText("QUẢN LÝ GIÁO VIÊN ");

        lblName.setText("Name GV");

        lblMajor.setText("Major");

        lblSalary.setText("Salary");

        cboMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnOpen.setText("OPEN");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnWrite.setText("WRITE");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnObj.setText("OBJECT");
        btnObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblMajor)
                            .addComponent(lblSalary))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(cboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWrite)
                            .addComponent(btnDelete)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOpen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(btnObj))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(lblQly, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQly)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOpen)
                            .addComponent(btnObj))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMajor)
                            .addComponent(cboMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnWrite)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalary)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {
            FileInputStream fis = new FileInputStream(this.fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.ds = (ArrayList<Giao_Vien>) ois.readObject();
            for (Giao_Vien gv : this.ds) {
                this.qlgv.insert(gv);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadTable();

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        Giao_Vien gv = getData();
        if (gv == null) {
            return;
        }
        this.qlgv.insert(gv);
        loadTable();
        try {
            FileOutputStream fis = new FileOutputStream(this.fileName);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(this.ds);
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnWriteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int chooseRow = this.tblTable.getSelectedRow();
        if (chooseRow == -1) {
            return;
        }
        int no = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (no == 1) {
            return;
        }
        this.qlgv.delete(chooseRow);
        loadTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjActionPerformed
        if (this.ds.size() == 0) {
            this.qlgv.createObj();
            loadTable();
        }
    }//GEN-LAST:event_btnObjActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        int chooseRow = this.tblTable.getSelectedRow();
        if (chooseRow == -1) {
            return;
        }
        this.txtName.setText(this.tblTable.getValueAt(chooseRow, 0).toString());
        this.cboMajor.setSelectedItem(this.tblTable.getValueAt(chooseRow, 1).toString());
        this.txtSalary.setText(this.tblTable.getValueAt(chooseRow, 2).toString());
    }//GEN-LAST:event_tblTableMouseClicked
    private void macDinh() {
        this.cboMajor.removeAllItems();
        this.cboMajor.addItem("UDPM");
        this.cboMajor.addItem("TKDH");
        this.cboMajor.addItem("TKTW");
    }

    private void loadTable() {
        this.model.setRowCount(0);
        for (Giao_Vien gv : this.ds) {
            Object[] rowTable = new Object[]{
                gv.getName(),
                gv.getMajor(),
                gv.getSalary(),
                gv.getStatus()
            };
            this.model.addRow(rowTable);
        }
    }

    public Giao_Vien getData() {
        String name = this.txtName.getText();
        String cost = this.txtSalary.getText();
        String major = this.cboMajor.getSelectedItem().toString();
        if (name.length() == 0 || cost.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống ô");
            return null;
        }
        try {
            double price = Double.parseDouble(cost);
            if (price < 1000) {
                JOptionPane.showMessageDialog(this, "Lương lớn hơn 1000");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double price = Double.parseDouble(cost);
        Giao_Vien gv = new Giao_Vien(name, major, price);
        return gv;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnObj;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnWrite;
    private javax.swing.JComboBox<String> cboMajor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMajor;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQly;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            String text = this.lblQly.getText();
            text = text.substring(1, text.length()) + text.charAt(0);
            this.lblQly.setText(text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
