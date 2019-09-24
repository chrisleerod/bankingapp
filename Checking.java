public class Checking extends Account {
    int [] last10checks = new int[10];

    public Checking(){
        super();
    }

    public Checking(String name, long taxID, double balance){
    }

    public void WriteCheck(int checknum, double amount){
        last10withdraws[numwithdraws] = amount;
        SetBalance(GetBalance() - amount);
        last10checks[numwithdraws] = checknum;
        numdeposits++;
    }

    public void DepositCheck(int checknum, double amount){
        last10deposits[numdeposits] = amount;
        SetBalance(GetBalance() + amount);
        last10checks[numwithdraws] = checknum;
        numwithdraws++;
    }

    public void display(){
        for (int i = 0; i < last10withdraws.length; i++) {
            System.out.println("Your last 10 withdraws are: " + last10withdraws[i] + "Your last 10 check numbers are: " + last10checks[i]);
        }
    }
}
