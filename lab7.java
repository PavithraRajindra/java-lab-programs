import java.util.Scanner;

public class lab7 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size=inp.nextInt();
        
        try{
            int arr[] = new int[size];
            System.out.println("Array size is positive.");
        }catch(NegativeArraySizeException e){
            System.out.println("Error: Array size is negative.");
        }

        inp.close();
    }   
}