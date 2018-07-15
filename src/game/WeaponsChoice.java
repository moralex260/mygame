package game;
 class WeaponsChoice extends HausewifesDefence {


    private static int hammer;
    private static int fryingPan;
    private static int smartphone;
    private static int emptyKefirBottl;
    private static int nail;
    private static int teeth;
    private static int loudCries;
    private static int poisonousSaliva;





    static void chooseWeapon() {

        hammer = (int) (40 + Math.random() * 20);
        fryingPan = (int) (40 + Math.random() * 10);
        smartphone = (int) (20 + Math.random() * 20);
        emptyKefirBottl = (int) (10 + Math.random() * 10);
        nail = (int) (5 + Math.random() * 5);
        teeth = (int) (20 + Math.random() * 40);
        loudCries = (int) (15 + Math.random() * 15);
        poisonousSaliva = (int) (5 + Math.random() * 5);


    }


    static int getEmptyKefirBottl() {
        return emptyKefirBottl;
    }

    static int getFryingPan() {
        return fryingPan;
    }

    static int getHammer() {
        return hammer;
    }

    static int getLoudCries() {
        return loudCries;
    }

    static int getNail() {
        return nail;
    }

    static int getPoisonousSaliva() {
        return poisonousSaliva;
    }

    static int getSmartphone() {
        return smartphone;
    }

    static int getTeeth() {
        return teeth;
    }

}



