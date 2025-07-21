class Aeroplane{
   public void fly(){
        System.out.println("Aeroplane flies");
    }
    protected void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void planeLastingAge(){
        System.out.println("Can run upto 29ages");
    }
    public Animal planeCanTake(){
        Animal an=new Animal();
        return an;
    }
}
class Cargoplane extends Aeroplane{
    public void fly(){
        System.out.println("Cargoplane flies at lower hieght");
    }
    public void takeOff(){
        System.out.println("Cargoplane Aeroplane is taking off");  
    }
    public void planeLastingAge(){
        System.out.println(" Cargoplane Can run upto 29ages");
    }
    public Deer planeCanTake(){
        Deer dd=new Deer();
        return dd;
    }
}
public class LaunchInh6 {
    public static void main(String[]args){
        Cargoplane car= new Cargoplane();
        car.fly();
    }
}
