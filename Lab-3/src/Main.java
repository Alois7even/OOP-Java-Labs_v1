public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Alois");
        account.setBalance(500);

        account.displayAccount();
    }
}