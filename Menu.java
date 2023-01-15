package login;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        String[] menu = {"Home", "Category", "Deals", "Service", "Community", "Quit"};
        Scanner options = new Scanner(System.in);
        int numbers;
        String welcome = "Welcome to the store";
        String goodbye = "Goodbye!";

        while (true) {
            System.out.println(welcome);
            System.out.println("Please select the label that you wish for!");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + " " + menu[i]);
            }
            numbers = options.nextInt();
            switch (numbers) {
                case 1 -> System.out.println("Now in homepage");
                case 2 -> System.out.println("Now in category");
                case 3 -> System.out.println("Now in deals");
                case 4 -> System.out.println("Now in service");
                case 5 -> System.out.println("Now in community");
                case 6 -> {
                    System.out.println(goodbye);
                    return;
                }
                default -> System.out.println("No selection");
            }
        }
    }

}
