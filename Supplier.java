public class Supplier {

    private int supplierId;
    private String supplierName;
    private String email;
    private String phone;
    private String address;

    // Constructor
    public Supplier(int supplierId, String supplierName,
            String email, String phone, String address) {

        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public int getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Supplier method
    public void supplyProduct(Product product, int quantity) {

        System.out.println(
                supplierName + " supplied " +
                        quantity + " units of " +
                        product.getProductName());

        product.getStock().addStock(quantity);
    }

    // Display supplier
    public void displaySupplier() {

        System.out.println("\n--- Supplier Details ---");

        System.out.println("Supplier ID   : " + supplierId);
        System.out.println("Supplier Name : " + supplierName);
        System.out.println("Email         : " + email);
        System.out.println("Phone         : " + phone);
        System.out.println("Address       : " + address);
    }
}