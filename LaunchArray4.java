import java.util.Scanner;

public class LaunchArray4 {
    public static void main(String[]args){
        int ar[]=new int[3];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("enter the number " + i);
             ar[i]=scan.nextInt();
        }

    }

}
