#ifndef SERVICES_H
#define SERVICES_H

#include <iostream>
#include <string>

using namespace std;

class Services
{
private:
    int serviceId;
    string typeOfService;

    int custId;
    string custName;

    int staffId;
    string staffName;

public:
    Services(
        int serviceId,
        string typeOfService,
        int custId,
        string custName,
        int staffId,
        string staffName
    );

    int getServiceId();
    string getTypeOfService();

    void displayService();
};

#endif