from User import User


class Staff(User):

    def __init__(self, staff_id, staff_name, phone, address):
        super().__init__(staff_id, staff_name, phone)

        self.staff_id = staff_id
        self.staff_name = staff_name
        self.phone = phone
        self.address = address

        self.sold_products = []
        self.bought_products = []
        self.services = []

    def get_staff_id(self):
        return self.staff_id

    def get_staff_name(self):
        return self.staff_name

    def get_address(self):
        return self.address

    def sell_product(self, product):
        self.sold_products.append(product)

    def buy_product(self, product):
        self.bought_products.append(product)

    def add_service(self, service):
        self.services.append(service)

    def display_staff(self):

        print("\n--- Staff Details ---")
        print("Staff ID   :", self.staff_id)
        print("Staff Name :", self.staff_name)
        print("Phone      :", self.phone)
        print("Address    :", self.address)

    def display_sold_products(self):

        print("\n--- Products Sold ---")

        if not self.sold_products:
            print("No products sold.")
            return

        for product in self.sold_products:
            print(
                product.get_product_id(),
                "-",
                product.get_product_name()
            )

    def display_bought_products(self):

        print("\n--- Products Bought ---")

        if not self.bought_products:
            print("No products bought.")
            return

        for product in self.bought_products:
            print(
                product.get_product_id(),
                "-",
                product.get_product_name()
            )

    def show_role(self):
        print("Role: Staff")