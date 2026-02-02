package Model.Builder;

import Model.Entities.Vessel;

public interface Builder {
    public void reset();
    public void setName(String name);
    public void setImo(String imo);
    public void setCategory(String category);
    public void setLength(double lenght);
    public void setBeam(double beam);
    public void setDraft(double draft);
    public void setCapacity(int capacity);
    public void setQuantity(int quantity);
    public Vessel getResult();
}
