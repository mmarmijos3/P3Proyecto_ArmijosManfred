package Model.Command;

import Model.Entities.Vessel;

/**
 *
 * @author Usuario
 */
public class MaintenanceCommand implements Command{
    private BillReceiver receiver;
    private Vessel vessel;
    private boolean isSelected;

    public MaintenanceCommand(BillReceiver receiver, Vessel vessel, boolean isSelected) {
        this.receiver = receiver;
        this.vessel = vessel;
        this.isSelected = isSelected;
    }
    
    @Override
    public void execute() {
        receiver.aplicarMaintenance(vessel, isSelected);
    }
}
