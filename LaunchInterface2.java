interface Telusko{
    void show();
    default void disp(){
        System.out.println(" hello mansha");
    }
    static void hello(){
        System.out.println(" Hello static");
    }
}
class Alien implements Telusko{
    public void disp(){
        System.out.println(" hello nithin");
    }
    @Override
    public void show() {
        System.out.println("hello lavanya");
    }
}
public class LaunchInterface2 {
    public static void main(String []args){
        Alien ai= new Alien();
        ai.disp();
        ai.show();
        Telusko.hello();;

    }  
}
