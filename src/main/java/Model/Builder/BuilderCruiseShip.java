package Model.Builder;

import Model.Entities.CruiseShip;

public class BuilderCruiseShip implements Builder{
    
    private String name;
    private String imo;     
    private double length;  
    private double beam;
    private double draft;
    private String type;    
    private int passengerCapacity;
    private int passengers;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setImo(String imo) {
        this.imo = imo;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public void setBeam(double bean) {
        this.beam = beam;
    }
    
    @Override
    public void setDraft(double draft) {
        this.draft = draft;
    }
    
    @Override
    public void setCapacity(int capacity) {
        this.passengerCapacity = capacity;
    }
    
    @Override
    public void setQuantity(int passengers) {
        this.passengers = passengers;
    }

    public CruiseShip getResult(){
        return new CruiseShip(passengerCapacity, passengers, name, imo, length, beam, draft);
    }
   
}
