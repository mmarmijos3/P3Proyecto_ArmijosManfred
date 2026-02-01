
package Model.Builder;

import Model.Entities.Vessel;

/**
 *
 * @author Manfred Armijos
 */
public class VesselConstructor {
    private BuilderDirector director = new BuilderDirector();
    
    public Vessel contructVessel(String type, String category, String name, String imo, int quantity){
        switch (type) {
            case "CRUISE" -> {return contructCruiseShip(category, name, imo, quantity);}
            case "CONTAINER" -> {return contructContainerShip(category, name, imo, quantity);}
            default -> {return null;}
        }
    }
    
    private Vessel contructCruiseShip(String category, String name, String imo, int quantity) {
        BuilderCruiseShip builder = new BuilderCruiseShip();
        switch (category) {
            case "SMALL" -> director.contructCruiseShipBoutique(builder, name, imo, quantity);
            case "MEDIUM" -> director.contructCruiseShipStandard(builder, name, imo, quantity);
            case "LARGE" -> director.contructCruiseShipMega(builder, name, imo, quantity);
            case "EXTRALARGE" -> director.contructCruiseShipIcon(builder, name, imo, quantity);
        }
        return builder.getResult();
    }

    private Vessel contructContainerShip(String category, String name, String imo, int quantity) {
        BuilderContainerShip builder = new BuilderContainerShip();
        switch (category) {
            case "SMALL" -> director.contructContainerShipFeeder(builder, name, imo, quantity);
            case "MEDIUM" -> director.contructContainerShipPostPanamax(builder, name, imo, quantity);
            case "LARGE" -> director.contructContainerShipNeopanamax(builder, name, imo, quantity);
            case "EXTRALARGE" -> director.contructContainerShipUltraLarge(builder, name, imo, quantity);
        }
        return builder.getResult();
    }
}
