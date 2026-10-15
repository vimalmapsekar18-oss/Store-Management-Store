using System;

public class Discount
{
    private int discountId;
    private string discountName;
    private string discountDescription;
    private string startDate;
    private string endDate;

    public Discount(
        int discountId,
        string discountName,
        string discountDescription,
        string startDate,
        string endDate
    )
    {
        this.discountId = discountId;
        this.discountName = discountName;
        this.discountDescription = discountDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int GetDiscountId()
    {
        return discountId;
    }

    public string GetDiscountName()
    {
        return discountName;
    }

    public void DisplayDiscount()
    {
        Console.WriteLine("\n--- Discount Details ---");

        Console.WriteLine("Discount ID   : " + discountId);
        Console.WriteLine("Discount Name : " + discountName);
        Console.WriteLine(
            "Description   : " +
            discountDescription
        );
        Console.WriteLine("Start Date    : " + startDate);
        Console.WriteLine("End Date      : " + endDate);
    }
}