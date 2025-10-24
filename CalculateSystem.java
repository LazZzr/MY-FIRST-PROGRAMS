import java.util.Scanner;

public class CalculateSystem {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int choice ;
        boolean isRunning = true;

        while(isRunning){

            System.out.println("_____________________________________");
            System.out.println("        CALCULATOR SYSTEM            ");
            System.out.println("_____________________________________");

            System.out.println("1. SELECT TO ADDITION  ");
            System.out.println("2. SELECT TO SUBTRACTION  ");
            System.out.println("3. SELECT TO MULTIPLICATION");
            System.out.println("4. SELECT TO DIVISION  ");
            System.out.println("5. SELECT TO EXITS  ");
            System.out.println("_____________________________________");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    addition();
                    System.out.println("Your result is : " +addition());
                    break;
                case 2:
                      subtraction();
                      System.out.println("Your result is: " +subtraction());
                      break;
                case 3:
                      multiplication();
                      System.out.println("Your result is: " +multiplication());
                      break;
                case 4:
                      division();
                      System.out.println("Your result is: " +division());
                      break;
                case 5:
                      isRunning = false;
                      break;
            }



        }
    }


    static double addition(){
        double num1;
        double num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        return num1 + num2;
    }

    static double subtraction(){
        double num1;
        double num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        return num1-num2;
    }

    static double multiplication(){
        double num1;
        double num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        return num1*num2;
    }

    static double division(){
        double num1;
        double num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        return num1/num2;
    }

}
