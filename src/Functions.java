import java.util.Scanner;

public class Functions {

    Scanner scan = new Scanner(System.in);
    int deposit;
    User user;

    public void showBalance () {
        System.out.println("Your current balance is " + this.user.getBalance());
    }

    public void deposit () {
        System.out.println("How much would you like to deposit?");
        this.deposit = scan.nextInt();
        this.user.balance = this.user.getBalance() + this.deposit;
        System.out.println("Your balance is now " + this.user.balance);
    }
}
