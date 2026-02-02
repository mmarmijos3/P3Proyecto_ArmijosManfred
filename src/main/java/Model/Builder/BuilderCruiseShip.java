package Model.Builder;

import Model.Entities.CruiseShip;

public class BuilderCruiseShip implements Builder{
    
    private CruiseShip cruiseShip;
    
    @Override
    public void reset(){
        cruiseShip = new CruiseShip();
    }

    @Override
    public void setName(String name) {
        cruiseShip.setName(name);
    }

    @Override
    public void setImo(String imo) {
        cruiseShip.setImo(imo);
    }
    
    @Override
    public void setCategory(String category) {
        cruiseShip.setCategory(category);
    }

    @Override
    public void setLength(double length) {
        cruiseShip.setLength(length);
    }
    
    @Override
    public void setBeam(double bean) {
        cruiseShip.setBeam(bean);
    }
    
    @Override
    public void setDraft(double draft) {
        cruiseShip.setDraft(draft);
    }
    
    @Override
    public void setCapacity(int capacity) {
        cruiseShip.setCapacity(capacity);
    }
    
    @Override
    public void setQuantity(int passengers) {
        cruiseShip.setQuantity(passengers);
    }

    @Override
    public CruiseShip getResult(){
        return cruiseShip;
    }
   
}
