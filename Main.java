import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        static Scanner scanner = new Scanner(System.in);

        // ==========================================
        // LISTS
        // ==========================================

        static ArrayList<Customer> customers = new ArrayList<>();
        static ArrayList<Staff> staffList = new ArrayList<>();
        static ArrayList<Supplier> suppliers = new ArrayList<>();
        static ArrayList<Product> products = new ArrayList<>();

        // ==========================================
        // MAIN METHOD
        // ==========================================

        public static void main(String[] args) {

                // Load all hard-coded data
                loadData();

                int choice;

                do {

                        displayMainMenu();

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        customerMenu();
                                        break;

                                case 2:
                                        staffMenu();
                                        break;

                                case 3:
                                        supplierMenu();
                                        break;

                                case 4:
                                        productMenu();
                                        break;

                                case 5:
                                        stockMenu();
                                        break;

                                case 6:
                                        feedbackMenu();
                                        break;

                                case 7:
                                        discountMenu();
                                        break;

                                case 8:
                                        displayAllData();
                                        break;

                                case 9:
                                        System.out.println();
                                        System.out.println("======================================");
                                        System.out.println(" Thank you for using Store Management ");
                                        System.out.println("======================================");
                                        break;

                                default:
                                        System.out.println("\nInvalid choice. Please try again.");
                        }

                } while (choice != 9);

                scanner.close();
        }

        // ==========================================
        // LOAD HARD-CODED DATA
        // ==========================================

        public static void loadData() {

                // ------------------------------------------
                // CUSTOMERS
                // ------------------------------------------

                Customer customer1 = new Customer(
                                1001,
                                "Rahul Sharma",
                                "rahul@gmail.com",
                                "9876543210",
                                "Mumbai");

                Customer customer2 = new Customer(
                                1002,
                                "Priya Patel",
                                "priya@gmail.com",
                                "9123456780",
                                "Pune");

                Customer customer3 = new Customer(
                                1003,
                                "Arjun Mehta",
                                "arjun@gmail.com",
                                "9988776655",
                                "Delhi");

                customers.add(customer1);
                customers.add(customer2);
                customers.add(customer3);

                // ------------------------------------------
                // STAFF
                // ------------------------------------------

                Staff staff1 = new Staff(
                                2001,
                                "Amit Kumar",
                                "amit@store.com",
                                "9000011111",
                                "ST001",
                                "Sales");

                Staff staff2 = new Staff(
                                2002,
                                "Sneha Singh",
                                "sneha@store.com",
                                "9000022222",
                                "ST002",
                                "Inventory");

                Staff staff3 = new Staff(
                                2003,
                                "Rohan Verma",
                                "rohan@store.com",
                                "9000033333",
                                "ST003",
                                "Manager");

                staffList.add(staff1);
                staffList.add(staff2);
                staffList.add(staff3);

                // ------------------------------------------
                // SUPPLIERS
                // ------------------------------------------

                Supplier supplier1 = new Supplier(
                                3001,
                                "ABC Electronics",
                                "abc@gmail.com",
                                "9111111111",
                                "Delhi");

                Supplier supplier2 = new Supplier(
                                3002,
                                "XYZ Traders",
                                "xyz@gmail.com",
                                "9222222222",
                                "Bangalore");

                Supplier supplier3 = new Supplier(
                                3003,
                                "Global Supplies",
                                "global@gmail.com",
                                "9333333333",
                                "Mumbai");

                suppliers.add(supplier1);
                suppliers.add(supplier2);
                suppliers.add(supplier3);

                // ------------------------------------------
                // STOCK
                // ------------------------------------------

                Stock stock1 = new Stock(
                                6001,
                                50,
                                10);

                Stock stock2 = new Stock(
                                6002,
                                30,
                                5);

                Stock stock3 = new Stock(
                                6003,
                                100,
                                20);

                // ------------------------------------------
                // PRODUCTS
                // ------------------------------------------

                Product product1 = new Product(
                                4001,
                                "Laptop",
                                "Electronics",
                                55000.00,
                                "Dell Inspiron Laptop",
                                supplier1,
                                stock1);

                Product product2 = new Product(
                                4002,
                                "Wireless Mouse",
                                "Accessories",
                                1200.00,
                                "Wireless optical mouse",
                                supplier2,
                                stock2);

                Product product3 = new Product(
                                4003,
                                "Keyboard",
                                "Accessories",
                                1800.00,
                                "Mechanical keyboard",
                                supplier3,
                                stock3);

                products.add(product1);
                products.add(product2);
                products.add(product3);

                // ------------------------------------------
                // FEEDBACK
                // ------------------------------------------

                Feedback feedback1 = new Feedback(
                                5001,
                                "Excellent product and service!",
                                5);

                Feedback feedback2 = new Feedback(
                                5002,
                                "Good quality product.",
                                4);

                Feedback feedback3 = new Feedback(
                                5003,
                                "Fast delivery and good service.",
                                5);

                customer1.addFeedback(feedback1);
                customer2.addFeedback(feedback2);
                customer3.addFeedback(feedback3);
        }

        // ==========================================
        // MAIN MENU
        // ==========================================

        public static void displayMainMenu() {

                System.out.println();
                System.out.println("======================================");
                System.out.println("       STORE MANAGEMENT SYSTEM");
                System.out.println("======================================");

                System.out.println("1. Customer Management");
                System.out.println("2. Staff Management");
                System.out.println("3. Supplier Management");
                System.out.println("4. Product Management");
                System.out.println("5. Stock Management");
                System.out.println("6. Feedback Management");
                System.out.println("7. Discount Management");
                System.out.println("8. Display All Data");
                System.out.println("9. Exit");

                System.out.println("======================================");
        }

        // ==========================================
        // CUSTOMER MENU
        // ==========================================

        public static void customerMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("       CUSTOMER MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Customer 1");
                        System.out.println("2. Customer 2");
                        System.out.println("3. Customer 3");
                        System.out.println("4. Display All Customers");
                        System.out.println("5. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayCustomer(0);
                                        break;

                                case 2:
                                        displayCustomer(1);
                                        break;

                                case 3:
                                        displayCustomer(2);
                                        break;

                                case 4:
                                        displayCustomers();
                                        break;

                                case 5:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 5);
        }

        // ==========================================
        // DISPLAY ONE CUSTOMER
        // ==========================================

        public static void displayCustomer(int index) {

                System.out.println();
                System.out.println("--- Customer Details ---");

                Customer customer = customers.get(index);

                customer.displayCustomer();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISPLAY ALL CUSTOMERS
        // ==========================================

        public static void displayCustomers() {

                System.out.println();
                System.out.println("--- All Customers ---");

                for (Customer customer : customers) {

                        customer.displayCustomer();

                        System.out.println("--------------------------------------");
                }
        }

        // ==========================================
        // STAFF MENU
        // ==========================================

        public static void staffMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("          STAFF MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Staff 1");
                        System.out.println("2. Staff 2");
                        System.out.println("3. Staff 3");
                        System.out.println("4. Display All Staff");
                        System.out.println("5. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayStaff(0);
                                        break;

                                case 2:
                                        displayStaff(1);
                                        break;

                                case 3:
                                        displayStaff(2);
                                        break;

                                case 4:
                                        displayAllStaff();
                                        break;

                                case 5:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 5);
        }

        // ==========================================
        // DISPLAY ONE STAFF
        // ==========================================

        public static void displayStaff(int index) {

                System.out.println();
                System.out.println("--- Staff Details ---");

                Staff staff = staffList.get(index);

                staff.displayStaff();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISPLAY ALL STAFF
        // ==========================================

        public static void displayAllStaff() {

                System.out.println();
                System.out.println("--- All Staff ---");

                for (Staff staff : staffList) {

                        staff.displayStaff();

                        System.out.println("--------------------------------------");
                }
        }

        // ==========================================
        // SUPPLIER MENU
        // ==========================================

        public static void supplierMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("        SUPPLIER MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Supplier 1");
                        System.out.println("2. Supplier 2");
                        System.out.println("3. Supplier 3");
                        System.out.println("4. Display All Suppliers");
                        System.out.println("5. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displaySupplier(0);
                                        break;

                                case 2:
                                        displaySupplier(1);
                                        break;

                                case 3:
                                        displaySupplier(2);
                                        break;

                                case 4:
                                        displayAllSuppliers();
                                        break;

                                case 5:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 5);
        }

        // ==========================================
        // DISPLAY ONE SUPPLIER
        // ==========================================

        public static void displaySupplier(int index) {

                System.out.println();
                System.out.println("--- Supplier Details ---");

                Supplier supplier = suppliers.get(index);

                supplier.displaySupplier();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISPLAY ALL SUPPLIERS
        // ==========================================

        public static void displayAllSuppliers() {

                System.out.println();
                System.out.println("--- All Suppliers ---");

                for (Supplier supplier : suppliers) {

                        supplier.displaySupplier();

                        System.out.println("--------------------------------------");
                }
        }

        // ==========================================
        // PRODUCT MENU
        // ==========================================

        public static void productMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("         PRODUCT MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Product 1");
                        System.out.println("2. Product 2");
                        System.out.println("3. Product 3");
                        System.out.println("4. Display All Products");
                        System.out.println("5. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayProduct(0);
                                        break;

                                case 2:
                                        displayProduct(1);
                                        break;

                                case 3:
                                        displayProduct(2);
                                        break;

                                case 4:
                                        displayAllProducts();
                                        break;

                                case 5:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 5);
        }

        // ==========================================
        // DISPLAY ONE PRODUCT
        // ==========================================

        public static void displayProduct(int index) {

                System.out.println();
                System.out.println("--- Product Details ---");

                Product product = products.get(index);

                product.displayProduct();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISPLAY ALL PRODUCTS
        // ==========================================

        public static void displayAllProducts() {

                System.out.println();
                System.out.println("--- All Products ---");

                for (Product product : products) {

                        product.displayProduct();

                        System.out.println("--------------------------------------");
                }
        }

        // ==========================================
        // STOCK MENU
        // ==========================================

        public static void stockMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("          STOCK MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Stock for Laptop");
                        System.out.println("2. Stock for Wireless Mouse");
                        System.out.println("3. Stock for Keyboard");
                        System.out.println("4. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayStock(0);
                                        break;

                                case 2:
                                        displayStock(1);
                                        break;

                                case 3:
                                        displayStock(2);
                                        break;

                                case 4:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 4);
        }

        // ==========================================
        // DISPLAY STOCK
        // ==========================================

        public static void displayStock(int index) {

                Product product = products.get(index);

                System.out.println();
                System.out.println("--- Stock Details ---");

                System.out.println("Product ID   : " +
                                product.getProductId());

                System.out.println("Product Name : " +
                                product.getProductName());

                product.getStock().displayStock();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // FEEDBACK MENU
        // ==========================================

        public static void feedbackMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("        FEEDBACK MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Rahul's Feedback");
                        System.out.println("2. Priya's Feedback");
                        System.out.println("3. Arjun's Feedback");
                        System.out.println("4. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayFeedback(
                                                        customers.get(0));
                                        break;

                                case 2:
                                        displayFeedback(
                                                        customers.get(1));
                                        break;

                                case 3:
                                        displayFeedback(
                                                        customers.get(2));
                                        break;

                                case 4:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 4);
        }

        // ==========================================
        // DISPLAY FEEDBACK
        // ==========================================

        public static void displayFeedback(Customer customer) {

                System.out.println();
                System.out.println("--- Customer Feedback ---");

                System.out.println(
                                "Customer: " +
                                                customer.getUserName());

                customer.displayFeedback();

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISCOUNT MENU
        // ==========================================

        public static void discountMenu() {

                int choice;

                do {

                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println("        DISCOUNT MANAGEMENT");
                        System.out.println("--------------------------------------");

                        System.out.println("1. Laptop Discount");
                        System.out.println("2. Mouse Discount");
                        System.out.println("3. Keyboard Discount");
                        System.out.println("4. Back to Main Menu");

                        choice = getChoice();

                        switch (choice) {

                                case 1:
                                        displayDiscount(
                                                        products.get(0));
                                        break;

                                case 2:
                                        displayDiscount(
                                                        products.get(1));
                                        break;

                                case 3:
                                        displayDiscount(
                                                        products.get(2));
                                        break;

                                case 4:
                                        break;

                                default:
                                        System.out.println("Invalid choice.");
                        }

                } while (choice != 4);
        }

        // ==========================================
        // DISPLAY DISCOUNT
        // ==========================================

        public static void displayDiscount(Product product) {

                System.out.println();
                System.out.println("--- Discount Details ---");

                System.out.println(
                                "Product ID   : " +
                                                product.getProductId());

                System.out.println(
                                "Product Name : " +
                                                product.getProductName());

                System.out.println(
                                "Original Price: ₹" +
                                                product.getPrice());

                System.out.println(
                                "Discount     : 10%");

                double discountedPrice = product.getPrice() * 0.90;

                System.out.println(
                                "Final Price  : ₹" +
                                                discountedPrice);

                System.out.println(
                                "Description  : Festival Discount");

                System.out.println("--------------------------------------");
        }

        // ==========================================
        // DISPLAY EVERYTHING
        // ==========================================

        public static void displayAllData() {

                System.out.println();
                System.out.println("======================================");
                System.out.println("          ALL STORE DATA");
                System.out.println("======================================");

                displayCustomers();

                displayAllStaff();

                displayAllSuppliers();

                displayAllProducts();

                System.out.println("\n--- Stock Information ---");

                for (int i = 0; i < products.size(); i++) {

                        displayStock(i);
                }

                System.out.println("\n--- Feedback Information ---");

                for (Customer customer : customers) {

                        displayFeedback(customer);
                }

                System.out.println("\n--- Discount Information ---");

                for (Product product : products) {

                        displayDiscount(product);
                }
        }

        // ==========================================
        // GET MENU CHOICE
        // ==========================================

        public static int getChoice() {

                System.out.print("\nEnter your choice: ");

                while (!scanner.hasNextInt()) {

                        System.out.println(
                                        "Please enter a number.");

                        scanner.next();
                        System.out.print(
                                        "Enter your choice: ");
                }

                int choice = scanner.nextInt();

                scanner.nextLine();

                return choice;
        }
}