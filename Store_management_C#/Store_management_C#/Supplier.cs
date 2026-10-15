using System;
using System.Collections.Generic;

public class Supplier : User
{
    private int supplierId;
    private string supplierName;
    private string companyName;
    private string productName;

    private List<Product> suppliedProducts;

    public Supplier(
        int supplierId,
        string supplierName,
        string phone,
        string companyName,
        string productName
    ) : base(supplierId, supplierName, phone)
    {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.productName = productName;

        suppliedProducts = new List<Product>();
    }

    public int GetSupplierId()
    {
        return supplierId;
    }

    public string GetSupplierName()
    {
        return supplierName;
    }

    public string GetCompanyName()
    {
        return companyName;
    }

    // Supplier supplies Product
    public void SupplyProduct(Product product)
    {
        suppliedProducts.Add(product);
    }

    public void DisplaySupplier()
    {
        Console.WriteLine("\n--- Supplier Details ---");

        Console.WriteLine("Supplier ID   : " + supplierId);
        Console.WriteLine("Supplier Name : " + supplierName);
        Console.WriteLine("Phone         : " + phone);
        Console.WriteLine("Company Name  : " + companyName);
        Console.WriteLine("Product Name  : " + productName);
    }

    public void DisplaySuppliedProducts()
    {
        Console.WriteLine("\n--- Supplied Products ---");

        if (suppliedProducts.Count == 0)
        {
            Console.WriteLine("No products supplied.");
            return;
        }

        foreach (Product product in suppliedProducts)
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
        Console.WriteLine("Role: Supplier");
    }
}