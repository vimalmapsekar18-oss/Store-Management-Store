
#ifndef PRODUCT_H
#define PRODUCT_H

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Discount;
class Stock;
class Supplier;
class Feedback;

class Product
{
private:
    int productId;
    string productName;
    string productInfo;

    Discount* discount;
    Stock* stock;
    Supplier* supplier;

    vector<Feedback*> feedbackList;

public:
    Product(
        int productId,
        string productName,
        string productInfo
    );

    int getProductId();
    string getProductName();
    string getProductInfo();

    void setDiscount(Discount* discount);
    void addFeedback(Feedback* feedback);
    void setStock(Stock* stock);
    void setSupplier(Supplier* supplier);

    void displayProduct();
    void displayFeedback();
};

#endif