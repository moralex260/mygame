package game;

import java.util.Scanner;

import static game.StartGamble.startGamble;
import static game.StartFight.startFight;

class ChoicePerson {
    private static int choice;

    static void menuChoicePerson() {
        final int becky = 1;
        final int dorothy = 2;
        final int chooseBecky = 3;
        final int chooseDorothy = 4;
        final int goMainMenu = 0;
        final int bet = 5;
        final int createPerson = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("   you can choose one of this pretty housewife:  Becky and Dorothy \n" +
                "to know who is Becky enter :  1 \n" +
                "to know who is Dorothy enter :2\n" +
                "to choose  Becky enter  : 3 \n" +
                "to choose Dorothy: 4 \n" +
                "back in main game menu enter: 0 \n" +
                " you can also do bets entering: 5 \n"+
                "create your person: 6 \n");
        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case becky: {
                    System.out.println(("Becky is a fat dirty cow. He is always sweating.\n" +
                            "He does not love anyone, especially Dorothy.\n") +
                            "When they meet on the road with each other, a fight begins." +
                            " In this case, such means as:\n" +
                            "hammer (damage 40-60)\n" +
                            "frying pan (damage 40-50)\n" +
                            "smartphone (damage 20-40)\n" +
                            "An empty kefir bottle (10-20 damage)\n" +
                            "nails (damage 5-10)\n" + "teeth (damage 15-30)\n" +
                            "loud cries and dirty laugh (damage 0-65) ");
                    menuChoicePerson();
                    break;
                }
                case dorothy: {
                    System.out.println("Dorothy is a thin, evil neighbor Becky. " +
                            "She always shakes from malice and spills her poisonous saliva. " +
                            "She does not love anyone, especially Becky." +
                            " When they meet on the road, one begins to fight. At the same time," +
                            " they use such means as:\n" +
                            "hammer (damage 40-60)\n" +
                            "frying pan (damage 40-50)\n" +
                            "smartphone (damage 20-40)\n" +
                            "An empty kefir bottle (10-20 damage)\n" +
                            "nails (damage 5-10)\n" +
                            "teeth (damage 15-30)\n" +
                            "loud cries and dirty laugh (damage 0-65)\n" +
                            "poisonous saliva (damage 5-10)");
                    break;
                }
                case bet: {
                    System.out.println("you have 1000 $,you can choice /n" +
                            "victory of Dorothy or Becky \n " +
                            "  if you won,you have your sume twice \n ");

                    startGamble();
                    break;
                }
                case chooseBecky: {
                    System.out.println("your choice Becky");
                    startFight();
                    break;
                }
                case chooseDorothy: {
                    System.out.println("your choice Dorothy");
                    startFight();
                    break;
                }
                case createPerson:{
                    MenuOfPerson.menu();
                    MenuOfPerson.personMenu();
                }
                case goMainMenu: {
                    return;
                }
            }
        }
    }
}