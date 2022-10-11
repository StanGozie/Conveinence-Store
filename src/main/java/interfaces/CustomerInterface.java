package interfaces;
import models.Customer;
import models.Product;
import models.UpdatedProductCatalogue;


public interface CustomerInterface {

    String customerToBuy(Product product, ProductService productService);

}
