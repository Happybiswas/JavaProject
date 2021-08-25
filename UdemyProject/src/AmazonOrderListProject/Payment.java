package AmazonOrderListProject;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment {
    enum PaymentType {CreditCard, BankTransfer}

    PaymentType paymentType;
    String accountNumber;
    String bankOrIssuer;
    double paymentAmount;
    Date paymentDate;

    public Payment( PaymentType paymentType, String accountNumber, String bankOrIssuer,
            double paymentAmount, Date paymentDate){
        this.paymentType = paymentType;
        this.accountNumber = accountNumber;
        this.bankOrIssuer = bankOrIssuer;
        this. paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM ,dd , yyyy");

    public String getPartialAccountNumber(){
        return "****" + accountNumber.substring(accountNumber.length()-4);

    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getBankOrIssuer() {
        return bankOrIssuer;
    }

    public String getFormattedPaymentAmount(){
        return formatter.format(paymentAmount);
    }
    public String getFormattedPaymentDate(){
        return formatter.format(paymentDate);
    }
}
