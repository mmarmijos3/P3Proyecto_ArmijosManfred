package Model.Command;

import Model.Entities.Vessel;

/**
 *
 * @author Usuario
 */
public class MaintenanceCommand implements Command{
    private Receiver receiver;
    private Vessel vessel;

    public MaintenanceCommand(Receiver receiver, Vessel vessel) {
        this.receiver = receiver;
        this.vessel = vessel;
    }
    
    @Override
    public void execute() {
        receiver.aplicarMaintenance(vessel);
    }
}
