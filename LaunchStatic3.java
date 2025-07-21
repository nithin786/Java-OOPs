//WAP to count number of objects created
class Alien{
    int age;
    static int count;
    {
        System.out.println("non static block");
        count++;

    }
    Alien(){
        age=17;
        
    }
    Alien(int age){
        this.age=age;
        
    }
}




public class LaunchStatic3 {
    public static void main(String[]args){
        Alien ai= new Alien();
        System.out.println(ai.count);
        Alien ai1= new Alien();
        System.out.println(ai1.count);
        Alien ai2= new Alien();
        System.out.println(ai2.count);
    }
    
}
