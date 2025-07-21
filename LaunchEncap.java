class Student{
    private int age;
    void setage(int age)
    {
        this.age=age;
    }
    int getage()
    {
        return age;
    }

}

public class  LaunchEncap{
    public static void main(String[] args){
        Student stu= new Student();
        stu.setage(2);
        System.out.println(stu.getage());
        // stu.age=18;
        // System.out.println(stu.age);

        Student stu1= new Student();
        stu1.setage(32);
        System.out.println(stu1.getage());




    }

}