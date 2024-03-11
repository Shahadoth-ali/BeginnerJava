
package beginnerjava;
import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        char letter;
        System.out.println("enter a letter:");
        letter=input.next().charAt(0);
        
        if(letter=='a'){
            System.out.println("vowel");
        }
        if(letter=='e'){
            System.out.println("vowel");
        }
        if(letter=='i'){
            System.out.println("vowel");
        }
        if(letter=='o'){
            System.out.println("vowel");
        }
        if(letter=='u'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
