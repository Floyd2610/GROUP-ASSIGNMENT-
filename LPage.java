package login;

import java.io.*;
import java.util.Scanner;

public class LPage {

    private static String account;
    private static String password;
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your account: ");
        account = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();
        ValidateUserInfo(account, password);
    }


    public static void ValidateUserInfo (String account, String password)
    {
        String l1;
        String l2;
        try {
            BufferedReader us = new BufferedReader(new FileReader("src/Register/UserInfo.csv"));
            BufferedReader ad = new BufferedReader(new FileReader("src/Login/AdminInfo.csv"));

            while ((l1 = us.readLine()) != null && (l2 = ad.readLine()) != null) {
                String[] user = l1.split(",");
                String[] ad = l2.split(",");
                    if ((account.equals(user[1]) && password.equals(user[2])) || account.equals(ad[1]) && password.equals(ad[2])) {
                        System.out.println("Log in successfully!");
                        Menu access = new Menu();
                        access.displayMenu();
                    }if (account.equals(user[1]) || account.equals(ad[1])){
                        System.out.println("Your password incorrect, please try again!");
                    } else {
                    System.out.println("Your account doesn't exist!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

