package AmazonOrderListProject;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    static final  double taxRate = 0.06;
   // initialized the product class
    Product product;
   // variable declaration
    String orderNumber;
    Date orderDate;
    ArrayList<OrderItem>orderItems;
    double itemsSubtotal;
    double shippingHandling;
    double tax;
    double grandTotal;
    Customer customer;
    Shipment shipment;
    Payment payment;
  // to

    public Order(String orderNumber, Date orderDate, ArrayList<OrderItem>orderItems, double shippingHandling, Customer customer
                  ) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.shippingHandling = shippingHandling;
        this.payment = payment;
        this.customer = customer;
    }
  // public Order(){}

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd,yyyy");

        public String getFormattedOrderDate(){
            return dateFormat.format(orderDate);
        }
        public String getShippingHandlingFormatted(){
            return formatter.format(shippingHandling);
        }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getItemsSubtotal(){
            double subtotal = 0;

            for (OrderItem item : orderItems){
              subtotal = subtotal + (item.quantity* item.product.getPrice());
            }
            itemsSubtotal = subtotal;
            return subtotal;
    }

    public  double getEstimatedTaxes(){
            tax = (getItemsSubtotal()* taxRate)+shippingHandling;
        return tax;
    }

    public double getGrandTotal() {
            grandTotal = getItemsSubtotal() + shippingHandling  +getEstimatedTaxes();
        return grandTotal;
    }

    public String getFormattedItemsSubtotal(){
        return  formatter.format(getItemsSubtotal());
    }

    public String getTotalBeforeTaxes(){
            return formatter.format(getItemsSubtotal()+shippingHandling);

    }
    public String getFormattedEstimatedTaxes(){
            return formatter.format(getEstimatedTaxes());
    }
    public  String getFormattedGrandTotal(){
            return formatter.format(getItemsSubtotal()+shippingHandling+getEstimatedTaxes());

    }
    public String getShipmentStatusAndDate(){
            if(shipment.shipmentStatus == Shipment.ShipmentStatus.Delivered){
                return shipment.shipmentStatus.name()+ " " + dateFormat.format(shipment.deliveryDate);
            }
            return shipment.shipmentStatus.name()+ " " + dateFormat.format(shipment.shippedDate);
    }




}
