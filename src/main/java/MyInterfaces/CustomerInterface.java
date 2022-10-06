package MyInterfaces;
import Models.Cashier;
import Models.Customer;
import Models.Product;
import Models.UpdatedProductCatalogue;

public interface CustomerInterface {

    public String customerToBuy(String productName, int productQuantity, double productPrice, Double walletBalance, UpdatedProductCatalogue catalogue);

}
