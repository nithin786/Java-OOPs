//final


class Car{
    public final void carryPassenger(){
        final double pi=3.14;
        System.out.println(" car carry passengers");
    }
}
class Hyundai extends Car{
    // public void carryPassenger(){
    //     System.out.println(" Hyundai car carry passengers");
    // }
}


public class LaunchInh10 {
    public static void main(String []args){
        Hyundai hy = new Hyundai();
        hy.carryPassenger();

    }
    
}
