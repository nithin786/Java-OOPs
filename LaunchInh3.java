class Alpha{
    Alpha(){
        System.out.println("Alpha constructor");
    }
}
class Beta extends Alpha{
    Beta(){   
        System.out.println("Beta constructor");
    }
}
// class Alpha{
//     void disp(){
//         System.out.println(" nithin loves mansha");
//     }
//     void show(){
//         System.out.println(" mansha loves nithin");
//     }
// }
// class Beta extends Alpha{
//     void show(){
//         System.out.println(" both love each other");
//     }
//     void hye(){
//         System.out.println("Speclized method");
//     }
// }
public class LaunchInh3 {
    public static void main(String[]args){
        Alpha b = new Beta(); // upcasting
        // b.disp();
        // b.show();
        // ((Beta) b).hye(); // dowm casting
    }
}