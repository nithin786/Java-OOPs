package LooseCoupling;

public class Flipkart {
    private IDellivery def;

    public void setDef(IDellivery def) {
        this.def = def;
    }
    public boolean deliver(){

        // boolean status = def.deliverTheProduct(3232.2);
        // return status;
        return def.deliverTheProduct(556.5);
    }



}
