#ifndef DISCOUNT_H
#define DISCOUNT_H

#include <iostream>
#include <string>

using namespace std;

class Discount
{
private:
    int discountId;
    string discountName;
    string discountDescription;
    string startDate;
    string endDate;

public:
    Discount(
        int discountId,
        string discountName,
        string discountDescription,
        string startDate,
        string endDate
    );

    int getDiscountId();
    string getDiscountName();

    void displayDiscount();
};

#endif