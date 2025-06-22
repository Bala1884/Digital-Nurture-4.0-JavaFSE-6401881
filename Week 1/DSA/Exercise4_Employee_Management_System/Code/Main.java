public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);
        manager.add(new Employee(1, "Alice", "Manager", 70000));
        manager.add(new Employee(2, "Bob", "Developer", 50000));
        manager.traverse();
        manager.search(2);
        manager.delete(1);
        manager.traverse();
    }
}