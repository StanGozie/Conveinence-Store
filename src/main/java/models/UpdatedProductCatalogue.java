package models;

import interfaces.ProductService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UpdatedProductCatalogue implements ProductService {
    private ArrayList<Product> productList = new ArrayList<>();

//    public UpdatedProductCatalogue(ArrayList<Product> productList) {
//        this.productList = productList;
//    }

//    public UpdatedProductCatalogue() {
//    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }


    @Override
    public String toString() {
        return "UpdatedProductCatalogue{" +
                "productList=" + productList +
                '}';
    }

    public void readProductListFromCsv(String path){

        ArrayList<Product> listOfProducts = getProductList();
        String line1 = null;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(path));

//            buff.readLine(); // to read the first line
            while ((line1 = buff.readLine()) != null) {
                String[] catalogue = line1.split(",");
                Product myProduct = new Product(catalogue[0], catalogue[1], catalogue[2], Double.parseDouble(catalogue[3]), Integer.parseInt(catalogue[4]));
                listOfProducts.add(myProduct);
            }
            buff.close();
            setProductList(listOfProducts);

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Product> fetchProductList(){
        return productList;
    }



    @Override
    public String readProductsFromCsvFile(String path) {

        String line = " ";
        StringBuilder builder = new StringBuilder();
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);){
            while(( line = br.readLine()) != null){
                builder.append(line).append("\r");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }


}
