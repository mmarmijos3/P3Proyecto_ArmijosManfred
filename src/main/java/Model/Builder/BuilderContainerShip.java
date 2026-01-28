package Model.Builder;

import Model.Entities.ContainerShip;

public class BuilderContainerShip implements Builder{
    
    private String name;
    private String imo;     
    private double length;  
    private double beam;
    private double draft;
    private String type;    
    private int capacityTEU;
    private int container;

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
    public void setBeam(double beam) {
        this.beam = beam;
    }
    
    @Override
    public void setDraft(double draft) {
        this.draft = draft;
    }

    
    @Override
    public void setCapacity(int capacity) {
        this.capacityTEU = capacity;
    }
    
    @Override
    public void setQuantity(int quantity) {
        this.container = quantity;
    }

    public ContainerShip getResult(){
        return new ContainerShip(capacityTEU, container, name, imo, length, beam, draft);
    }
   
}
