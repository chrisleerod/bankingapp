public class CreditCard extends Account {
    long cardnumber;
    String [] last10charges = new String[10];
    public CreditCard(){
    }

    public CreditCard(String name, long taxID, double balance){
    }

    public void DebitCharge(String name, double amount){
        last10withdraws[numwithdraws] = amount;
        SetBalance(GetBalance() - amount);
        last10charges[numwithdraws] = name;
        numwithdraws++;
    }

    public void MakePayment(double amount){
        last10deposits[numdeposits] = amount;
        SetBalance(GetBalance() - amount);
        numdeposits++;
    }

    public void display(){
        for (int i = 0; i < last10deposits.length; i++){
            System.out.println("Your last 10 deposits are: " + last10deposits[i] + "Your last 10 charges: " + last10charges[i] + " Amount " + last10withdraws[i]);
        }
    }
}
