package game;

import java.util.Scanner;

import static game.ChoicePerson.menuChoicePerson;


class GameMenu {


    public static void main(String[] args) {
        int choice;
        for (Menu menu : Menu.values()) {
            System.out.println(menu);
        }


        switch (Menu.MENU) {
            case CHOSE_PERSON:
                ChoicePerson.menuChoicePerson();
        }

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