package LooseCoupling;

public class BlueDart implements IDellivery {

    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("The priduct is delivery by Bluedart");
        return true;
    }
    


}
