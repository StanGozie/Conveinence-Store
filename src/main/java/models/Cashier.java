package models;
import exceptions.PurchaseUnsuccessfulException;
import interfaces.CashierInterface;


public class Cashier extends Staff implements CashierInterface {
    private String qualification;

    public Cashier() {
    }


    public Cashier(String firstName, String lastName, int age, char gender, String staffId, String role, String qualification) {
        super(firstName, lastName, age, gender, staffId, role);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    @Override
    public String issuesSalesReceipts(Customer customer, Product productList) {


                String receipt = "-------- Customer Receipt ------- \n" + "Customer Name: " + customer.getFirstName() + " " + customer.getLastName() + "\n" + "Customer ID: " + customer.getCustomerId() +
                    "\n" + "Product name: " + productList.getProductName() + "\n" + "Order Quantity: " + customer.getQuantity() + "\n" + "Unit Price: " + productList.getProductPrice() + "\n" + "Total: " + productList.getProductPrice() * customer.getQuantity() + "\n" +
                    "Payment status: " + "Payment received." + "\n" + "Thank you for your patronage!" + "\n" + "We look forward to seeing you another time.";


            return receipt;

    }

}


