from User import User


class Customer(User):

    def __init__(self, cust_id, cust_name, phone, address):
        super().__init__(cust_id, cust_name, phone)

        self.cust_id = cust_id
        self.cust_name = cust_name
        self.phone = phone
        self.address = address

        self.checked_stocks = []
        self.services = []
        self.feedback_list = []

    def get_cust_id(self):
        return self.cust_id

    def get_cust_name(self):
        return self.cust_name

    def get_address(self):
        return self.address

    def check_stock(self, stock):
        self.checked_stocks.append(stock)

    def add_service(self, service):
        self.services.append(service)

    def add_feedback(self, feedback):
        self.feedback_list.append(feedback)

    def display_customer(self):

        print("\n--- Customer Details ---")
        print("Customer ID   :", self.cust_id)
        print("Customer Name :", self.cust_name)
        print("Phone         :", self.phone)
        print("Address       :", self.address)

    def display_feedback(self):

        print("\n--- Customer Feedback ---")

        if not self.feedback_list:
            print("No feedback found.")
            return

        for feedback in self.feedback_list:
            feedback.display_feedback()

    def display_services(self):

        print("\n--- Customer Services ---")

        if not self.services:
            print("No services found.")
            return

        for service in self.services:
            service.display_service()

    def show_role(self):
        print("Role: Customer")