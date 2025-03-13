public class Task {
    public String name;
    public Boolean completion;
    public int id;
    public static int i = 0;

    Task(String name){
             id = ++i;
             this.name = name;
             this.completion = false;
    }

    public String toString(){
        return name;
    }
}
