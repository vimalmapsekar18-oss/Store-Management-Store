class Services:

    def __init__(
        self,
        service_id,
        type_of_service,
        cust_id,
        cust_name,
        staff_id,
        staff_name
    ):

        self.service_id = service_id
        self.type_of_service = type_of_service

        self.cust_id = cust_id
        self.cust_name = cust_name

        self.staff_id = staff_id
        self.staff_name = staff_name

    def get_service_id(self):
        return self.service_id

    def get_type_of_service(self):
        return self.type_of_service

    def display_service(self):

        print("\n--- Service Details ---")

        print("Service ID      :", self.service_id)
        print("Type of Service :", self.type_of_service)
        print("Customer ID     :", self.cust_id)
        print("Customer Name   :", self.cust_name)
        print("Staff ID        :", self.staff_id)
        print("Staff Name      :", self.staff_name)