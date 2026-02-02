package Model.Command;

import Model.Entities.Vessel;

public class RefuelCommand implements Command{
    private Receiver receiver;
    private Vessel vessel;

    public RefuelCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
    @Override
    public void execute() {
        receiver.aplicarRefuel(vessel, 1200);
    }
}
