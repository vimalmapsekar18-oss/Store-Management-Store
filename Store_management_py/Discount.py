class Discount:

    def __init__(
        self,
        discount_id,
        discount_name,
        discount_description,
        start_date,
        end_date
    ):

        self.discount_id = discount_id
        self.discount_name = discount_name
        self.discount_description = discount_description
        self.start_date = start_date
        self.end_date = end_date

    def get_discount_id(self):
        return self.discount_id

    def get_discount_name(self):
        return self.discount_name

    def display_discount(self):

        print("\n--- Discount Details ---")

        print("Discount ID   :", self.discount_id)
        print("Discount Name :", self.discount_name)
        print("Description   :", self.discount_description)
        print("Start Date    :", self.start_date)
        print("End Date      :", self.end_date)