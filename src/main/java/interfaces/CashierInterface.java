package interfaces;

import models.Customer;
import models.Product;

public interface CashierInterface {
        public String issuesSalesReceipts(Customer customer, Product productList);
}

//, int quantity, double price