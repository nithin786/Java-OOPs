interface FI{
    int disp(int a,int b);
}

public class LaunchLambda2 {
    public static void main(String[]args){
        FI f = (a,b)-> {
            System.out.println("Implemented in Lambda" + a + b);
            return a;
        };
        f.disp(45, 3);

    }

}
