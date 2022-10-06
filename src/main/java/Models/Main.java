package Models;


public class Main {

    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.setAge(32);
        applicant.setApplicantId("APP/401");
        applicant.setFirstName("Ngozi");
        applicant.setLastName("Okafor");
        applicant.setGender('F');
        applicant.setQualification("BS.c");
        applicant.setRoleAppliedFor("Cashier");


        Manager manager = new Manager();
        manager.setFirstName("Odinaka");
        manager.setLastName("Ekweozor");
        manager.setAge(44);
        manager.setGender('M');
        manager.setRole("Manager");
        manager.setStaffId("SID/002");

        Cashier cashier = new Cashier();
        cashier.setFirstName(applicant.getFirstName());
        cashier.setLastName(applicant.getLastName());
        cashier.setAge(applicant.getAge());
        cashier.setGender(applicant.getGender());
        cashier.setQualification(applicant.getQualification());
        cashier.setRole(applicant.getRoleAppliedFor());
        cashier.setStaffId("SID/105");

        String path = "/Users/decagon/IdeaProjects/DebbieStores/src/main/resources/Books.csv";
        UpdatedProductCatalogue catalogue1 = new UpdatedProductCatalogue();
        catalogue1.addToProductList(path);
        System.out.println(catalogue1.getProductList());
        Product product = new Product();
        product.setProductName("SMA Gold");

        Customer customer = new Customer();
        customer.setFirstName("Chisom");
        customer.setLastName("Chigozie");
        customer.setWalletBalance(10000.0);
        //System.out.println(customer.customerToBuy("SMA Gold", 2, 350.00, ));
        System.out.println(cashier.issuesSalesReceipts(customer,product,2));







    }
}

