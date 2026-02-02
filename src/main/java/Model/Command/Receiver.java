package Model.Command;

import Model.Entities.Vessel;
import Model.Entities.ContainerShip;
import Model.Entities.CruiseShip;

/**
 * Receiver class - Contiene toda la lógica de negocio
 * (Paso: The Receiver class contains some business logic)
 */
public class Receiver {
    private double subtotal = 0.0;
    private StringBuilder facturaDetalle = new StringBuilder();
    
    // Métodos de cálculo (business logic)
    public void calcularAtraque(Vessel vessel) {
        double area = vessel.getLength() * vessel.getBeam();
        double costo = area * 50.0; // $50 por m²
        agregarCosto("Atraque (" + area + " m²)", costo);
    }
    
    public void aplicarLoading(Vessel vessel) {
        double costo = calcularCostoCarga(vessel);
        agregarCosto("Loading", costo);
    }
    
    public void aplicarUnloading(Vessel vessel) {
        double costo = calcularCostoDescarga(vessel);
        agregarCosto("Unloading", costo);
    }
    
    public void aplicarClean(Vessel vessel) {
        double costo = calcularCostoLimpieza(vessel);
        agregarCosto("Clean Service", costo);
    }
    
    public void aplicarRefuel(Vessel vessel, double litros) {
        double costo = calcularCostoCombustible(vessel, litros);
        agregarCosto("Refuel (" + litros + "L)", costo);
    }
    
    public void aplicarMaintenance(Vessel vessel) {
        double costo = calcularCostoMantenimiento(vessel);
        agregarCosto("Maintenance", costo);
    }
    
    // Lógica de cálculo específica por tipo de embarcación
    private double calcularCostoCarga(Vessel vessel) {
        if (vessel instanceof ContainerShip) {
            ContainerShip cs = (ContainerShip) vessel;
            return cs.getQuantity() * 10.0; // $10 por contenedor
        } else if (vessel instanceof CruiseShip) {
            CruiseShip cs = (CruiseShip) vessel;
            return cs.getQuantity() * 5.0; // $5 por pasajero
        }
        return 100.0; // Costo base
    }
    
    private double calcularCostoDescarga(Vessel vessel) {
        if (vessel instanceof ContainerShip) {
            ContainerShip cs = (ContainerShip) vessel;
            return cs.getQuantity() * 8.0; // $8 por contenedor
        } else if (vessel instanceof CruiseShip) {
            CruiseShip cs = (CruiseShip) vessel;
            return cs.getQuantity() * 4.0; // $4 por pasajero
        }
        return 80.0; // Costo base
    }
    
    private double calcularCostoLimpieza(Vessel vessel) {
        double area = vessel.getLength() * vessel.getBeam();
        if (vessel instanceof ContainerShip) {
            return area * 15.0; // $15/m² para contenedores
        } else if (vessel instanceof CruiseShip) {
            return area * 25.0; // $25/m² para cruceros (más limpieza)
        }
        return area * 20.0; // Costo base
    }
    
    private double calcularCostoCombustible(Vessel vessel, double litros) {
        if (vessel instanceof ContainerShip) {
            return litros * 1.2; // $1.2/L para contenedores
        } else if (vessel instanceof CruiseShip) {
            return litros * 1.5; // $1.5/L para cruceros
        }
        return litros * 1.0; // Costo base
    }
    
    private double calcularCostoMantenimiento(Vessel vessel) {
        double area = vessel.getLength() * vessel.getBeam();
        if (vessel instanceof ContainerShip) {
            return area * 30.0; // $30/m² para contenedores
        } else if (vessel instanceof CruiseShip) {
            return area * 40.0; // $40/m² para cruceros
        }
        return area * 35.0; // Costo base
    }
    
    private void agregarCosto(String descripcion, double costo) {
        subtotal += costo;
        facturaDetalle.append(String.format("%-20s $%.2f\n", descripcion, costo));
    }
    
    public String getFactura() {
        return "=== BILL SUMMARY ===\n" +
               facturaDetalle.toString() +
               "-------------------\n" +
               String.format("SUBTOTAL:        $%.2f", subtotal);
    }
    
    public void reset() {
        subtotal = 0.0;
        facturaDetalle = new StringBuilder();
    }
}
