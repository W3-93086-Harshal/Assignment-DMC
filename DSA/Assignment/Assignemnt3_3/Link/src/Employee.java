class Employee {
    private int empId;
    private String name;
    private double salary;
    Employee prev;
    Employee next;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.prev = null;
        this.next = null;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class DoublyLinkedList {
    private Employee head;
    private Employee tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addEmployee(int empId, String name, double salary) {
        Employee newEmployee = new Employee(empId, name, salary);

        if (head == null) {
            head = tail = newEmployee;
        } else {
            tail.next = newEmployee;
            newEmployee.prev = tail;
            tail = newEmployee;
        }
        System.out.println("Employee added successfully!");
    }

    public void displayEmployees() {
        if (head == null) {
            System.out.println("No employees in the list!");
            return;
        }

        Employee current = head;
        System.out.println("\nEmployee List:");
        System.out.println("ID\tName\tSalary");
        System.out.println("------------------------");
        while (current != null) {
            System.out.printf("%d\t%s\t%.2f\n",
                    current.getEmpId(),
                    current.getName(),
                    current.getSalary());
            current = current.next;
        }
    }

    public Employee searchByName(String name) {
        Employee current = head;
        while (current != null) {
            if (current.getName().equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean deleteByEmpId(int empId) {
        Employee current = head;

        while (current != null) {
            if (current.getEmpId() == empId) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean updateSalary(int empId, double newSalary) {
        Employee current = head;
        while (current != null) {
            if (current.getEmpId() == empId) {
                current.setSalary(newSalary);
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
