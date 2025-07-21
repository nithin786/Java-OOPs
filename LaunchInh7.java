abstract class Aeroplane{
    public abstract void fly();
     protected abstract void takeOff();
 }
class Cargoplane extends Aeroplane{
    public void fly(){
        System.out.println("Cargoplane flies at lower hieght");
    }
    protected void takeOff(){
        System.out.println("Cargoplane is taking off");
    }
}
class FighterPlane extends Aeroplane{
    public void fly(){
        System.out.println("FighterPlane flies at lower hieght");
    }
    protected void takeOff(){
        System.out.println("FighterPlane is taking off");
    }
}
class Passenger extends Aeroplane{
    public void fly(){
        System.out.println("Passenger flies at lower hieght");
    }
    protected void takeOff(){
        System.out.println("Passenger is taking off");
    }
}
class Airport{
    public void permit(Aeroplane ref){
        ref.fly(); // 1: M     --> Polymorphism
        ref.takeOff();
    }
}
public class LaunchInh7 {
    public static void  main(String[]args){
        Cargoplane cp = new Cargoplane();
        FighterPlane fp = new FighterPlane();
        Passenger pp = new Passenger();
        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);
        // cp.fly();
        // cp.takeOff();
        // fp.fly();
        // fp.takeOff();
        // pp.fly();
        // pp.takeOff();
    }   
}
