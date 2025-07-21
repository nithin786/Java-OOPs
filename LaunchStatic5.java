class Beta{
    static void disp(){
        System.out.println("Disp static method");
    }
    void show(){
        System.out.println("Show non static method");
    }

}


public class LaunchStatic5 {
    public static void main(String[]args){
        Beta b=new Beta();
        //b.disp();
        b.show();
        Beta.disp();


    }
    
}
