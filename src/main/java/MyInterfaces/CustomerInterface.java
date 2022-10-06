package MyInterfaces;
import Models.Cashier;
import Models.Customer;
import Models.Product;
import Models.UpdatedProductCatalogue;

public interface CustomerInterface {

    public String customerToBuy(Customer customer, String productName, int productQuantity, UpdatedProductCatalogue catalogue, Cashier cashier);

}
