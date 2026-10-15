using System;
using System.Collections.Generic;

public class Customer : User
{
    private int custId;
    private string custName;
    private string address;

    private List<Stock> checkedStocks;
    private List<Services> services;
    private List<Feedback> feedbackList;

    public Customer(
        int custId,
        string custName,
        string phone,
        string address
    ) : base(custId, custName, phone)
    {
        this.custId = custId;
        this.custName = custName;
        this.address = address;

        checkedStocks = new List<Stock>();
        services = new List<Services>();
        feedbackList = new List<Feedback>();
    }

    public int GetCustId()
    {
        return custId;
    }

    public string GetCustName()
    {
        return custName;
    }

    public string GetAddress()
    {
        return address;
    }

    // Customer checks Stock
    public void CheckStock(Stock stock)
    {
        checkedStocks.Add(stock);
    }

    // Customer gets Services
    public void AddService(Services service)
    {
        services.Add(service);
    }

    // Customer gives Feedback
    public void AddFeedback(Feedback feedback)
    {
        feedbackList.Add(feedback);
    }

    public void DisplayCustomer()
    {
        Console.WriteLine("\n--- Customer Details ---");

        Console.WriteLine("Customer ID   : " + custId);
        Console.WriteLine("Customer Name : " + custName);
        Console.WriteLine("Phone         : " + phone);
        Console.WriteLine("Address       : " + address);
    }

    public void DisplayFeedback()
    {
        Console.WriteLine("\n--- Customer Feedback ---");

        if (feedbackList.Count == 0)
        {
            Console.WriteLine("No feedback found.");
            return;
        }

        foreach (Feedback feedback in feedbackList)
        {
            feedback.DisplayFeedback();
        }
    }

    public void DisplayServices()
    {
        Console.WriteLine("\n--- Customer Services ---");

        if (services.Count == 0)
        {
            Console.WriteLine("No services found.");
            return;
        }

        foreach (Services service in services)
        {
            service.DisplayService();
        }
    }

    public override void ShowRole()
    {
        Console.WriteLine("Role: Customer");
    }
}