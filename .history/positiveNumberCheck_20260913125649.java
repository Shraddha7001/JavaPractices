import java.util.*;


public class positiveNumberCheck{

    public static void main(String[] args) {
        
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 0){

            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is not a positive number");
        }

        sc.close();
    }
}