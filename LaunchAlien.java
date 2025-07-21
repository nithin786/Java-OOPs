class Alien{
    private int id;
    private String name;
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

public class LaunchAlien {
    public static void main(String []args){
        Alien al= new Alien();
        al.setId(43);
        al.setName("nithin");
        System.out.println(al.getId());
        System.out.println(al.getName());
        System.out.println("**********************");
        Alien al1= new Alien();
        al1.setId(23);
        al1.setName("mansha");
        System.out.println(al1.getId());
        System.out.println(al1.getName());
        System.out.println("**********************");


        Alien al2= new Alien();
        al2.setId(54);
        al2.setName("narayana");
        System.out.println(al2.getId());
        System.out.println(al2.getName());


    }
    
}
