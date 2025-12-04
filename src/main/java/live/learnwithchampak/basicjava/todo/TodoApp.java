package live.learnwithchampak.basicjava.todo;
import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        TodoManager manager = new TodoManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n TODO MENU ");
            System.out.println("0. Exit");
            
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Completed");
            System.out.println("4. Delete Task");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    manager.addTask(title);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Task ID to mark complete: ");
                    int id1 = sc.nextInt();
                    manager.markCompleted(id1);
                    break;
                case 4:
                    System.out.print("Task ID to delete: ");
                    int id2 = sc.nextInt();
                    manager.deleteTask(id2);
                    break;
                
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
