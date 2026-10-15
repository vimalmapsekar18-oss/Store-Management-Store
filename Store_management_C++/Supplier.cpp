#include "Supplier.h"
#include "Product.h"

Supplier::Supplier(
    int supplierId,
    string supplierName,
    string phone,
    string companyName,
    string productName
) : User(supplierId, supplierName, phone)
{
    this->supplierId = supplierId;
    this->supplierName = supplierName;
    this->companyName = companyName;
    this->productName = productName;
}

int Supplier::getSupplierId()
{
    return supplierId;
}

string Supplier::getSupplierName()
{
    return supplierName;
}

string Supplier::getCompanyName()
{
    return companyName;
}

void Supplier::supplyProduct(Product* product)
{
    suppliedProducts.push_back(product);
}

void Supplier::displaySupplier()
{
    cout << "\n--- Supplier Details ---" << endl;

    cout << "Supplier ID   : " << supplierId << endl;
    cout << "Supplier Name : " << supplierName << endl;
    cout << "Phone         : " << phone << endl;
    cout << "Company Name  : " << companyName << endl;
    cout << "Product Name  : " << productName << endl;
}

void Supplier::displaySuppliedProducts()
{
    cout << "\n--- Supplied Products ---" << endl;

    if (suppliedProducts.empty())
    {
        cout << "No products supplied." << endl;
        return;
    }

    for (Product* product : suppliedProducts)
    {
        cout << product->getProductId()
             << " - "
             << product->getProductName()
             << endl;
    }
}

void Supplier::showRole()
{
    cout << "Role: Supplier" << endl;
}