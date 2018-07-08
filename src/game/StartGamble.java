package game;

import java.util.Scanner;

import static game.StartFight.startFight;

public class StartGamble {
    static void startGamble() {
        int sum = 1000;
        System.out.println("enter person who wil be win(Dorothy or Becky)");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("enter sume of bet");
        int bet = scanner.nextInt();

        startFight();

    }
}
