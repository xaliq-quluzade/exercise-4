package task1;

public class Product {
    static int productCount = 0;
    static String companyName;

    static {
        companyName = "MyCompany";
    }

    int productID = 1000;
    String productName;

    {
        productID = productID + productCount++;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public void printInfo() {
        System.out.println("Company name : " + companyName + "\n" + "Product ID : " +
                this.productID + "\n" + "Product name : " + this.productName);
    }
}
