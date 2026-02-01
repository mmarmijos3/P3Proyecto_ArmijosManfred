package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

//<editor-fold defaultstate="collapsed" desc="DATA FORM">
    // </editor-fold>

/**
 *
 * @author Manfred Armijos
 */
public class ViewPort extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla
     */
    public ViewPort() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
    }
    
    //<editor-fold defaultstate="collapsed" desc="BUTTONS">
    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnCleanForm() {
        return btnCleanForm;
    }

    public JButton getBtnCleanSearch() {
        return btnCleanSearch;
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public JButton getBtnDelCollection() {
        return btnDelCollection;
    }

    public JButton getBtnDelDB() {
        return btnDelDB;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA FORM">
    
    //<editor-fold defaultstate="collapsed" desc="NAME">
    public String getNameForm() {
        return txfName.getText();
    }
    
    public void setNameForm(String name){
        txfName.setText(name);
    }
    
    public void cleanNameForm(){
        setNameForm("");
    }
    
    public void showlErrorName(String error) {
        lblErrorName.setText(error);
    }
    
    public void cleanlErrorName() {
        lblErrorName.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="IMO">
    public String getIMOForm() {
        return txfIMO.getText();
    }
    
    public void setIMOForm(String imo){
        txfIMO.setText(imo);
    }
    
    public void cleanIMOForm(){
        setIMOForm("");
    }
    
    public void showlErrorIMO(String error) {
        lblErrorIMO.setText(error);
    }
    
    public void cleanlErrorIMO() {
        lblErrorIMO.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TYPE">
    public String getTypeForm(){
        return cbxType.getSelectedItem().toString();
    }
    
    public void setTypeForm(Object type){
        cbxType.setSelectedItem(type);
    }
    
    public void cleanTypeForm(){
        setTypeForm(0);
    }
    
    public void showErrorType(String error) {
        lblErrorType.setText(error);
    }
    
    public void cleanErrorType() {
        lblErrorType.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CATEGORY">
    public String getCategoryForm(){
        return cbxCategory.getSelectedItem().toString();
    }
    
    public void setCategoryForm(Object category){
        cbxCategory.setSelectedItem(category);
    }
    
    public void cleanCategoryForm(){
        setCategoryForm(0);
    }
    
    public void showErrorCategory(String error) {
        lblErrorCategory.setText(error);
    }
    
    public void cleanErrorCategory() {
        lblErrorCategory.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="OCCUPANCY">
    public int getOccupancyForm() {
        return sldOccupancy.getValue();
    }
    
    public void setOccupancyForm(int occupancy) {
        sldOccupancy.setValue(occupancy);
    }
    
    public void cleanOccupancyForm() {
        setOccupancyForm(0);
    }
    
    public void showErrorOccupancy(String error) {
        lblErrorOccupancy.setText(error);
    }
    
    public void cleanErrorOccupancy() {
        lblErrorOccupancy.setText("");
    }
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA TABLE">
    public void loadDataToTable(ArrayList<Object[]> data) {
        
        DefaultTableModel tableModel = (DefaultTableModel) tblVesselQueue.getModel();
        
        tableModel.setRowCount(0);
        
        for(Object[] row : data) {
            tableModel.addRow(row);
        }
    }
    
    public int getSelectedVessel(){
        return tblVesselQueue.getSelectedRow();
    }
    
    public Object getInfoSelectedVessel(int col){
        return tblVesselQueue.getValueAt(getSelectedVessel(), col);
    }
    
    public Object getIMOToEdit(){
        return getInfoSelectedVessel(0);
    }
    
    public Object getNameToEdit(){
        return getInfoSelectedVessel(1);
    }
    
    public Object getTypeToEdit(){
        return getInfoSelectedVessel(2);
    }
    
    public Object getCategoryToEdit(){
        return getInfoSelectedVessel(3);
    }
    
    public Object getOccupancyToEdit(){
        return getInfoSelectedVessel(4);
    }
    
    public void enableTable(boolean state){
        tblVesselQueue.setEnabled(state);
    }
    // </editor-fold>
   
    

    public String getSearchForm() {
        return txfSearch.getText();
    }

    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFormTitle = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        lblErrorName = new javax.swing.JLabel();
        lblErrorCategory = new javax.swing.JLabel();
        cbxCategory = new javax.swing.JComboBox<>();
        cbxType = new javax.swing.JComboBox<>();
        txfIMO = new javax.swing.JTextField();
        lblErrorIMO = new javax.swing.JLabel();
        lblErrorType = new javax.swing.JLabel();
        lblErrorOccupancy = new javax.swing.JLabel();
        sldOccupancy = new javax.swing.JSlider();
        btnCleanForm = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVesselQueue = new javax.swing.JTable();
        txfSearch = new javax.swing.JTextField();
        btnCleanSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelCollection = new javax.swing.JButton();
        btnDelDB = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(30, 40, 53));
        jPanel2.setPreferredSize(new java.awt.Dimension(610, 610));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFormTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblFormTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblFormTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblFormTitle.setText("VESSEL FORM");
        jPanel2.add(lblFormTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        txfName.setBackground(new java.awt.Color(30, 40, 53));
        txfName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfName.setForeground(new java.awt.Color(255, 255, 255));
        txfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        txfName.setCaretColor(new java.awt.Color(255, 255, 255));
        txfName.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel2.add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, -1));

        lblErrorName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 330, 30));

        lblErrorCategory.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorCategory.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblErrorCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 330, 30));

        cbxCategory.setBackground(new java.awt.Color(30, 40, 53));
        cbxCategory.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxCategory.setForeground(new java.awt.Color(255, 255, 255));
        cbxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "SMALL", "MEDIUM", "LARGE", "EXTRALARGE" }));
        cbxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxCategory.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxCategory.setFocusable(false);
        cbxCategory.setPreferredSize(new java.awt.Dimension(500, 55));
        jPanel2.add(cbxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 410, -1));

        cbxType.setBackground(new java.awt.Color(30, 40, 53));
        cbxType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxType.setForeground(new java.awt.Color(255, 255, 255));
        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "CRUISE", "CONTAINER" }));
        cbxType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxType.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxType.setFocusable(false);
        cbxType.setPreferredSize(new java.awt.Dimension(500, 55));
        jPanel2.add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 410, -1));

        txfIMO.setBackground(new java.awt.Color(30, 40, 53));
        txfIMO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfIMO.setForeground(new java.awt.Color(255, 255, 255));
        txfIMO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIMO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "IMO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        txfIMO.setCaretColor(new java.awt.Color(255, 255, 255));
        txfIMO.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel2.add(txfIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 410, -1));

        lblErrorIMO.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorIMO.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorIMO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorIMO.setToolTipText("");
        jPanel2.add(lblErrorIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 330, 30));

        lblErrorType.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorType.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblErrorType, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 330, 30));

        lblErrorOccupancy.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorOccupancy.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorOccupancy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblErrorOccupancy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 330, 30));

        sldOccupancy.setBackground(new java.awt.Color(30, 40, 53));
        sldOccupancy.setForeground(new java.awt.Color(255, 255, 255));
        sldOccupancy.setMajorTickSpacing(10);
        sldOccupancy.setMinorTickSpacing(5);
        sldOccupancy.setPaintLabels(true);
        sldOccupancy.setPaintTicks(true);
        sldOccupancy.setSnapToTicks(true);
        sldOccupancy.setToolTipText("");
        sldOccupancy.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Occupancy  %", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        sldOccupancy.setFocusable(false);
        jPanel2.add(sldOccupancy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 410, 80));

        btnCleanForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClean.png"))); // NOI18N
        btnCleanForm.setBorder(null);
        btnCleanForm.setBorderPainted(false);
        btnCleanForm.setContentAreaFilled(false);
        jPanel2.add(btnCleanForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconReset.png"))); // NOI18N
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconCreate.png"))); // NOI18N
        btnCreate.setBorder(null);
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        jPanel3.setBackground(new java.awt.Color(30, 40, 53));
        jPanel3.setPreferredSize(new java.awt.Dimension(610, 610));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVesselQueue.setBackground(new java.awt.Color(30, 40, 53));
        tblVesselQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IMO", "Name", "Type", "Category", "Occupancy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVesselQueue);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 660, 290));

        txfSearch.setBackground(new java.awt.Color(30, 40, 53));
        txfSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfSearch.setForeground(new java.awt.Color(255, 255, 255));
        txfSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "IMO to Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        txfSearch.setCaretColor(new java.awt.Color(255, 255, 255));
        txfSearch.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel3.add(txfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 440, 80));

        btnCleanSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClean.png"))); // NOI18N
        btnCleanSearch.setBorder(null);
        btnCleanSearch.setBorderPainted(false);
        btnCleanSearch.setContentAreaFilled(false);
        jPanel3.add(btnCleanSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconEdit.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        jPanel3.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDelete.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        btnDelCollection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDeleteCollection.png"))); // NOI18N
        btnDelCollection.setBorder(null);
        btnDelCollection.setBorderPainted(false);
        btnDelCollection.setContentAreaFilled(false);
        jPanel3.add(btnDelCollection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        btnDelDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDeleteDatabase.png"))); // NOI18N
        btnDelDB.setBorder(null);
        btnDelDB.setBorderPainted(false);
        btnDelDB.setContentAreaFilled(false);
        jPanel3.add(btnDelDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconSearch.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

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
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
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
    private javax.swing.JButton btnCleanForm;
    private javax.swing.JButton btnCleanSearch;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelCollection;
    private javax.swing.JButton btnDelDB;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxCategory;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCategory;
    private javax.swing.JLabel lblErrorIMO;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorOccupancy;
    private javax.swing.JLabel lblErrorType;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JSlider sldOccupancy;
    private javax.swing.JTable tblVesselQueue;
    private javax.swing.JTextField txfIMO;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
