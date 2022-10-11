package models;


import interfaces.ProductService;
//import interfaces.ProductService;

public class Main {

    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.setAge(32);
        applicant.setApplicantId("APP/401");
        applicant.setFirstName("Ngozi");
        applicant.setLastName("Okafor");
        applicant.setGender('F');
        applicant.setQualification("B.Sc");
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
        catalogue1.readProductListFromCsv(path);
        System.out.println(catalogue1.getProductList());

        System.out.println(" ");
        System.out.println(" ");

      Product product = new Product();
      product.setProductName("SMA Gold");
      product.setUnitsInStock(3);
      product.setProductPrice(350.00);
      product.setProductId("BF/001");
      product.setProductCategory("Baby Food");

        Customer customer = new Customer();
        customer.setFirstName("Chisom");
        customer.setLastName("Chigozie");
        customer.setCustomerId("1122");
        customer.setQuantity(2);
        customer.setWalletBalance(5000.00);

      Product product1 = new Product();
      product1.setProductCategory("Groceries");
      product1.setProductName("Milo");
      product1.setUnitsInStock(1);
      product1.setProductPrice(350.00);
      product1.setProductId("EL/1122");


        Customer customer1 = new Customer();
        customer1.setWalletBalance(1600.00);
        customer1.setFirstName("Cheta");
        customer1.setQuantity(1);


        System.out.println(customer.customerToBuy(product, getProductService()));
        System.out.println(" ");
        System.out.println(cashier.issuesSalesReceipts(customer, product));
        System.out.println(" ");
        System.out.println(customer1.customerToBuy(product1, getProductService()));
        System.out.println(" ");
        System.out.println(cashier.issuesSalesReceipts(customer1, product1));
        System.out.println(" ");
        //System.out.println(manager.hiresCashier(applicant));


    }
    private static ProductService getProductService() {
        return new UpdatedProductCatalogue();
    }
}




