import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    ArrayList<Task> lists = new ArrayList<Task>();

    public void addtask(String name){
        int i = 0;
        Task curtask = new Task(name);
        lists.add(curtask);

        System.out.println("Tasks: ");
        for (Task t : lists)
        {
            System.out.println(t.id +" "+ t.name);
        }
    }

    public void display(){

        if (lists.isEmpty())
        {
            System.out.println("No tasks. ");
        }

        for (Task t : lists)
        {
            System.out.println(t.name);
        }
    }

    public void delete() {
        System.out.println("Select tasks to delete: ");
        String[] deleteid = s.nextLine().split(" ");
        s.nextLine();
    }

    public static void main(String[] args) {

        Main app = new Main();
        System.out.println("Choose an operation: ");
        System.out.println("1. Addtask\n2.Display ");
        int x = app.s.nextInt();
        app.s.nextLine();
        if (x == 1) {
            System.out.println("Enter: ");
            String str = app.s.nextLine();
            app.addtask(str);
        }

        else if (x ==2) {
            app.display();
        }
    }
}