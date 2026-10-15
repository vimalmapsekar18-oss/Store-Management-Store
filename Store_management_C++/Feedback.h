#ifndef FEEDBACK_H
#define FEEDBACK_H

#include <iostream>
#include <string>

using namespace std;

class Feedback
{
private:
    int feedbackId;
    int customerId;
    string customerName;
    string description;

public:
    Feedback(
        int feedbackId,
        int customerId,
        string customerName,
        string description
    );

    int getFeedbackId();

    void displayFeedback();
};

#endif