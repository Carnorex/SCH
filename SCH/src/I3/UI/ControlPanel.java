/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.UI;

import I3.Classes.Booking;
import I3.Classes.UserInfo;
import I3.DatabaseOperation.BookingDb;
import I3.DatabaseOperation.CustomerDb;
import I3.DatabaseOperation.DatabaseOperation;
import I3.TableModel.CustomCellRenderer;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
////jButton6

///////////////////////////////////////////////////////////////////////
public class ControlPanel extends javax.swing.JFrame {

    Vector<String> customerList = new Vector();
    DatabaseOperation db = new DatabaseOperation();
    CustomerDb customerdb = new CustomerDb();
    Booking booking;
    BookingDb bookingdb = new BookingDb();
    boolean existingCustomer = false;
    UserInfo user;
    ResultSet result;

    public ControlPanel() {
        
        initComponents();
       // UIManager.setLookAndFeel(UIManager);
        this.getContentPane().setBackground(new Color(241,241,242));
        searchCustomerHelper();
        AutoCompleteDecorator.decorate(combo_users);
              
    }
//////////////////////////////////////////////////////////////////////
    public void populateWithBookingData() {
        result = bookingdb.getBookingInformation();
        //bookingdb.flushAll();
        //table_booking.setModel(DbUtils.resultSetToTableModel(result));
        CustomCellRenderer customRenderer = new CustomCellRenderer();
        //table_booking.setDefaultRenderer(Object.class, customRenderer);
        bookingdb.flushAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel_container = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_room_up = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsList = new javax.swing.JList();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        combo_users = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_contact = new javax.swing.JTextField();
        tf_address = new javax.swing.JTextField();
        combo_reservationType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btn_saveBooking = new javax.swing.JButton();
        tf_rooms = new javax.swing.JTextField();
        tf_guestNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_customerId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_container.setBackground(new java.awt.Color(51, 102, 255));

        jPanel3.setBackground(new java.awt.Color(230, 231, 232));

        btn_room_up.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_room_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DefaultButtono.png"))); // NOI18N
        btn_room_up.setText("Agregar habitaciones");
        btn_room_up.setBorder(null);
        btn_room_up.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_room_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_room_upActionPerformed(evt);
            }
        });

        roomsList.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        roomsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Alberca", "Bar", "Sala de entretenimiento" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        roomsList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        roomsList.setVisibleRowCount(1);
        jScrollPane1.setViewportView(roomsList);

        jLabel11.setText("salas validas:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Eliga una de estas salas:");

        jPanel1.setBackground(new java.awt.Color(0, 167, 157));

        combo_users.setEditable(true);
        combo_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_usersActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar huesped:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_users, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_users, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_room_up, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_room_up)
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel4.setText("Numero contacto");

        jLabel2.setText("Nombre");

        jLabel9.setText("Tipo");

        jLabel6.setText("Huesped");

        jLabel5.setText("Salas");

        tf_contact.setToolTipText("digits only");
        tf_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_contactKeyTyped(evt);
            }
        });

        combo_reservationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En lugar", "Reservacion pagada", "Reservacion" }));
        combo_reservationType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_reservationTypeMouseClicked(evt);
            }
        });
        combo_reservationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_reservationTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Direccion");

        btn_saveBooking.setBackground(new java.awt.Color(0, 167, 157));
        btn_saveBooking.setText("Guardar");
        btn_saveBooking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 167, 157)));
        btn_saveBooking.setBorderPainted(false);
        btn_saveBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveBookingActionPerformed(evt);
            }
        });

        tf_rooms.setEditable(false);

        tf_guestNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_guestNoKeyTyped(evt);
            }
        });

        jLabel10.setText("ID");

        tf_customerId.setEditable(false);
        tf_customerId.setBackground(new java.awt.Color(209, 210, 212));
        tf_customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_customerIdActionPerformed(evt);
            }
        });

        jLabel13.setText("Nueva reserva");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combo_reservationType, 0, 120, Short.MAX_VALUE)
                                .addComponent(tf_name)
                                .addComponent(tf_address)
                                .addComponent(tf_contact)
                                .addComponent(tf_rooms)
                                .addComponent(tf_guestNo))
                            .addComponent(tf_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btn_saveBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_rooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_guestNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combo_reservationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_saveBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar1.setBackground(new java.awt.Color(255, 51, 51));
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CustomerInfo.png"))); // NOI18N
        jButton1.setText("Informe Huesped");
        jButton1.setToolTipText("Informe huesped");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator3);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rooms.png"))); // NOI18N
        jButton2.setText("Habitaciones");
        jButton2.setToolTipText("Informe de habitaciones");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jButton2.getAccessibleContext().setAccessibleDescription("Informe de habitciones");

        jToolBar1.add(jSeparator6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OtherItems.png"))); // NOI18N
        jButton7.setText("Salas");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);
        jToolBar1.add(jSeparator2);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ring.png"))); // NOI18N
        jButton4.setText("Reservaciones");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question.png"))); // NOI18N
        jButton3.setText("Ayuda");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Salir.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Caja de comentarios");

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_containerLayout.createSequentialGroup()
                                .addGap(611, 611, 611)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_containerLayout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_containerLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 479, Short.MAX_VALUE))
        );
        panel_containerLayout.setVerticalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_containerLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(panel_container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerPanel c = new CustomerPanel();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RoomPanel r = new RoomPanel(this, rootPaneCheckingEnabled);
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
//////////////////////////////////////////////////////////////////////
    private void btn_saveBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveBookingActionPerformed
        if (!isAnyRequiredFieldEmpty()) {
            bookingObjectCreation();
            bookingdb.insertBooking(booking);
            clearAllFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Falta por rellenas datos");
        }

    }//GEN-LAST:event_btn_saveBookingActionPerformed
///////////////////////////////////////////////////////////////////////////////
    // returning true should block the user to execute next processes
    private boolean isAnyRequiredFieldEmpty() {
        return tf_address.getText().equals("") || tf_contact.getText().equals("") || tf_guestNo.getText().equals("") || tf_name.getText().equals("") || tf_rooms.getText().equals("");
    }
///////////////////////////////////////////////////////////////////////////////
    private void bookingObjectCreation() {
        booking = new Booking();
        roomsToRoomObjectList(tf_rooms.getText());
        booking.setBookingType((String) combo_reservationType.getSelectedItem());
        booking.setPerson(Integer.parseInt(tf_guestNo.getText()));
       
        booking.setBookingType((String) combo_reservationType.getSelectedItem());
       {
           
        }

        if (existingCustomer) {
            booking.getCustomer().setCustomer_id(Integer.parseInt(tf_customerId.getText()));
        } else {
            createNewCustomer();
            customerdb.insertCustomer(user);
            booking.getCustomer().setCustomer_id(db.getCustomerId(user));
            db.flushAll();
        }
    }
/////////////////////////////////////////////////////////////////////////
    private void createNewCustomer() {
        user = new UserInfo();

        user.setName(tf_name.getText());
        user.setAddress(tf_address.getText());
        user.setPhone_no(tf_contact.getText());

    }
/////////////////////////////////////////////////////////////////////////////
    private void roomsToRoomObjectList(String value) {
        if (!value.contains(",")) {
            booking.addRoom(value.trim());
        } else {
            String[] roomArray = value.split(",");
            for (String s : roomArray) {
                booking.addRoom(s);
            }
        }
    }
/////////////////////////////////////////////////////////////////////////////
    private void btn_room_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_room_upActionPerformed
        List<String> list = new ArrayList();
        list = roomsList.getSelectedValuesList();
        if (!list.isEmpty()) {
            String roomString = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                roomString += "," + list.get(i);
            }
            tf_rooms.setText(roomString);
        }
/////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btn_room_upActionPerformed

///////////////////////////////////////////////////////////////////////
    private void tf_contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_contactKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_contactKeyTyped
////////////////////////////////////////////////////////////////////////
    private void tf_guestNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_guestNoKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_guestNoKeyTyped

////////////////////////////////////////////////////////////////////
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ItemPanel i = new ItemPanel(this, true);
        i.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
//////////////////////////////////////////////////////////////////////////
    private void date_checkInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_checkInPropertyChange
       
    }//GEN-LAST:event_date_checkInPropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
PantallaBloque logica=new PantallaBloque();

logica.setVisible(true);
this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void combo_reservationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_reservationTypeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_combo_reservationTypeActionPerformed

    private void combo_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_usersActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_combo_usersActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PanelAyuda p = new PanelAyuda();
        p.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_customerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_customerIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 OrderPanel c = new OrderPanel(this, true);
        c.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combo_reservationTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_reservationTypeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_reservationTypeMouseClicked
////////////////////////////////////////////////////////////////////////////////
    private void searchCustomerHelper() {
        final DefaultComboBoxModel model = new DefaultComboBoxModel(customerList);
        combo_users.setModel(model);

        JTextComponent editor = (JTextComponent) combo_users.getEditor().getEditorComponent();
        editor.addKeyListener(new KeyAdapter() {
          @Override
            public void keyTyped(KeyEvent evt) {
                //System.out.println((int)KeyEvent.VK_ACCEPT);
                // .............. 1st part for searching a customer, user should hit enter if he finds a user. 
                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                    String details = (String) combo_users.getSelectedItem();
                    //System.out.println(details);
                    if (!details.contains(",")) {
                        JOptionPane.showMessageDialog(null, "No se han encontrado usuarios, intente agregar un nuevo usuario");
                    } else {
                        int customerId = Integer.parseInt(details.substring(details.lastIndexOf(",") + 1));
                        // A if condition should be here, but not required as the last line has no chance of returning -1.

                        System.out.println(".>> " + customerId);
                        ResultSet userDB = db.searchAnUser(customerId);
                        displayTextField(userDB);
                        existingCustomer = true;

                    }

                }

                //................. end of first part, start of 2nd part,  for suggesting saved customer data list
                String value = "";
                try {
                    value = combo_users.getEditor().getItem().toString();

                } catch (Exception ex) {
                }
                if (value.length() >= 2) {

                    userComboFill(db.searchUser(value));
                }

            }
        });

    }
//////////////////////////////////////////////////////////////////
    private void displayTextField(ResultSet rs) {
        System.out.println("in");
        try {
            while (rs.next()) {

                tf_customerId.setText(rs.getInt("user_id") + "");
                tf_name.setText(rs.getString("name"));///////////////////////////
                tf_contact.setText(rs.getString("phone"));////////////////////////
                tf_address.setText(rs.getString("address"));//////////////////////

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el tablero");
        }
    }
/////////////////////////////////////////////////////////
    private void userComboFill(ResultSet result) {
        customerList.clear();
        try {
            while (result.next()) {
                //System.out.println(">>>>>> "+result.getString("name"));
                customerList.add(result.getString("name") + ", " + result.getString("address") + "," + result.getString("user_id"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de relleno");
        }

    }
/////////////////////////////////////////////////////////////
    private void clearAllFields() {
        combo_users.getEditor().setItem(null);
        combo_reservationType.setSelectedIndex(0);

        tf_address.setText("");
        tf_contact.setText("");
        tf_customerId.setText("");
        tf_guestNo.setText("");
        tf_name.setText("");
        tf_rooms.setText("");
        
        existingCustomer = false;
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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_room_up;
    private javax.swing.JButton btn_saveBooking;
    private javax.swing.JComboBox combo_reservationType;
    private javax.swing.JComboBox combo_users;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel_container;
    private javax.swing.JList roomsList;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_customerId;
    private javax.swing.JTextField tf_guestNo;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_rooms;
    // End of variables declaration//GEN-END:variables
}
