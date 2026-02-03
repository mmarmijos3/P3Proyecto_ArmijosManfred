package Model.Command;

import Model.Entities.Bill;
import Model.Entities.Vessel;

/**
 * BillReceiver class - Contiene toda la lógica de negocio
 (Paso: The BillReceiver class contains some business logic)
 */
public class BillReceiver {
    private Bill bill;

    public BillReceiver() {
        this.bill = new Bill();
    }

    private static final double DOCK_FEE_CONTAINER_PER_METER = 0.25;
    private static final double DOCK_FEE_CRUISE_PER_METER = 0.15;
    private static final double CONTAINER_HANDLING_FEE = 0.75;
    private static final double PASSENGER_TAX = 1.30;
    private static final double REFUEL_CONTAINER = 1500.0;
    private static final double REFUEL_CRUISE = 3000.0;
    private static final double CLEAN_CONTAINER = 1200.0;
    private static final double CLEAN_CRUISE = 2000.0;
    private static final double MAINTENANCE_CONTAINER = 2500.0;
    private static final double MAINTENANCE_CRUISE = 3200.0;
    private static final double DISCOUNT_RATE_NO_OPERATION = 0.10; // 10% discount
    private static final double TAX_RATE = 0.15; // 15% IVA
    
 
    public void aplicarAtraque(Vessel vessel) {
        agregarCosto(calcularCostoDock(vessel));
    }
    
    public void applyDiscount(boolean op1, boolean op2) {
        agregarCosto(-calculateDiscount(op1, op2));
    }
    
    public void aplicarLoading(Vessel vessel, boolean isSelected) {
        if(isSelected) agregarCosto(calcularCostoCarga(vessel));
    }
    
    public void aplicarUnloading(Vessel vessel, boolean isSelected) {
        if(isSelected) agregarCosto(calcularCostoDescarga(vessel));
    }
    
    public void aplicarClean(Vessel vessel, boolean isSelected) {
        if(isSelected) agregarCosto(calcularCostoLimpieza(vessel));
    }
    
    public void aplicarRefuel(Vessel vessel, boolean isSelected) {
        if(isSelected) agregarCosto(calcularCostoCombustible(vessel));
    }
    
    public void aplicarMaintenance(Vessel vessel, boolean isSelected) {
        if(isSelected) agregarCosto(calcularCostoMantenimiento(vessel));
    }
    
    // Lógica de cálculo específica por tipo de embarcación
    private double calcularCostoDock(Vessel vessel) {
        double area = calculateVesselArea(vessel);
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return area * DOCK_FEE_CONTAINER_PER_METER; 
            } 
            default -> {
                return area * DOCK_FEE_CRUISE_PER_METER;
            }
        }
    }
    
    public double calculateDiscount(boolean op1, boolean op2) {
        bill.calculateDiscount((!op1 && !op2)? DISCOUNT_RATE_NO_OPERATION: 0);
        return bill.getDiscount();
    }
    
    
    private double calcularCostoCarga(Vessel vessel) {
        double remain = vessel.getCapacity() - vessel.getQuantity();
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return remain * CONTAINER_HANDLING_FEE; 
            } 
            default -> {
                return remain * PASSENGER_TAX;
            }
        }
    }
    
    private double calcularCostoDescarga(Vessel vessel) {
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return vessel.getQuantity() * CONTAINER_HANDLING_FEE; 
            } 
            default -> {
                return vessel.getQuantity() * PASSENGER_TAX;
            }
        }
    }
    
    private double calcularCostoLimpieza(Vessel vessel) {
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return CLEAN_CONTAINER; 
            } 
            default -> {
                return CLEAN_CRUISE;
            }
        }
    }
    
    private double calcularCostoCombustible(Vessel vessel) {
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return REFUEL_CONTAINER; 
            } 
            default -> {
                return REFUEL_CRUISE;
            }
        }
    }
    
    private double calcularCostoMantenimiento(Vessel vessel) {        
        switch(vessel.getType()){
            case "CONTAINER" -> {
                return MAINTENANCE_CONTAINER; 
            } 
            default -> {
                return MAINTENANCE_CRUISE;
            }
        }
    }
    
    private double calculateVesselArea(Vessel vessel){
        return vessel.getLength() * vessel.getBeam();
    }
    
    private void agregarCosto(double costo) {
        bill.setSubtotal(bill.getSubtotal() + costo);
    }
    
    public Object[] getBill() {
        calculateBill();
        return bill.getInfoBill();
    }
    
    
    public void calculateBill() {
        bill.calculateTax(TAX_RATE);
        bill.calculateTotal();
    }
    
    public void reset() {
        bill.cleanBill();
    }
}
