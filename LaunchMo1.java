class Addition{
   int  add(int n1, int n2)
    {
        return n1+n2;
    
    }
    int  add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    
    }
    float  add(float n1, float n2)
    {
        return n1+n2;
    
    }
    float  add(float n1, float n2, float n3)
    {
        return n1+n2+n3;
    
    }
    double add(int n1, int n2, double n3){
        return n1+n2+n3;
    }
}


public class LaunchMo1 {
    public static void main(String [] aargs){
        Addition ad= new Addition();
       System.out.println( ad.add(7,7));
       System.out.println( ad.add(7,7,9));
       System.out.println(ad.add(2.3f,34.4f,3.4f));


    }
    
}
