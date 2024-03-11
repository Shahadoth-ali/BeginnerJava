
package array_demo;

public class Array3 {
    public static void main(String[] args) {
//        String[] names=new String[4];
//        names[0]="shahadoth";
//        names[1]="rojina";
//        names[2]="rubayet";
//        names[3]="mahiya";

//          for (int i = 0; i < 4; i++) {
//            System.out.println(names[i]);
//        }

          String[] names={"shahadoth","rojian","rubayet","mariya"};
        for(String x : names){
            System.out.println(x);
        }
        int[] numbers={10,20,30,40,50,60};
        int sum=0;
        for(int x: numbers){
            sum=sum+x;
        }
        System.out.println(sum);
       
    }
}
