#include "Customer.h"
#include "Stock.h"
#include "Services.h"
#include "Feedback.h"

Customer::Customer(
    int custId,
    string custName,
    string phone,
    string address
) : User(custId, custName, phone)
{
    this->custId = custId;
    this->custName = custName;
    this->address = address;
}

int Customer::getCustId()
{
    return custId;
}

string Customer::getCustName()
{
    return custName;
}

string Customer::getAddress()
{
    return address;
}

void Customer::checkStock(Stock* stock)
{
    checkedStocks.push_back(stock);
}

void Customer::addService(Services* service)
{
    services.push_back(service);
}

void Customer::addFeedback(Feedback* feedback)
{
    feedbackList.push_back(feedback);
}

void Customer::displayCustomer()
{
    cout << "\n--- Customer Details ---" << endl;

    cout << "Customer ID   : " << custId << endl;
    cout << "Customer Name : " << custName << endl;
    cout << "Phone         : " << phone << endl;
    cout << "Address       : " << address << endl;
}

void Customer::displayFeedback()
{
    cout << "\n--- Customer Feedback ---" << endl;

    if (feedbackList.empty())
    {
        cout << "No feedback found." << endl;
        return;
    }

    for (Feedback* feedback : feedbackList)
    {
        feedback->displayFeedback();
    }
}

void Customer::displayServices()
{
    cout << "\n--- Customer Services ---" << endl;

    if (services.empty())
    {
        cout << "No services found." << endl;
        return;
    }

    for (Services* service : services)
    {
        service->displayService();
    }
}

void Customer::showRole()
{
    cout << "Role: Customer" << endl;
}
