public class Discount {

    private int discountId;
    private double percentage;
    private String description;

    // Constructor
    public Discount(int discountId, double percentage,
            String description) {

        this.discountId = discountId;
        this.percentage = percentage;
        this.description = description;
    }

    // Getters
    public int getDiscountId() {
        return discountId;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setPercentage(double percentage) {

        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println(
                    "Discount must be between 0 and 100.");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Calculate discount amount
    public double calculateDiscount(double price) {

        return price * percentage / 100;
    }

    // Calculate final price
    public double calculateFinalPrice(double price) {

        double discountAmount = calculateDiscount(price);

        return price - discountAmount;
    }

    // Display discount
    public void displayDiscount() {

        System.out.println("\n--- Discount Details ---");

        System.out.println("Discount ID : " + discountId);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Description : " + description);
    }
}