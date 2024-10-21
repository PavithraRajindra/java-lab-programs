// Electricity Bill Generator
import java.util.*;
public class lab1{
    private int cno;
    private String cname, ctype;
    private double units, prev, cur, tot;
    
    private void data(){
        Scanner inp = new Scanner(System.in);
        Scanner inps = new Scanner(System.in);
        System.out.print("Enter Consumer No.: ");
        cno = inp.nextInt();
        System.out.print("Enter Consumer Name: ");
        cname = inps.nextLine();
        System.err.print("Enter Connection type(c/d): ");
        ctype = inps.nextLine();
        System.err.print("Enter previous month's reading: ");
        prev = inp.nextDouble();
        System.err.print("Enter current month's reading: ");
        cur = inp.nextDouble();
        inp.close();
        inps.close();
    }

    private void calc(){
        data();
        units=cur-prev;
        switch (ctype) {
            case "d":
                if(units<=100)
                    tot=units*1;
                else if(units>=101 && units<=200)
                    tot=100*1 + (units-100)*2.5;
                else if (units>=201 && units<=500)
                    tot=100*1 + 100*2.5 + (units-200)*4;
                else
                    tot=100*1 + 100*2.5 + 300*4 + (units-500)*6;
                break;
            
            case "c":
                if(units<=100)
                    tot=units*2;
                else if(units>=101 && units<=200)
                    tot=100*2 + (units-100)*4.5;
                else if (units>=201 && units<=500)
                    tot=100*2 + 100*4.5 + (units-200)*6;
                else
                    tot=100*2 + 100*4.5 + 300*6 + (units-500)*7;
                break;

            default:
                System.out.println("Incorrect!");
        }
    }

    void display(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("Customer number: "+cno);
        System.out.println("Customer name: "+cname);
        System.out.println("Connection type: "+ctype);
        System.out.println("Previous month's reading: "+prev);
        System.out.println("Current month's reading: "+cur);
        System.out.println("Total units: "+units);
        System.out.println("Total amount to be paid: "+tot);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args){
        lab1 obj = new lab1();
        obj.calc();
        obj.display();
    }

}
