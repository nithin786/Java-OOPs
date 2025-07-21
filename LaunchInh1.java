class Telusko{
    int age;
    void disp(){
        System.out.println("nithin loves mansha");
    }
    void course(){
        System.out.println("telusko have java courses");
    }
   
}
class Alien extends Telusko{
    void show(){
        age =10;
        System.out.println("nithin age: " + age);
    }
    void course(){
        System.out.println("telusko have started new course");
    
    }

}
public class LaunchInh1 {
    public static void main(String[]args){
        Alien ai= new Alien();
        ai.disp();
        ai.show();
        ai.course();

    }
    
}
