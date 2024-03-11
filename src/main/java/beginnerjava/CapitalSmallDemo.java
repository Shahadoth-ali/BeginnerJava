
package beginnerjava;

import java.util.Scanner;

public class CapitalSmallDemo {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        
        char letter;
        System.out.println("enter a letter:");
        letter=input.next().charAt(0);
        if(letter>='a' && letter<='z'){
            System.out.println("small");
        }
       else if(letter>='A' && letter<='Z'){
            System.out.println("capital");
        }else{
            System.out.println("not a letter");
       }
        
    }
}
