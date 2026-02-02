package Model.Command;

import Model.Entities.Vessel;

public class LoadingCommand implements Command {
    private BillReceiver receiver;
    private Vessel vessel;
    private boolean isSelected;

    public LoadingCommand(BillReceiver receiver, Vessel vessel, boolean isSelected) {
        this.receiver = receiver;
        this.vessel = vessel;
        this.isSelected = isSelected;
    }
    
        @Override
    public void execute() {
        receiver.aplicarLoading(vessel, isSelected);
    }
}
