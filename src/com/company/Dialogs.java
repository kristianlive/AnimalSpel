package com.company;
import java.io.IOException;
import java.util.*;

public class Dialogs {

    static private Scanner scanner = new Scanner(System.in);

    static public void clear() {
        // "clear" the console by printing 60 new lines
        System.out.println("\n".repeat(60));
    }

    static public String prompt(String question) {
        // clear() ? maybe we want a clear before each prompt
        System.out.println(question);
        return scanner.nextLine();// loop 4 gång
    }

    static public int promptInt(String question, int min, int max) {
        var num = min - 1;
        try {
            num = Integer.parseInt(prompt(question));
        } catch (Exception ignore) {
        }
        // if illegal choice show the prompt again (recursion)
        // otherwise return the choice
        return num < min || num > max ?
                promptInt(question, min, max) : num;
    }

    static public int menu(String menuName, String... options) {
        // print the menu
        //clear();
        //System.out.println("-".repeat(50));
        System.out.println("Player Menu: " + menuName);
        System.out.println("-".repeat(50));
        var counter = 1;
        for (var option : options) {
            System.out.println(counter + ". " + option);
            counter++;
        }
        System.out.println("-".repeat(50));
        // wait for the user to make a choice
        var choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (Exception ignore) {
        }
        // if illegal choice show the menu again (recursion)
        // otherwise return the choice
        return choice < 1 || choice > options.length ?
                menu(menuName, options) : choice;
    }

    public static void inputEnter() {
        System.out.println("\nPress Enter to continue...");

        try {
            System.in.read();
        } catch (IOException var1) {
            var1.printStackTrace();
        }

    }
    public static int getInt(int min, int max) {
        System.out.println("\nEnter here: ");
        int intReturn = -1;

        do {
            try {
                intReturn = Integer.parseInt(scanner.nextLine());
                if (intReturn > max || intReturn < min) {
                    System.out.println("A number between " + min + "-" + max);
                }
            } catch (Exception var4) {
                System.out.println("An integer!");
            }
        } while(intReturn == -1 || intReturn > max || intReturn < min);

        return intReturn;
    }
    public static int getInt(int min, int max, int save) {
        System.out.println("\nEnter here: ");
        int intReturn = -1;

        do {
            try {
                intReturn = Integer.parseInt(scanner.nextLine());
                if (intReturn > max || intReturn < min || intReturn != 9) {
                    System.out.println("A number between " + min + "-" + max + "or " + save);
                }
            } catch (Exception var5) {
                System.out.println("An integer!");
            }
        } while(intReturn != 9 || intReturn > max || intReturn < min);

        return intReturn;
    }
}