
package beginnerjava;
import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Do you love java?");
        System.out.println("y/Y/n/N");
        ch=input.nextLine().charAt(0);
        
        if(ch=='y' || ch=='Y'){
            System.out.println("java lover");
        }else if(ch=='n' || ch=='N'){
            System.out.println("you are not a java lover");
        }
    }
}
