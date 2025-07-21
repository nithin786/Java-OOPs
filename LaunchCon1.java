class Employee{
    private int id;
    private String name;

    Employee(int id, String name)
    {
        System.out.println( " param consturctur ");
        this.id=id;
        this.name=name;
    }
    Employee(){
        System.out.println(" zero param consturctur");

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}





public class LaunchCon1 {
    public static void main(String []args){
        Employee emp= new Employee(44,"mansha");
           emp.setId(33);
           emp.setName("nithin");
           System.out.println(emp.getId());
           System.out.println(emp.getName());
           Employee emp1= new Employee(54, "lavanya");
           System.out.println(emp1.getId());
           System.out.println(emp1.getName());


    }
    
}
