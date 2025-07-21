import java.util.Scanner;

class Farmer{
    float pa;
    float td;
    float si;
    static float ri;
    static{
        ri=5.4f;
    }
    void input(){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the amount");
        pa=scan.nextFloat();
        System.out.println("enter the requored time");
        td=scan.nextFloat();
    }
    void findSI(){
        si=(pa*td*ri)/100.0f;
    }
    void dis(){
        System.out.println("the si is: " + si);
    }
}
public class LaunchStatic4 {
    public static void main(String[]args){
        System.out.println("Farmer loan application");
        Farmer f1= new Farmer();
        Farmer f2= new Farmer();
        Farmer f3= new Farmer();
        System.out.println("farmer 1: ");
        f1.input();
        f1.findSI();
        f1.dis();
        System.out.println("farmer 2: ");
        f2.input();
        f2.findSI();
        f2.dis();
        System.out.println("farmer 3: ");
        f3.input();
        f3.findSI();
        f3.dis();
        
    }
    
}
