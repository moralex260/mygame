package game;

public enum Menu {
    MENU,
    CHOSE_PERSON,
    CREATE_PERSON,
    EXIT,


    Menu() {};
    public static Menu getOrdinal(int input) {

        for (Menu k: Menu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return EXIT;
    }

}