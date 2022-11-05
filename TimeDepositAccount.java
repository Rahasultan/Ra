//Suppose you want to implement a class TimeDepositAccount. A time deposit account has a fixed interest rate
// that should be set in the constructor, together with the initial balance. Provide a method to get the current
// balance. Provide a method to add the earned interest to the account. This method should have no arguments because
// the interest rate is already known. It should have no return value because you already provided a method for
// obtaining the current balance. It is not possible to deposit additional funds into this account. Provide a
// withdraw method that removes the entire balance. Partial withdrawals are not allowed.
public class TimeDepositAccount {
    double balance ,interest;
    public TimeDepositAccount(double intial_balance)
    {
        balance=intial_balance;
        interest=((balance*10)/100);
    }
    public double display_balance()
    {
        return balance;
    }
    public void Add_interest()
    {
        balance=balance+interest;
        System.out.println(balance);
    }
    public void withdraw_balance(double withdraw_amount)
    {
        if(balance==withdraw_amount)
        {
            balance=balance-balance;
            System.out.println("Your full amount has been withdrawn successfully");
        }
        else
            System.out.println("sorry you can not withdraw partial of your balance or or greater than the amount deposited");
    }
    public void deposit_balance(double newer)
    {
        System.out.println("sorry you can not deposit another amount of money");
    }


}

