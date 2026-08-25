public class Feedback {

    private int feedbackId;
    private String message;
    private int rating;

    // Constructor
    public Feedback(int feedbackId, String message, int rating) {

        this.feedbackId = feedbackId;
        this.message = message;

        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            this.rating = 1;
        }
    }

    // Getters
    public int getFeedbackId() {
        return feedbackId;
    }

    public String getMessage() {
        return message;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setRating(int rating) {

        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println(
                    "Rating must be between 1 and 5.");
        }
    }

    // Display feedback
    public void displayFeedback() {

        System.out.println(
                "Feedback ID: " + feedbackId);

        System.out.println(
                "Rating     : " + rating + "/5");

        System.out.println(
                "Message    : " + message);

        System.out.println("-------------------------");
    }
}