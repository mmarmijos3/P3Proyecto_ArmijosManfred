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
    
    private void setUniqueData(String name, String imo){
        builder.reset();
        builder.setName(name);
        builder.setImo(imo);
    }
    
    // Small luxury cruise ship standard
    public void contructCruiseShipBoutique(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("SMALL");
        builder.setLength(210);
        builder.setBeam(26);
        builder.setDraft(6.7);
        builder.setCapacity(600);
        builder.setQuantity(600 * quantity/100);
    }
    
    // Standard mid-size cruise ship standard
    public void contructCruiseShipStandard(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("MEDIUM");
        builder.setLength(325);
        builder.setBeam(37);
        builder.setDraft(8.3);
        builder.setCapacity(3950);
        builder.setQuantity(3950 * quantity/100);
    }
    
    // Large mega cruise ship standard
    public void contructCruiseShipMega(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("LARGE");
        builder.setLength(339);
        builder.setBeam(39);
        builder.setDraft(9);
        builder.setCapacity(4375);
        builder.setQuantity(4375 * quantity/100);
    }
    
    // Extra large icon-class cruise ship standard
    public void contructCruiseShipIcon(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("EXTRALARGE");
        builder.setLength(362);
        builder.setBeam(66);
        builder.setDraft(9.3);
        builder.setCapacity(6988);
        builder.setQuantity(6988 * quantity/100);
    }
    
    // Small feeder container ship standard
    public void contructContainerShipFeeder(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("SMALL");
        builder.setLength(172);
        builder.setBeam(27);
        builder.setDraft(10);
        builder.setCapacity(2500);
        builder.setQuantity(2500 * quantity/100);
    }

    // Medium Post-Panamax container ship standard
    public void contructContainerShipPostPanamax(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("MEDIUM");
        builder.setLength(347);
        builder.setBeam(43);
        builder.setDraft(14.5);
        builder.setCapacity(13500);
        builder.setQuantity(13500 * quantity/100);
    }
    
    // Large Neopanamax container ship standard
    public void contructContainerShipNeopanamax(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("LARGE");
        builder.setLength(366);
        builder.setBeam(48);
        builder.setDraft(15.2);
        builder.setCapacity(15500);
        builder.setQuantity(15500 * quantity/100);
    }
    
    // Extra large Ultra Large Container Ship standard
    public void contructContainerShipUltraLarge(String name, String imo, int quantity){
        setUniqueData(name, imo);
        builder.setCategory("EXTRALARGE");
        builder.setLength(400);
        builder.setBeam(61);
        builder.setDraft(16);
        builder.setCapacity(23756);
        builder.setQuantity(23756 * quantity/100);
    }
}