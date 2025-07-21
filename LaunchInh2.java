class Human{
    int age;
    void disp(){
        System.out.println("humans are intelligent");
    }
}
class Employee extends Human{
    void disp(){
        age=34;
        System.out.println("humans are intelligent and good");
    }
}
class Student extends Employee {
    
}
public class LaunchInh2 {
    public static void main(String []args){
        Employee emp= new Employee();
        emp.disp();
        
    }
}
