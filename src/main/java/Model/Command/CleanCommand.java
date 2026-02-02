package Model.Command;

import Model.Entities.Vessel;

/**
 *
 * @author Usuario
 */
public class CleanCommand implements Command{
    private BillReceiver receiver;
    private Vessel vessel;
    private boolean isSelected;

    public CleanCommand(BillReceiver receiver, Vessel vessel, boolean isSelected) {
        this.receiver = receiver;
        this.vessel = vessel;
        this.isSelected = isSelected;
    }
    
    @Override
    public void execute() {
        receiver.aplicarClean(vessel, isSelected);
    }
}
