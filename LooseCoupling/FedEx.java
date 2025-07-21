package LooseCoupling;

public class FedEx implements IDellivery{
    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("The priduct is delivery by Fedex");
        return true;
    }
    


}
