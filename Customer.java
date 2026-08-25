import java.util.ArrayList;

public class Customer extends User {

    // Customer-specific attribute
    private String address;

    // Customer can have multiple feedback records
    private ArrayList<Feedback> feedbackList;

    // Constructor
    public Customer(int userId, String userName, String email,
            String phone, String address) {

        super(userId, userName, email, phone);

        this.address = address;
        this.feedbackList = new ArrayList<>();
    }

    // Getter
    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Add feedback
    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
        System.out.println("Feedback added successfully.");
    }

    // Display all feedback
    public void displayFeedback() {

        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }

        System.out.println("\n--- Customer Feedback ---");

        for (Feedback feedback : feedbackList) {
            feedback.displayFeedback();
        }
    }

    // Display customer information
    public void displayCustomer() {
        System.out.println("Customer ID : " + getUserId());
        System.out.println("Name        : " + getUserName());
        System.out.println("Email       : " + getEmail());
        System.out.println("Phone       : " + getPhone());
        System.out.println("Address     : " + address);

        System.out.println("\n--- Customer Details ---");

        displayUser();

        System.out.println("Address   : " + address);
    }

    // Overriding parent method
    @Override
    public void showRole() {
        System.out.println("Role: Customer");
    }
}