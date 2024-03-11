
package beginnerjava;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int id;
        String title;
        int price;
        String description;
        String category;
        
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter id: ");
        id=input1.nextInt();
        System.out.println("id is :"+id);
        
        Scanner input2=new Scanner(System.in);
        System.out.println("enter title:");
        title=input2.nextLine();
        System.out.println("title is: "+title);
        
        Scanner input3=new Scanner(System.in);
        System.out.println("enter price:");
        price=input3.nextInt();
        System.out.println("price is: "+price);
        
        Scanner input4=new Scanner(System.in);
        System.out.println("description:");
        description=input4.nextLine();
        System.out.println("description is: "+description);
        
        Scanner input5=new Scanner(System.in);
        System.out.println("enter category:");
        category=input5.nextLine();
        System.out.println("category is: "+category);
        
    }
}
