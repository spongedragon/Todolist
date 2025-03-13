import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    ArrayList<Task> lists = new ArrayList<Task>();

    public void addtask(String name){
        int i = 0;
        Task curtask = new Task(name);
        lists.add(curtask);

//        System.out.println("Tasks: ");
//        for (Task t : lists)
//        {
//            System.out.println(t.id +" "+ t.name);
//        }
    }

    public void display(){

        if (lists.isEmpty())
        {
            System.out.println("No tasks currently. ");
        }

        for (Task t : lists)
        {
            System.out.println(t.id + ". " + t.name);
        }
    }

    public void delete() {
        System.out.println("Select tasks to delete: ");
        String[] deleteid = s.nextLine().split(" ");
        s.nextLine();
    }

    public static void main(String[] args) {
        int id = 0;
        Main app = new Main();
        app.addtask("Hello there");
        app.addtask("Hi");
        app.display();


        System.out.println("Click x or y to add or delete tasks. Click z to exit. ");
        String choicestr = app.s.next();
        char choice = choicestr.charAt(0);
        app.s.nextLine();
//        int x = app.s.nextInt();
//        app.s.nextLine();

        if (choice == 'x') {
            System.out.println("Enter: ");
            String str = app.s.nextLine();
            app.addtask(str);
            System.out.println("Tasks: ");
        for (Task t : app.lists)
        {
            System.out.println(t.id +" "+ t.name);
        }
        }

        else if (choice == 'y') {
        }
    }
}