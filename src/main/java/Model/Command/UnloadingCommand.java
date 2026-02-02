package Model.Command;

import Model.Entities.Vessel;

public class UnloadingCommand implements Command{
    private Receiver receiver;
    private Vessel vessel;

    public UnloadingCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
    @Override
    public void execute() {
        receiver.aplicarUnloading(vessel);
    }
}
