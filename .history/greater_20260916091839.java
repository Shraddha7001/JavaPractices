import java.util.Scanner;
public class greater {

    public static void main(String[] args) {
        
        System.out.print("Enter first number = ");
        System.out.print("Enter second number = ");


        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){

            System.out.println("num1 " + " that is " + num1 + " is greater than num2 that is " + num2);
        }

        else{
            System.out.println("num2 " + " that is " + num2 + " is greater than num1 that is " + num1);
        }

        sc.close();

    }
    

}
