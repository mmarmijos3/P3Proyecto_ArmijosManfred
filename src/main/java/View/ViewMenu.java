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
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 238, 244));
        jLabel1.setText("MENU PRINCIPAL");

        btnBack.setBackground(new java.awt.Color(10, 107, 207));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBack.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGoBills;
    private javax.swing.JButton btnGoDock;
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
