
package oop;

public class WrapperDemo {
    public static void main(String[] args) {
        //primitive-->object
        int x=30;
        Integer y=Integer.valueOf(x);
        System.out.println("y= "+y);
        
        Integer z=x;//Integer.valueOf(x)-->autoboxing
        System.out.println("z= "+z);
    }
}
