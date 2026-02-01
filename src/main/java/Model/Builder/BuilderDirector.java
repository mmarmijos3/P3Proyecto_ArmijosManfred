package Model.Builder;

public class BuilderDirector {
    
    private void setUniqueData(Builder builder, String name, String imo, int quantity){
        builder.setName(name);
        builder.setImo(imo);
        builder.setQuantity(quantity);
    }
    
    public void contructCruiseShipBoutique(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(220);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(1500);
    }
    
    public void contructCruiseShipStandard(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(300);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(3500);
    }
    public void contructCruiseShipMega(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(340);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(5500);
    }
    public void contructCruiseShipIcon(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(365);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(7600);
    }
    
   
    public void contructContainerShipFeeder(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(200);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(3000);
    }

    public void contructContainerShipPostPanamax(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(350);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(10000);
    }
    public void contructContainerShipNeopanamax(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(366);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(14500);
    }
    public void contructContainerShipUltraLarge(Builder builder, String name, String imo, int quantity){
        setUniqueData(builder, name, imo, quantity);
        builder.setLength(400);
        builder.setBeam(30);
        builder.setDraft(30);
        builder.setCapacity(24000);
    }
    
}
