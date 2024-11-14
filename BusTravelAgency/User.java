import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Busagency ba = new Busagency();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Agency Name");
            System.out.println("2. Bus Type");
            System.out.println("3. Route");
            System.out.println("4. Time");
            System.out.println("5. User Information");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ba.agencyName();
                    break;
                case 2:
                    ba.bus();
                    break;
                case 3:
                    ba.route();
                    break;
                case 4:
                    ba.time();
                    break;
                case 5:
                    ba.userinfo();
                    break;
                case 6:
                    System.out.println("Thank you! Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

class Busagency {
    void agencyName() {
        System.out.println("Agency Name: VRL");
    }

    void bus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Bus Type:");
        System.out.println("1. AC Sleeper");
        System.out.println("2. Non-AC Sleeper");
        int busChoice = sc.nextInt();

        switch (busChoice) {
            case 1:
                System.out.println("You selected: AC Sleeper");
                break;
            case 2:
                System.out.println("You selected: Non-AC Sleeper");
                break;
            default:
                System.out.println("Invalid choice for bus type.");
        }
    }

    void route() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Route:");
        System.out.println("1. Bangalore to Belagavi");
        System.out.println("2. Belagavi to Mysore");
        int routeChoice = sc.nextInt();

        switch (routeChoice) {
            case 1:
                System.out.println("You selected route: Bangalore to Belagavi");
                break;
            case 2:
                System.out.println("You selected route: Belagavi to Mysore");
                break;
            default:
                System.out.println("Invalid choice for route.");
        }
    }

    void time() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Departure Time:");
        System.out.println("1. 9 PM to 7 AM");
        System.out.println("2. 8 PM to 6 AM");
        int timeChoice = sc.nextInt();

        switch (timeChoice) {
            case 1:
                System.out.println("You selected: 9 PM to 7 AM");
                break;
            case 2:
                System.out.println("You selected: 8 PM to 6 AM");
                break;
            default:
                System.out.println("Invalid choice for time.");
        }
    }

    void userinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        String username = sc.next();
        System.out.println("Enter user mobile number:");
        long mobile = sc.nextLong();
        System.out.println("Thanks for choosing our agency, " + username + "!");
    }
}
