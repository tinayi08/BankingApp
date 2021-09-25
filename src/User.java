import java.util.Scanner;

public class User {
    String name;
    int accNum;
    int balance = 1567;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
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
