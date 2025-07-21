import java.util.Scanner;

public class LaunchArray7 {
    public static void main(String[]args ){
        int arr[][][] = new int[3][5][5];
        Scanner Scan = new Scanner(System.in);
        for(int i =0; i<arr.length; i++){
            System.out.println("classes : " + (i + 1));
            for(int j=0; j<arr[i].length;j++){
                System.out.println("students : " + (j + 1));
                for(int k=0; k<arr[i][j].length;k++){
                    System.out.println("subjects : " + (k + 1)) ;
                    arr[i][j][k]=Scan.nextInt();
                }

            }
        }
        System.out.println("\n--- Displaying All Marks ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Class " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("  Student " + (j + 1) + ": ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        
    }

}
