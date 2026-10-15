#ifndef STAFF_H
#define STAFF_H

#include "User.h"
#include <vector>

class Product;
class Services;

class Staff : public User
{
private:
    int staffId;
    string staffName;
    string address;

    vector<Product*> soldProducts;
    vector<Product*> boughtProducts;
    vector<Services*> services;

public:
    Staff(
        int staffId,
        string staffName,
        string phone,
        string address
    );

    int getStaffId();
    string getStaffName();
    string getAddress();

    void sellProduct(Product* product);
    void buyProduct(Product* product);
    void addService(Services* service);

    void displayStaff();
    void displaySoldProducts();
    void displayBoughtProducts();

    void showRole() override;
};

#endif