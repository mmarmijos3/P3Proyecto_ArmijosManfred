
package Model.Command;

/**
 *
 * @author Manfred Armijos
 */
public class DiscountCommand implements Command{
    private BillReceiver receiver;
    private boolean load;
    private boolean unload;

    public DiscountCommand(BillReceiver receiver, boolean load, boolean unload) {
        this.receiver = receiver;
        this.load = load;
        this.unload = unload;
    }
    
        @Override
    public void execute() {
        receiver.applyDiscount(load, unload);
    }
}
