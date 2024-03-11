
package beginnerjava;
import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int number;
        System.out.print("enter final number: ");
        number=input.nextInt();
        int sum=0;
        
        for (int i = 1; i <= number; i++) {
            System.out.print(i+"x"+i+"+");
            sum=sum+i*i;
        }
        System.out.println("="+sum);
    }
}
