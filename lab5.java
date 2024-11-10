import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab5 {
    private ArrayList<String> obj;

    public lab5(){
        obj = new ArrayList<>();
    }

    public void append(String str){
        obj.add(str);
        System.out.println("List after appending: "+obj);
    }

    public void insert(int posn, String str){
        if(posn<0 || posn> obj.size()){
            System.out.println("Index out of bounds");
            return;
        }else{
            obj.add(posn,str);
        }
        System.out.println("List after insertion: "+obj);
    }

    public void search(String str){
        int ind = obj.indexOf(str);
        if(ind==-1){
            System.out.println(str+" not found in List");
        }else{
            System.out.println(str+" found in List at index "+ind);
        }
    }

    public void listStartsWithLetter(char letter){
        System.out.println("Strings starting with the letter "+letter+": ");
        for(String str : obj){
            if(str.startsWith(String.valueOf(letter))){
                System.out.println(str);
            }
        }
    }

    public void sortAscending(){
        Collections.sort(obj);
        System.out.println("List after sorting: "+obj);
    }

    public void sortDescending(){
        Collections.sort(obj,Collections.reverseOrder());
        System.out.println("List after sorting: "+obj);
    }

    public void remove(String str){
        if(obj.remove(str)){
            System.out.println("List after removing element "+str+": "+obj);
        }else{
            System.out.println(str+" not found in List");
        }
    }

    public void display(){
        System.out.println("List: "+obj);
    }

    public static void main(String[] args) {
        lab5 listOps = new lab5();
        Scanner inp = new Scanner(System.in);

        String str;
        int choice, pos;

        while(true){
            System.out.print("\nList Operations\n1. Append to list\n2. Insert element at position\n3. Search in list\n4. List all strings starting with given letter\n");
            System.out.print("5. Sort list in ascending order\n6. Sort list in descending order\n7. Remove element from list\n8. Display List\n9. Exit\n");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            inp.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter string to append: ");
                    str = inp.nextLine();
                    listOps.append(str);
                    break;

                case 2:
                    System.out.print("Enter string to insert: ");
                    str = inp.nextLine();
                    System.out.print("Enter position to insert: ");
                    pos = inp.nextInt();
                    listOps.insert(pos, str);
                    break;

                case 3:
                    System.out.print("Enter string to be searched in list: ");;
                    str = inp.nextLine();
                    listOps.search(str);
                    break;

                case 4:
                    System.out.print("Enter a letter to list strings starting with this letter: ");
                    char ch = inp.nextLine().charAt(0);
                    listOps.listStartsWithLetter(ch);
                    break;

                case 5:
                    listOps.sortAscending();
                    break;

                case 6:
                    listOps.sortDescending();
                    break;

                case 7:
                    System.out.print("Enter string to be removed from list: ");
                    str = inp.nextLine();
                    listOps.remove(str);
                    break;

                case 8:
                    listOps.display();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
