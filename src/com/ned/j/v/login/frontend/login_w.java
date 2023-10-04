package com.ned.j.v.login.frontend;

import com.ned.j.v.data.usersDT;
import com.ned.j.v.login.backend.changewindows;
import com.ned.j.v.login.backend.conectionUser;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class login_w extends javax.swing.JFrame {

    boolean change = false;
    boolean view = false;
    String pass;
    javax.swing.ImageIcon viewOff = new javax.swing.ImageIcon("src/com/ned/j/v/public_proyect/view_off.png");
    javax.swing.ImageIcon viewOn = new javax.swing.ImageIcon("src/com/ned/j/v/public_proyect/view_on.png");
    
    public login_w() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/ned/j/v/public_proyect/icon.png")));
        txt_password.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_view = new javax.swing.JLabel();
        txt_password_ = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setMinimumSize(new java.awt.Dimension(857, 557));

        jPanel1.setBackground(new java.awt.Color(33, 53, 85));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        txt_username.setBackground(new java.awt.Color(33, 53, 85));
        txt_username.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setToolTipText("");
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txt_username.setCaretColor(new java.awt.Color(204, 204, 204));
        txt_username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_username.setMargin(new java.awt.Insets(2, 30, 2, 2));
        txt_username.setMinimumSize(new java.awt.Dimension(2, 44));
        txt_username.setName(""); // NOI18N
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 300, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        txt_password.setBackground(new java.awt.Color(33, 53, 85));
        txt_password.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txt_password.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 250, 50));

        btn_login.setBackground(new java.awt.Color(79, 112, 156));
        btn_login.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Ingresar");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.setDefaultCapable(false);
        btn_login.setFocusPainted(false);
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 230, 50));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/user.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/pass.png"))); // NOI18N
        jLabel2.setText("´");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 100, 50));

        btn_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/view_on.png"))); // NOI18N
        btn_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMouseClicked(evt);
            }
        });
        jPanel1.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 50, 50));

        txt_password_.setBackground(new java.awt.Color(33, 53, 85));
        txt_password_.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txt_password_.setForeground(new java.awt.Color(255, 255, 255));
        txt_password_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txt_password_.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txt_password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 250, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("©2023 | Universidad Mariano Galvéz Zacapa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Versión:1.0");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:        
        if (view){
            if ((txt_username.getText().length() > 0) && (txt_password.getText().length() > 0)){
                change = conectionUser.getaccess(txt_username.getText().toUpperCase(), txt_password.getText().toUpperCase());
            }else{
                JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if((txt_username.getText().length() > 0) && (txt_password_.getText().length() > 0)){
                change = conectionUser.getaccess(txt_username.getText().toUpperCase(), txt_password_.getText().toUpperCase());
            }else{
                JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (change) {
            changewindows.changewindows_home(); 
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        btn_login.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_btn_loginMouseExited

    private void btn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseClicked
        
        if (view){
            view = false;
            pass = txt_password.getText();
            txt_password.setVisible(false);
            txt_password_.setVisible(true);
            txt_password_.setText(pass);
               
        }else{
            view = true;
            pass = txt_password_.getText();
            txt_password_.setVisible(false);
            txt_password.setVisible(true);
            txt_password.setText(pass);
            
        }
        viewSet();
    }//GEN-LAST:event_btn_viewMouseClicked
    
    private void viewSet(){
        if (view){
            btn_view.setIcon(viewOff);
        }else{
            btn_view.setIcon(viewOn);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_password;
    private javax.swing.JPasswordField txt_password_;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
