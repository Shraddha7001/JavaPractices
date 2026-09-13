import java.util.*;


public class positiveNumberCheck{

    public static void main(String[] args) {
        
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        long num = sc.nextLong();

        if(num > 0){

            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is not a positive number");
        }

        sc.close();
    }
}