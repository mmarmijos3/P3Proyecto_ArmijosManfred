package Model.Builder;

public class BuilderDirector {
    Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }
    
    public BuilderDirector() {}

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    private void setUniqueData(String name, String imo, int quantity){
        builder.reset();
        builder.setName(name);
        builder.setImo(imo);
        builder.setQuantity(quantity);
    }
    
    public void contructCruiseShipBoutique(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("SMALL");
        builder.setLength(220);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(1500);
    }
    
    public void contructCruiseShipStandard(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("MEDIUM");
        builder.setLength(300);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(3500);
    }
    public void contructCruiseShipMega(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("LARGE");
        builder.setLength(340);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(5500);
    }
    public void contructCruiseShipIcon(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("EXTRALARGE");
        builder.setLength(365);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(7600);
    }
    
    public void contructContainerShipFeeder(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("SMALL");
        builder.setLength(200);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(3000);
    }

    public void contructContainerShipPostPanamax(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("MEDIUM");
        builder.setLength(350);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(10000);
    }
    public void contructContainerShipNeopanamax(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("LARGE");
        builder.setLength(366);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(14500);
    }
    public void contructContainerShipUltraLarge(String name, String imo, int quantity){
        setUniqueData(name, imo, quantity);
        builder.setCategory("EXTRALARGE");
        builder.setLength(400);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(24000);
    }
    
}
