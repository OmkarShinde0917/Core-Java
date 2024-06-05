import java.util.*;

public class Tax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name:");// Name of Employee
        String name = sc.nextLine();
        System.out.println("Enter annual income of employee:");//Annual Income
        double income = sc.nextDouble();
        double tax = incometax(income);// Variable for Finding tax
        System.out.println("The Employee name: "+name);
        System.out.println("Employee income Tax: "+tax);
        sc.close();
    }
    //Calculating Tax from annual income
    public static double incometax(double income) {
        double tax = 0;
        if (income<=250000) {// employee salary up to 2.5lac no tax applied
            tax = 0;
        }else if (income<=250001 && income>=500000) {
            tax = (income - 250000)*0.10;// Salary up to 5lac, 10% Tax applied
        }else if (income<=1000000) {
            tax =  30000 +(income - 500000)*0.20;// Salary up to 10lac, 30,000rs+20% tax applied
        }else {
            tax = 50000 + (income-1000000)*0.30;// Salary above 10lac, 50,000rs+30% tax applied
        }
        return tax;

    }


}


