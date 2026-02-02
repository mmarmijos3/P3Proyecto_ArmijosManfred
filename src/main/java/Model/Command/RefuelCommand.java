package Model.Command;

import Model.Entities.Vessel;

public class RefuelCommand implements Command{
    private BillReceiver receiver;
    private Vessel vessel;
    private boolean isSelected;

    public RefuelCommand(BillReceiver receiver, Vessel vessel, boolean isSelected) {
        this.receiver = receiver;
        this.vessel = vessel;
        this.isSelected = isSelected;
    }
    
    @Override
    public void execute() {
        receiver.aplicarRefuel(vessel, isSelected);
    }
}
