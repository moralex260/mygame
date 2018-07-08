package game;

import java.util.Random;
import java.util.Scanner;

class StartFight extends WeaponsChoice {

    static void startFight() {
        hammer = (int) (40 + Math.random() * 20);
        fryingPan = (int) (40 + Math.random() * 10);
        smartphone = (int) ((int) 20 + Math.random() * 20);
        emptyKefirBottl = (int) (10 + Math.random() * 10);
        nail = (int) (5 + Math.random() * 5);
        teeth = (int) (20 + Math.random() * 40);
        loudCries = (int) (15 + Math.random() * 15);
        poisonousSaliva = (int) (5 + Math.random() * 5);

        int bag = (int) (10 + Math.random() * 20);
        int arms = (int) (10 + Math.random() * 10);
        int shoutingSave = (int) (20 + Math.random() * 20);
        int randomWalker = (int) (15 + Math.random() * 15);
        String Becky;
        String Dorothy;

        int becky = 500;
        int dorothy = 450;
        int num = 0;
        int num1 = 0;
        System.out.println("enter number of hit by Becky:" + num);

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("enter number of hit by Dorohty:" + num1);
        num1 = scanner.nextInt();
        int[] weapons = {hammer, smartphone, fryingPan, emptyKefirBottl, nail, teeth};
        int[] defence = {bag, arms, shoutingSave, randomWalker};
        for (int i = 0; i < num; i++) {
            Random rand = new Random();
            int result = weapons[rand.nextInt(6)];
            int result1 = defence[rand.nextInt(4)];
            int result2 = weapons[rand.nextInt(6)];
            int result3 = defence[rand.nextInt(4)];

            System.out.println("беки застосувала:" + result + "\n" +
                    "дороті захистилась:" + result1 + "\n" +
                    "дороті застосувала:" + result2 + "\n" +
                    "бекі захистилась:" + result3 + "\n");
            dorothy = dorothy - result + result1;
            becky = becky - result2 + result3;
        }
        if (becky > dorothy) {
            //   if (name.equals(Becky)) {
            //    sum=sum+2*bet}
            // else{sum=sum-bet};
            //  }


            System.out.println("Becky von");
        } else

        {
            System.out.println("Dorothy von");


        }

        System.out.println("Dorothy has" + dorothy + "points of life" + "\n" +
                "Becky has" + becky + "points of life" + "\n");
    }
}
