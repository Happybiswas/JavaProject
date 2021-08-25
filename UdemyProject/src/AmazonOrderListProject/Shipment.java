package AmazonOrderListProject;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Shipment {
    // enum class
    enum ShipmentStatus{InProcess, Shipped, Delivered}
    enum ShipmentSpeed { OneDay,TwoDay, Mail}
    // declare variable
    String shipmentId;
    String carrier;
    ShipmentStatus shipmentStatus;
    String trackingId;
    Date shippedDate;
    Date deliveryDate;
    ShipmentSpeed shipmentSpeed;



    public Shipment(String shipmentId, String carrier, ShipmentStatus shipmentStatus, String trackingId, Date shippedDate,
                    Date deliveryDate, ShipmentSpeed shipmentSpeed){

        this.shipmentId = shipmentId;
        this.carrier = carrier;
        this.shipmentStatus = shipmentStatus;
        this.trackingId = trackingId;
        this.shippedDate = shippedDate;
        this.deliveryDate = deliveryDate;
        this.shipmentSpeed = shipmentSpeed;

    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

    // date format method  for shipped date
    public String getFormattedShippedDate(){
        return dateFormat.format(shippedDate);
    }
    // date format method for delivery date
    public String getFormattedDeliveryDate(){
        return dateFormat.format(deliveryDate);

    }


}
