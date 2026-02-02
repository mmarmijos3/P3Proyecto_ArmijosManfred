package View;

import javax.swing.JButton;

public class ViewMenu extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla
     */
    public ViewMenu() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
    }

    public JButton getBtnGoBills() {
        return btnGoBills;
    }

    public JButton getBtnGoDock() {
        return btnGoDock;
    }

    public JButton getBtnGoLogin() {
        return btnBack;
    }

    public JButton getBtnGoPort() {
        return btnGoPort;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBGLogin = new javax.swing.JPanel();
        btnGoPort = new javax.swing.JButton();
        btnGoDock = new javax.swing.JButton();
        btnGoBills = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        pnlBGLogin.setBackground(new java.awt.Color(15, 20, 25));
        pnlBGLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnlBGLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoPort.setBorder(null);
        btnGoPort.setBorderPainted(false);
        btnGoPort.setContentAreaFilled(false);
        btnGoPort.setPreferredSize(new java.awt.Dimension(295, 500));
        pnlBGLogin.add(btnGoPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, 320));

        btnGoDock.setBorder(null);
        btnGoDock.setBorderPainted(false);
        btnGoDock.setContentAreaFilled(false);
        btnGoDock.setPreferredSize(new java.awt.Dimension(295, 500));
        pnlBGLogin.add(btnGoDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 170, 360, 320));

        btnGoBills.setBorder(null);
        btnGoBills.setBorderPainted(false);
        btnGoBills.setContentAreaFilled(false);
        btnGoBills.setPreferredSize(new java.awt.Dimension(295, 500));
        pnlBGLogin.add(btnGoBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 170, 360, 320));

        btnBack.setBackground(new java.awt.Color(10, 107, 207));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBack.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setPreferredSize(new java.awt.Dimension(45, 45));
        pnlBGLogin.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconMenu.jpg"))); // NOI18N
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGoBills;
    private javax.swing.JButton btnGoDock;
    private javax.swing.JButton btnGoPort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlBGLogin;
    // End of variables declaration//GEN-END:variables
}
