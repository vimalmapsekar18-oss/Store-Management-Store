#include "User.h"

User::User(int userId, string userName, string phone)
{
    this->userId = userId;
    this->userName = userName;
    this->phone = phone;
}

int User::getUserId()
{
    return userId;
}

string User::getUserName()
{
    return userName;
}

string User::getPhone()
{
    return phone;
}

void User::displayUser()
{
    cout << "User ID   : " << userId << endl;
    cout << "User Name : " << userName << endl;
    cout << "Phone     : " << phone << endl;
}

void User::showRole()
{
    cout << "Role: User" << endl;
}

User::~User()
{
}