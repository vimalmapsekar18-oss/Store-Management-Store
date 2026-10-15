#ifndef SUPPLIER_H
#define SUPPLIER_H

#include "User.h"
#include <vector>

class Product;

class Supplier : public User
{
private:
    int supplierId;
    string supplierName;
    string companyName;
    string productName;

    vector<Product*> suppliedProducts;

public:
    Supplier(
        int supplierId,
        string supplierName,
        string phone,
        string companyName,
        string productName
    );

    int getSupplierId();
    string getSupplierName();
    string getCompanyName();

    void supplyProduct(Product* product);

    void displaySupplier();
    void displaySuppliedProducts();

    void showRole() override;
};

#endif