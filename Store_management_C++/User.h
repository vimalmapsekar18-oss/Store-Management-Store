#ifndef USER_H
#define USER_H

#include <iostream>
#include <string>

using namespace std;

class User
{
protected:
    int userId;
    string userName;
    string phone;

public:
    User(int userId, string userName, string phone);

    int getUserId();
    string getUserName();
    string getPhone();

    virtual void displayUser();
    virtual void showRole();

    virtual ~User();
};

#endif