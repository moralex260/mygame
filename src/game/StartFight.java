package game;

import java.util.Random;
import java.util.Scanner;
 class StartFight extends WeaponsChoice {
  static   int becky = 500;
    static int dorothy = 450;

    static void startFight() {


        int dorothy = 450;
        int num = 0;
        int num1 = 0;
        System.out.println("enter number of hit by Becky:" + num);

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("enter number of hit by Dorohty:" + num1);
        num1 = scanner.nextInt();
         chooseWeapon();
        chooseDefence();

        int weapons[] = {WeaponsChoice.getHammer(), getEmptyKefirBottl(), getFryingPan(), getNail(), getSmartphone(), getTeeth(), getLoudCries(), getPoisonousSaliva()};
        int[] defence = {HausewifesDefence.getBag(),HausewifesDefence.getArms(),HausewifesDefence.getShoutingSave(), HausewifesDefence.getRandomWalker()};
        for (int i = 0; i < num; i++) {
            Random rand = new Random();
            int result = weapons[rand.nextInt(8)];
            int result1 = defence[rand.nextInt(4)];


            System.out.println("Becky attak:" + result + "\n" +
                    "Dorothy's defence:" + result1 + "\n");

            dorothy = dorothy - result + result1;
        }
        for (int j = 0; j < num1; j++) {
            Random rand = new Random();

            int result2 = weapons[rand.nextInt(8)];
            int result3 = defence[rand.nextInt(4)];
            System.out.println(" Dorothy's attak:" + result2 + "\n" +
                    "Becky defence:" + result3 + "\n");
            becky = becky - result2 + result3;
        }
        if (becky > dorothy) {
            System.out.println("Becky von");
        } else {
            System.out.println("Dorothy von");
        }
        System.out.println("Dorothy has" + dorothy + "points of life" + "\n" +
                "Becky has" + becky + "points of life" + "\n");


    }

}