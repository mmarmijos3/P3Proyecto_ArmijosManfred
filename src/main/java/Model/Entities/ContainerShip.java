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

    public ContainerShip(
        int capacityTEU,
        int container, 
        String name, 
        String category, 
        String imo, 
        double length,
        double beam, 
        double draft
    ) 
    {
        super(name, imo, category, length, beam, draft);
        this.capacityTEU = capacityTEU;
        this.container = container;
    }

    public ContainerShip() {
        
    }
    
    @Override
    public int getCapacity() {
        return capacityTEU;
    }

    @Override
    public void setCapacity(int capacityTEU) {
        this.capacityTEU = capacityTEU;
    }

    @Override
    public int getQuantity() {
        return container;
    }

    @Override
    public void setQuantity(int container) {
        this.container = container;
    }
    
    @Override
    public void boarding() {
        setQuantity(getCapacity());
    }

    @Override
    public void disembarkation() {
        setQuantity(0);
    }

    @Override
    public String getType() {
        return "CONTAINER";
    }

}