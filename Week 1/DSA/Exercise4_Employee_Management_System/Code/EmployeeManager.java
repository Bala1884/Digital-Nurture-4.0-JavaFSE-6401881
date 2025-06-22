public class EmployeeManager {
    Employee[] employees;
    int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void add(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        }
    }

    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void search(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void delete(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                size--;
                System.out.println("Deleted employee with ID " + id);
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}