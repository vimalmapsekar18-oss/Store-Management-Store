#include "Stock.h"
#include "Product.h"

Stock::Stock(
    int supplierId,
    string supplierName,
    int productId,
    string productName,
    string productInfo
)
{
    this->supplierId = supplierId;
    this->supplierName = supplierName;

    this->productId = productId;
    this->productName = productName;
    this->productInfo = productInfo;

    product = nullptr;
}

void Stock::setProduct(Product* product)
{
    this->product = product;
}

Product* Stock::getProduct()
{
    return product;
}

int Stock::getProductId()
{
    return productId;
}

string Stock::getProductName()
{
    return productName;
}

void Stock::displayStock()
{
    cout << "\n--- Stock Details ---" << endl;

    cout << "Supplier ID         : " << supplierId << endl;
    cout << "Supplier Name       : " << supplierName << endl;
    cout << "Product ID          : " << productId << endl;
    cout << "Product Name        : " << productName << endl;
    cout << "Product Information : " << productInfo << endl;

    if (product != nullptr)
    {
        cout << "Connected Product   : "
             << product->getProductName()
             << endl;
    }
}