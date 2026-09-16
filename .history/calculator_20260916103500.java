import java.util.*;

public class calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        double num1 = sc.nextDouble();


        System.out.print("Enter 2nd number = ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/,%) = ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Add " + num1 + " and " + num2 + " = " + (num1 + num2));    
                break;
            case '-': System.out.println("Subtract " + num1 + " and " + num2 + " = " + (num1 - num2));    
                break;
            case '*': System.out.println("Multiply " + num1 + " and " + num2 + " = " + (num1 * num2));    
                break;
            case '/': System.out.println("Divide " + num1 + " and " + num2 + " = " + (num1 + num2));    
                break;
            case '%': System.out.println("Modulus " + num1 + " and " + num2 + " = " + (num1 % num2));    
                break;

        
            default: System.out.println("Invalid operator...!");
                break;
        }

        sc.close();
    }
    
}
