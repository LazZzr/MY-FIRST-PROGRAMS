import java.util.Scanner;

public class BankSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        //DECLARER AN VARIABLE
       double balance = 0;
       int choice;
       boolean isRuning = true;

       // APPLY WHILE LOOP TO TAKE INPUT UNTIL YOU WANT
       while(isRuning) {
           System.out.println("--------------------------------");
           System.out.println("WELCOME TO OUR BANK ");
           System.out.println("--------------------------------");

           System.out.println("1. SHOWING YOUR CURRENT BALANCE");
           System.out.println("2. DEPOSIT YOUR AMOUNT ");
           System.out.println("3. WITHDRAW AN AMOUNT ");
           System.out.println("4. EXITS THE PROGRAM ");
           System.out.println("--------------------------------");
           System.out.print("PLEASE ENTER YOUR CHOICE  :");
           choice = sc.nextInt();

           // SELECT OPTION
           switch (choice){
               case 1:
                     System.out.println("YOUR CURRENT BALANCE IS ");
                     System.out.println(balance);
                     break;
               case 2:
                   balance += deposit();
                   break;
               case 3:
                   balance -= withdraw();
                   break;
               case 4:
                   isRuning = false;
                   break;
               default :
                   System.out.println("INVALID CHOICE");
           }

       }
    }


    // CREATE A STATIC METHOD TO DEPOSIT BALANCE
   static double deposit()
   {
       double amount;
       System.out.print("Please enter the amount you want to deposit:");
       amount = sc.nextDouble();

       if(amount<0)
       {
           System.out.println("Invalid amount");
       }
       else
       {
           return amount;
       }
       return amount;
   }

   // CREATE STATIC METHOD TO WITHDRAW BALANCE
   static  double withdraw()
   {
       double amount ;
       System.out.print("Please enter the amount you want to withdraw:");
       amount = sc.nextDouble();

       if(amount<0)
       {
           System.out.println("Invalid amount");
       }
       else
       {
         return amount;
       }

       return amount;
   }


}
