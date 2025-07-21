@FunctionalInterface
interface ITelusko{
    void disp();
}
class Alien implements ITelusko{

    @Override
    public void disp() {
        System.out.println("Implemented in Alien class");
    }
    
}
public class LaunchLambda1 {
    public static void main(String[]args){
        ITelusko t=()-> System.out.println("Implementes in Lambda");
        t.disp();

    }

}
