#include "Feedback.h"

Feedback::Feedback(
    int feedbackId,
    int customerId,
    string customerName,
    string description
)
{
    this->feedbackId = feedbackId;
    this->customerId = customerId;
    this->customerName = customerName;
    this->description = description;
}

int Feedback::getFeedbackId()
{
    return feedbackId;
}

void Feedback::displayFeedback()
{
    cout << "\n--- Feedback Details ---" << endl;

    cout << "Feedback ID   : " << feedbackId << endl;
    cout << "Customer ID   : " << customerId << endl;
    cout << "Customer Name : " << customerName << endl;
    cout << "Description   : " << description << endl;
}