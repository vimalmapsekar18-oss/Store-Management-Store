using System;

public class Services
{
    private int serviceId;
    private string typeOfService;

    private int custId;
    private string custName;

    private int staffId;
    private string staffName;

    public Services(
        int serviceId,
        string typeOfService,
        int custId,
        string custName,
        int staffId,
        string staffName
    )
    {
        this.serviceId = serviceId;
        this.typeOfService = typeOfService;

        this.custId = custId;
        this.custName = custName;

        this.staffId = staffId;
        this.staffName = staffName;
    }

    public int GetServiceId()
    {
        return serviceId;
    }

    public string GetTypeOfService()
    {
        return typeOfService;
    }

    public void DisplayService()
    {
        Console.WriteLine("\n--- Service Details ---");

        Console.WriteLine("Service ID      : " + serviceId);
        Console.WriteLine("Type of Service : " + typeOfService);

        Console.WriteLine("Customer ID     : " + custId);
        Console.WriteLine("Customer Name   : " + custName);

        Console.WriteLine("Staff ID        : " + staffId);
        Console.WriteLine("Staff Name      : " + staffName);
    }
}