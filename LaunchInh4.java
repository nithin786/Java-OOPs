class Alpha{
    int a,b;
    Alpha(){
        System.out.println("Alpha zero constructur");
        a=10;
        b=20;
    }
    Alpha(int m,int n){
        System.out.println("Alpha one constructur");
        a=m;
        b=n;
    }
}
class Beta extends Alpha{
    int x,y;
    Beta(){
        super(90,30);
        System.out.println("Beta zero param constructur");
        x=55;
        y=64;
    }
    Beta(int m, int n ){
        //super(m,n);
        this();
        x=m;
        y=n;
        System.out.println("Beta one param constructor");
    }
    void disp(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
public class LaunchInh4 {
    public static void main(String[]agrs){
        Beta b=new Beta(2,4);
        b.disp();



    }
    
}
