class Stock:

    def __init__(
        self,
        supplier_id,
        supplier_name,
        product_id,
        product_name,
        product_info
    ):

        self.supplier_id = supplier_id
        self.supplier_name = supplier_name

        self.product_id = product_id
        self.product_name = product_name
        self.product_info = product_info

        self.product = None

    def set_product(self, product):
        self.product = product

    def get_product(self):
        return self.product

    def get_product_id(self):
        return self.product_id

    def get_product_name(self):
        return self.product_name

    def display_stock(self):

        print("\n--- Stock Details ---")

        print("Supplier ID          :", self.supplier_id)
        print("Supplier Name        :", self.supplier_name)
        print("Product ID           :", self.product_id)
        print("Product Name         :", self.product_name)
        print("Product Information  :", self.product_info)

        if self.product is not None:
            print(
                "Connected Product    :",
                self.product.get_product_name()
            )