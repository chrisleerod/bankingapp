/* Name: Chris Rodriguez
# Date: 9/23/2019
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description: The Bank Account Class allows for updates and
modification to the child classes.
# Input: The user types commands such as ........... (explain
commands)."
# Output:The program will display the rolling balance of each of the
classes.
*/
public class Account {
    private String name;
    private long taxID;
    private double balance;
    protected double[] last10withdraws = new double[10];
    protected double[] last10deposits = new double[10];
    protected int numdeposits=0;
    protected int numwithdraws=0;

    private Account(String name, long taxID, double balance){
    }

    Account() {
    }

    public void SetName(){
        name = name;
    }

    public void SetTaxID(){
        taxID = taxID;
    }

    public void SetBalance(double bal){
        balance = bal;
    }

    //returns the given variables in order to call on them in run_bank
    public String GetName(){
        return name;
    }

    public long GetTaxID(){
        return taxID;
    }

    public double GetBalance(){
        return balance;
    }

    public void display(){
        System.out.println("Balance: " + GetBalance() + "\n" + "Name: " + GetName() + "\n" + "Tax ID: " + GetTaxID());
    }
}
