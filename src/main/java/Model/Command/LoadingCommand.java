package Model.Command;

import Model.Entities.Vessel;

public class LoadingCommand implements Command {
    private Receiver receiver;
    private Vessel vessel;

    public LoadingCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
        @Override
    public void execute() {
        receiver.aplicarLoading(vessel);
    }
}
