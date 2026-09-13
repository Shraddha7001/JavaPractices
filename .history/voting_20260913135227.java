import java.util.Scanner;

public class voting {

    public static void main(String[] args) {
        
        System.out.print("Enter the age of a person = ");

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age <= 18){

            System.out.println("Person is eligible to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
    }
    
}
