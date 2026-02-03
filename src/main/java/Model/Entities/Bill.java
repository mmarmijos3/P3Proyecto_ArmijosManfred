
package Model.Entities;

/**
 *
 * @author Manfred Armijos
 */
public class Bill {
    
    private double subtotal;
    private double discount;
    private double tax;
    private double total;

    public Bill() {
        this.subtotal = 0.0;
        this.discount = 0.0;
        this.tax = 0.0;
        this.total = 0.0;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void cleanBill(){
        setSubtotal(0);
        setDiscount(0);
        setTax(0);
        setTotal(0);
    }
    
    public void calculateDiscount(double discountRate) {
        setDiscount(getSubtotal() * discountRate);
    }
    
    public void calculateTax(double taxRate) {
        setTax(getSubtotal() * taxRate);
    }
    
    public void calculateTotal() {
        setTotal(getSubtotal() + getTax());
    }
    
    public Object[] getInfoBill() {
        Object[] detail = new Object[4];
        
        detail[0] = getSubtotal();
        detail[1] = getDiscount();
        detail[2] = getTax();
        detail[3] = getTotal();
        
        return detail;
    }
    
}
