public class Stock {

    private int stockId;
    private int quantity;
    private int minimumStockLevel;

    // Constructor
    public Stock(int stockId, int quantity, int minimumStockLevel) {

        this.stockId = stockId;
        this.quantity = quantity;
        this.minimumStockLevel = minimumStockLevel;
    }

    // Getters
    public int getStockId() {
        return stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinimumStockLevel() {
        return minimumStockLevel;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMinimumStockLevel(int minimumStockLevel) {
        this.minimumStockLevel = minimumStockLevel;
    }

    // Add stock
    public void addStock(int quantity) {

        if (quantity > 0) {
            this.quantity += quantity;

            System.out.println(
                    quantity + " units added to stock.");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    // Remove stock
    public boolean removeStock(int quantity) {

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return false;
        }

        if (quantity > this.quantity) {
            System.out.println("Insufficient stock.");
            return false;
        }

        this.quantity -= quantity;

        System.out.println(
                quantity + " units removed from stock.");

        return true;
    }

    // Check stock
    public void checkStock() {

        if (quantity <= minimumStockLevel) {

            System.out.println(
                    "WARNING: Stock is running low!");

        } else {

            System.out.println(
                    "Stock level is sufficient.");
        }
    }

    // Display stock
    public void displayStock() {

        System.out.println("\n--- Stock Details ---");

        System.out.println("Stock ID            : " + stockId);
        System.out.println("Available Quantity  : " + quantity);
        System.out.println("Minimum Stock Level : " + minimumStockLevel);
    }
}