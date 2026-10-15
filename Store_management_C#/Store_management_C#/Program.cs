using System;
using System.Collections.Generic;

class Program
{
    static List<Customer> customers = new List<Customer>();
    static List<Staff> staffList = new List<Staff>();
    static List<Supplier> suppliers = new List<Supplier>();

    static List<Services> services = new List<Services>();
    static List<Stock> stocks = new List<Stock>();
    static List<Product> products = new List<Product>();
    static List<Discount> discounts = new List<Discount>();
    static List<Feedback> feedbackList = new List<Feedback>();


    // =====================================================
    // MAIN
    // =====================================================

    static void Main(string[] args)
    {
        LoadData();

        MainMenu();
    }


    // =====================================================
    // LOAD HARD-CODED DATA
    // =====================================================

    static void LoadData()
    {
        // ================================================
        // CUSTOMERS
        // ================================================

        Customer customer1 = new Customer(
            1001,
            "Rahul Sharma",
            "9876543210",
            "Mumbai"
        );

        Customer customer2 = new Customer(
            1002,
            "Priya Patel",
            "9123456780",
            "Pune"
        );

        Customer customer3 = new Customer(
            1003,
            "Arjun Mehta",
            "9988776655",
            "Delhi"
        );

        customers.Add(customer1);
        customers.Add(customer2);
        customers.Add(customer3);


        // ================================================
        // STAFF
        // ================================================

        Staff staff1 = new Staff(
            2001,
            "Amit Kumar",
            "9000011111",
            "Mumbai"
        );

        Staff staff2 = new Staff(
            2002,
            "Sneha Singh",
            "9000022222",
            "Pune"
        );

        Staff staff3 = new Staff(
            2003,
            "Rohan Verma",
            "9000033333",
            "Delhi"
        );

        staffList.Add(staff1);
        staffList.Add(staff2);
        staffList.Add(staff3);


        // ================================================
        // SUPPLIERS
        // ================================================

        Supplier supplier1 = new Supplier(
            3001,
            "ABC Electronics",
            "9111111111",
            "ABC Electronics Pvt Ltd",
            "Laptop"
        );

        Supplier supplier2 = new Supplier(
            3002,
            "XYZ Traders",
            "9222222222",
            "XYZ Traders Pvt Ltd",
            "Keyboard"
        );

        Supplier supplier3 = new Supplier(
            3003,
            "Global Supplies",
            "9333333333",
            "Global Supplies Ltd",
            "Mouse"
        );

        suppliers.Add(supplier1);
        suppliers.Add(supplier2);
        suppliers.Add(supplier3);


        // ================================================
        // PRODUCTS
        // ================================================

        Product product1 = new Product(
            4001,
            "Laptop",
            "Dell Inspiron Laptop"
        );

        Product product2 = new Product(
            4002,
            "Keyboard",
            "Mechanical Keyboard"
        );

        Product product3 = new Product(
            4003,
            "Mouse",
            "Wireless Optical Mouse"
        );

        products.Add(product1);
        products.Add(product2);
        products.Add(product3);


        // ================================================
        // STOCK
        // ================================================

        Stock stock1 = new Stock(
            3001,
            "ABC Electronics",
            4001,
            "Laptop",
            "Dell Inspiron Laptop"
        );

        Stock stock2 = new Stock(
            3002,
            "XYZ Traders",
            4002,
            "Keyboard",
            "Mechanical Keyboard"
        );

        Stock stock3 = new Stock(
            3003,
            "Global Supplies",
            4003,
            "Mouse",
            "Wireless Optical Mouse"
        );

        stocks.Add(stock1);
        stocks.Add(stock2);
        stocks.Add(stock3);


        // Stock HAS Product

        stock1.SetProduct(product1);
        stock2.SetProduct(product2);
        stock3.SetProduct(product3);

        product1.SetStock(stock1);
        product2.SetStock(stock2);
        product3.SetStock(stock3);


        // Supplier SUPPLIES Product

        supplier1.SupplyProduct(product1);
        supplier2.SupplyProduct(product2);
        supplier3.SupplyProduct(product3);

        product1.SetSupplier(supplier1);
        product2.SetSupplier(supplier2);
        product3.SetSupplier(supplier3);


        // ================================================
        // DISCOUNTS
        // ================================================

        Discount discount1 = new Discount(
            5001,
            "Festival Discount",
            "Special discount on Laptop",
            "01-08-2026",
            "31-08-2026"
        );

        Discount discount2 = new Discount(
            5002,
            "Back to School",
            "Special discount on Keyboard",
            "01-08-2026",
            "15-08-2026"
        );

        Discount discount3 = new Discount(
            5003,
            "Weekend Offer",
            "Special discount on Mouse",
            "10-08-2026",
            "20-08-2026"
        );

        discounts.Add(discount1);
        discounts.Add(discount2);
        discounts.Add(discount3);


        // Product GETS Discount

        product1.SetDiscount(discount1);
        product2.SetDiscount(discount2);
        product3.SetDiscount(discount3);


        // ================================================
        // FEEDBACK
        // ================================================

        Feedback feedback1 = new Feedback(
            6001,
            1001,
            "Rahul Sharma",
            "Excellent laptop and good service."
        );

        Feedback feedback2 = new Feedback(
            6002,
            1002,
            "Priya Patel",
            "Good quality keyboard."
        );

        Feedback feedback3 = new Feedback(
            6003,
            1003,
            "Arjun Mehta",
            "The mouse works perfectly."
        );

        feedbackList.Add(feedback1);
        feedbackList.Add(feedback2);
        feedbackList.Add(feedback3);


        // Customer gives Feedback

        customer1.AddFeedback(feedback1);
        customer2.AddFeedback(feedback2);
        customer3.AddFeedback(feedback3);


        // Product gets Feedback

        product1.AddFeedback(feedback1);
        product2.AddFeedback(feedback2);
        product3.AddFeedback(feedback3);


        // ================================================
        // CUSTOMER CHECKS STOCK
        // ================================================

        customer1.CheckStock(stock1);
        customer2.CheckStock(stock2);
        customer3.CheckStock(stock3);


        // ================================================
        // STAFF SELLS PRODUCT
        // ================================================

        staff1.SellProduct(product1);
        staff2.SellProduct(product2);
        staff3.SellProduct(product3);


        // ================================================
        // STAFF BUYS PRODUCT
        // ================================================

        staff1.BuyProduct(product2);
        staff2.BuyProduct(product3);
        staff3.BuyProduct(product1);


        // ================================================
        // SERVICES
        // ================================================

        Services service1 = new Services(
            7001,
            "Home Delivery",
            1001,
            "Rahul Sharma",
            2001,
            "Amit Kumar"
        );

        Services service2 = new Services(
            7002,
            "Product Installation",
            1002,
            "Priya Patel",
            2002,
            "Sneha Singh"
        );

        Services service3 = new Services(
            7003,
            "Customer Support",
            1003,
            "Arjun Mehta",
            2003,
            "Rohan Verma"
        );

        services.Add(service1);
        services.Add(service2);
        services.Add(service3);


        // Customer gets Services

        customer1.AddService(service1);
        customer2.AddService(service2);
        customer3.AddService(service3);


        // Staff handles Services

        staff1.AddService(service1);
        staff2.AddService(service2);
        staff3.AddService(service3);
    }


    // =====================================================
    // DISPLAY CUSTOMERS
    // =====================================================

    static void DisplayCustomers()
    {
        Console.WriteLine("\n========== CUSTOMER LIST ==========");

        foreach (Customer customer in customers)
        {
            customer.DisplayCustomer();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY STAFF
    // =====================================================

    static void DisplayStaff()
    {
        Console.WriteLine("\n========== STAFF LIST ==========");

        foreach (Staff staff in staffList)
        {
            staff.DisplayStaff();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY SUPPLIERS
    // =====================================================

    static void DisplaySuppliers()
    {
        Console.WriteLine("\n========== SUPPLIER LIST ==========");

        foreach (Supplier supplier in suppliers)
        {
            supplier.DisplaySupplier();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY SERVICES
    // =====================================================

    static void DisplayServices()
    {
        Console.WriteLine("\n========== SERVICES LIST ==========");

        foreach (Services service in services)
        {
            service.DisplayService();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY STOCK
    // =====================================================

    static void DisplayStock()
    {
        Console.WriteLine("\n========== STOCK LIST ==========");

        foreach (Stock stock in stocks)
        {
            stock.DisplayStock();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY PRODUCTS
    // =====================================================

    static void DisplayProducts()
    {
        Console.WriteLine("\n========== PRODUCT LIST ==========");

        foreach (Product product in products)
        {
            product.DisplayProduct();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY DISCOUNTS
    // =====================================================

    static void DisplayDiscounts()
    {
        Console.WriteLine("\n========== DISCOUNT LIST ==========");

        foreach (Discount discount in discounts)
        {
            discount.DisplayDiscount();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // DISPLAY FEEDBACK
    // =====================================================

    static void DisplayFeedback()
    {
        Console.WriteLine("\n========== FEEDBACK LIST ==========");

        foreach (Feedback feedback in feedbackList)
        {
            feedback.DisplayFeedback();

            Console.WriteLine("--------------------------------");
        }
    }


    // =====================================================
    // MAIN MENU
    // =====================================================

    static void MainMenu()
    {
        while (true)
        {
            Console.WriteLine();
            Console.WriteLine("==========================================");
            Console.WriteLine("       STORE MANAGEMENT SYSTEM");
            Console.WriteLine("==========================================");

            Console.WriteLine("1. Display Customers");
            Console.WriteLine("2. Display Staff");
            Console.WriteLine("3. Display Suppliers");
            Console.WriteLine("4. Display Services");
            Console.WriteLine("5. Display Stock");
            Console.WriteLine("6. Display Products");
            Console.WriteLine("7. Display Discounts");
            Console.WriteLine("8. Display Feedback");
            Console.WriteLine("9. Display All");
            Console.WriteLine("10. Exit");

            Console.WriteLine("==========================================");

            Console.Write("Enter your choice: ");

            string input = Console.ReadLine();

            if (!int.TryParse(input, out int choice))
            {
                Console.WriteLine("Please enter a valid number.");
                continue;
            }


            // =================================================
            // C# SWITCH
            // =================================================

            switch (choice)
            {
                case 1:
                    DisplayCustomers();
                    break;

                case 2:
                    DisplayStaff();
                    break;

                case 3:
                    DisplaySuppliers();
                    break;

                case 4:
                    DisplayServices();
                    break;

                case 5:
                    DisplayStock();
                    break;

                case 6:
                    DisplayProducts();
                    break;

                case 7:
                    DisplayDiscounts();
                    break;

                case 8:
                    DisplayFeedback();
                    break;

                case 9:

                    DisplayCustomers();
                    DisplayStaff();
                    DisplaySuppliers();
                    DisplayServices();
                    DisplayStock();
                    DisplayProducts();
                    DisplayDiscounts();
                    DisplayFeedback();

                    break;

                case 10:

                    Console.WriteLine(
                        "\nThank you for using the Store Management System!"
                    );

                    return;

                default:

                    Console.WriteLine(
                        "\nInvalid choice."
                    );

                    break;
            }
        }
    }
}