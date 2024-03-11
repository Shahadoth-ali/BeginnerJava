
package beginnerjava;
import java.util.Scanner;

//F=9/5*c+32
public class TemperatureDemo {
    public static void main(String[] args) {
        double temperature;
        double f;
        Scanner input=new Scanner(System.in);
        System.out.println("enter celcious temp:");
        temperature=input.nextDouble();
        f=temperature*9/5+32;
        System.out.println("Ferrenhite temp is: "+f);
    }
}
