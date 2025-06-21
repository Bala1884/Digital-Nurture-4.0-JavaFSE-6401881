public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.add(new Task(1, "Code", "Pending"));
        manager.add(new Task(2, "Test", "Done"));
        manager.traverse();
        manager.search(1);
        manager.delete(2);
        manager.traverse();
    }
}