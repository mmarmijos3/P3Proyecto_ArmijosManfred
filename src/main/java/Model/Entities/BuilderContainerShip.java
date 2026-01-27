package Model.Entities;

public class BuilderContainerShip implements Builder{
    
    private String name;
    private String imo;     
    private double length;  
    private double bean;
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
    public void setBean(double bean) {
        this.bean = bean;
    }
    
    @Override
    public void setDraft(double draft) {
        this.draft = draft;
    }

    @Override
    public void setType(String type) {
        this.type = type;
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
        return new ContainerShip(capacityTEU, container, name, imo, length, bean, draft, type);
    }
   
}
