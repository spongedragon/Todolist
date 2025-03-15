import java.util.ArrayList;
import java.util.Scanner;

public class Tasklist {

    ArrayList<Task> lists = new ArrayList<Task>();
    Tasklist() {


    }

    public void addtask(String name){
        int i = 0;
        Task curtask = new Task(name);
        lists.add(curtask);

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

}
