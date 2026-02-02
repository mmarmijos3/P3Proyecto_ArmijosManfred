package Model.Entities;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

public class CruiseShip extends Vessel{
    private int passengerCapacity;
    private int passengers;

    public CruiseShip(
        int passengerCapacity, 
        int passengers, 
        String name, 
        String imo, 
        String category,
        double length, 
        double beam, 
        double draft
    ) 
    {
        super(name, imo, category, length, beam, draft);
        this.passengerCapacity = passengerCapacity;
        this.passengers = passengers;
    }

    public CruiseShip() {
    }
    

    @Override
    public int getCapacity() {
        return passengerCapacity;
    }

    @Override
    public void setCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getQuantity() {
        return passengers;
    }

    @Override
    public void setQuantity(int passengers) {
        this.passengers = passengers;
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
        return "CRUISE";
    }

}
