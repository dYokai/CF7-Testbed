package gr.aueb.cf.exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiarsDice {

    public static void main(String[] args) {

        System.out.println("--- Welcome to the Liar's Dice Game ---");

        int players = getNumberOfPlayers();
        List<String> playerNames = getPlayerName(players);
        int balance = balance();
        System.out.println("Tha game has " + players + " players:" + playerNames);
    }


    public static int getNumberOfPlayers() {
        Scanner scanner = new Scanner(System.in);
        int players = 0;

        do {
            System.out.println("Enter the number of players");
            if (scanner.hasNextInt()){
                players = scanner.nextInt();
                if (players <= 0) {
                    System.out.println("Please insert number of players greater than zero");
                }
            }else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
        } while (players <= 0);
        return players;
    }

    public static List<String> getPlayerName(int players) {
        Scanner scanner = new Scanner(System.in);
        List<String> playerNames = new ArrayList<>();

        for (int i = 1; i <= players; i++) {
            String name;
            do {
                System.out.print("Insert name for player: " + i + ":");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Name can not be empty. Please enter a valid name");
                }
            } while (name.isEmpty());
            playerNames.add(name);
        }
        return playerNames;
    }

    public static int balance() {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        do {
            System.out.println("Enter the amount of balance you want to play (minimum 5 euros):");
            if (scanner.hasNextInt()) {
                balance = scanner.nextInt();
                if (balance < 5) {
                    System.out.println("The minimum pot is 5 euros. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric amount.");
                scanner.next();
            }
        } while (balance < 5);

        return balance;
    }
    }

