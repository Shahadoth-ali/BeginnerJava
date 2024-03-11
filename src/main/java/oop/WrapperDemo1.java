
package oop;


public class WrapperDemo1 {
    public static void main(String[] args) {
        //object-->premitive data type
        Double d=new Double(10.5);
        System.out.println("d= "+d);
        
        double e=d.doubleValue();
        //double e=d;  d.doubleValue()---unboxing
        System.out.println("e= "+e);
    }
 
}
