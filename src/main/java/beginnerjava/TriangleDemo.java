
package beginnerjava;
import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        float base;
        float height;
        double area;
        Scanner input1=new Scanner(System.in);
        System.out.print("enter base: ");
        base=input1.nextFloat();
        Scanner input2=new Scanner(System.in);
        System.out.println("enter height");
        height=input2.nextFloat();
        area=0.5*base*height;
        System.out.println("area is: "+area +"sq unit");
    }
  
}
