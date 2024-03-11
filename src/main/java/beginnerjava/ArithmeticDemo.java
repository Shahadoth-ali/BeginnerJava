
package beginnerjava;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1,num2;
       Scanner input1=new Scanner(System.in);
        System.out.println("enter first number:");
        num1=input1.nextInt();
        
        Scanner input2=new Scanner(System.in);
        System.out.println("enter second number:");
        num2=input2.nextInt();
        int result;
        
        result=num1+num2;
        System.out.println("sum is: "+result);
        
        result=num1-num2;
        System.out.println("sub is: "+result);
        
        result=num1*num2;
        System.out.println("mul is: "+result);
        
        result=num1/num2;
        System.out.println("division is: "+result);
        
        result=num1%num2;
        System.out.println("remind is: "+result);
        
    }
}
