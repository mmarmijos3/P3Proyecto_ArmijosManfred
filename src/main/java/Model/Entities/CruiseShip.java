package Model.Entities;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

public class CruiseShip extends Vessel{
    private int passengerCapacity;
    private int passengers;

    public CruiseShip(int passengerCapacity, int passengers, String name, String imo, double length, double bean, double draft) {
        super(name, imo, length, bean, draft);
        this.passengerCapacity = passengerCapacity;
        this.passengers = passengers;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    
    @Override
    public void boarding() {
        setPassengers(getPassengerCapacity());
    }

    @Override
    public void disembarkation() {
        setPassengers(0);
    }

    @Override
    public String getType() {
        return "CRUISE";
    }

}
