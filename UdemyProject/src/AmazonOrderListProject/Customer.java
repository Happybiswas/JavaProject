package AmazonOrderListProject;

public class Customer {
    String customerId;
    String customerName;
    String stressAddress;
    String country;
    String cityStateZip;
   // empty constructor

    //parameteras constructor
    public Customer(String customerId,String customerName, String stressAddress,
            String cityStateZip,String country){
    this.customerId = customerId;
    this.customerName= customerName;
    this.stressAddress = stressAddress;
    this.country = country;
    this.cityStateZip = cityStateZip;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStressAddress() {
        return stressAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }



}
