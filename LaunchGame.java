import java.util.Scanner;
class Guesser{
    int num;
    int guessingNumber(){
        System.out.println(" Guesser please guess the numer");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
}
class Player{
    int num;
    int guessingNumber(){
        System.out.println(" player1 please guess the numer");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
    
}
class Umpire{
    int numFromGuesser;
    int num1;
    int num2;
    int num3;
    void collectNumFromGuesser(){
        Guesser guesser = new Guesser();
        numFromGuesser=guesser.guessingNumber();
    }
    void collectNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        num1 =p1.guessingNumber();
        num2 =p2.guessingNumber();
        num3 =p3.guessingNumber();
    }
    void verify(){
        if (numFromGuesser== num1){
            if(numFromGuesser== num3 && numFromGuesser== num2){
                System.out.println("All player won the game");
            }
            else if (numFromGuesser== num2){
                System.out.println(" player 1 and player 2 won the game");
            }
            else if (numFromGuesser== num3){
                System.out.println(" player 1 and player 3 won the game");
            }
            else{
                System.out.println(" player 1");

            }
        }
        else if(numFromGuesser== num2){
            if(numFromGuesser==num3){
                System.out.println(" player2 and player 3 won the game");
            
            }
            else{
                System.out.println(" player 2");

            }
        }
        else if (numFromGuesser== num3){
            System.out.println(" player 3");
        }
        else {
            System.out.println(" Game failed ");
        }
        
    }
   
}
public class LaunchGame {
    public static void main(String [] args){
        Umpire up = new Umpire();
        up.collectNumFromGuesser();
        up.collectNumFromPlayer();
        up.verify();
        

    }
    
}
