
package beginnerjava;

import java.util.Scanner;

public class VowelConsonantDemo2 {
    public static void main(String[] args) {
              Scanner input=new Scanner(System.in);
        
        char letter;
        System.out.println("enter a letter:");
        letter=input.next().charAt(0);
        
        if(letter=='a' || letter=='A' || letter=='e' || letter=='E'
                 || letter=='i' || letter=='I' || letter=='o' || letter=='O'
                || letter=='u' || letter=='U'){
            System.out.println("vowel");
        }
      else{
            System.out.println("consonant");
        }
    }
}
