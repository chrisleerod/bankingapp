import java.util.Scanner;

public class Run_Bank {
    static Account account = new Account();
    static Savings savings = new Savings();
    static CreditCard cc = new CreditCard();
    static Checking chec = new Checking();
    static int check;
    public static Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        savings.SetBalance(100);
        cc.SetBalance(100);
        chec.SetBalance(100);
        //Gives the user an interface that welcomes them and gives them a list of options to choose from
        System.out.println("****************************************************************************");
        System.out.println("                Rodriguez Banking LLC Financial Services             ");
        System.out.println("        Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
        System.out.println("****************************************************************************");
        System.out.println("1. Savings Deposit\n" +
                "2. Savings Withdrawal\n" +
                "3. Checking Deposit\n" +
                "4. Write a Check\n" +
                "5. Credit Payment\n" +
                "6. Make a Charge\n" +
                "7. Display Savings\n" +
                "8. Display Checking\n" +
                "9. Display Credit Balance\n" +
                "10. Exit\n" +
                "Enter your selection");
        int choice = scan.nextInt();
        String decision;
        account.SetBalance(100);
        while(choice != 10) {
            if(choice == 1){
                System.out.println("Would you like to make a deposit? enter y/n");
                decision = scan.next();
                if(decision.contains("y")){
                    System.out.println("How much?");
                    double amount = scan.nextInt();
                    //checks to see if the transaction is possible
                    if(amount > 0) {
                        savings.dodeposit(amount);
                    }
                    else {
                        System.out.println("ERROR: Amount must be positive.");
                    }
                }
                else {
                    System.out.println("1. Savings Deposit\n" +
                            "2. Savings Withdrawal\n" +
                            "3. Checking Deposit\n" +
                            "4. Write a Check\n" +
                            "5. Credit Payment\n" +
                            "6. Make a Charge\n" +
                            "7. Display Savings\n" +
                            "8. Display Checking\n" +
                            "9. Display Credit Balance\n" +
                            "10. Exit\n" +
                            "Enter your next selection");
                    choice = scan.nextInt();
                }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 2){
                System.out.println("Would you like to make a withdraw from savings? enter y/n");
                decision = scan.next();
                        if(decision.contains("y")){
                            System.out.println("How much?");
                            double amount = scan.nextInt();
                            //checks to see if the transaction is possible
                            if(amount > 0) {
                                savings.dowithdraw(amount);
                            }
                            else {
                                System.out.println("ERROR: Amount must be positive.");
                            }
                        }
                        else{
                            System.out.println("1. Savings Deposit\n" +
                                    "2. Savings Withdrawal\n" +
                                    "3. Checking Deposit\n" +
                                    "4. Write a Check\n" +
                                    "5. Credit Payment\n" +
                                    "6. Make a Charge\n" +
                                    "7. Display Savings\n" +
                                    "8. Display Checking\n" +
                                    "9. Display Credit Balance\n" +
                                    "10. Exit\n" +
                                    "Enter your next selection");
                choice = scan.nextInt();
            }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 3){
                System.out.println("Would you like to to make a deposit into Checking? Enter y/n");
                decision = scan.next();
                if(decision.contains("y")){
                    System.out.println("How much?");
                    double amount = scan.nextInt();
                    System.out.println("What's your checking number?");
                    int chenum = scan.nextInt();
                    //checks to see if the transaction is possible
                    if(amount > 0) {
                        chec.DepositCheck(chenum, amount);
                    }
                    else {
                        System.out.println("ERROR: Amount must be positive.");
                    }
                }
                else {
                    System.out.println("1. Savings Deposit\n" +
                            "2. Savings Withdrawal\n" +
                            "3. Checking Deposit\n" +
                            "4. Write a Check\n" +
                            "5. Credit Payment\n" +
                            "6. Make a Charge\n" +
                            "7. Display Savings\n" +
                            "8. Display Checking\n" +
                            "9. Display Credit Balance\n" +
                            "10. Exit\n" +
                            "Enter your next selection");
                    choice = scan.nextInt();
                }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("Enter next selection");
                choice = scan.nextInt();
            }
            if(choice == 4){
                System.out.println("Would you like to write a check? Enter y/n");
                decision = scan.next();
                if(decision.contains("y")){
                    System.out.println("How much?");
                    double amount = scan.nextInt();
                    System.out.println("What is the check number?");
                    int chenum = scan.nextInt();
                    //checks to see if the transaction is possible
                    if(amount > 0 && savings.GetBalance() > amount) {
                        chec.WriteCheck(chenum, amount);
                    }
                    else {
                        System.out.println("ERROR: Amount must be positive or you're trying to overdraft.");
                    }
                }
                else{
                    System.out.println("1. Savings Deposit\n" +
                            "2. Savings Withdrawal\n" +
                            "3. Checking Deposit\n" +
                            "4. Write a Check\n" +
                            "5. Credit Payment\n" +
                            "6. Make a Charge\n" +
                            "7. Display Savings\n" +
                            "8. Display Checking\n" +
                            "9. Display Credit Balance\n" +
                            "10. Exit\n" +
                            "Enter your next selection");
                    choice = scan.nextInt();
                }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 5){
                System.out.println("Would you like to make a credit card payment? Enter y/n");
                decision = scan.next();
                if(decision.contains("y")){
                    System.out.println("How much?");
                    double amount = scan.nextInt();
                    //checks to see if the transaction is possible
                    if(amount > 0) {
                        cc.MakePayment(amount);
                    }
                    else {
                        System.out.println("ERROR: Amount must be positive.");
                    }
                }
                else{
                    System.out.println("1. Savings Deposit\n" +
                            "2. Savings Withdrawal\n" +
                            "3. Checking Deposit\n" +
                            "4. Write a Check\n" +
                            "5. Credit Payment\n" +
                            "6. Make a Charge\n" +
                            "7. Display Savings\n" +
                            "8. Display Checking\n" +
                            "9. Display Credit Balance\n" +
                            "10. Exit\n" +
                            "Enter your next selection");
                    choice = scan.nextInt();
                }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 6){
                System.out.println("Would you like to make a debit charge? Enter y/n");
                decision = scan.next();
                if(decision.contains("y")){
                    System.out.println("How much?");
                    double amount = scan.nextInt();
                    System.out.println("What is the name of the business?");
                    String name = scan.next();
                    // Checks to see if the amount given is not negative and is less than what is in the bank account.
                    if(amount > 0 && cc.GetBalance() >= amount) {
                        cc.DebitCharge(name, amount);
                    }
                    else {
                        System.out.println("ERROR: Amount must be positive and or be less than what you have in your account.");
                    }
                }
                else{
                    System.out.println("Enter your next selection");
                    System.out.println("1. Savings Deposit\n" +
                            "2. Savings Withdrawal\n" +
                            "3. Checking Deposit\n" +
                            "4. Write a Check\n" +
                            "5. Credit Payment\n" +
                            "6. Make a Charge\n" +
                            "7. Display Savings\n" +
                            "8. Display Checking\n" +
                            "9. Display Credit Balance\n" +
                            "10. Exit\n" +
                            "Enter your next selection");
                    choice = scan.nextInt();
                }
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 7){
                savings.display();
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 8){
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 9){
                System.out.println("Savings: " + savings.GetBalance() + " Checking: " + chec.GetBalance() + " Credit Balance: " + cc.GetBalance());
                System.out.println("1. Savings Deposit\n" +
                        "2. Savings Withdrawal\n" +
                        "3. Checking Deposit\n" +
                        "4. Write a Check\n" +
                        "5. Credit Payment\n" +
                        "6. Make a Charge\n" +
                        "7. Display Savings\n" +
                        "8. Display Checking\n" +
                        "9. Display Credit Balance\n" +
                        "10. Exit\n" +
                        "Enter your next selection");
                choice = scan.nextInt();
            }
            if(choice == 10){
                System.out.println("Bye");
                break;
            }
        }
    }
}

