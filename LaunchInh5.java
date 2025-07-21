class Animal{
    static int age;
    static void disp(){
        System.out.println("Animal static method");
    }
    void show(){
        System.out.println("Animal shoew method");
    }

}
class Deer extends Animal{
    // static void disp(){
    //     System.out.println("Deer static method");
    // }
    void show(){
        System.out.println("Deer show method");
    }
}
public class LaunchInh5 {
    public static void main(String[]args){
        Deer deer= new Deer();
        deer.disp();
        deer.show();
        // Animal.disp();

    }
    
}
