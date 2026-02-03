package Model.Command;

import Model.Entities.Vessel;

public class DockCommand implements Command{
    private BillReceiver receiver;
    private Vessel vessel;

    public DockCommand(BillReceiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
        @Override
    public void execute() {
        receiver.aplicarAtraque(vessel);
    }
    
}
