public class User {

    // Attributes
    private int userId;
    private String userName;
    private String email;
    private String phone;

    // Constructor
    public User(int userId, String userName, String email, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Method
    public void displayUser() {
        System.out.println("User ID   : " + userId);
        System.out.println("Name      : " + userName);
        System.out.println("Email     : " + email);
        System.out.println("Phone     : " + phone);
    }

    // Method that can be overridden
    public void showRole() {
        System.out.println("Role: User");
    }
}