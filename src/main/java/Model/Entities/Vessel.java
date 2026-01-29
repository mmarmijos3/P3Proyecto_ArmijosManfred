package Model.Entities;

/**
 *
 * @author Armijos Manfred, Balseca Valeska
 */

public abstract class Vessel implements IDockable{
    private String name;    // Vessel name (e.g., "Man Arm", "Queen Val 2")
    private String imo;     // International Maritime Organization number (unique 7-digit identifier)
    private double length;  // Vessel length in meters (Length Overall - LOA)
    private double beam;
    private double draft;

    public Vessel(String name, String imo, double length, double beam, double draft) {
        this.name = name;
        this.imo = imo;
        this.length = length;
        this.beam = beam;
        this.draft = draft;
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

    public double getBeam() {
        return beam;
    }

    public void setBeam(double beam) {
        this.beam = beam;
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public abstract String getType();

    
    @Override
    public abstract void boarding();
    
    @Override
    public abstract void disembarkation();

}
