import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList employeeList = new DoublyLinkedList();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employeeList.addEmployee(empId, name, salary);
                    break;

                case 2:
                    employeeList.displayEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee Name to search: ");
                    String searchName = scanner.nextLine();
                    Employee found = employeeList.searchByName(searchName);
                    if (found != null) {
                        System.out.printf("Employee found: ID=%d, Name=%s, Salary=%.2f\n",
                                found.getEmpId(), found.getName(), found.getSalary());
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (employeeList.deleteByEmpId(deleteId)) {
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to update salary: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    if (employeeList.updateSalary(updateId, newSalary)) {
                        System.out.println("Salary updated successfully!");
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Employee Management System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}