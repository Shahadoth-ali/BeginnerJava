
package beginnerjava;
import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("enter a number: ");
        num=input.nextInt();
        
        for (int i = 1; i <=10; i++) {
            System.out.println(i+"x"+num+"="+i*num);
            
        }
        
    }
   
}
