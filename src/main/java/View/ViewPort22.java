package View;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

import Controller.Port;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ViewPort22 extends javax.swing.JFrame {
    
    private final Port port;
        
    public ViewPort22() {
        initComponents();
        this.port = new Port(this);
        port.fullFormVisible();
        port.loadTableData();
        pnlOperation.setVisible(false);
        pnlPayment.setVisible(false);
        setLocationRelativeTo(null);
        tblStart.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 18));
        tblStart.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
        tblStart.setRowHeight(28);
    }
    //<editor-fold defaultstate="collapsed" desc="Getters">
        
    public Port getPort() {
        return port;
    }

    public ButtonGroup getBgpOperations() {
        return bgpOperations;
    }

    public JButton getBtnBilling() {
        return btnBilling;
    }

    public JButton getBtnClean() {
        return btnClean;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public JButton getBtnDetele() {
        return btnDetele;
    }

    public JButton getBtnDock() {
        return btnDock;
    }

    public JButton getBtnExitForm() {
        return btnExitForm;
    }

    public JButton getBtnExitService() {
        return btnExitService;
    }

    public JButton getBtnExitStatus() {
        return btnExitStatus;
    }

    public JButton getBtnForm() {
        return btnForm;
    }

    public JButton getBtnOperation() {
        return btnOperation;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JComboBox<String> getCbxType() {
        return cbxType;
    }

    public JCheckBox getChbClean() {
        return chbClean;
    }

    public JCheckBox getChbMaintenance() {
        return chbMaintenance;
    }

    public JCheckBox getChbRefuel() {
        return chbRefuel;
    }

    public JLabel getLbSubtotalT() {
        return lbSubtotalT;
    }

    public JLabel getLblBGForm() {
        return lblBGForm;
    }

    public JLabel getLblBGService() {
        return lblBGService;
    }

    public JLabel getLblBGStatus() {
        return lblBGStatus;
    }

    public JLabel getLblDiscount() {
        return lblDiscount;
    }

    public JLabel getLblDiscountT() {
        return lblDiscountT;
    }

    public JLabel getLblErrorDock() {
        return lblErrorDock;
    }

    public JLabel getLblErrorFormCapacity() {
        return lblErrorFormCapacity;
    }

    public JLabel getLblErrorFormIMO() {
        return lblErrorFormIMO;
    }

    public JLabel getLblErrorFormLength() {
        return lblErrorFormLength;
    }

    public JLabel getLblErrorFormName() {
        return lblErrorFormName;
    }

    public JLabel getLblErrorFormQuantity() {
        return lblErrorFormQuantity;
    }

    public JLabel getLblErrorFormType() {
        return lblErrorFormType;
    }

    public JLabel getLblErrorSearch() {
        return lblErrorSearch;
    }

    public JLabel getLblExtras() {
        return lblExtras;
    }

    public JLabel getLblFormCapacity() {
        return lblFormCapacity;
    }

    public JLabel getLblFormIMO() {
        return lblFormIMO;
    }

    public JLabel getLblFormLength() {
        return lblFormLength;
    }

    public JLabel getLblFormName() {
        return lblFormName;
    }

    public JLabel getLblFormQuantity() {
        return lblFormQuantity;
    }

    public JLabel getLblFormType() {
        return lblFormType;
    }

    public JLabel getLblIVA() {
        return lblIVA;
    }

    public JLabel getLblIVAT() {
        return lblIVAT;
    }

    public JLabel getLblOperation() {
        return lblOperation;
    }

    public JLabel getLblPayment() {
        return lblPayment;
    }

    public JLabel getLblServCapacity() {
        return lblServCapacity;
    }

    public JLabel getLblServCapacityT() {
        return lblServCapacityT;
    }

    public JLabel getLblServImo() {
        return lblServImo;
    }

    public JLabel getLblServImoT() {
        return lblServImoT;
    }

    public JLabel getLblServLength() {
        return lblServLength;
    }

    public JLabel getLblServLengthT() {
        return lblServLengthT;
    }

    public JLabel getLblServName() {
        return lblServName;
    }

    public JLabel getLblServQuantity() {
        return lblServQuantity;
    }

    public JLabel getLblServQuantityT() {
        return lblServQuantityT;
    }

    public JLabel getLblServType() {
        return lblServType;
    }

    public JLabel getLblSubtotal() {
        return lblSubtotal;
    }

    public JLabel getLblSubtotal2() {
        return lblSubtotal2;
    }

    public JLabel getLblSubtotal2T() {
        return lblSubtotal2T;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JLabel getLblTotalT() {
        return lblTotalT;
    }

    public JPanel getPnlData() {
        return pnlData;
    }

    public JPanel getPnlDock() {
        return pnlDock;
    }

    public JPanel getPnlForm() {
        return pnlForm;
    }

    public JPanel getPnlOperation() {
        return pnlOperation;
    }

    public JPanel getPnlPayment() {
        return pnlPayment;
    }

    public JPanel getPnlSearch() {
        return pnlSearch;
    }

    public JPanel getPnlService() {
        return pnlService;
    }

    public JPanel getPnlStatus() {
        return pnlStatus;
    }

    public JRadioButton getRbtLoading() {
        return rbtLoading;
    }

    public JRadioButton getRbtUnloading() {
        return rbtUnloading;
    }

    public JScrollPane getSplTableStatus() {
        return splTableStatus;
    }

    public JTable getTblStart() {
        return tblStart;
    }

    public JTabbedPane getTplPort() {
        return tplPort;
    }

    public JTextField getTxfCapacity() {
        return txfCapacity;
    }

    public JTextField getTxfImo() {
        return txfImo;
    }

    public JTextField getTxfLength() {
        return txfLength;
    }

    public JTextField getTxfName() {
        return txfName;
    }

    public JTextField getTxfQuantity() {
        return txfQuantity;
    }

    public JTextField getTxfSearch() {
        return txfSearch;
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpOperations = new javax.swing.ButtonGroup();
        tplPort = new javax.swing.JTabbedPane();
        pnlStatus = new javax.swing.JPanel();
        splTableStatus = new javax.swing.JScrollPane();
        tblStart = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDetele = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        pnlSearch = new javax.swing.JPanel();
        txfSearch = new javax.swing.JTextField();
        lblErrorSearch = new javax.swing.JLabel();
        btnExitStatus = new javax.swing.JButton();
        lblBGStatus = new javax.swing.JLabel();
        btnDrop = new javax.swing.JButton();
        pnlForm = new javax.swing.JPanel();
        pnlData = new javax.swing.JPanel();
        lblFormName = new javax.swing.JLabel();
        lblFormIMO = new javax.swing.JLabel();
        lblFormLength = new javax.swing.JLabel();
        lblFormType = new javax.swing.JLabel();
        lblFormCapacity = new javax.swing.JLabel();
        lblFormQuantity = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        txfImo = new javax.swing.JTextField();
        txfLength = new javax.swing.JTextField();
        txfCapacity = new javax.swing.JTextField();
        txfQuantity = new javax.swing.JTextField();
        btnForm = new javax.swing.JButton();
        cbxType = new javax.swing.JComboBox<>();
        lblErrorFormQuantity = new javax.swing.JLabel();
        lblErrorFormName = new javax.swing.JLabel();
        lblErrorFormIMO = new javax.swing.JLabel();
        lblErrorFormLength = new javax.swing.JLabel();
        lblErrorFormType = new javax.swing.JLabel();
        lblErrorFormCapacity = new javax.swing.JLabel();
        lblBGForm = new javax.swing.JLabel();
        btnExitForm = new javax.swing.JButton();
        pnlService = new javax.swing.JPanel();
        pnlOperation = new javax.swing.JPanel();
        lblOperation = new javax.swing.JLabel();
        btnOperation = new javax.swing.JButton();
        rbtLoading = new javax.swing.JRadioButton();
        rbtUnloading = new javax.swing.JRadioButton();
        lblExtras = new javax.swing.JLabel();
        chbRefuel = new javax.swing.JCheckBox();
        chbMaintenance = new javax.swing.JCheckBox();
        chbClean = new javax.swing.JCheckBox();
        pnlPayment = new javax.swing.JPanel();
        lblIVAT = new javax.swing.JLabel();
        lblDiscountT = new javax.swing.JLabel();
        lblTotalT = new javax.swing.JLabel();
        btnBilling = new javax.swing.JButton();
        lblPayment = new javax.swing.JLabel();
        lbSubtotalT = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblSubtotal2T = new javax.swing.JLabel();
        lblSubtotal2 = new javax.swing.JLabel();
        pnlDock = new javax.swing.JPanel();
        lblServName = new javax.swing.JLabel();
        lblServImo = new javax.swing.JLabel();
        lblServLength = new javax.swing.JLabel();
        lblServQuantity = new javax.swing.JLabel();
        btnDock = new javax.swing.JButton();
        lblServType = new javax.swing.JLabel();
        lblServCapacity = new javax.swing.JLabel();
        lblErrorDock = new javax.swing.JLabel();
        lblServImoT = new javax.swing.JLabel();
        lblServLengthT = new javax.swing.JLabel();
        lblServCapacityT = new javax.swing.JLabel();
        lblServQuantityT = new javax.swing.JLabel();
        lblBGService = new javax.swing.JLabel();
        btnExitService = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(15, 26, 43));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tplPort.setBackground(new java.awt.Color(15, 26, 43));
        tplPort.setForeground(new java.awt.Color(255, 255, 255));
        tplPort.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tplPort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tplPort.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tplPort.setMaximumSize(new java.awt.Dimension(1200, 700));
        tplPort.setMinimumSize(new java.awt.Dimension(1200, 700));
        tplPort.setOpaque(true);
        tplPort.setPreferredSize(new java.awt.Dimension(1200, 700));

        pnlStatus.setBackground(new java.awt.Color(34, 45, 69));
        pnlStatus.setMaximumSize(new java.awt.Dimension(1200, 700));
        pnlStatus.setMinimumSize(new java.awt.Dimension(1200, 700));
        pnlStatus.setPreferredSize(new java.awt.Dimension(1200, 700));
        pnlStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStart.setBackground(new java.awt.Color(34, 45, 69));
        tblStart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblStart.setForeground(new java.awt.Color(255, 255, 255));
        tblStart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "IMO", "Length", "Type", "Capacity", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStart.setGridColor(new java.awt.Color(255, 255, 255));
        tblStart.setSelectionBackground(new java.awt.Color(0, 193, 212));
        tblStart.setShowGrid(false);
        tblStart.setShowHorizontalLines(true);
        splTableStatus.setViewportView(tblStart);

        pnlStatus.add(splTableStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1000, 300));

        btnUpdate.setBackground(new java.awt.Color(0, 193, 212));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconUpdate.png"))); // NOI18N
        btnUpdate.setPreferredSize(new java.awt.Dimension(75, 50));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlStatus.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        btnDetele.setBackground(new java.awt.Color(0, 193, 212));
        btnDetele.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDetele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDelete.png"))); // NOI18N
        btnDetele.setPreferredSize(new java.awt.Dimension(75, 50));
        btnDetele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeteleActionPerformed(evt);
            }
        });
        pnlStatus.add(btnDetele, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, -1, -1));

        btnClear.setBackground(new java.awt.Color(0, 193, 212));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClear.png"))); // NOI18N
        btnClear.setPreferredSize(new java.awt.Dimension(75, 50));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlStatus.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 193, 212));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconSearch.png"))); // NOI18N
        btnSearch.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlStatus.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        btnClean.setBackground(new java.awt.Color(0, 193, 212));
        btnClean.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClean.png"))); // NOI18N
        btnClean.setPreferredSize(new java.awt.Dimension(50, 50));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        pnlStatus.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        pnlSearch.setBackground(new java.awt.Color(34, 45, 69));
        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfSearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlSearch.add(txfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 50));

        lblErrorSearch.setForeground(new java.awt.Color(255, 158, 0));
        pnlSearch.add(lblErrorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 20));

        pnlStatus.add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 530, 80));

        btnExitStatus.setBackground(new java.awt.Color(15, 26, 43));
        btnExitStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExitStatus.setForeground(new java.awt.Color(255, 51, 0));
        btnExitStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconExit.png"))); // NOI18N
        btnExitStatus.setPreferredSize(new java.awt.Dimension(75, 50));
        btnExitStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitStatusActionPerformed(evt);
            }
        });
        pnlStatus.add(btnExitStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, -1, -1));

        lblBGStatus.setBackground(new java.awt.Color(204, 204, 255));
        lblBGStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGStatus.jpg"))); // NOI18N
        lblBGStatus.setOpaque(true);
        pnlStatus.add(lblBGStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        btnDrop.setBackground(new java.awt.Color(0, 193, 212));
        btnDrop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDrop.png"))); // NOI18N
        btnDrop.setPreferredSize(new java.awt.Dimension(75, 50));
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });
        pnlStatus.add(btnDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, -1, -1));

        tplPort.addTab("Status", pnlStatus);

        pnlForm.setBackground(new java.awt.Color(34, 45, 69));
        pnlForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlData.setBackground(new java.awt.Color(34, 45, 69));
        pnlData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFormName.setBackground(new java.awt.Color(255, 255, 255));
        lblFormName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormName.setForeground(new java.awt.Color(189, 195, 199));
        lblFormName.setText("Name");
        pnlData.add(lblFormName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblFormIMO.setBackground(new java.awt.Color(255, 255, 255));
        lblFormIMO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormIMO.setForeground(new java.awt.Color(189, 195, 199));
        lblFormIMO.setText("IMO");
        pnlData.add(lblFormIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblFormLength.setBackground(new java.awt.Color(255, 255, 255));
        lblFormLength.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormLength.setForeground(new java.awt.Color(189, 195, 199));
        lblFormLength.setText("Length");
        pnlData.add(lblFormLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblFormType.setBackground(new java.awt.Color(255, 255, 255));
        lblFormType.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormType.setForeground(new java.awt.Color(189, 195, 199));
        lblFormType.setText("Type");
        pnlData.add(lblFormType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lblFormCapacity.setBackground(new java.awt.Color(255, 255, 255));
        lblFormCapacity.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormCapacity.setForeground(new java.awt.Color(189, 195, 199));
        lblFormCapacity.setText("CapacityTEU");
        pnlData.add(lblFormCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lblFormQuantity.setBackground(new java.awt.Color(255, 255, 255));
        lblFormQuantity.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormQuantity.setForeground(new java.awt.Color(189, 195, 199));
        lblFormQuantity.setText("Container");
        pnlData.add(lblFormQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txfName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txfName.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txfImo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txfImo.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(txfImo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        txfLength.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txfLength.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(txfLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txfCapacity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txfCapacity.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(txfCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        txfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txfQuantity.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(txfQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        btnForm.setBackground(new java.awt.Color(0, 193, 212));
        btnForm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnForm.setText("Next");
        btnForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormActionPerformed(evt);
            }
        });
        pnlData.add(btnForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 200, 50));

        cbxType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CRUISE", "CONTAINER" }));
        cbxType.setPreferredSize(new java.awt.Dimension(240, 40));
        pnlData.add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        lblErrorFormQuantity.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 240, 20));

        lblErrorFormName.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 20));

        lblErrorFormIMO.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 240, 20));

        lblErrorFormLength.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 240, 20));

        lblErrorFormType.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 20));

        lblErrorFormCapacity.setForeground(new java.awt.Color(255, 158, 0));
        pnlData.add(lblErrorFormCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 240, 20));

        pnlForm.add(pnlData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 510, 550));

        lblBGForm.setBackground(new java.awt.Color(204, 204, 255));
        lblBGForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGForm.jpg"))); // NOI18N
        lblBGForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBGForm.setOpaque(true);
        pnlForm.add(lblBGForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        btnExitForm.setBackground(new java.awt.Color(15, 26, 43));
        btnExitForm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExitForm.setForeground(new java.awt.Color(255, 51, 0));
        btnExitForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconExit.png"))); // NOI18N
        btnExitForm.setPreferredSize(new java.awt.Dimension(75, 50));
        btnExitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFormActionPerformed(evt);
            }
        });
        pnlForm.add(btnExitForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, -1, -1));

        tplPort.addTab("Form", pnlForm);

        pnlService.setBackground(new java.awt.Color(34, 45, 69));
        pnlService.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOperation.setBackground(new java.awt.Color(34, 45, 69));
        pnlOperation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOperation.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblOperation.setForeground(new java.awt.Color(189, 195, 199));
        lblOperation.setText("Operation");
        pnlOperation.add(lblOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnOperation.setBackground(new java.awt.Color(0, 193, 212));
        btnOperation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnOperation.setText("Operate");
        btnOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });
        pnlOperation.add(btnOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 50));

        bgpOperations.add(rbtLoading);
        rbtLoading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtLoading.setForeground(new java.awt.Color(255, 255, 255));
        rbtLoading.setText("Loading");
        rbtLoading.setContentAreaFilled(false);
        pnlOperation.add(rbtLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        bgpOperations.add(rbtUnloading);
        rbtUnloading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtUnloading.setForeground(new java.awt.Color(255, 255, 255));
        rbtUnloading.setText("Unloading");
        rbtUnloading.setContentAreaFilled(false);
        pnlOperation.add(rbtUnloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        lblExtras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblExtras.setForeground(new java.awt.Color(255, 255, 255));
        lblExtras.setText("Extras");
        pnlOperation.add(lblExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        chbRefuel.setBackground(new java.awt.Color(102, 153, 255));
        chbRefuel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbRefuel.setForeground(new java.awt.Color(255, 255, 255));
        chbRefuel.setText("Refuel");
        chbRefuel.setContentAreaFilled(false);
        chbRefuel.setFocusPainted(false);
        pnlOperation.add(chbRefuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        chbMaintenance.setBackground(new java.awt.Color(102, 153, 255));
        chbMaintenance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbMaintenance.setForeground(new java.awt.Color(255, 255, 255));
        chbMaintenance.setText("Maintenance");
        chbMaintenance.setContentAreaFilled(false);
        chbMaintenance.setFocusPainted(false);
        pnlOperation.add(chbMaintenance, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        chbClean.setBackground(new java.awt.Color(102, 153, 255));
        chbClean.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbClean.setForeground(new java.awt.Color(255, 255, 255));
        chbClean.setText("Clean");
        chbClean.setContentAreaFilled(false);
        chbClean.setFocusPainted(false);
        pnlOperation.add(chbClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        pnlService.add(pnlOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 290, 560));

        pnlPayment.setBackground(new java.awt.Color(34, 45, 69));
        pnlPayment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIVAT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIVAT.setForeground(new java.awt.Color(189, 195, 199));
        lblIVAT.setText("IVA");
        pnlPayment.add(lblIVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblDiscountT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDiscountT.setForeground(new java.awt.Color(189, 195, 199));
        lblDiscountT.setText("Discount");
        pnlPayment.add(lblDiscountT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblTotalT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalT.setForeground(new java.awt.Color(189, 195, 199));
        lblTotalT.setText("Total");
        pnlPayment.add(lblTotalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnBilling.setBackground(new java.awt.Color(0, 193, 212));
        btnBilling.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBilling.setText("Bill");
        btnBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingActionPerformed(evt);
            }
        });
        pnlPayment.add(btnBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 50));

        lblPayment.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPayment.setForeground(new java.awt.Color(189, 195, 199));
        lblPayment.setText("Payment");
        pnlPayment.add(lblPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lbSubtotalT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSubtotalT.setForeground(new java.awt.Color(189, 195, 199));
        lbSubtotalT.setText("Subtotal");
        pnlPayment.add(lbSubtotalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblTotal.setBackground(new java.awt.Color(15, 26, 43));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(189, 195, 199));
        lblTotal.setOpaque(true);
        pnlPayment.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        lblSubtotal.setBackground(new java.awt.Color(15, 26, 43));
        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(189, 195, 199));
        lblSubtotal.setOpaque(true);
        pnlPayment.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 30));

        lblDiscount.setBackground(new java.awt.Color(15, 26, 43));
        lblDiscount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(189, 195, 199));
        lblDiscount.setOpaque(true);
        pnlPayment.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 30));

        lblIVA.setBackground(new java.awt.Color(15, 26, 43));
        lblIVA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIVA.setForeground(new java.awt.Color(189, 195, 199));
        lblIVA.setOpaque(true);
        pnlPayment.add(lblIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 30));

        lblSubtotal2T.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSubtotal2T.setForeground(new java.awt.Color(189, 195, 199));
        lblSubtotal2T.setText("Subtotal");
        pnlPayment.add(lblSubtotal2T, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblSubtotal2.setBackground(new java.awt.Color(15, 26, 43));
        lblSubtotal2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSubtotal2.setForeground(new java.awt.Color(189, 195, 199));
        lblSubtotal2.setOpaque(true);
        pnlPayment.add(lblSubtotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 30));

        pnlService.add(pnlPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 290, 560));

        pnlDock.setBackground(new java.awt.Color(34, 45, 69));
        pnlDock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServName.setForeground(new java.awt.Color(189, 195, 199));
        lblServName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServName.setText("--");
        pnlDock.add(lblServName, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 90, 270, -1));

        lblServImo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServImo.setForeground(new java.awt.Color(189, 195, 199));
        lblServImo.setText("--");
        pnlDock.add(lblServImo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        lblServLength.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServLength.setForeground(new java.awt.Color(189, 195, 199));
        lblServLength.setText("--");
        pnlDock.add(lblServLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        lblServQuantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServQuantity.setForeground(new java.awt.Color(189, 195, 199));
        lblServQuantity.setText("--");
        pnlDock.add(lblServQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        btnDock.setBackground(new java.awt.Color(0, 193, 212));
        btnDock.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDock.setText("Dock");
        btnDock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDockActionPerformed(evt);
            }
        });
        pnlDock.add(btnDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 50));

        lblServType.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblServType.setForeground(new java.awt.Color(189, 195, 199));
        lblServType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServType.setText("Type");
        pnlDock.add(lblServType, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 280, -1));

        lblServCapacity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServCapacity.setForeground(new java.awt.Color(189, 195, 199));
        lblServCapacity.setText("--");
        pnlDock.add(lblServCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        lblErrorDock.setForeground(new java.awt.Color(255, 158, 0));
        pnlDock.add(lblErrorDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, -1));

        lblServImoT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServImoT.setForeground(new java.awt.Color(189, 195, 199));
        lblServImoT.setText("IMO");
        pnlDock.add(lblServImoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblServLengthT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServLengthT.setForeground(new java.awt.Color(189, 195, 199));
        lblServLengthT.setText("Length");
        pnlDock.add(lblServLengthT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblServCapacityT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServCapacityT.setForeground(new java.awt.Color(189, 195, 199));
        lblServCapacityT.setText("Capacity");
        pnlDock.add(lblServCapacityT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblServQuantityT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblServQuantityT.setForeground(new java.awt.Color(189, 195, 199));
        lblServQuantityT.setText("Quantity");
        pnlDock.add(lblServQuantityT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        pnlService.add(pnlDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, 560));

        lblBGService.setBackground(new java.awt.Color(204, 204, 255));
        lblBGService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGService.jpg"))); // NOI18N
        lblBGService.setOpaque(true);
        pnlService.add(lblBGService, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        btnExitService.setBackground(new java.awt.Color(15, 26, 43));
        btnExitService.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExitService.setForeground(new java.awt.Color(255, 51, 0));
        btnExitService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconExit.png"))); // NOI18N
        btnExitService.setPreferredSize(new java.awt.Dimension(75, 50));
        btnExitService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitServiceActionPerformed(evt);
            }
        });
        pnlService.add(btnExitService, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, -1, -1));

        tplPort.addTab("Service", pnlService);

        getContentPane().add(tplPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDockActionPerformed
        getPort().dockVessel();
    }//GEN-LAST:event_btnDockActionPerformed

    private void btnBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingActionPerformed
        getPort().bill();
    }//GEN-LAST:event_btnBillingActionPerformed

    private void btnOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperationActionPerformed
        getPort().operations();
    }//GEN-LAST:event_btnOperationActionPerformed

    private void btnFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormActionPerformed
        getPort().registerVessel();
    }//GEN-LAST:event_btnFormActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        getPort().cleanSearch();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        getPort().searchVessel();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeteleActionPerformed
        getPort().deleteVessel();
    }//GEN-LAST:event_btnDeteleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        getPort().Edit();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitStatusActionPerformed
        getPort().exit();
    }//GEN-LAST:event_btnExitStatusActionPerformed

    private void btnExitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFormActionPerformed
        getPort().exit();
    }//GEN-LAST:event_btnExitFormActionPerformed

    private void btnExitServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitServiceActionPerformed
        getPort().exit();
    }//GEN-LAST:event_btnExitServiceActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        getPort().dropDatabase();
    }//GEN-LAST:event_btnDropActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        getPort().clearQueue();
    }//GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpOperations;
    private javax.swing.JButton btnBilling;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDetele;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnExitForm;
    private javax.swing.JButton btnExitService;
    private javax.swing.JButton btnExitStatus;
    private javax.swing.JButton btnForm;
    private javax.swing.JButton btnOperation;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JCheckBox chbClean;
    private javax.swing.JCheckBox chbMaintenance;
    private javax.swing.JCheckBox chbRefuel;
    private javax.swing.JLabel lbSubtotalT;
    private javax.swing.JLabel lblBGForm;
    private javax.swing.JLabel lblBGService;
    private javax.swing.JLabel lblBGStatus;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscountT;
    private javax.swing.JLabel lblErrorDock;
    private javax.swing.JLabel lblErrorFormCapacity;
    private javax.swing.JLabel lblErrorFormIMO;
    private javax.swing.JLabel lblErrorFormLength;
    private javax.swing.JLabel lblErrorFormName;
    private javax.swing.JLabel lblErrorFormQuantity;
    private javax.swing.JLabel lblErrorFormType;
    private javax.swing.JLabel lblErrorSearch;
    private javax.swing.JLabel lblExtras;
    private javax.swing.JLabel lblFormCapacity;
    private javax.swing.JLabel lblFormIMO;
    private javax.swing.JLabel lblFormLength;
    private javax.swing.JLabel lblFormName;
    private javax.swing.JLabel lblFormQuantity;
    private javax.swing.JLabel lblFormType;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblIVAT;
    private javax.swing.JLabel lblOperation;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblServCapacity;
    private javax.swing.JLabel lblServCapacityT;
    private javax.swing.JLabel lblServImo;
    private javax.swing.JLabel lblServImoT;
    private javax.swing.JLabel lblServLength;
    private javax.swing.JLabel lblServLengthT;
    private javax.swing.JLabel lblServName;
    private javax.swing.JLabel lblServQuantity;
    private javax.swing.JLabel lblServQuantityT;
    private javax.swing.JLabel lblServType;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotal2;
    private javax.swing.JLabel lblSubtotal2T;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalT;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlDock;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlOperation;
    private javax.swing.JPanel pnlPayment;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlService;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JRadioButton rbtLoading;
    private javax.swing.JRadioButton rbtUnloading;
    private javax.swing.JScrollPane splTableStatus;
    private javax.swing.JTable tblStart;
    private javax.swing.JTabbedPane tplPort;
    private javax.swing.JTextField txfCapacity;
    private javax.swing.JTextField txfImo;
    private javax.swing.JTextField txfLength;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfQuantity;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
