import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str;
        int ind;
        System.out.print("Enter the string: ");
        str = inp.nextLine();
        System.out.print("Enter the index: ");
        ind = inp.nextInt();
        inp.nextLine();
        if(ind<0||ind>str.length()){
            System.out.println("Index out of range");
        }else{
            System.out.println("The character at index " + ind + " is: " + str.charAt(ind));
        }
        inp.close();
    }
}
