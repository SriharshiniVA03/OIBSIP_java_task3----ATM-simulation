import java.util.*;
class ATM {
    Account acc = new Account();
    Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("Welcome to ATM");

        System.out.print("Enter User ID: ");
        String id = sc.next();

        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if (!acc.login(id, pin)) {
            System.out.println("Invalid Credentials");
            return;
        }

        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1.Transaction History");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Transfer");
            System.out.println("5.Quit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    acc.showHistory();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;

                case 4:
                    System.out.print("Enter receiver name: ");
                    String r = sc.next();
                    System.out.print("Enter amount: ");
                    double t = sc.nextDouble();
                    acc.transfer(t, r);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
