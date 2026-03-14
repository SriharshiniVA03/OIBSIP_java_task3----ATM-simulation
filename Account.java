import java.util.*;

//TASK 3 - ATM 
class Account {
    String userId = "user123";
    String userPin = "1234";
    double balance = 10000;
    ArrayList<String> history = new ArrayList<>();

    public boolean login(String id, String pin) {
        return userId.equals(id) && userPin.equals(pin);
    }

    public void deposit(double amount) {
        balance += amount;
        history.add("Deposited: " + amount);
        System.out.println("Deposit Successful");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void transfer(double amount, String receiver) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Transferred " + amount + " to " + receiver);
            System.out.println("Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}