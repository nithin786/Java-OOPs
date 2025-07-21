interface Calc{
    void add(); //public abstract void add();
    void sub(); //public abstract void sub();
}
class MyCalc implements Calc{
    public void add(){
        int a=10;
        int b=20;
        int res=a+b;
        System.out.println(res);
    }
    public void sub(){
        int a= 9;
        int b=3;
        int res =a-b;
        System.out.println(res); 
    }
}
public class LaunchInterface {
    public static void main(String []args){
        MyCalc my = new MyCalc();
        my.add();
        my.sub();

    }
    
}
