class Calc{
    int num1,num2, res;
    // void add (){
    //     num1 = 3;
    //     num2 =4;
    //     res = num1 + num2;
    //     System.out.println(res);
    
    // }
    // void add (int n1, int n2){
    //     num1 = n1;
    //     num2 =n2;
    //     res = num1 + num2;
    //     System.out.println(res);
    
    // }
    // int add()
    // {
    //     num1 = 3;
    //     num2 = 4;
    //     res = num1 + num2;
    //     return res;

    // }
    int add(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
        res = num1 + num2;
        return res;

    }
}




public class LaunchMethod1 {
    public static void main(String [] args){
        Calc cc = new Calc();
        //cc.add();
        //cc.add(4,4 );
        int result = cc.add(4,4);
        System.out.println(result);


    }
    
}
