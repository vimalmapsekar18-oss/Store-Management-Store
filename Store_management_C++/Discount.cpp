#include "Discount.h"

Discount::Discount(
    int discountId,
    string discountName,
    string discountDescription,
    string startDate,
    string endDate
)
{
    this->discountId = discountId;
    this->discountName = discountName;
    this->discountDescription = discountDescription;
    this->startDate = startDate;
    this->endDate = endDate;
}

int Discount::getDiscountId()
{
    return discountId;
}

string Discount::getDiscountName()
{
    return discountName;
}

void Discount::displayDiscount()
{
    cout << "\n--- Discount Details ---" << endl;

    cout << "Discount ID   : " << discountId << endl;
    cout << "Discount Name : " << discountName << endl;
    cout << "Description   : "
         << discountDescription << endl;

    cout << "Start Date    : " << startDate << endl;
    cout << "End Date      : " << endDate << endl;
}