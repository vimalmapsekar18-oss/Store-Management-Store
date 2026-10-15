from Customer import Customer
from Staff import Staff
from Supplier import Supplier
from Services import Services
from Stock import Stock
from Product import Product
from Discount import Discount
from Feedback import Feedback

class StoreManagementSystem:

    def __init__(self):

        self.customers = []
        self.staff_list = []
        self.suppliers = []
        self.services = []
        self.stocks = []
        self.products = []
        self.discounts = []
        self.feedback_list = []

        self.load_data()

    def load_data(self):

        # ==============================
        # CUSTOMERS
        # ==============================

        customer1 = Customer(
            1001,
            "Rahul Sharma",
            "9876543210",
            "Mumbai"
        )

        customer2 = Customer(
            1002,
            "Priya Patel",
            "9123456780",
            "Pune"
        )

        customer3 = Customer(
            1003,
            "Arjun Mehta",
            "9988776655",
            "Delhi"
        )

        self.customers.extend([
            customer1,
            customer2,
            customer3
        ])


        # ==============================
        # STAFF
        # ==============================

        staff1 = Staff(
            2001,
            "Amit Kumar",
            "9000011111",
            "Mumbai"
        )

        staff2 = Staff(
            2002,
            "Sneha Singh",
            "9000022222",
            "Pune"
        )

        staff3 = Staff(
            2003,
            "Rohan Verma",
            "9000033333",
            "Delhi"
        )

        self.staff_list.extend([
            staff1,
            staff2,
            staff3
        ])


        # ==============================
        # SUPPLIERS
        # ==============================

        supplier1 = Supplier(
            3001,
            "ABC Electronics",
            "9111111111",
            "ABC Electronics Pvt Ltd",
            "Laptop"
        )

        supplier2 = Supplier(
            3002,
            "XYZ Traders",
            "9222222222",
            "XYZ Traders Pvt Ltd",
            "Keyboard"
        )

        supplier3 = Supplier(
            3003,
            "Global Supplies",
            "9333333333",
            "Global Supplies Ltd",
            "Mouse"
        )

        self.suppliers.extend([
            supplier1,
            supplier2,
            supplier3
        ])


        # ==============================
        # PRODUCTS
        # ==============================

        product1 = Product(
            4001,
            "Laptop",
            "Dell Inspiron Laptop"
        )

        product2 = Product(
            4002,
            "Keyboard",
            "Mechanical Keyboard"
        )

        product3 = Product(
            4003,
            "Mouse",
            "Wireless Optical Mouse"
        )

        self.products.extend([
            product1,
            product2,
            product3
        ])


        # ==============================
        # STOCK
        # ==============================

        stock1 = Stock(
            3001,
            "ABC Electronics",
            4001,
            "Laptop",
            "Dell Inspiron Laptop"
        )

        stock2 = Stock(
            3002,
            "XYZ Traders",
            4002,
            "Keyboard",
            "Mechanical Keyboard"
        )

        stock3 = Stock(
            3003,
            "Global Supplies",
            4003,
            "Mouse",
            "Wireless Optical Mouse"
        )

        self.stocks.extend([
            stock1,
            stock2,
            stock3
        ])


        # Stock HAS Product

        stock1.set_product(product1)
        stock2.set_product(product2)
        stock3.set_product(product3)

        product1.set_stock(stock1)
        product2.set_stock(stock2)
        product3.set_stock(stock3)


        # Supplier SUPPLIES Product

        supplier1.supply_product(product1)
        supplier2.supply_product(product2)
        supplier3.supply_product(product3)

        product1.set_supplier(supplier1)
        product2.set_supplier(supplier2)
        product3.set_supplier(supplier3)


        # ==============================
        # DISCOUNTS
        # ==============================

        discount1 = Discount(
            5001,
            "Festival Discount",
            "Special discount on Laptop",
            "01-08-2026",
            "31-08-2026"
        )

        discount2 = Discount(
            5002,
            "Back to School",
            "Special discount on Keyboard",
            "01-08-2026",
            "15-08-2026"
        )

        discount3 = Discount(
            5003,
            "Weekend Offer",
            "Special discount on Mouse",
            "10-08-2026",
            "20-08-2026"
        )

        self.discounts.extend([
            discount1,
            discount2,
            discount3
        ])

        product1.set_discount(discount1)
        product2.set_discount(discount2)
        product3.set_discount(discount3)


        # ==============================
        # FEEDBACK
        # ==============================

        feedback1 = Feedback(
            6001,
            1001,
            "Rahul Sharma",
            "Excellent laptop and good service."
        )

        feedback2 = Feedback(
            6002,
            1002,
            "Priya Patel",
            "Good quality keyboard."
        )

        feedback3 = Feedback(
            6003,
            1003,
            "Arjun Mehta",
            "The mouse works perfectly."
        )

        self.feedback_list.extend([
            feedback1,
            feedback2,
            feedback3
        ])

        customer1.add_feedback(feedback1)
        customer2.add_feedback(feedback2)
        customer3.add_feedback(feedback3)

        product1.add_feedback(feedback1)
        product2.add_feedback(feedback2)
        product3.add_feedback(feedback3)


        # ==============================
        # CUSTOMER CHECKS STOCK
        # ==============================

        customer1.check_stock(stock1)
        customer2.check_stock(stock2)
        customer3.check_stock(stock3)


        # ==============================
        # STAFF SELLS / BUYS PRODUCTS
        # ==============================

        staff1.sell_product(product1)
        staff2.sell_product(product2)
        staff3.sell_product(product3)

        staff1.buy_product(product2)
        staff2.buy_product(product3)
        staff3.buy_product(product1)


        # ==============================
        # SERVICES
        # ==============================

        service1 = Services(
            7001,
            "Home Delivery",
            1001,
            "Rahul Sharma",
            2001,
            "Amit Kumar"
        )

        service2 = Services(
            7002,
            "Product Installation",
            1002,
            "Priya Patel",
            2002,
            "Sneha Singh"
        )

        service3 = Services(
            7003,
            "Customer Support",
            1003,
            "Arjun Mehta",
            2003,
            "Rohan Verma"
        )

        self.services.extend([
            service1,
            service2,
            service3
        ])

        customer1.add_service(service1)
        customer2.add_service(service2)
        customer3.add_service(service3)

        staff1.add_service(service1)
        staff2.add_service(service2)
        staff3.add_service(service3)


    # ==========================================
    # CUSTOMER
    # ==========================================

    def display_customers(self):

        print("\n========== CUSTOMER LIST ==========")

        for customer in self.customers:

            customer.display_customer()

            print("--------------------------------")


    # ==========================================
    # STAFF
    # ==========================================

    def display_staff(self):

        print("\n========== STAFF LIST ==========")

        for staff in self.staff_list:

            staff.display_staff()

            print("--------------------------------")


    # ==========================================
    # SUPPLIER
    # ==========================================

    def display_suppliers(self):

        print("\n========== SUPPLIER LIST ==========")

        for supplier in self.suppliers:

            supplier.display_supplier()

            print("--------------------------------")


    # ==========================================
    # SERVICES
    # ==========================================

    def display_services(self):

        print("\n========== SERVICES LIST ==========")

        for service in self.services:

            service.display_service()

            print("--------------------------------")


    # ==========================================
    # STOCK
    # ==========================================

    def display_stocks(self):

        print("\n========== STOCK LIST ==========")

        for stock in self.stocks:

            stock.display_stock()

            print("--------------------------------")


    # ==========================================
    # PRODUCTS
    # ==========================================

    def display_products(self):

        print("\n========== PRODUCT LIST ==========")

        for product in self.products:

            product.display_product()

            print("--------------------------------")


    # ==========================================
    # DISCOUNTS
    # ==========================================

    def display_discounts(self):

        print("\n========== DISCOUNT LIST ==========")

        for discount in self.discounts:

            discount.display_discount()

            print("--------------------------------")


    # ==========================================
    # FEEDBACK
    # ==========================================

    def display_feedback(self):

        print("\n========== FEEDBACK LIST ==========")

        for feedback in self.feedback_list:

            feedback.display_feedback()

            print("--------------------------------")


    # ==========================================
    # MAIN MENU
    # ==========================================

    def main_menu(self):

        while True:

            print("\n")
            print("==========================================")
            print("       STORE MANAGEMENT SYSTEM")
            print("==========================================")

            print("1. Display Customers")
            print("2. Display Staff")
            print("3. Display Suppliers")
            print("4. Display Services")
            print("5. Display Stock")
            print("6. Display Products")
            print("7. Display Discounts")
            print("8. Display Feedback")
            print("9. Display All")
            print("10. Exit")

            print("==========================================")

            try:
                choice = int(input("Enter your choice: "))

            except ValueError:
                print("Please enter a valid number.")
                continue


            # ==========================================
            # PYTHON SWITCH / MATCH-CASE
            # ==========================================

            match choice:

                case 1:
                    self.display_customers()

                case 2:
                    self.display_staff()

                case 3:
                    self.display_suppliers()

                case 4:
                    self.display_services()

                case 5:
                    self.display_stocks()

                case 6:
                    self.display_products()

                case 7:
                    self.display_discounts()

                case 8:
                    self.display_feedback()

                case 9:

                    self.display_customers()
                    self.display_staff()
                    self.display_suppliers()
                    self.display_services()
                    self.display_stocks()
                    self.display_products()
                    self.display_discounts()
                    self.display_feedback()

                case 10:

                    print("\nThank you for using the system!")

                    break

                case _:

                    print("\nInvalid choice.")


# ==========================================
# PROGRAM START
# ==========================================

if __name__ == "__main__":

    system = StoreManagementSystem()

    system.main_menu()