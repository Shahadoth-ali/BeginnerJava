
package beginnerjava;
import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("enter a int num:");
        number=input.nextInt();
        
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
