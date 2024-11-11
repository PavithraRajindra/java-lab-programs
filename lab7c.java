import java.util.Scanner;

public class lab7c{
    public static void checkVotingAge(int age) throws Exception{
        if(age<18){
            throw new Exception("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = inp.nextInt();
        try {
            checkVotingAge(age);
            System.out.println("You are eligible to vote.");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}