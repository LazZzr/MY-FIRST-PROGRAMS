import java.util.Random;
import java.util.Scanner;


public class Random_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int computer;
        System.out.println("WELCOME TO NUMBER GAME!");
       // System.out.print("ENTER YOUR number:");
        //int number = sc.nextInt();
         computer = r.nextInt(100);
        //System.out.print(computer);
     boolean s = true;
      while(s){
          System.out.print("ENTER YOUR NUMBER:");
        int number = sc.nextInt();
        
        if(number!=computer){
            System.out.println("Oh! Your are Defeat ,'Try Again'! ");
            System.out.println("The Computer number is: " +computer);
        }
        else{
            System.out.println("NICE! YOU WIN THE GAME ");
        }
        if(number==computer){
            break;
        }
      }
      sc.close();
    }
}
