import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in degree = ");
        double temp = sc.nextDouble();

        if(temp < 10){
            System.out.println("Very cold...🥶");
        }

        else if(temp >= 10 && temp < 25){
            System.out.println("Moderate...👌");
        }

        else{
            System.out.println("Hot...🥵");
        }

        sc.close();
    }
    
}
