using System;

public class Feedback
{
    private int feedbackId;
    private int customerId;
    private string customerName;
    private string description;

    public Feedback(
        int feedbackId,
        int customerId,
        string customerName,
        string description
    )
    {
        this.feedbackId = feedbackId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.description = description;
    }

    public int GetFeedbackId()
    {
        return feedbackId;
    }

    public void DisplayFeedback()
    {
        Console.WriteLine("\n--- Feedback Details ---");

        Console.WriteLine("Feedback ID   : " + feedbackId);
        Console.WriteLine("Customer ID   : " + customerId);
        Console.WriteLine("Customer Name : " + customerName);
        Console.WriteLine("Description   : " + description);
    }
}