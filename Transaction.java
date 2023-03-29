public class Transaction {
    //Creating a main method
    public static void main(String[]args){
    //creating an objects
        Account sushamaKaile = new Account("Sushama",1001,50000);
        Account vishakhaValse = new Account("Vishakha",1002,75000);
        Account priyaJadhav= new Account("Priya",1003,90000);
        Account adarshJadhav = new Account("Adarsh",1004,100000);


    // Sushama Kaile Bank Transaction 
        System.out.println("Sushama's Account Balance is: "+ sushamaKaile.get_balance());
    // Sushama Kaile add money in her Account
        sushamaKaile.deposite(50000);
        System.out.println("Sushama's Account Balance After Deposite: "+ sushamaKaile.get_balance());
    // Sushama Kaile Withdrawing a Money 
        sushamaKaile.withdraw(10000);
        System.out.println("Sushama's Account Balance After Withdraw: "+sushamaKaile.get_balance());
    // Susha Kaile Added intrest
        sushamaKaile.add_intrest(0.05);
        System.out.println("Sushama's Account Banalce With Intrest: "+ sushamaKaile.get_balance());
    



    //Vishakhas Transctions
        System.out.println("Vishakha's Account Balance is: "+ vishakhaValse.get_balance());
        vishakhaValse.deposite(25000);
        System.out.println("Vishakha's Account Balance After Deposite: "+ vishakhaValse.get_balance());
        vishakhaValse.withdraw(10000);
        System.out.println("Vishakha's Account Balance After Withdraw: "+vishakhaValse.get_balance());
        vishakhaValse.add_intrest(0.02);
        System.out.println("Vishakha's Account Banalce With Intrest: "+ vishakhaValse.get_balance());

    //Priyas Transctions
        System.out.println("Priya's Account Balance is: "+ priyaJadhav.get_balance());
        priyaJadhav.deposite(15000);
        System.out.println("Priya's Account Balance After Deposite: "+ priyaJadhav.get_balance());
        priyaJadhav.withdraw(5000);
        System.out.println("Priya's Account Balance After Withdraw: "+priyaJadhav.get_balance());
        priyaJadhav.add_intrest(0.05);
        System.out.println("Priya's Account Banalce With Intrest: "+ priyaJadhav.get_balance());
        
    //Adarsh Transctions 
        System.out.println("Adarsh's Account Balance is: "+ adarshJadhav.get_balance());
        adarshJadhav.deposite(50000);
        System.out.println("Adarsh's Account Balance After Deposite: "+ adarshJadhav.get_balance());
        adarshJadhav.withdraw(10000);
        System.out.println("Adarsh's Account Balance After Withdraw: "+adarshJadhav.get_balance());
        adarshJadhav.add_intrest(0.09);
        System.out.println("Adarsh's Account Banalce With Intrest: "+ adarshJadhav.get_balance());




    }
}
