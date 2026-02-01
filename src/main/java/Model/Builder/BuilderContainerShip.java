package Model.Builder;

import Model.Entities.ContainerShip;

public class BuilderContainerShip implements Builder{
    
    private ContainerShip containerShip;
    
    @Override
    public void reset(){
        containerShip = new ContainerShip();
    }

    @Override
    public void setName(String name) {
        containerShip.setName(name);
    }

    @Override
    public void setImo(String imo) {
        containerShip.setImo(imo);
    }

    @Override
    public void setLength(double length) {
        containerShip.setLength(length);
    }
    
    @Override
    public void setBeam(double beam) {
        containerShip.setBeam(beam);
    }
    
    @Override
    public void setDraft(double draft) {
        containerShip.setDraft(draft);
    }

    
    @Override
    public void setCapacity(int capacity) {
        containerShip.setCapacity(capacity);
    }
    
    @Override
    public void setQuantity(int quantity) {
        containerShip.setQuantity(quantity);
    }

    @Override
    public ContainerShip getResult(){
        return containerShip;
    }
   
}
