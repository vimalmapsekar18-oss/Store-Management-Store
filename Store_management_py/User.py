class User:

    def __init__(self, user_id, user_name, phone):
        self.user_id = user_id
        self.user_name = user_name
        self.phone = phone

    def get_user_id(self):
        return self.user_id

    def get_user_name(self):
        return self.user_name

    def get_phone(self):
        return self.phone

    def display_user(self):
        print("User ID   :", self.user_id)
        print("User Name :", self.user_name)
        print("Phone     :", self.phone)

    def show_role(self):
        print("Role: User")