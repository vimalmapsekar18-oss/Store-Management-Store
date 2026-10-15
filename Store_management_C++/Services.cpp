#include "Services.h"

Services::Services(
    int serviceId,
    string typeOfService,
    int custId,
    string custName,
    int staffId,
    string staffName
)
{
    this->serviceId = serviceId;
    this->typeOfService = typeOfService;

    this->custId = custId;
    this->custName = custName;

    this->staffId = staffId;
    this->staffName = staffName;
}

int Services::getServiceId()
{
    return serviceId;
}

string Services::getTypeOfService()
{
    return typeOfService;
}

void Services::displayService()
{
    cout << "\n--- Service Details ---" << endl;

    cout << "Service ID      : " << serviceId << endl;
    cout << "Type of Service : " << typeOfService << endl;

    cout << "Customer ID     : " << custId << endl;
    cout << "Customer Name   : " << custName << endl;

    cout << "Staff ID        : " << staffId << endl;
    cout << "Staff Name      : " << staffName << endl;
}