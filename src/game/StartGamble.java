package game;

import java.util.Scanner;

public class StartGamble extends StartFight {

    static void startGamble() {
        int sum = 1000;
        System.out.println("enter person who wil be win(Dorothy or Becky)");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("enter sume of bet");
        int bet = scanner.nextInt();
        sum -= bet;
        startFight();
        if (name.equals("Dorothy")) {

            if (dorothy > becky) {
                sum = sum + 2 * bet;

                System.out.println("your money=" + sum + "you won");

            } else if (dorothy < becky) {
                System.out.println("your money=" + sum + "you loose");
            } else  {
                sum += sum;
                System.out.println("anyone won");
            }
        }
        else if(name.equals("Bechy")){ if (dorothy < becky) {
            sum = sum + 2 * bet;

            System.out.println("your money=" + sum + "you won");

        } else if (dorothy > becky) {
            System.out.println("your money=" + sum + "you loose");
        } else  {
            sum += sum;
            System.out.println("anyone won");
        }

        }
    }
    }







