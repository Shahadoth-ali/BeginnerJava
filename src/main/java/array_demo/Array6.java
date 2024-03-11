
package array_demo;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] A=new int[2][3];
        int[][] B=new int[2][3];
        int[][] C=new int[2][3];
        
        //getting input for A matrix
        System.out.println("enter element for a matrix");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf("A[%d][%d]= ",row,column);
                A[row][column]=input.nextInt();
            }
        }
        //printing for A matrix
        System.out.println("A=");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" "+A[row][column]);
            }
            System.out.println("");
        }
        //getting input for B matrix
        System.out.println("enter element for B matrix");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                 System.out.printf("B[%d][%d]= ",row,column);
                B[row][column]=input.nextInt();
            }
        }
        //printing for B matrix
        System.out.println("B=");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" "+B[row][column]);
            }
            System.out.println("  ");
        }
        
        //adding A and B matrix
        System.out.println("A+B=");
        for (int row = 0; row <2; row++) {
            for (int col = 0; col <3; col++) {
                C[row][col]=A[row][col]+B[row][col];
                System.out.print(" "+C[row][col]);
            }
            System.out.println(" ");
            
        }
    }
 
}
