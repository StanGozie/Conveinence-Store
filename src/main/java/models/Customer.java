package models;
import exceptions.OutOfStockException;
import interfaces.CashierInterface;
import interfaces.CustomerInterface;
import exceptions.PurchaseUnsuccessfulException;
import interfaces.ProductService;

import java.util.ArrayList;

public class Customer extends Person implements CustomerInterface{

    private String customerId;
    private String address;
    private int quantity;
    private  Double walletBalance;

    private ArrayList<Product> cart = new ArrayList<>();

    public Customer(String firstName, String lastName, int age, char gender, String customerId, String address, int quantity, Double walletBalance, ArrayList<Product> cart) {
        super(firstName, lastName, age, gender);
        this.customerId = customerId;
        this.address = address;
        this.quantity = quantity;
        this.walletBalance = walletBalance;
        this.cart = cart;
    }

    public String getCustomerId() {return customerId;}

    public void setCustomerId(String customerId) {this.customerId = customerId;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public Double getWalletBalance() {return walletBalance;}

    public void setWalletBalance(Double walletBalance) {this.walletBalance = walletBalance;}

    public ArrayList<Product> getCart() {return cart;}

    public void setCart(ArrayList<Product> cart) {this.cart = cart;}

    @Override
    public String customerToBuy(Product product, ProductService productService) {
        String result = "";
        double newWalletBalance;
        int newAmountInStock;


        if(getQuantity() > product.getUnitsInStock()) {

            throw new OutOfStockException("Out Of Stock!");
        }
        //if(product.getProductName().equals()) I want to state a logic that allows the customer buy more than one item.

        if(getQuantity() <= product.getUnitsInStock() && walletBalance > getQuantity() * product.getProductPrice()) {

                result = "Purchase Successful";
        }

        else {
            throw new PurchaseUnsuccessfulException("Transaction is not successful");
        }

        newWalletBalance = walletBalance - (getQuantity() * product.getProductPrice());
        System.out.println("Balance in Customer's wallet: " + newWalletBalance);

        System.out.println(" ");

        newAmountInStock = product.getUnitsInStock() - getQuantity();
        System.out.println("StockBalance: " + newAmountInStock);

        System.out.println(" ");

        return result;


    }


    }










