import java.util.Scanner;

public class LaunchArray {
    public static void main(String[] args) {
        int[][][] marks = new int[3][5][5];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Class " + (i + 1) + " Student " + (j + 1));
                for (int k = 0; k < 5; k++) {
                    System.out.print("Subject " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        // Output
        System.out.println("\n--- All Marks ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Class " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("  Student " + (j + 1) + ": ");
                for (int k = 0; k < 5; k++) {
                    System.out.print(marks[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
