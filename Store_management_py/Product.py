class Product:

    def __init__(self, product_id, product_name, product_info):

        self.product_id = product_id
        self.product_name = product_name
        self.product_info = product_info

        self.discount = None
        self.feedback_list = []
        self.stock = None
        self.supplier = None

    def get_product_id(self):
        return self.product_id

    def get_product_name(self):
        return self.product_name

    def get_product_info(self):
        return self.product_info

    def set_discount(self, discount):
        self.discount = discount

    def add_feedback(self, feedback):
        self.feedback_list.append(feedback)

    def set_stock(self, stock):
        self.stock = stock

    def set_supplier(self, supplier):
        self.supplier = supplier

    def display_product(self):

        print("\n--- Product Details ---")

        print("Product ID          :", self.product_id)
        print("Product Name        :", self.product_name)
        print("Product Information :", self.product_info)

        if self.supplier is not None:
            print(
                "Supplier            :",
                self.supplier.get_supplier_name()
            )

        if self.discount is not None:
            print(
                "Discount            :",
                self.discount.get_discount_name()
            )

    def display_feedback(self):

        print("\n--- Product Feedback ---")

        if not self.feedback_list:
            print("No feedback found.")
            return

        for feedback in self.feedback_list:
            feedback.display_feedback()