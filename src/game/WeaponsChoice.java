package game;

class WeaponsChoice {

    static int hammer;


    static int fryingPan;
    static int smartphone;
    static int emptyKefirBottl;
    static int nail;
    static int teeth;
    static int loudCries;
    static int poisonousSaliva;


    static void chooseWeapon() {
        hammer = (int) (40 + Math.random() * 20);
        fryingPan = (int) (40 + Math.random() * 10);
        smartphone = (int) ((int) 20 + Math.random() * 20);
        emptyKefirBottl = (int) (10 + Math.random() * 10);
        nail = (int) (5 + Math.random() * 5);
        teeth = (int) (20 + Math.random() * 40);
        loudCries = (int) (15 + Math.random() * 15);
        poisonousSaliva = (int) (5 + Math.random() * 5);

        System.out.println(hammer + fryingPan);
    }


}


