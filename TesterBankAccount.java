public class TesterBankAccount {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.Setdeposits(1000);
        account.Setwithdraws(500);
        account.Setwithdraws(400);
        account.get_Remaining_Balance();
        System.out.println("expected result = "+100);
        account.Setdeposits(900);
        account.AddInterest();
        account.get_Remaining_Balance();
        System.out.println("expected result = "+1100);


    }
}
