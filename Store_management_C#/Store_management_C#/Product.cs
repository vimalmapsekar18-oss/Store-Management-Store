using System;
using System.Collections.Generic;

public class Product
{
    private int productId;
    private string productName;
    private string productInfo;

    private Discount discount;
    private Stock stock;
    private Supplier supplier;

    private List<Feedback> feedbackList;

    public Product(
        int productId,
        string productName,
        string productInfo
    )
    {
        this.productId = productId;
        this.productName = productName;
        this.productInfo = productInfo;

        feedbackList = new List<Feedback>();

        discount = null;
        stock = null;
        supplier = null;
    }

    public int GetProductId()
    {
        return productId;
    }

    public string GetProductName()
    {
        return productName;
    }

    public string GetProductInfo()
    {
        return productInfo;
    }

    // Product gets Discount
    public void SetDiscount(Discount discount)
    {
        this.discount = discount;
    }

    // Product gets Feedback
    public void AddFeedback(Feedback feedback)
    {
        feedbackList.Add(feedback);
    }

    // Product has Stock
    public void SetStock(Stock stock)
    {
        this.stock = stock;
    }

    // Supplier supplies Product
    public void SetSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }

    public void DisplayProduct()
    {
        Console.WriteLine("\n--- Product Details ---");

        Console.WriteLine("Product ID          : " + productId);
        Console.WriteLine("Product Name        : " + productName);
        Console.WriteLine("Product Information : " + productInfo);

        if (supplier != null)
        {
            Console.WriteLine(
                "Supplier            : " +
                supplier.GetSupplierName()
            );
        }

        if (discount != null)
        {
            Console.WriteLine(
                "Discount            : " +
                discount.GetDiscountName()
            );
        }
    }

    public void DisplayFeedback()
    {
        Console.WriteLine("\n--- Product Feedback ---");

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
}