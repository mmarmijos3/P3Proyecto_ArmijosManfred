package View;

import javax.swing.JButton;

/**
 *
 * @author Manfred Armijos
 */
public class ViewMenu extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla
     */
    public ViewMenu() {
        initComponents();
        setUndecorated(true);
    }

    public JButton getBtnGoBills() {
        return btnGoBills;
    }

    public JButton getBtnGoDock() {
        return btnGoDock;
    }

    public JButton getBtnGoLogin() {
        return btnGoLogin;
    }

    public JButton getBtnGoPort() {
        return btnGoPort;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGoPort = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGoDock = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGoBills = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnGoLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 107, 207));
        jPanel2.setPreferredSize(new java.awt.Dimension(295, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoPort.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Desktop\\ESPE\\POO\\P3\\Imagenes proyecto\\iconQueue295x500.jpg")); // NOI18N
        btnGoPort.setPreferredSize(new java.awt.Dimension(295, 500));
        jPanel2.add(btnGoPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 238, 244));
        jLabel3.setText("PORT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(10, 107, 207));
        jPanel3.setPreferredSize(new java.awt.Dimension(295, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoDock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGStatus.jpg"))); // NOI18N
        btnGoDock.setPreferredSize(new java.awt.Dimension(295, 500));
        jPanel3.add(btnGoDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 238, 244));
        jLabel4.setText("DOCK");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(10, 107, 207));
        jPanel4.setPreferredSize(new java.awt.Dimension(295, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGService.jpg"))); // NOI18N
        btnGoBills.setPreferredSize(new java.awt.Dimension(295, 500));
        jPanel4.add(btnGoBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 238, 244));
        jLabel5.setText("BILLS");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, -1, -1));

        btnGoLogin.setBackground(new java.awt.Color(10, 107, 207));
        btnGoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconExit.png"))); // NOI18N
        btnGoLogin.setBorderPainted(false);
        btnGoLogin.setContentAreaFilled(false);
        jPanel1.add(btnGoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 100, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 238, 244));
        jLabel1.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 290, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBills;
    private javax.swing.JButton btnGoDock;
    private javax.swing.JButton btnGoLogin;
    private javax.swing.JButton btnGoPort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
