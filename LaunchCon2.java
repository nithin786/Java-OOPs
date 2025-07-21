class vehicle{
    private int age;
    private String name;
    vehicle(){

    }
    vehicle(int age, String name){
        this.age=age;
        this.name=name;
    
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}
public class LaunchCon2 {
    public static void main(String []args){
        vehicle vh= new vehicle(65, "nithin");
        System.out.println(vh.getAge());
        System.out.println(vh.getName());


    }
    
}
