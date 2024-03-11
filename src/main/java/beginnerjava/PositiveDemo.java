
package beginnerjava;
import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("enter a int number:");
        num=input.nextInt();
        
        if(num>0){
            System.out.println("this is a positive number");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
        
    }
}
