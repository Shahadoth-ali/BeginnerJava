
package beginnerjava;
import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
         System.out.print("Have you completed your bsc?");
        System.out.println("y/n");
        ch=input.nextLine().charAt(0);
       
        
        if(ch=='y'){
            System.out.print("have you fluent in english?");
            System.out.println("y/n");
            ch=input.nextLine().charAt(0);
            if(ch=='y'){
                System.out.println("you are eligible for the post");
            }else if(ch=='n'){
                System.out.println("you are not eligible");
            }
        }else{
            System.out.println("you are not eligible");
        }
    }
}
