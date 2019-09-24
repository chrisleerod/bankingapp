public class Savings extends Account {
    public Savings(){
    }

    public Savings(String name, long taxID, double balance){
        name = super.GetName();
        taxID = super.GetTaxID();
        balance = super.GetBalance();
    }

    public void dodeposit(double amount){
        SetBalance(GetBalance() + amount);
        last10deposits[numdeposits] = amount;
        numwithdraws++;
    }

    public void dowithdraw(double amount){
        SetBalance(GetBalance() - amount);
        last10withdraws[numwithdraws] = amount;
        numwithdraws++;
    }

    public void display(){
        for (int i = 0; i < last10deposits.length; i++){
            System.out.println("Your last 10 deposits are: " + last10deposits[i] + " Withdraws: " + last10withdraws[i]);
        }
    }
}
