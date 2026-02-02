package Model.Command;

import Model.Entities.Vessel;

public class DockCommand implements Command{
    private Receiver receiver;
    private Vessel vessel;

    public DockCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
        @Override
    public void execute() {
        receiver.calcularAtraque(vessel);
    }
    
}
