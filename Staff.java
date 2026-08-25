public class Staff extends User {

    private String staffId;
    private String department;

    // Constructor
    public Staff(int userId, String userName, String email,
            String phone, String staffId, String department) {

        super(userId, userName, email, phone);

        this.staffId = staffId;
        this.department = department;
    }

    // Getters
    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Staff method
    public void manageStore() {
        System.out.println(getUserName() + " is managing the store.");
    }

    // Display staff
    public void displayStaff() {

        System.out.println("\n--- Staff Details ---");

        displayUser();

        System.out.println("Staff ID  : " + staffId);
        System.out.println("Department: " + department);
    }

    // Method overriding
    @Override
    public void showRole() {
        System.out.println("Role: Staff");
    }
}