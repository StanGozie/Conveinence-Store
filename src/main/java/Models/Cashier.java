package Models;
import MyInterfaces.CashierInterface;

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
    public String issuesSalesReceipts(Customer customer, Product product, int quantity) {
        String receipt = "-------- Customer Receipt ------- \n\n" + "Customer Name: " + customer.getFirstName() + " " + customer.getLastName() + "\n" + "Customer ID: " + customer.getCustomerId() +
                    "\n" + "Product name: " + product.getProductName() + "\n" + "Order Quantity: " + quantity + "\n" +
                    "Payment status: " + "Payment received." + "\n" + "Thank you for your patronage!" + "\n" + "We look forward to seeing you another time.";;

//        else {
//            receipt = "Transaction Unsuccessful";
//        }
        return receipt;

    }
}


