package interfaces;

import models.Product;

import java.util.ArrayList;

public interface ProductService {

    void readProductListFromCsv (String filePath);

    ArrayList<Product> fetchProductList ();

    String readProductsFromCsvFile (String path);
}