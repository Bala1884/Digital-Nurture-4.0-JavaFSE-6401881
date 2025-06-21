public class TaskManager {
    Task head;

    public void add(Task task) {
        task.next = head;
        head = task;
    }

    public void traverse() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void search(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                System.out.println("Found: " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    public void delete(int id) {
        Task current = head, prev = null;
        while (current != null) {
            if (current.taskId == id) {
                if (prev == null) head = current.next;
                else prev.next = current.next;
                System.out.println("Deleted task with ID " + id);
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Task not found.");
    }
}