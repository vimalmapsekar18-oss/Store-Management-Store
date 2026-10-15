from User import User


class Supplier(User):

    def __init__(
        self,
        supplier_id,
        supplier_name,
        phone,
        company_name,
        product_name
    ):

        super().__init__(
            supplier_id,
            supplier_name,
            phone
        )

        self.supplier_id = supplier_id
        self.supplier_name = supplier_name
        self.phone = phone
        self.company_name = company_name
        self.product_name = product_name

        self.supplied_products = []

    def get_supplier_id(self):
        return self.supplier_id

    def get_supplier_name(self):
        return self.supplier_name

    def get_company_name(self):
        return self.company_name

    def supply_product(self, product):
        self.supplied_products.append(product)

    def display_supplier(self):

        print("\n--- Supplier Details ---")

        print("Supplier ID  :", self.supplier_id)
        print("Supplier Name:", self.supplier_name)
        print("Phone        :", self.phone)
        print("Company Name :", self.company_name)
        print("Product Name :", self.product_name)

    def display_supplied_products(self):

        print("\n--- Supplied Products ---")

        if not self.supplied_products:
            print("No products supplied.")
            return

        for product in self.supplied_products:
            print(
                product.get_product_id(),
                "-",
                product.get_product_name()
            )

    def show_role(self):
        print("Role: Supplier")