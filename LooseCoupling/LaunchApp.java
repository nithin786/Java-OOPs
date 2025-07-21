package LooseCoupling;

public class LaunchApp {
    public static void main(String[]args){
        Flipkart fp = new Flipkart();
        //BlueDart bd = new BlueDart();
        fp.setDef(new BlueDart());
        boolean status = fp.deliver();
        if(status)
        System.out.println(" succesfully delivered");
        else
        System.out.println("Failed to deliver");


    }

}
