import java.util.LinkedList;
import java.util.Scanner;

public class lab6c {
    private static LinkedList<String> list = new LinkedList<>();
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str;
        while(true){
            System.out.print("\nLinked List Menu\n1. Insert element\n2. Delete element\n3. Display List\n4.Exit\nEnter your choice: ");
            int choice = inp.nextInt();
            inp.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter string to be inserted: ");
                    str = inp.nextLine();
                    list.add(str);
                    System.out.println("List: "+list);
                    break;

                case 2:
                    System.out.print("Enter element to be deleted: ");
                    str = inp.nextLine();
                    if(list.remove(str)){
                        System.out.println("Element deleted");
                    }else{
                        System.out.println("Element not found in List");
                    }
                    System.out.println("List: "+list);
                    break;

                case 3:
                    System.out.println("List: "+list);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
