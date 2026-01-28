package Model.Entities;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

/*
Class daughter referring to container ship-type vessels    
*/
public class ContainerShip extends Vessel{

    private int capacityTEU;
    private int container;

    public ContainerShip(int capacityTEU, int container, String name, String imo, double length, double beam, double draft) {
        super(name, imo, length, beam, draft);
        this.capacityTEU = capacityTEU;
        this.container = container;
    }
    
    public int getCapacityTEU() {
        return capacityTEU;
    }

    public void setCapacityTEU(int capacityTEU) {
        this.capacityTEU = capacityTEU;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }
    
    /*
    override of inherited methods
    */
    
    @Override
    public void boarding() {
        setContainer(getCapacityTEU());
    }

    @Override
    public void disembarkation() {
        setContainer(0);
    }

    @Override
    public String getType() {
        return "CONTAINER";
    }

}