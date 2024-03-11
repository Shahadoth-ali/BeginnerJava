
package array_demo;
import java.util.Scanner;
public class Ass18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        String[] days={"saturday","sunday","monday","tuesday","wed","th","fri"};
        System.out.println("enter a number from 1-7");
        number=input.nextInt();
        for (int i = 0; i <7; i++) {
           if(number==i){
                System.out.println(days[i]);
           }
        }
        
    }
 
}
