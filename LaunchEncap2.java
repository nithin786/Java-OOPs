class Employee{
    private int id;
    private String name;
    private double salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
public class LaunchEncap2 {
    public static void main(String [] args){
        Employee emp1= new Employee();
        emp1.setId(45);
        emp1.setName("nithin");
        emp1.setSalary(343.34d);
        int id = emp1.getId();
        if(id == 0)
              System.out.println(id);
        else
              System.out.println("failed");     
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

    }
    
}
