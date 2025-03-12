import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Task> lists = new ArrayList<Task>();

    public void addtask(String name){
        int i = 0;
        Task curtask = new Task(name);
        lists.add(curtask);

        System.out.println("Tasks: ");
        for (Task t : lists)
        {
            i++;
            System.out.println(i +" "+ t.name);
        }
    }

    public void display(){
        for (Task t : lists)
        {
            System.out.println(t.name);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Main app = new Main();
        System.out.println("Choose an operation: ");
        System.out.println("1. Addtask");
        int x = s.nextInt();
        s.nextLine();
        if (x == 1)
        {
            System.out.println("Enter: ");
            String str = s.nextLine();
            app.addtask(str);
        }
    }
}