import java.util.Random;
import java.util.Scanner;

public class NumberGassing {
 public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     Random rand = new Random();

     int first = 1;
     int attemted=0;

     System.out.println("------------------------------------");
     System.out.print("ENTER NUMBER FIRST :");
     int start=sc.nextInt();
     System.out.print("ENTER NUMBER LAST :");
     int end=sc.nextInt();
     System.out.println("YOU ARE SELEACTING NUMBERS "+start+" TO "+end+" NUMBER GASSING GAME");

     
     int computerGuase = rand.nextInt(start,end+1);

     Boolean ture = true;

while(first<=100) {
    System.out.print("ENTER YOUR GASSING NUMBER:");
    int gassingNumber = sc.nextInt();
     attemted++;

    if (computerGuase == gassingNumber) {
        System.out.println("YOU WON THE MATCH");
        break;
    } else if (computerGuase > gassingNumber) {
        System.out.println("ENTER NUMBE IS SO LOW");
        break;
    } else if (computerGuase < gassingNumber) {
        System.out.println("ENTER NUMBER IS SO HIGH");
        break;
    } else {
        System.out.println("TRY AGAIN");
    }

    }

 }
}
