import java.util.Scanner;


public class largest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd number = ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 " + "( " + num1 + " ) "+ "is largest number.");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 " + "( " + num2 + " ) "+ "is largest number.");

        }
        else{
            System.out.println("num3 " + "( " + num3 + " ) "+ "is largest number.");
        }
    }
    
}
