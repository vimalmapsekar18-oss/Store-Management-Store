class Feedback:

    def __init__(
        self,
        feedback_id,
        customer_id,
        customer_name,
        description
    ):

        self.feedback_id = feedback_id
        self.customer_id = customer_id
        self.customer_name = customer_name
        self.description = description

    def get_feedback_id(self):
        return self.feedback_id

    def display_feedback(self):

        print("\n--- Feedback Details ---")

        print("Feedback ID   :", self.feedback_id)
        print("Customer ID   :", self.customer_id)
        print("Customer Name :", self.customer_name)
        print("Description   :", self.description)