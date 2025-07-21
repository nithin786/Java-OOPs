import java.util.Scanner;

public class LaunchArray1 {
    public static void  main(String[]args){
        int marks[]= new int [5];
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<5;i++){
            System.out.println("Enter the marks : " + i);
            marks[i]= scan.nextInt();
        }
        System.out.println("************************************");
        for(int i =0; i<5;i++){
            System.out.print(marks[i] + "  ");
        }
        System.out.println();
        

    }

}
