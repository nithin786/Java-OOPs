class Alpha{
    static int num1;
    int num2;
    static{
        num1=4;
        System.out.println("static block");
    }
    {
        System.out.println("java block----> Non static");
    }
    Alpha(){
        num2=5;
        System.out.println("Alpha block");
    }
    Alpha(int num2){
        System.out.println("one param constructor");
        this.num2=num2;
    }
    void disp(){
        System.out.println("non static disp method");
        System.out.println(num1);
        System.out.println(num2);
    }
    static void disp1(){
        System.out.println("static disp method");
        System.out.println(num1);
    }
}
public class LaunchStatic2 {
    public static void main(String[ ] args){
        System.out.println("main method");
        Alpha alp=new Alpha(87);
        alp.disp();
        Alpha.disp1();
        Alpha alp1=new Alpha(98);
        alp1.disp();
    }
}
