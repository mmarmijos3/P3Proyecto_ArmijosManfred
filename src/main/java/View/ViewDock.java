package View;

import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manfred Armijos
 */
public class ViewDock extends javax.swing.JFrame {


    public ViewDock() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
        tblBills.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        tblBills.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
        tblBills.getTableHeader().setBackground(Color.white);
        tblBills.setRowHeight(28);
    }

    
    //<editor-fold defaultstate="collapsed" desc="BUTTONS">
    public JButton getBtnDock() {
        return btnDock;
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnCleanServices() {
        return btnClean;
    }


    public JButton getBtnPaySave() {
        return btnPaySave;
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


    public JButton getBtnCalculate() {
        return btnPayUpdate;
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA VESSEL">
    
    //<editor-fold defaultstate="collapsed" desc="NAME">
    public String getServNameForm() {
        return lblServName.getText();
    }
    
    public void setServNameForm(String name){
        lblServName.setText(name);
    }
    
    public void cleanServNameForm(){
        setServNameForm("");
    }
    
//    public void showlErrorName(String error) {
//        lblErrorName.setText(error);
//    }
//    
//    public void cleanlErrorName() {
//        lblErrorName.setText("");
//    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="IMO">
    public String getServIMOForm() {
        return lblServIMO.getText();
    }
    
    public void setServIMOForm(String imo){
        lblServIMO.setText(imo);
    }
    
    public void cleanIMOForm(){
        setServIMOForm("");
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TYPE">
    public String getServTypeForm(){
        return lblServType.getText();
    }
    
    public void setServTypeForm(String type){
        lblServType.setText(type);
    }
    
    public void cleanServTypeForm(){
        setServTypeForm("");
    }
    
    //</editor-fold>
    
//    //<editor-fold defaultstate="collapsed" desc="CATEGORY">
//    public String getCategoryForm(){
//        return cbxCategory.getSelectedItem().toString();
//    }
//    
//    public void setCategoryForm(Object category){
//        cbxCategory.setSelectedItem(category);
//    }
//    
//    public void cleanCategoryForm(){
//        setCategoryForm(0);
//    }
//    
//    public void showErrorCategory(String error) {
//        lblErrorCategory.setText(error);
//    }
//    
//    public void cleanErrorCategory() {
//        lblErrorCategory.setText("");
//    }
//    //</editor-fold>
//    
//    //<editor-fold defaultstate="collapsed" desc="OCCUPANCY">
//    public int getOccupancyForm() {
//        return sldOccupancy.getValue();
//    }
//    
//    public void setOccupancyForm(int occupancy) {
//        sldOccupancy.setValue(occupancy);
//    }
//    
//    public void cleanOccupancyForm() {
//        setOccupancyForm(0);
//    }
//    
//    public void showErrorOccupancy(String error) {
//        lblErrorOccupancy.setText(error);
//    }
//    
//    public void cleanErrorOccupancy() {
//        lblErrorOccupancy.setText("");
//    }
//    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA TABLE">
    public void loadDataToTable(List<Object[]> data) {
        
        DefaultTableModel tableModel = (DefaultTableModel) tblBills.getModel();
        
        tableModel.setRowCount(0);
        
        for(Object[] row : data) {
            tableModel.addRow(row);
        }
    }
    
    public int getSelectedBill(){
        return tblBills.getSelectedRow();
    }
    
    public void clearBillSelection() {
        tblBills.clearSelection();
    }
    
    public boolean isAnyBillSelected() {
        return tblBills.getSelectedRow() != -1;
    }
    
    public Object getInfoSelectedBill(int col){
        return tblBills.getValueAt(getSelectedBill(), col);
    }
    
    public Object getIDToEdit(){
        return getInfoSelectedBill(0);
    }
    
    public Object getNameToEdit(){
        return getInfoSelectedBill(1);
    }
    
    public Object getIMOToEdit(){
        return getInfoSelectedBill(2);
    }
    
    public Object getTypeToEdit(){
        return getInfoSelectedBill(3);
    }
    
    public Object getTotalToEdit(){
        return getInfoSelectedBill(4);
    }
    
    
    public void enableTable(boolean state){
        tblBills.setEnabled(state);
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SERVICES">
    
    //<editor-fold defaultstate="collapsed" desc="OPERATIONS">
    public boolean getLoading(){
        return rbtLoading.isSelected();
    }
    
    public void setLoading(boolean estado){
        rbtLoading.setSelected(estado);
    }
    
    public boolean getUnloading(){
        return rbtUnloading.isSelected();
    }
    
    public void setUnloading(boolean estado){
        rbtUnloading.setSelected(estado);
    }
    
    public boolean getMotorSelecionado(){
        return getLoading() || getUnloading();
    }
    
    public void cleanOperations(){
        rbgOperations.clearSelection();
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="EXTRAS">
    public boolean isSelectedClean() {
        return chbClean.isSelected();
    }

    public boolean isSelectedMaintenance() {
        return chbMaintenance.isSelected();
    }

    public boolean isSelectedRefuel() {
        return chbRefuel.isSelected();
    }
    
    public void selectClean(boolean selection) {
        chbClean.setSelected(selection);
    }

    public void selectMaintenance(boolean selection) {
        chbMaintenance.setSelected(selection);
    }

    public void selectRefuel(boolean selection) {
        chbRefuel.setSelected(selection);
    }
    
    
    public void cleanExtras(){
        selectClean(false);
        selectMaintenance(false);
        selectRefuel(false);
    }
    // </editor-fold>
    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CLEAN">
    public void cleanAll(){
        cleanServNameForm();
        cleanIMOForm();
        cleanServTypeForm();
        cleanOperations();
        cleanExtras();
    }
    
    public void cleanServices(){
        cleanOperations();
        cleanExtras();
    }
    // </editor-fold>
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgOperations = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnDock = new javax.swing.JButton();
        lblServName = new javax.swing.JLabel();
        lblServIMO = new javax.swing.JLabel();
        lblServType = new javax.swing.JLabel();
        lblPaySubtotal = new javax.swing.JLabel();
        lblPayDiscount = new javax.swing.JLabel();
        lblPayIVA = new javax.swing.JLabel();
        lblPayTotal = new javax.swing.JLabel();
        rbtLoading = new javax.swing.JRadioButton();
        rbtUnloading = new javax.swing.JRadioButton();
        chbRefuel = new javax.swing.JCheckBox();
        chbMaintenance = new javax.swing.JCheckBox();
        chbClean = new javax.swing.JCheckBox();
        btnClean = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelCollection = new javax.swing.JButton();
        btnDelDB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBills = new javax.swing.JTable();
        btnPayUpdate = new javax.swing.JButton();
        btnPaySave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(10, 107, 207));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBack.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        btnDock.setBorder(null);
        btnDock.setBorderPainted(false);
        btnDock.setContentAreaFilled(false);
        jPanel1.add(btnDock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 50, 160));

        lblServName.setBackground(new java.awt.Color(255, 255, 255));
        lblServName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblServName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblServName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 45));

        lblServIMO.setBackground(new java.awt.Color(255, 255, 255));
        lblServIMO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblServIMO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblServIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 45));

        lblServType.setBackground(new java.awt.Color(255, 255, 255));
        lblServType.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblServType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblServType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, 45));

        lblPaySubtotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPaySubtotal.setForeground(new java.awt.Color(255, 255, 255));
        lblPaySubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPaySubtotal.setText("0");
        lblPaySubtotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPaySubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Subtotal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lblPaySubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 70));

        lblPayDiscount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPayDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblPayDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPayDiscount.setText("0");
        lblPayDiscount.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPayDiscount.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Discount", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lblPayDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 300, 70));

        lblPayIVA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPayIVA.setForeground(new java.awt.Color(255, 255, 255));
        lblPayIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPayIVA.setText("0");
        lblPayIVA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPayIVA.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "IVA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lblPayIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 300, 70));

        lblPayTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPayTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblPayTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPayTotal.setText("0");
        lblPayTotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPayTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Total", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(lblPayTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 300, 70));

        rbgOperations.add(rbtLoading);
        rbtLoading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtLoading.setForeground(new java.awt.Color(255, 255, 255));
        rbtLoading.setText("Loading");
        rbtLoading.setContentAreaFilled(false);
        jPanel1.add(rbtLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        rbgOperations.add(rbtUnloading);
        rbtUnloading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtUnloading.setForeground(new java.awt.Color(255, 255, 255));
        rbtUnloading.setText("Unloading");
        rbtUnloading.setContentAreaFilled(false);
        jPanel1.add(rbtUnloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        chbRefuel.setBackground(new java.awt.Color(102, 153, 255));
        chbRefuel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbRefuel.setForeground(new java.awt.Color(255, 255, 255));
        chbRefuel.setText("Refuel");
        chbRefuel.setContentAreaFilled(false);
        chbRefuel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbRefuel.setFocusPainted(false);
        jPanel1.add(chbRefuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        chbMaintenance.setBackground(new java.awt.Color(102, 153, 255));
        chbMaintenance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbMaintenance.setForeground(new java.awt.Color(255, 255, 255));
        chbMaintenance.setText("Maintenance");
        chbMaintenance.setContentAreaFilled(false);
        chbMaintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbMaintenance.setFocusPainted(false);
        jPanel1.add(chbMaintenance, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, -1, -1));

        chbClean.setBackground(new java.awt.Color(102, 153, 255));
        chbClean.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chbClean.setForeground(new java.awt.Color(255, 255, 255));
        chbClean.setText("Clean");
        chbClean.setContentAreaFilled(false);
        chbClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbClean.setFocusPainted(false);
        jPanel1.add(chbClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, -1, -1));

        btnClean.setBorder(null);
        btnClean.setBorderPainted(false);
        btnClean.setContentAreaFilled(false);
        jPanel1.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 100, 50));

        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 100, 50));

        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 285, 100, 50));

        btnDelCollection.setBorder(null);
        btnDelCollection.setBorderPainted(false);
        btnDelCollection.setContentAreaFilled(false);
        jPanel1.add(btnDelCollection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 285, 100, 50));

        btnDelDB.setBorder(null);
        btnDelDB.setBorderPainted(false);
        btnDelDB.setContentAreaFilled(false);
        jPanel1.add(btnDelDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 285, 100, 50));

        tblBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "IMO", "Name", "Type", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBills);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 880, 320));

        btnPayUpdate.setBorder(null);
        btnPayUpdate.setBorderPainted(false);
        btnPayUpdate.setContentAreaFilled(false);
        btnPayUpdate.setEnabled(false);
        jPanel1.add(btnPayUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 100, 50));

        btnPaySave.setBorder(null);
        btnPaySave.setBorderPainted(false);
        btnPaySave.setContentAreaFilled(false);
        btnPaySave.setEnabled(false);
        jPanel1.add(btnPaySave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDock.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelCollection;
    private javax.swing.JButton btnDelDB;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPaySave;
    private javax.swing.JButton btnPayUpdate;
    private javax.swing.JCheckBox chbClean;
    private javax.swing.JCheckBox chbMaintenance;
    private javax.swing.JCheckBox chbRefuel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPayDiscount;
    private javax.swing.JLabel lblPayIVA;
    private javax.swing.JLabel lblPaySubtotal;
    private javax.swing.JLabel lblPayTotal;
    private javax.swing.JLabel lblServIMO;
    private javax.swing.JLabel lblServName;
    private javax.swing.JLabel lblServType;
    private javax.swing.ButtonGroup rbgOperations;
    private javax.swing.JRadioButton rbtLoading;
    private javax.swing.JRadioButton rbtUnloading;
    private javax.swing.JTable tblBills;
    // End of variables declaration//GEN-END:variables
}
