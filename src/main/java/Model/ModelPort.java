package Model;

import Model.Entities.*;

public class ModelPort {
    
    Director director = new Director();
    
    public Vessel contructVessel(String type, String category){
        switch (type) {
            case "CRUISE" -> {return contructCruiseShip(category);}
            case "CONTAINER" -> {return contructContainerShip(category);}
            default -> {return null;}
        }
    }
    
    public void guardarvessel(String type, String category){
        
    }

    private Vessel contructCruiseShip(String category) {
        BuilderCruiseShip builder = new BuilderCruiseShip();
        switch (category) {
            case "SMALL" -> director.contructCruiseShipBoutique(builder);
            case "MEDIUM" -> director.contructCruiseShipStandard(builder);
            case "LARGE" -> director.contructCruiseShipMega(builder);
            case "EXTRALARGE" -> director.contructCruiseShipIcon(builder);
        }
        return builder.getResult();
    }

    private Vessel contructContainerShip(String category) {
        BuilderContainerShip builder = new BuilderContainerShip();
        switch (category) {
            case "SMALL" -> director.contructContainerShipFeeder(builder);
            case "MEDIUM" -> director.contructContainerShipPostPanamax(builder);
            case "LARGE" -> director.contructContainerShipNeopanamax(builder);
            case "EXTRALARGE" -> director.contructContainerShipUltraLarge(builder);
        }
        return builder.getResult();
    }
}
