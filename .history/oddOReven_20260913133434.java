import java.util.Scanner;

public class oddOReven {

    public static void main(String[] args) {
        
        System.out.print("Enter a number = ");


        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();


        if(num == 0){
            System.out.println("0 is neither a even number nor a odd number");
        }
        else if(num % 2 == 0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
    
}
