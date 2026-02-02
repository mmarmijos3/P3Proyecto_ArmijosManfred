package Model.Command;

import Model.Entities.Vessel;

public class UnloadingCommand implements Command{
    private BillReceiver receiver;
    private Vessel vessel;
    private boolean isSelected;

    public UnloadingCommand(BillReceiver receiver, Vessel vessel, boolean isSelected) {
        this.receiver = receiver;
        this.vessel = vessel;
        this.isSelected = isSelected;
    }
    
    @Override
    public void execute() {
        receiver.aplicarUnloading(vessel, isSelected);
    }
}
