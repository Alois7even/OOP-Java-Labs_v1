public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Alex");
        account.setBalance(500);

        System.out.println("First balance:");
        System.out.println(account.getBalance());

        account.setBalance(-200);

        System.out.println("Final balance:");
        System.out.println(account.getBalance());
    }
}