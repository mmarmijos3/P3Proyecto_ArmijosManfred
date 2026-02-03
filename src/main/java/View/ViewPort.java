package View;

import java.awt.Color;
import java.util.List;
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
        tblVesselQueue.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        tblVesselQueue.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
        tblVesselQueue.getTableHeader().setBackground(Color.white);
        tblVesselQueue.setRowHeight(28);
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
    public void loadDataToTable(List<Object[]> data) {
        
        DefaultTableModel tableModel = (DefaultTableModel) tblVesselQueue.getModel();
        
        tableModel.setRowCount(0);
        
        for(Object[] row : data) {
            tableModel.addRow(row);
        }
    }
    
    public int getSelectedVessel(){
        return tblVesselQueue.getSelectedRow();
    }
    
    public void clearVesselSelection() {
        tblVesselQueue.clearSelection();
    }
    
    public boolean isAnyVesselSelected() {
        return tblVesselQueue.getSelectedRow() != -1;
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
    
    //<editor-fold defaultstate="collapsed" desc="CLEAN">
    public void cleanForm(){
        cleanNameForm();
        cleanIMOForm();
        cleanTypeForm();
        cleanCategoryForm();
        cleanOccupancyForm();
        cleanlErrorName();
        cleanlErrorIMO();
        cleanErrorType();
        cleanErrorCategory();
        cleanErrorOccupancy();
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SEARCH">
    public String getIMOToSearch() {
        return txfSearch.getText();
    }
    
    public void cleanIMOToSearch() {
        txfSearch.setText("");
    }
    
    public void showErrorSearch(String error) {
        lblErrorSearch.setText(error);
    }
    
    public void cleanErrorSearch() {
        lblErrorSearch.setText("");
    }
    
    
    // </editor-fold>
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVesselQueue = new javax.swing.JTable();
        txfSearch = new javax.swing.JTextField();
        btnCleanSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelCollection = new javax.swing.JButton();
        btnDelDB = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblErrorSearch = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfName.setBorder(null);
        txfName.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 390, 50));

        lblErrorName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 330, 30));

        lblErrorCategory.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorCategory.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 330, 30));

        cbxCategory.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "SMALL", "MEDIUM", "LARGE", "EXTRALARGE" }));
        cbxCategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxCategory.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxCategory.setPreferredSize(new java.awt.Dimension(500, 55));
        jPanel1.add(cbxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 435, 390, 50));

        cbxType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "CRUISE", "CONTAINER" }));
        cbxType.setBorder(null);
        cbxType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxType.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxType.setFocusable(false);
        cbxType.setOpaque(true);
        cbxType.setPreferredSize(new java.awt.Dimension(500, 55));
        jPanel1.add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 390, 50));

        txfIMO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfIMO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIMO.setBorder(null);
        txfIMO.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 390, 50));

        lblErrorIMO.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorIMO.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorIMO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorIMO.setToolTipText("");
        jPanel1.add(lblErrorIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 330, 30));

        lblErrorType.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorType.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 330, 30));

        lblErrorOccupancy.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorOccupancy.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorOccupancy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorOccupancy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 330, 30));

        sldOccupancy.setBackground(new java.awt.Color(255, 255, 255));
        sldOccupancy.setMajorTickSpacing(10);
        sldOccupancy.setMinorTickSpacing(5);
        sldOccupancy.setPaintLabels(true);
        sldOccupancy.setPaintTicks(true);
        sldOccupancy.setSnapToTicks(true);
        sldOccupancy.setToolTipText("");
        sldOccupancy.setFocusable(false);
        sldOccupancy.setOpaque(true);
        jPanel1.add(sldOccupancy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 390, 50));

        btnCleanForm.setBorder(null);
        btnCleanForm.setBorderPainted(false);
        btnCleanForm.setContentAreaFilled(false);
        btnCleanForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCleanForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 100, 50));

        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 100, 50));

        btnCreate.setBorder(null);
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 100, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tblVesselQueue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        tblVesselQueue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblVesselQueue.setFocusable(false);
        tblVesselQueue.setOpaque(false);
        tblVesselQueue.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tblVesselQueue.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVesselQueue.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVesselQueue.setShowGrid(true);
        tblVesselQueue.getTableHeader().setResizingAllowed(false);
        tblVesselQueue.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVesselQueue);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 720, 380));

        txfSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSearch.setBorder(null);
        txfSearch.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel1.add(txfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 125, 380, 50));

        btnCleanSearch.setBorder(null);
        btnCleanSearch.setBorderPainted(false);
        btnCleanSearch.setContentAreaFilled(false);
        btnCleanSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCleanSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, 100, 50));

        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 225, 100, 50));

        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 225, 100, 50));

        btnDelCollection.setBorder(null);
        btnDelCollection.setBorderPainted(false);
        btnDelCollection.setContentAreaFilled(false);
        btnDelCollection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelCollection, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 225, 100, 50));

        btnDelDB.setBorder(null);
        btnDelDB.setBorderPainted(false);
        btnDelDB.setContentAreaFilled(false);
        btnDelDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 225, 100, 50));

        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 128, 100, 50));

        lblErrorSearch.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorSearch.setForeground(new java.awt.Color(255, 153, 51));
        lblErrorSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 410, 30));

        btnBack.setBackground(new java.awt.Color(10, 107, 207));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBack.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconPort.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCategory;
    private javax.swing.JLabel lblErrorIMO;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorOccupancy;
    private javax.swing.JLabel lblErrorSearch;
    private javax.swing.JLabel lblErrorType;
    private javax.swing.JSlider sldOccupancy;
    private javax.swing.JTable tblVesselQueue;
    private javax.swing.JTextField txfIMO;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
