
package beginnerjava;
import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter first number");
        num1=input.nextInt();
        System.out.println("enter second number");
        num2=input.nextInt();
       int large=(num1>num2) ? num1 : num2;
        System.out.println("large number is "+large);
    }
}
