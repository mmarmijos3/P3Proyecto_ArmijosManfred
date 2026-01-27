package Model.Entities;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

public abstract class Vessel implements IDockable{
    private String name;    // Vessel name (e.g., "Man Arm", "Queen Val 2")
    private String imo;     // International Maritime Organization number (unique 7-digit identifier)
    private double length;  // Vessel length in meters (Length Overall - LOA)
    private double bean;
    private double draft;
    private String type;    // Vessel type ("CONTAINER" or "CRUISE")

    public Vessel(String name, String imo, double length, double bean, double draft, String type) {
        this.name = name;
        this.imo = imo;
        this.length = length;
        this.bean = bean;
        this.draft = draft;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBean() {
        return bean;
    }

    public void setBean(double bean) {
        this.bean = bean;
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    @Override
    public abstract void boarding();
    
    @Override
    public abstract void disembarkation();

}
