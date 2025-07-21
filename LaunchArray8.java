import java.util.Arrays;

public class LaunchArray8 {
    public static void main(String[]args){
        // int ar[][] = new int[4][4];
        // System.out.println(ar.getClass().getName());
        int a[] ={3,4,5,5,67,7,8,7,0};
        for( int dd : a){
            System.out.print(dd + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for( int dd : a){
            System.out.print(dd + " ");
    
        }


    }

}
