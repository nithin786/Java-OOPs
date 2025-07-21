import java.util.Scanner;

public class LaunchArray2 {

    public static void main(String[]args){
        int marks[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);
        for(int i =0; i<marks.length; i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("Enter marks of class " + i + " Student " + j);
                marks[i][j] = scan.nextInt();
            }
        }
        for(int i =0; i<marks.length; i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j] + "  ");
                
            }
            System.out.println();
        }
        
        

    }
}
