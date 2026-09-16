import java.util.Scanner;

public class signCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println(num + " is neither negative nor positive.");
        }
        else if(num > 0){
            System.out.println("Positive number.");
        }
        else{
            System.out.println("Negative number");
        }
    }
    
}
