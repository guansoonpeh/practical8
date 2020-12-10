package Q2;

public class InvoiceLine {

    private Product product;
    private int quantity;
    private double price;

    public InvoiceLine() {

    }

    public InvoiceLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = quantity * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    
//    public String toString(){
//
//    }
}
