package AmazonOrderListProject;



public class Product {
   // enm class unchangeable variable like final
    enum Condition{ New, Used,Recondition}

      String productId;
      String productCategory;
      String productDescription;

    public double getPrice() {
        return price;
    }

      String soldBy;
     double price;
     Condition condition;

    //  constructor to inasilaize the object or class property
    public Product(  String productId, String productCategory, String productDescription, String soldBy, double price,
            Condition condition){
        this.productId = productId;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.soldBy = soldBy;
        this.price = price;
        this.condition = condition;

    }
    // to string method to print the variable value
    public String toString(){
        return productCategory+" "+ productDescription+" "+ soldBy+ " "+ price+ " "+ condition+" ";

    }
}
