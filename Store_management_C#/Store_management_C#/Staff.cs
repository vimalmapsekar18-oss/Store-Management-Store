using System;
using System.Collections.Generic;

public class Staff : User
{
    private int staffId;
    private string staffName;
    private string address;

    private List<Product> soldProducts;
    private List<Product> boughtProducts;
    private List<Services> services;

    public Staff(
        int staffId,
        string staffName,
        string phone,
        string address
    ) : base(staffId, staffName, phone)
    {
        this.staffId = staffId;
        this.staffName = staffName;
        this.address = address;

        soldProducts = new List<Product>();
        boughtProducts = new List<Product>();
        services = new List<Services>();
    }

    public int GetStaffId()
    {
        return staffId;
    }

    public string GetStaffName()
    {
        return staffName;
    }

    public string GetAddress()
    {
        return address;
    }

    // Staff sells Product
    public void SellProduct(Product product)
    {
        soldProducts.Add(product);
    }

    // Staff buys Product
    public void BuyProduct(Product product)
    {
        boughtProducts.Add(product);
    }

    public void AddService(Services service)
    {
        services.Add(service);
    }

    public void DisplayStaff()
    {
        Console.WriteLine("\n--- Staff Details ---");

        Console.WriteLine("Staff ID   : " + staffId);
        Console.WriteLine("Staff Name : " + staffName);
        Console.WriteLine("Phone      : " + phone);
        Console.WriteLine("Address    : " + address);
    }

    public void DisplaySoldProducts()
    {
        Console.WriteLine("\n--- Products Sold ---");

        if (soldProducts.Count == 0)
        {
            Console.WriteLine("No products sold.");
            return;
        }

        foreach (Product product in soldProducts)
        {
            Console.WriteLine(
                product.GetProductId() +
                " - " +
                product.GetProductName()
            );
        }
    }

    public void DisplayBoughtProducts()
    {
        Console.WriteLine("\n--- Products Bought ---");

        if (boughtProducts.Count == 0)
        {
            Console.WriteLine("No products bought.");
            return;
        }

        foreach (Product product in boughtProducts)
        {
            Console.WriteLine(
                product.GetProductId() +
                " - " +
                product.GetProductName()
            );
        }
    }

    public override void ShowRole()
    {
        Console.WriteLine("Role: Staff");
    }
}