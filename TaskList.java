import java.util.*;
import java.util.ArrayList;
public class TaskList{
    static ArrayList <String> todo = new ArrayList<>();
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Task List Application");
        System.out.println();
        System.out.println("The choices are:");
        System.out.println("1.Add TaskList\n2.Remove TaskList\n3.List the Task\n4.Quit");
        while(true){
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Task name:");
                    String tname = sc.nextLine();
                    addtask(tname);
                    break;
                case 2:
                         if(todo.size()!=0){
                            System.out.println("Enter the task number to remove:");
                            int tnum = sc.nextInt();
                            removetask(tnum);
                        }
                        else{
                            System.out.println("NO TaskList to remove:");
                        }
                    
                    break;
                case 3:
                    System.out.println("The TaskList are:");
                    displaytask();
                    break; 
                case 4:
                    System.out.println("Quiting the TaskList Application!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice!!");
                    break;
            }
        }
    }
    static void addtask(String name){
        if(name.isEmpty()){
            System.out.println("Task name cannot be Empty!!");
        }
        else{
            todo.add(name);
            System.out.println("Task added.");
        }
        
    }
    static void removetask(int num){
        
        if(num>todo.size()||num<1){
            System.out.println("Enter a valid task number");
        }
        else{
            todo.remove(num-1);
            System.out.println("Task removed.");
        }
    }
    static void displaytask(){
        if(todo.size()==0){
            System.out.println("TaskList is Empty!");
        }
        else{
            for(String tasks :todo){
                System.out.println(tasks);
            }
        }
        
    }
}