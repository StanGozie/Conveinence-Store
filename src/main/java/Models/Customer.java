package Models;
import Exceptions.InsufficientFundsException;
import Exceptions.OutOfStockException;
import MyInterfaces.CustomerInterface;
import Exceptions.PurchaseUnsuccessfulException;

public class Customer extends Person implements CustomerInterface {

    private String customerId;
    private String address;
    private  Double walletBalance;

    public Customer(String firstName, String lastName, int age, char gender, String customerId, String address, Double walletBalance) {
        super(firstName, lastName, age, gender);
        this.customerId = customerId;
        this.address = address;
        this.walletBalance = walletBalance;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public String customerToBuy(String productName, int productQuantity, double productPrice, Double walletBalance, UpdatedProductCatalogue catalogue) {
        String result = "";
       Product product = new Product();
    for (Product element: catalogue.getProductList()){
        if(element.getProductName().equals(productName)){
            product = element;
        }
        if(productQuantity > product.getUnitsInStock()) {
            throw new OutOfStockException("Out Of Stock!");
        }
        if(productQuantity <= product.getUnitsInStock() && walletBalance > productQuantity * product.getProductPrice() ){
                result = "Purchase Successful";
        }
        else {
                throw new PurchaseUnsuccessfulException("Transaction is not successful");

        }
    }

    return result;
    }

//    public boolean canBuy(Product product, int quantity, double ){
//        if (walletBalance >= product.getProductPrice() * quantity){
//            return true;
//        }else{
//            throw new InsufficientFundsException("Insufficient Funds");
//        }
//    }
//
}








