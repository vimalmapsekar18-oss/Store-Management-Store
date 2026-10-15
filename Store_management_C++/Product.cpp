#include "Product.h"
#include "Discount.h"
#include "Supplier.h"
#include "Feedback.h"

Product::Product(
    int productId,
    string productName,
    string productInfo
)
{
    this->productId = productId;
    this->productName = productName;
    this->productInfo = productInfo;

    discount = nullptr;
    stock = nullptr;
    supplier = nullptr;
}

int Product::getProductId()
{
    return productId;
}

string Product::getProductName()
{
    return productName;
}

string Product::getProductInfo()
{
    return productInfo;
}

void Product::setDiscount(Discount* discount)
{
    this->discount = discount;
}

void Product::addFeedback(Feedback* feedback)
{
    feedbackList.push_back(feedback);
}

void Product::setStock(Stock* stock)
{
    this->stock = stock;
}

void Product::setSupplier(Supplier* supplier)
{
    this->supplier = supplier;
}

void Product::displayProduct()
{
    cout << "\n--- Product Details ---" << endl;

    cout << "Product ID          : " << productId << endl;
    cout << "Product Name        : " << productName << endl;
    cout << "Product Information : " << productInfo << endl;

    if (supplier != nullptr)
    {
        cout << "Supplier            : "
             << supplier->getSupplierName()
             << endl;
    }

    if (discount != nullptr)
    {
        cout << "Discount            : "
             << discount->getDiscountName()
             << endl;
    }
}

void Product::displayFeedback()
{
    cout << "\n--- Product Feedback ---" << endl;

    if (feedbackList.empty())
    {
        cout << "No feedback found." << endl;
        return;
    }

    for (Feedback* feedback : feedbackList)
    {
        feedback->displayFeedback();
    }
}