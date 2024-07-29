import java.util.*;

public class ATM_project{
    public static void main(String[] args){
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number:");
        int password = scanner.nextInt();
         if(password == pin){
            System.out.println("Enter your name:");
            name = scanner.next();
            System.out.println("Welcome " +name);

            while(true){
                System.out.println("\nPress 1 to check Balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to withdraw amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("press 5 to exit");
                System.out.println();
                int opt = scanner.nextInt();
                if(opt == 5){
                            System.out.println("Thankyou");
                            break;
                        }    
                switch(opt){
                    case 1:
                        System.out.println("Your current balance is " +balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to Add to your account:");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance += AddAmount;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = scanner.nextInt();
                        if(TakeAmount > balance){
                            System.out.println("In-sufficent balance");
                            System.out.println("Try less than your available balance");

                        }
                        else{
                            System.out.println("Successfully taken\n");
                            balance -= TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to ALL in one Mini Atm");
                        System.out.println();
                        System.out.println("Available balance is =" +balance);
                        System.out.println("Amount deposited     =" +AddAmount);
                        System.out.println("Amount debited       ="+TakeAmount);
                        System.out.println("Thanks for Coming");
                        break;
                    
                    default:
                        System.out.println("press the number below 5 to exit");
                        break;

                }
                 
            }
         }//if
         else{
            System.out.println("Wrong PIN number");
         }

    }
}