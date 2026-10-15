#include "Staff.h"
#include "Product.h"
#include "Services.h"

Staff::Staff(
    int staffId,
    string staffName,
    string phone,
    string address
) : User(staffId, staffName, phone)
{
    this->staffId = staffId;
    this->staffName = staffName;
    this->address = address;
}

int Staff::getStaffId()
{
    return staffId;
}

string Staff::getStaffName()
{
    return staffName;
}

string Staff::getAddress()
{
    return address;
}

void Staff::sellProduct(Product* product)
{
    soldProducts.push_back(product);
}

void Staff::buyProduct(Product* product)
{
    boughtProducts.push_back(product);
}

void Staff::addService(Services* service)
{
    services.push_back(service);
}

void Staff::displayStaff()
{
    cout << "\n--- Staff Details ---" << endl;

    cout << "Staff ID   : " << staffId << endl;
    cout << "Staff Name : " << staffName << endl;
    cout << "Phone      : " << phone << endl;
    cout << "Address    : " << address << endl;
}

void Staff::displaySoldProducts()
{
    cout << "\n--- Products Sold ---" << endl;

    if (soldProducts.empty())
    {
        cout << "No products sold." << endl;
        return;
    }

    for (Product* product : soldProducts)
    {
        cout << product->getProductId()
             << " - "
             << product->getProductName()
             << endl;
    }
}

void Staff::displayBoughtProducts()
{
    cout << "\n--- Products Bought ---" << endl;

    if (boughtProducts.empty())
    {
        cout << "No products bought." << endl;
        return;
    }

    for (Product* product : boughtProducts)
    {
        cout << product->getProductId()
             << " - "
             << product->getProductName()
             << endl;
    }
}

void Staff::showRole()
{
    cout << "Role: Staff" << endl;
}