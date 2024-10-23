import java.util.*;

class Employee{
    protected String emp_name, address, mail_id;
    protected int emp_id;
    protected double mobile_no;
    Employee(String empName, int empId, String addr, String mailId, double mobNo){
        this.emp_name = empName;
        this.emp_id = empId;
        this.address = addr;
        this.mail_id = mailId;
        this.mobile_no = mobNo;
    }

    void display(double basicPay, double grossSal, double netSal){
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------PAY SLIP----------------------------");
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee name: "+emp_name);
        System.out.println("Profession: Associate Professor");
        System.out.println("Basic Pay: "+basicPay);
        System.out.println("Gross Salary: "+grossSal);
        System.out.println("Net Salary: "+netSal);
        System.out.println("----------------------------------------------------------------");
    }
}

class Programmer extends Employee{
    Programmer(String empName, int empId, String addr, String mailId, double mobNo) {
        super(empName,empId,addr,mailId,mobNo);
    }

    void calc(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basicPay = inp.nextDouble();

        double hra = 0.1 * basicPay;
        double da = 0.97 * basicPay;
        double pf = 0.12 * basicPay;
        double scf = 0.001 * basicPay;
        double grossSal = basicPay + da + hra;
        double netSal = grossSal - pf - scf;
        super.display(basicPay, grossSal, netSal);
        inp.close();
    }
}

class AssistantProfessor extends Employee{
    AssistantProfessor(String empName, int empId, String addr, String mailId, double mobNo) {
        super(empName,empId,addr,mailId,mobNo);
    }

    void calc(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basicPay = inp.nextDouble();

        double hra = 0.1 * basicPay;
        double da = 0.97 * basicPay;
        double pf = 0.12 * basicPay;
        double scf = 0.001 * basicPay;
        double grossSal = basicPay + da + hra;
        double netSal = grossSal - pf - scf;
        super.display(basicPay, grossSal, netSal);
        inp.close();
    }
}

class AssociateProfessor extends Employee{
    AssociateProfessor(String empName, int empId, String addr, String mailId, double mobNo) {
        super(empName,empId,addr,mailId,mobNo);
    }

    void calc(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basicPay = inp.nextDouble();

        double hra = 0.1 * basicPay;
        double da = 0.97 * basicPay;
        double pf = 0.12 * basicPay;
        double scf = 0.001 * basicPay;
        double grossSal = basicPay + da + hra;
        double netSal = grossSal - pf - scf;
        super.display(basicPay, grossSal, netSal);
        inp.close();
    }
}

class Professor extends Employee{
    Professor(String empName, int empId, String addr, String mailId, double mobNo) {
        super(empName,empId,addr,mailId,mobNo);
    }

    void calc(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basicPay = inp.nextDouble();

        double hra = 0.1 * basicPay;
        double da = 0.97 * basicPay;
        double pf = 0.12 * basicPay;
        double scf = 0.001 * basicPay;
        double grossSal = basicPay + da + hra;
        double netSal = grossSal - pf - scf;
        super.display(basicPay, grossSal, netSal);
        inp.close();
    }

}

public class lab3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inps = new Scanner(System.in);
        do{
            System.out.print("1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor\n5. Exit\nChoose profession:");
            int choice = inp.nextInt();
            
            if(choice==5){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.print("Enter name: ");
                String empName = inps.nextLine();
                System.out.print("Enter Employee ID: ");
                int empId = inp.nextInt();
                System.err.print("Enter address: ");
                String addr = inps.nextLine();
                System.out.print("Enter mail ID: ");
                String mailId = inps.nextLine();
                System.out.print("Enter mobile no.: ");
                double mobNo = inp.nextDouble();

                switch(choice){
                    case 1:
                        Programmer pro = new Programmer(empName, empId, addr, mailId, mobNo);
                        pro.calc();
                        break;

                    case 2:
                        AssistantProfessor asp = new AssistantProfessor(empName, empId, addr, mailId, mobNo);
                        asp.calc();
                        break;

                    case 3:
                        AssociateProfessor acp = new AssociateProfessor(empName, empId, addr, mailId, mobNo);
                        acp.calc();
                        break;

                    case 4:
                        Professor prof = new Professor(empName, empId, addr, mailId, mobNo);
                        prof.calc();
                        break;

                    default:
                        System.out.println("Invalid choice");                    
                }
            }
        }while(true);
        inp.close();
        inps.close();
    }
}