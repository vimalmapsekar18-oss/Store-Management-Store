public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private String description;

    // Relationships
    private Supplier supplier;
    private Stock stock;
    private Discount discount;

    // Constructor
    public Product(int productId,
            String productName,
            String category,
            double price,
            String description,
            Supplier supplier,
            Stock stock) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.description = description;
        this.supplier = supplier;
        this.stock = stock;
        this.discount = null;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Stock getStock() {
        return stock;
    }

    public Discount getDiscount() {
        return discount;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    // Apply discount
    public void applyDiscount(Discount discount) {

        this.discount = discount;

        System.out.println(
                "Discount applied to " + productName);
    }

    // Remove discount
    public void removeDiscount() {

        this.discount = null;

        System.out.println(
                "Discount removed from " + productName);
    }

    // Calculate final price
    public double getFinalPrice() {

        if (discount != null) {

            return discount.calculateFinalPrice(price);

        }

        return price;
    }

    // Purchase product
    public boolean purchaseProduct(int quantity) {

        if (stock.removeStock(quantity)) {

            System.out.println(
                    "Purchase successful: " +
                            quantity + " x " +
                            productName);

            System.out.println(
                    "Total Price: ₹" +
                            (getFinalPrice() * quantity));

            return true;
        }

        return false;
    }

    // Search/check product information
    public boolean matchesCategory(String category) {

        return this.category.equalsIgnoreCase(category);
    }

    // Display product
    public void displayProduct() {

        System.out.println("\n--- Product Details ---");

        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Category     : " + category);
        System.out.println("Price        : ₹" + price);
        System.out.println("Description  : " + description);

        if (supplier != null) {
            System.out.println(
                    "Supplier     : " +
                            supplier.getSupplierName());
        }

        if (discount != null) {
            System.out.println(
                    "Discount     : " +
                            discount.getPercentage() + "%");

            System.out.println(
                    "Final Price  : ₹" +
                            getFinalPrice());

        } else {

            System.out.println(
                    "Final Price  : ₹" + price);
        }

        if (stock != null) {
            System.out.println(
                    "Stock        : " +
                            stock.getQuantity());
        }
    }
}