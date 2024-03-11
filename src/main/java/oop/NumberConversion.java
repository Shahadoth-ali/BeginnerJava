
package oop;

public class NumberConversion {
    public static void main(String[] args) {
        //that means binary,octal,hexa sob string asole
        String binary="1010";
        Integer decimal=Integer.parseInt(binary,2);
        System.out.println("decimal= "+decimal);
        
        String octal="674";
        Integer dec=Integer.parseInt(octal,8);
        System.out.println(dec);
    }
}
