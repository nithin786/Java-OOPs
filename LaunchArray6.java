public class LaunchArray6 {
    public static void main(String[] args) {
        int arr[][] = {{4, 2}, {5, 3}};
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
