import java.util.Scanner;

public class User {
    private String name;
    private int accNum;
    private int balance = 1567;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void createUser() {
        System.out.println("Hello");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        this.name = scan.next();
        System.out.println("Please enter your account number:");
        this.accNum = scan.nextInt();

    }

}
