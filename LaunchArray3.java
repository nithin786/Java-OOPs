import java.util.Scanner;

public class LaunchArray3 {
    public static void main(String[]args){
        int marks[][] = new int[3][];
        marks[0]= new int [4];
        marks[1]= new int [2];
        marks[2]= new int [3];


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
