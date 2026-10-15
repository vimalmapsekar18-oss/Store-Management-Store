#include <iostream>
#include <vector>

#include "Customer.h"
#include "Staff.h"
#include "Supplier.h"
#include "Services.h"
#include "Stock.h"
#include "Product.h"
#include "Discount.h"
#include "Feedback.h"

using namespace std;


// ======================================================
// GLOBAL LISTS
// ======================================================

vector<Customer*> customers;
vector<Staff*> staffList;
vector<Supplier*> suppliers;

vector<Services*> services;
vector<Stock*> stocks;
vector<Product*> products;
vector<Discount*> discounts;
vector<Feedback*> feedbackList;


// ======================================================
// LOAD DATA
// ======================================================

void loadData()
{
    // ==================================================
    // CUSTOMERS
    // ==================================================

    Customer* customer1 = new Customer(
        1001,
        "Rahul Sharma",
        "9876543210",
        "Mumbai"
    );

    Customer* customer2 = new Customer(
        1002,
        "Priya Patel",
        "9123456780",
        "Pune"
    );

    Customer* customer3 = new Customer(
        1003,
        "Arjun Mehta",
        "9988776655",
        "Delhi"
    );

    customers.push_back(customer1);
    customers.push_back(customer2);
    customers.push_back(customer3);


    // ==================================================
    // STAFF
    // ==================================================

    Staff* staff1 = new Staff(
        2001,
        "Amit Kumar",
        "9000011111",
        "Mumbai"
    );

    Staff* staff2 = new Staff(
        2002,
        "Sneha Singh",
        "9000022222",
        "Pune"
    );

    Staff* staff3 = new Staff(
        2003,
        "Rohan Verma",
        "9000033333",
        "Delhi"
    );

    staffList.push_back(staff1);
    staffList.push_back(staff2);
    staffList.push_back(staff3);


    // ==================================================
    // SUPPLIERS
    // ==================================================

    Supplier* supplier1 = new Supplier(
        3001,
        "ABC Electronics",
        "9111111111",
        "ABC Electronics Pvt Ltd",
        "Laptop"
    );

    Supplier* supplier2 = new Supplier(
        3002,
        "XYZ Traders",
        "9222222222",
        "XYZ Traders Pvt Ltd",
        "Keyboard"
    );

    Supplier* supplier3 = new Supplier(
        3003,
        "Global Supplies",
        "9333333333",
        "Global Supplies Ltd",
        "Mouse"
    );

    suppliers.push_back(supplier1);
    suppliers.push_back(supplier2);
    suppliers.push_back(supplier3);


    // ==================================================
    // PRODUCTS
    // ==================================================

    Product* product1 = new Product(
        4001,
        "Laptop",
        "Dell Inspiron Laptop"
    );

    Product* product2 = new Product(
        4002,
        "Keyboard",
        "Mechanical Keyboard"
    );

    Product* product3 = new Product(
        4003,
        "Mouse",
        "Wireless Optical Mouse"
    );

    products.push_back(product1);
    products.push_back(product2);
    products.push_back(product3);


    // ==================================================
    // STOCK
    // ==================================================

    Stock* stock1 = new Stock(
        3001,
        "ABC Electronics",
        4001,
        "Laptop",
        "Dell Inspiron Laptop"
    );

    Stock* stock2 = new Stock(
        3002,
        "XYZ Traders",
        4002,
        "Keyboard",
        "Mechanical Keyboard"
    );

    Stock* stock3 = new Stock(
        3003,
        "Global Supplies",
        4003,
        "Mouse",
        "Wireless Optical Mouse"
    );

    stocks.push_back(stock1);
    stocks.push_back(stock2);
    stocks.push_back(stock3);


    // Stock HAS Product

    stock1->setProduct(product1);
    stock2->setProduct(product2);
    stock3->setProduct(product3);

    product1->setStock(stock1);
    product2->setStock(stock2);
    product3->setStock(stock3);


    // Supplier SUPPLIES Product

    supplier1->supplyProduct(product1);
    supplier2->supplyProduct(product2);
    supplier3->supplyProduct(product3);

    product1->setSupplier(supplier1);
    product2->setSupplier(supplier2);
    product3->setSupplier(supplier3);


    // ==================================================
    // DISCOUNTS
    // ==================================================

    Discount* discount1 = new Discount(
        5001,
        "Festival Discount",
        "Special discount on Laptop",
        "01-08-2026",
        "31-08-2026"
    );

    Discount* discount2 = new Discount(
        5002,
        "Back to School",
        "Special discount on Keyboard",
        "01-08-2026",
        "15-08-2026"
    );

    Discount* discount3 = new Discount(
        5003,
        "Weekend Offer",
        "Special discount on Mouse",
        "10-08-2026",
        "20-08-2026"
    );

    discounts.push_back(discount1);
    discounts.push_back(discount2);
    discounts.push_back(discount3);


    // Product GETS Discount

    product1->setDiscount(discount1);
    product2->setDiscount(discount2);
    product3->setDiscount(discount3);


    // ==================================================
    // FEEDBACK
    // ==================================================

    Feedback* feedback1 = new Feedback(
        6001,
        1001,
        "Rahul Sharma",
        "Excellent laptop and good service."
    );

    Feedback* feedback2 = new Feedback(
        6002,
        1002,
        "Priya Patel",
        "Good quality keyboard."
    );

    Feedback* feedback3 = new Feedback(
        6003,
        1003,
        "Arjun Mehta",
        "The mouse works perfectly."
    );

    feedbackList.push_back(feedback1);
    feedbackList.push_back(feedback2);
    feedbackList.push_back(feedback3);


    // Customer gives Feedback

    customer1->addFeedback(feedback1);
    customer2->addFeedback(feedback2);
    customer3->addFeedback(feedback3);


    // Product gets Feedback

    product1->addFeedback(feedback1);
    product2->addFeedback(feedback2);
    product3->addFeedback(feedback3);


    // ==================================================
    // CUSTOMER CHECKS STOCK
    // ==================================================

    customer1->checkStock(stock1);
    customer2->checkStock(stock2);
    customer3->checkStock(stock3);


    // ==================================================
    // STAFF SELLS PRODUCTS
    // ==================================================

    staff1->sellProduct(product1);
    staff2->sellProduct(product2);
    staff3->sellProduct(product3);


    // ==================================================
    // STAFF BUYS PRODUCTS
    // ==================================================

    staff1->buyProduct(product2);
    staff2->buyProduct(product3);
    staff3->buyProduct(product1);


    // ==================================================
    // SERVICES
    // ==================================================

    Services* service1 = new Services(
        7001,
        "Home Delivery",
        1001,
        "Rahul Sharma",
        2001,
        "Amit Kumar"
    );

    Services* service2 = new Services(
        7002,
        "Product Installation",
        1002,
        "Priya Patel",
        2002,
        "Sneha Singh"
    );

    Services* service3 = new Services(
        7003,
        "Customer Support",
        1003,
        "Arjun Mehta",
        2003,
        "Rohan Verma"
    );

    services.push_back(service1);
    services.push_back(service2);
    services.push_back(service3);


    // Customer gets Services

    customer1->addService(service1);
    customer2->addService(service2);
    customer3->addService(service3);


    // Staff handles Services

    staff1->addService(service1);
    staff2->addService(service2);
    staff3->addService(service3);
}


// ======================================================
// DISPLAY CUSTOMERS
// ======================================================

void displayCustomers()
{
    cout << "\n========== CUSTOMER LIST ==========" << endl;

    for (Customer* customer : customers)
    {
        customer->displayCustomer();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY STAFF
// ======================================================

void displayStaff()
{
    cout << "\n========== STAFF LIST ==========" << endl;

    for (Staff* staff : staffList)
    {
        staff->displayStaff();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY SUPPLIERS
// ======================================================

void displaySuppliers()
{
    cout << "\n========== SUPPLIER LIST ==========" << endl;

    for (Supplier* supplier : suppliers)
    {
        supplier->displaySupplier();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY SERVICES
// ======================================================

void displayServices()
{
    cout << "\n========== SERVICES LIST ==========" << endl;

    for (Services* service : services)
    {
        service->displayService();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY STOCK
// ======================================================

void displayStock()
{
    cout << "\n========== STOCK LIST ==========" << endl;

    for (Stock* stock : stocks)
    {
        stock->displayStock();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY PRODUCTS
// ======================================================

void displayProducts()
{
    cout << "\n========== PRODUCT LIST ==========" << endl;

    for (Product* product : products)
    {
        product->displayProduct();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY DISCOUNTS
// ======================================================

void displayDiscounts()
{
    cout << "\n========== DISCOUNT LIST ==========" << endl;

    for (Discount* discount : discounts)
    {
        discount->displayDiscount();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// DISPLAY FEEDBACK
// ======================================================

void displayFeedback()
{
    cout << "\n========== FEEDBACK LIST ==========" << endl;

    for (Feedback* feedback : feedbackList)
    {
        feedback->displayFeedback();

        cout << "--------------------------------" << endl;
    }
}


// ======================================================
// MAIN MENU
// ======================================================

void mainMenu()
{
    int choice;

    while (true)
    {
        cout << "\n";
        cout << "==========================================" << endl;
        cout << "       STORE MANAGEMENT SYSTEM" << endl;
        cout << "==========================================" << endl;

        cout << "1. Display Customers" << endl;
        cout << "2. Display Staff" << endl;
        cout << "3. Display Suppliers" << endl;
        cout << "4. Display Services" << endl;
        cout << "5. Display Stock" << endl;
        cout << "6. Display Products" << endl;
        cout << "7. Display Discounts" << endl;
        cout << "8. Display Feedback" << endl;
        cout << "9. Display All" << endl;
        cout << "10. Exit" << endl;

        cout << "==========================================" << endl;

        cout << "Enter your choice: ";
        cin >> choice;


        // ==================================================
        // C++ SWITCH
        // ==================================================

        switch (choice)
        {
            case 1:
                displayCustomers();
                break;

            case 2:
                displayStaff();
                break;

            case 3:
                displaySuppliers();
                break;

            case 4:
                displayServices();
                break;

            case 5:
                displayStock();
                break;

            case 6:
                displayProducts();
                break;

            case 7:
                displayDiscounts();
                break;

            case 8:
                displayFeedback();
                break;

            case 9:

                displayCustomers();
                displayStaff();
                displaySuppliers();
                displayServices();
                displayStock();
                displayProducts();
                displayDiscounts();
                displayFeedback();

                break;

            case 10:

                cout << "\nThank you for using the Store Management System!"
                     << endl;

                return;

            default:

                cout << "\nInvalid choice." << endl;

                break;
        }
    }
}


// ======================================================
// PROGRAM START
// ======================================================

int main()
{
    loadData();

    mainMenu();

    return 0;
}