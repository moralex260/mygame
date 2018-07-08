package game;

import java.util.Scanner;

import static game.ChoicePerson.menuChoicePerson;


class GameMenu {

    public static void main(String[] args) {
        int choice;
        {
            System.out.println("if you want play game,please enter 1 \n if you want exit ,enter 0");
        }
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println("BYE");
            System.exit(0);
        } else {
            menuChoicePerson();
        }
    }


}