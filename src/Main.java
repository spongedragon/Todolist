import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Tasklist app = new Tasklist();
        app.addtask("hello");
        app.display();
    }
}