using System;

public class Stock
{
    private int supplierId;
    private string supplierName;

    private int productId;
    private string productName;
    private string productInfo;

    private Product product;

    public Stock(
        int supplierId,
        string supplierName,
        int productId,
        string productName,
        string productInfo
    )
    {
        this.supplierId = supplierId;
        this.supplierName = supplierName;

        this.productId = productId;
        this.productName = productName;
        this.productInfo = productInfo;

        product = null;
    }

    public void SetProduct(Product product)
    {
        this.product = product;
    }

    public Product GetProduct()
    {
        return product;
    }

    public int GetProductId()
    {
        return productId;
    }

    public string GetProductName()
    {
        return productName;
    }

    public void DisplayStock()
    {
        Console.WriteLine("\n--- Stock Details ---");

        Console.WriteLine("Supplier ID         : " + supplierId);
        Console.WriteLine("Supplier Name       : " + supplierName);
        Console.WriteLine("Product ID          : " + productId);
        Console.WriteLine("Product Name        : " + productName);
        Console.WriteLine("Product Information : " + productInfo);

        if (product != null)
        {
            Console.WriteLine(
                "Connected Product   : " +
                product.GetProductName()
            );
        }
    }
}