
package beginnerjava;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);//Scanner class kono
        // package e create kora ache
        int number;
        System.out.print("Enter any number: ");
        number=input.nextInt();
        System.out.println("The number is: "+number);
        
        Scanner input1=new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name=input1.next();
        System.out.println("welcome :"+name);
        
        Scanner input2=new Scanner(System.in);
        String name1;
        System.out.println("Enter your name:");
        name1=input2.nextLine();
        System.out.println("welcome: "+name1);
    }
}
