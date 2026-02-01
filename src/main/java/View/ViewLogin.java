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
        pnlLogin = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblErrors = new javax.swing.JLabel();
        lblIconKey = new javax.swing.JLabel();
        lblIconUser = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        psfPassword = new javax.swing.JPasswordField();
        lblTitle1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        pnlBGLogin.setBackground(new java.awt.Color(15, 20, 25));
        pnlBGLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setPreferredSize(new java.awt.Dimension(1280, 720));

        pnlLogin.setBackground(new java.awt.Color(30, 40, 53));
        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 58, 88), 4, true));
        pnlLogin.setPreferredSize(new java.awt.Dimension(600, 700));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(10, 107, 207));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setText("OK");
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, -1, -1));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 153, 51));
        lblLogin.setText("LOGIN");
        pnlLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        lblErrors.setForeground(new java.awt.Color(255, 158, 0));
        lblErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlLogin.add(lblErrors, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 430, 20));

        lblIconKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconKey.png"))); // NOI18N
        pnlLogin.add(lblIconKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 540, 50, 40));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconUser.png"))); // NOI18N
        pnlLogin.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 40, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 64)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 204, 153));
        lblTitle.setText("SEAPORT");
        pnlLogin.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 150));

        txfUsername.setBackground(new java.awt.Color(30, 40, 53));
        txfUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfUsername.setForeground(new java.awt.Color(255, 255, 255));
        txfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsername.setText("admin");
        txfUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 193, 212))); // NOI18N
        txfUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txfUsername.setPreferredSize(new java.awt.Dimension(500, 100));
        txfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsernameActionPerformed(evt);
            }
        });
        pnlLogin.add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 320, 80));

        psfPassword.setBackground(new java.awt.Color(30, 40, 53));
        psfPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        psfPassword.setForeground(new java.awt.Color(255, 255, 255));
        psfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psfPassword.setText("admin");
        psfPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 193, 212))); // NOI18N
        psfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        pnlLogin.add(psfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 320, 80));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 3, 64)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(0, 204, 153));
        lblTitle1.setText("ESPE");
        pnlLogin.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, -1, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("P: 1599");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("U: mmarmijos3");
        pnlLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGForm.jpg"))); // NOI18N

        btnExit.setBackground(new java.awt.Color(10, 107, 207));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClose.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout pnlBGLoginLayout = new javax.swing.GroupLayout(pnlBGLogin);
        pnlBGLogin.setLayout(pnlBGLoginLayout);
        pnlBGLoginLayout.setHorizontalGroup(
            pnlBGLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBGLoginLayout.setVerticalGroup(
            pnlBGLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLoginLayout.createSequentialGroup()
                .addGroup(pnlBGLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBGLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBGLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JLabel lblIconKey;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel pnlBGLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField psfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
