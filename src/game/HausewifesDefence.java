package game;

public class HausewifesDefence {
    private static int bag;
   private static int arms;
    private static int shoutingSave;
    private static int randomWalker;
    static void chooseDefence() {
        bag = (int) (10 + (Math.random() * 20+1));
         arms = (int) (10 + (Math.random() * 10+1));
         shoutingSave = (int) (20 + (Math.random() * 20+1));
         randomWalker = (int) (15 + (Math.random() * 15+1));

    }
    static int getBag() {
        return bag;
    }

    static int getArms() {
        return arms;
    }

    static int getShoutingSave() {
        return shoutingSave;
    }

    static int getRandomWalker() {
        return randomWalker;
    }
}
