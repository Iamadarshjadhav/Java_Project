public class Account {
    public String accName;
    public int accNumber;
    private double accountBalance;
    private double intrestRate=0.05;
public Account(String name, int number, double balance){
   accName =name;
   accNumber= number;
    accountBalance= balance;
    
}
public double deposite(double amount){
    accountBalance= accountBalance + amount;
    return accountBalance;

}
public double withdraw(double amount){
    accountBalance=accountBalance -amount;
    return accountBalance;

}
public double add_intrest(Double amount){
    accountBalance= accountBalance +(accountBalance*intrestRate);
    return accountBalance;
}
public double get_balance(){
    return accountBalance;
}
}
