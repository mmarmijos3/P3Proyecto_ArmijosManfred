
package Model.Builder;

import Model.Entities.Vessel;

/**
 *
 * @author Manfred Armijos
 */
public class VesselConstructor {
    private BuilderDirector director = new BuilderDirector();
    
    public Vessel contructFromDoc(Object[] info){
        return contructVessel(
            info[2].toString(), // type
            info[3].toString(), // category
            info[1].toString(), // name
            info[0].toString(), // imo
            (int) info[8]       // quantity
        );
    }
    
    public Vessel contructVessel(String type, String category, String name, String imo, int quantity){
        switch (type) {
            case "CRUISE" -> {return contructCruiseShip(category, name, imo, quantity);}
            case "CONTAINER" -> {return contructContainerShip(category, name, imo, quantity);}
            default -> {return null;}
        }
    }
    
    private Vessel contructCruiseShip(String category, String name, String imo, int quantity) {
        director.setBuilder(new BuilderCruiseShip());
        switch (category) {
            case "SMALL" -> director.contructCruiseShipBoutique(name, imo, quantity);
            case "MEDIUM" -> director.contructCruiseShipStandard(name, imo, quantity);
            case "LARGE" -> director.contructCruiseShipMega(name, imo, quantity);
            case "EXTRALARGE" -> director.contructCruiseShipIcon(name, imo, quantity);
        }
        return director.getBuilder().getResult();
    }

    private Vessel contructContainerShip(String category, String name, String imo, int quantity) {
        director.setBuilder(new BuilderContainerShip());
        switch (category) {
            case "SMALL" -> director.contructContainerShipFeeder(name, imo, quantity);
            case "MEDIUM" -> director.contructContainerShipPostPanamax(name, imo, quantity);
            case "LARGE" -> director.contructContainerShipNeopanamax(name, imo, quantity);
            case "EXTRALARGE" -> director.contructContainerShipUltraLarge(name, imo, quantity);
        }
        return director.getBuilder().getResult();
    }
}
