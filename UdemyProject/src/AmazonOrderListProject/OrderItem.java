package AmazonOrderListProject;

public class OrderItem {
    Product product;
    int quantity;

    // making constructor
    public OrderItem(){

    }
    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;

    }
}
