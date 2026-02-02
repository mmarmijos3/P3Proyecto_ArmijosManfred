package Model.Command;

import Model.Entities.Vessel;

/**
 *
 * @author Usuario
 */
public class CleanCommand implements Command{
    private Receiver receiver;
    private Vessel vessel;

    public CleanCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
    @Override
    public void execute() {
        receiver.aplicarClean(vessel);
    }
}
