#ifndef STOCK_H
#define STOCK_H

#include <iostream>
#include <string>

using namespace std;

class Product;

class Stock
{
private:
    int supplierId;
    string supplierName;

    int productId;
    string productName;
    string productInfo;

    Product* product;

public:
    Stock(
        int supplierId,
        string supplierName,
        int productId,
        string productName,
        string productInfo
    );

    void setProduct(Product* product);

    Product* getProduct();

    int getProductId();
    string getProductName();

    void displayStock();
};

#endif