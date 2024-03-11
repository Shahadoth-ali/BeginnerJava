
package array_demo;

public class Array5 {
    public static void main(String[] args) {
             int[][] number=new int[2][3];
        
        number[0][0]=10;
        number[0][1]=10;
        number[0][2]=10;
        number[1][0]=10;
        number[1][1]=10;
        number[1][2]=10;
        
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.println("");
        }
    }
 
}
