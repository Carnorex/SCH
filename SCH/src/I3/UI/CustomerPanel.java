/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.UI;

import I3.Classes.UserInfo;
import I3.DatabaseOperation.CustomerDb;
import I3.DatabaseOperation.DatabaseOperation;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;


public class CustomerPanel extends javax.swing.JFrame {

    UserInfo user = new UserInfo();
    CustomerDb db = new CustomerDb();
    ResultSet result = null;
    
    //int choice = ADD;
    public CustomerPanel() {
        
          //  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            initComponents();
            this.getContentPane().setBackground(new Color(241,241,242));
            setTitle("All About Customers");
            populateWithCustomerData();
         
    }
    
    private void populateWithCustomerData()
    {
        result = db.getAllCustomer();
        table_customer.setModel(DbUtils.resultSetToTableModel(result));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_address = new javax.swing.JTextField();
        tf_phone = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_addCustomer = new javax.swing.JButton();
        btn_editCustomer = new javax.swing.JButton();
        btn_deleteCustomer = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        tf_type = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(230, 231, 232));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Californian FB", 0, 18), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel3.setText("Numero de telefono");

        jLabel1.setText("Nombre");

        tf_phone.setToolTipText("Digits Only");
        tf_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_phoneKeyTyped(evt);
            }
        });

        jLabel2.setText("Direccion");

        jLabel4.setText("Tipo");

        tf_id.setEditable(false);

        jLabel5.setText("ID");

        btn_addCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Agregar.png"))); // NOI18N
        btn_addCustomer.setText("Agregar");
        btn_addCustomer.setBorder(null);
        btn_addCustomer.setBorderPainted(false);
        btn_addCustomer.setFocusPainted(false);
        btn_addCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });

        btn_editCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Editar.png"))); // NOI18N
        btn_editCustomer.setText("Editar");
        btn_editCustomer.setToolTipText("");
        btn_editCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editCustomer.setFocusPainted(false);
        btn_editCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editCustomerActionPerformed(evt);
            }
        });

        btn_deleteCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar.png"))); // NOI18N
        btn_deleteCustomer.setText("Eliminar");
        btn_deleteCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCustomerActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setText("Limpiar");
        btn_reset.setToolTipText("Reset everything");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jButton2.setText("Tipos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_address)
                            .addComponent(tf_phone)
                            .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(tf_type, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_addCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_type, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID usuario", "Nombre", "Direccion", "Telefono", "Tipo"
            }
        ));
        table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_customer);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo trans.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Salir.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Menutipos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(77, 77, 77))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Informacion");
        jPanel3.getAccessibleContext().setAccessibleDescription("Informacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        ObjectCreation();
        db.insertCustomer(user);
        populateWithCustomerData();
        emptyField();
      
    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void ObjectCreation()
    {
        user = new UserInfo();
        
        user.setName(tf_name.getText());
        user.setAddress(tf_address.getText());
        user.setPhone_no(tf_phone.getText());
        user.setType(tf_type.getText());
        try{
            user.setCustomer_id(Integer.parseInt(tf_id.getText()));
        }
        catch(Exception ex)
        {
            user.setCustomer_id(0);
        }
        
    }
    
    private void table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customerMouseClicked
       
        user = new UserInfo();
        int row = table_customer.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        btn_editCustomer.setEnabled(true);
        btn_deleteCustomer.setEnabled(true);
        btn_addCustomer.setEnabled(false);
        
    }//GEN-LAST:event_table_customerMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       
        emptyField();
        
    }//GEN-LAST:event_btn_resetActionPerformed

 
    
    private void btn_editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCustomerActionPerformed
        ObjectCreation();
        db.updateCustomer(user);
        populateWithCustomerData();
        emptyField();
    }//GEN-LAST:event_btn_editCustomerActionPerformed

    private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed
        int row  = table_customer.getSelectedRow();
        int selectedUserId = (int) table_customer.getModel().getValueAt(row, 0);
        try {
            db.deleteCustomer(selectedUserId);
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateWithCustomerData();
        emptyField();
        
    }//GEN-LAST:event_btn_deleteCustomerActionPerformed

    private void tf_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_phoneKeyTyped
         char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_phoneKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ControlPanel logica=new ControlPanel();

logica.setVisible(true);
this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            JOptionPane.showMessageDialog(null, " Simple ==== Doble===Suite==Deleux===Starnad");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void emptyField()
    {
         btn_addCustomer.setEnabled(true);
        btn_editCustomer.setEnabled(false);
        btn_deleteCustomer.setEnabled(false);
        
        user = new UserInfo();
        
        tf_address.setText("");
        tf_id.setText("");
        tf_name.setText("");
        tf_phone.setText("");
        tf_type.setText("");
        table_customer.clearSelection();
    }
    
    private void displayToTextField(int row)
{
    //System.out.println(table_customer.getModel().getValueAt(row, 0)+ " >>>>>>>>> ");
    tf_id.setText(table_customer.getModel().getValueAt(row, 0)+"");
    tf_name.setText((String) table_customer.getModel().getValueAt(row, 1));
    tf_address.setText((String) table_customer.getModel().getValueAt(row, 2));
    tf_phone.setText((String) table_customer.getModel().getValueAt(row, 3));
    tf_type.setText((String) table_customer.getModel().getValueAt(row, 4));
}
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
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCustomer;
    private javax.swing.JButton btn_deleteCustomer;
    private javax.swing.JButton btn_editCustomer;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_type;
    // End of variables declaration//GEN-END:variables
}
