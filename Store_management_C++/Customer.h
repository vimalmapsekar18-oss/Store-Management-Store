#ifndef CUSTOMER_H
#define CUSTOMER_H

#include "User.h"
#include <vector>

class Stock;
class Services;
class Feedback;

class Customer : public User
{
private:
    int custId;
    string custName;
    string address;

    vector<Stock*> checkedStocks;
    vector<Services*> services;
    vector<Feedback*> feedbackList;

public:
    Customer(
        int custId,
        string custName,
        string phone,
        string address
    );

    int getCustId();
    string getCustName();
    string getAddress();

    void checkStock(Stock* stock);
    void addService(Services* service);
    void addFeedback(Feedback* feedback);

    void displayCustomer();
    void displayFeedback();
    void displayServices();

    void showRole() override;
};

#endif