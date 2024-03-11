
package beginnerjava;
import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.println("enter a number:");
        num1=input.nextInt();
        
        for (int i = 2; i <num1; i++) {
            if(num1%i==0){
                System.out.println("this is not a prime number");
                break;
            }else{
                System.out.println("this is a prime number.");
                break;
            }
        }
    }
}
