
package beginnerjava;


public class IncrementDecrement {
    public static void main(String[] args) {
        int x=25;
        int y;
        
        y=x++;//post increment || x er man hobe 26
               //and erpor x pele ta change hbe
        System.out.println("y="+y);
        
        y=++x;
        System.out.println("y="+y);
        
        int a=12;
        int b;
        b=--a;
        System.out.println("b="+b);
        b=a--;
        System.out.println("b="+b);
                
    }
}
