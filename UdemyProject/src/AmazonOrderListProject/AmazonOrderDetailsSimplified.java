package AmazonOrderListProject;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AmazonOrderDetailsSimplified {


    public static void main(String[] args) {

        // create class object
        AmazonOrderDetailsSimplified amazonOd = new AmazonOrderDetailsSimplified();

        // Product  class
        ArrayList<Product> products = new ArrayList<>();
        amazonOd.addProducts(products);

        // OrderItems class
        ArrayList<OrderItem> oderItems = new ArrayList<>();
        oderItems = amazonOd.createOrderItems(products);

        // customer class
        Customer customer = new Customer("102", "Happy Biswas", "784 Elton Farm Circle", "Glen Mills PA ", "USA");

        Order order = amazonOd.createOrder(oderItems, customer);
        amazonOd.createShipment(order);
        amazonOd.createPayment(order);
        amazonOd.PrintOrderDetails(order);
        amazonOd.printInvoice(order);

    }
    public void PrintOrderDetails(Order order) {

        System.out.println("**************");
        System.out.println("order details");
        System.out.println("**************");
        System.out.println("order on" + order.getFormattedOrderDate() + "order #" + order.getOrderNumber());
        System.out.println("Shipping Address");
        System.out.println(order.getCustomer().getCustomerName());
        System.out.println(order.getCustomer().getStressAddress());
        System.out.println(order.getCustomer().getCityStateZip());
        System.out.println(order.getCustomer().getCountry());
        System.out.println("Payment Method ");
        System.out.println(order.getPayment().getBankOrIssuer());
        System.out.println(order.getPayment().getPartialAccountNumber());
        System.out.println("order summery");
        System.out.println("items Subtotal");
        System.out.println(order.getFormattedItemsSubtotal());
        System.out.println("Shipping and Handling");
        System.out.println(order.getShippingHandlingFormatted());
        System.out.println("Total before tax");
        System.out.println(order.getTotalBeforeTaxes());
        System.out.println("Estimated tax to be collected ");
        System.out.println(order.getFormattedEstimatedTaxes());
        System.out.println("Grand Total");
        System.out.println(order.getFormattedGrandTotal() + "\n");
        System.out.println(order.getShipmentStatusAndDate() + "\n");

        for (OrderItem item : order.orderItems) {
            System.out.println(item.product.productDescription);
            // System.out.println("quantity:" + item.quantity);
            System.out.println("Sold By:" + item.product.soldBy);
            System.out.println("sold By:" + item.product.price);
            System.out.println("Condition:" + item.product.condition);

        }
    }

    // to create customer order we create this method
    public Order createOrder(ArrayList<OrderItem> orderItems, Customer customer) {
        // inisialize the order class
        Order order = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        order = new Order("121-58548-7985479", new Date(), orderItems, 7.50, customer);

        return order;
    }

    public ArrayList<OrderItem> createOrderItems(ArrayList<Product> products) {

        ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();

        for (int i = 0; i <= products.size()-1; i++) {
           // if (i % 2 != 0) {
                orderItems.add(new OrderItem(products.get(i), i));

          //  }

        }
        return orderItems;
    }

    public void addProducts(ArrayList<Product> products) {
        products.add(new Product("101-25", "Books", "Basic Java",
                "Amazon.com", 8.99, Product.Condition.New));

        products.add(new Product("101-26", "Books", "GITOBITAN",
                "Amazon.com", 10.99, Product.Condition.New));

        products.add(new Product("101-27", "Books", " Design and Development",
                "Amazon.com", 9.99, Product.Condition.New));

        products.add(new Product("101-28", "Books", "Fundamental CyberSecurity",
                "Amazon.com", 8.99, Product.Condition.New));

        products.add(new Product("101-29", "Books", "Software Development",
                "Amazon.com", 5.99, Product.Condition.New));

        products.add(new Product("101-30", "Books", "Basic Wen Design and Development",
                "Amazon.com", 7.99, Product.Condition.Used));
    }

    public void createShipment(Order order) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Shipment shipment = new Shipment("121212", "UPS", Shipment.ShipmentStatus.Delivered, "ya4215522155225",
                    dateFormat.parse("08/22/2021"), dateFormat.parse("08/25/2021"), Shipment.ShipmentSpeed.TwoDay);
            order.shipment = shipment;
        } catch (Exception e) {
            System.out.println(" Just Exception");
        }
    }

    public void createPayment(Order order) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            order.payment = new Payment(Payment.PaymentType.CreditCard, "0101217895", "Amazon.com visa", order.getGrandTotal(),
                    dateFormat.parse("08/22/2021"));
        } catch (Exception e) {
            System.out.println("Just Exception");
        }
    }

    public void printInvoice(Order order) {

            System.out.println("\n***********************************************************");
            System.out.println("Final Invoice Details for Order #" + order.getOrderNumber());
            System.out.println("***********************************************************\n");
            System.out.println("Order Placed: " + order.getFormattedOrderDate());
            System.out.println("Amazon.com order number: " + order.getOrderNumber());
            System.out.println("Order Total: " + order.getFormattedItemsSubtotal() + "\n");
            System.out.println("Shipped on " + order.shipment.getFormattedShippedDate() + "\n");
            System.out.println("Items Ordered/Price\n ");
            for (OrderItem item : order.orderItems) {
                System.out.println(item.product.productDescription);
                System.out.println("Quantity: " + item.quantity);
                System.out.println("Sold by: " + item.product.soldBy);
                System.out.println("Price : " + item.product.price);
                System.out.println("Condition: " + item.product.condition + "\n");
            }
            System.out.println("Shipping Address\n");
            System.out.println(order.getCustomer().getCustomerName());
            System.out.println(order.getCustomer().getStressAddress());
            System.out.println(order.getCustomer().getCityStateZip());
            System.out.println(order.getCustomer().getCountry() + "\n");
            System.out.println("Shipping Speed:");
            System.out.println(order.shipment.shipmentSpeed);
            System.out.println("Payment Method:");
            System.out.println("Signature | " + order.payment.getPartialAccountNumber());
            System.out.println("Rewards Points\n");
            System.out.print("Item(s) Subtotal: ");
            System.out.println(order.getFormattedItemsSubtotal());
            System.out.print("Shipping and Handling: ");
            System.out.println(order.getShippingHandlingFormatted() + "\n");
            System.out.print("Total before tax:  ");
            System.out.println(order.getTotalBeforeTaxes());
            System.out.print("Estimated tax to be collected: ");
            System.out.println(order.getFormattedEstimatedTaxes() + "\n");
            System.out.print("Grand Total: ");
            System.out.println(order.getFormattedGrandTotal() + "\n");
            System.out.println("Billing Address\n");
            System.out.println(order.getCustomer().getCustomerName());
            System.out.println(order.getCustomer().getStressAddress());
            System.out.println(order.getCustomer().getCityStateZip());
            System.out.println(order.getCustomer().getCountry() + "\n");
            System.out.println("Credit Card Transactions: ");
            System.out.println(order.payment.getBankOrIssuer() + " ending in " + order.payment.getPartialAccountNumber() + ": " + order.payment.getFormattedPaymentDate() + ": " + order.payment.getFormattedPaymentAmount());
        }



}
