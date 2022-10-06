package MyInterfaces;

import Models.Customer;
import Models.Product;
import Models.UpdatedProductCatalogue;

public interface CashierInterface {
        public String issuesSalesReceipts(Customer customer, Product product, int quantity);
}
