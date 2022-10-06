package Models;
import Exceptions.InsufficientFundsException;
import MyInterfaces.CustomerInterface;

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
    public String customerToBuy(Customer customer, String productName, int productQuantity, UpdatedProductCatalogue catalogue, Cashier cashier) {
        String result = "";
       Product product = new Product();
    for (Product element: catalogue.getProductList()){
        if(element.getProductName().equals(productName)){
            product = element;
        }
    }
    if(productQuantity <= product.getUnitsInStock() && canBuy(product, productQuantity)){
        walletBalance -= productQuantity * product.getProductPrice();
        cashier.issuesSalesReceipts(customer, product, productQuantity);
        result = "Purchase Successful";
    }
    if(productQuantity > product.getUnitsInStock()){
            result = "Out Of Stock!";
    }
    return result;
    }

    public boolean canBuy(Product product, int quantity){
        if (walletBalance >= product.getProductPrice() * quantity){
            return true;
        }else{
            throw new InsufficientFundsException("Insufficient Funds");
        }
    }

}








