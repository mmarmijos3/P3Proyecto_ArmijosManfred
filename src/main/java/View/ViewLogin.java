package View;

import javax.swing.JButton;

public class ViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla
     */
    public ViewLogin() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
    }

    public String getPassword() {
        return String.valueOf(psfPassword.getPassword());
    }

    public String getUsername() {
        return txfUsername.getText();
    }
    
    public void showErrors(String error){
        lblErrors.setText(error);
    }
    
    public void clear(){
        lblErrors.setText("");
        txfUsername.setText("");
        psfPassword.setText("");
    }
    

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBGLogin = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        txfUsername = new javax.swing.JTextField();
        psfPassword = new javax.swing.JPasswordField();
        lblErrors = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        pnlBGLogin.setBackground(new java.awt.Color(15, 20, 25));
        pnlBGLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(10, 107, 207));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClose.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(45, 45));
        pnlBGLogin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, -1, -1));

        txfUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsername.setText("admin");
        txfUsername.setBorder(null);
        txfUsername.setOpaque(true);
        txfUsername.setPreferredSize(new java.awt.Dimension(500, 100));
        txfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsernameActionPerformed(evt);
            }
        });
        pnlBGLogin.add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 315, 290, 40));

        psfPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        psfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psfPassword.setText("admin");
        psfPassword.setBorder(null);
        psfPassword.setOpaque(true);
        pnlBGLogin.add(psfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 435, 290, 40));

        lblErrors.setForeground(new java.awt.Color(255, 158, 0));
        lblErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlBGLogin.add(lblErrors, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 430, 20));

        btnLogin.setBackground(new java.awt.Color(10, 107, 207));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        pnlBGLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconLogin.png"))); // NOI18N
        pnlBGLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBGLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBGLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JPanel pnlBGLogin;
    private javax.swing.JPasswordField psfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
