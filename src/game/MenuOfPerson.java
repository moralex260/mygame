package game;

import java.util.Arrays;
import java.util.Scanner;

class MenuOfPerson {
    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int CHOOSE = 2;
    private static final int REMOVE = 3;
    private static final int UPDATE = 4;

    static void menu() {
        System.out.println("         Menu     " +
                "");
        System.out.println(" 1 - Add person");
        System.out.println(" 2 - Choose person");
        System.out.println(" 3 - Remove person by id");
        System.out.println(" 4 - Update person");
        System.out.println(" 0 - Exit");
        System.out.println("\n");
    }

    static void personMenu() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int choose = scanner.nextInt();
            switch (choose) {
                case EXIT: {
                    System.out.println("BYE");
                    ChoicePerson.menuChoicePerson();
                    break;
                }
                case ADD: {
                    System.out.println("ADD your person");
                    System.out.println("Enter person id");
                    int id = scanner.nextInt();
                    System.out.println("Enter person name");
                    String name = scanner.nextLine();
                    System.out.println("Enter person describe");
                    String describe = scanner.nextLine();
                    System.out.println("Enter person hp ");
                    int hp = scanner.nextInt();
                    PersonManager.add(id,name,describe, hp);
                    System.out.println(Arrays.toString(PersonManager.getArr()));
                    menu();
                    break;
                }
                case CHOOSE: {
                    System.out.println("CHOOSE person");
                    System.out.println("Enter person id");
                    int id = scanner.nextInt();
                    System.out.println("person with chosen id: ");
                    PersonManager.search(id);
                    menu();
                    break;
                }

                case REMOVE: {
                    System.out.println("REMOVE person");
                    System.out.println("Enter person id");
                    int id = scanner.nextInt();
                    PersonManager.removeById(id);
                    System.out.println("REMOVED");
                    System.out.println(Arrays.toString(PersonManager.getArr()));
                    menu();
                    break;
                }

                case UPDATE: {
                    System.out.println("UPDATE person");
                    System.out.println("Enter person id");
                    int id = scanner.nextInt();

                    System.out.println("Enter person name");

                    String name = scanner.nextLine();

                    System.out.println("Enter person describe");
                    String describe = scanner.nextLine();

                    System.out.println("Enter person hp");
                    int hp = scanner.nextInt();
                    PersonManager.set(id, name, describe, hp);
                    System.out.println("UPDATED");
                    System.out.println(Arrays.toString(PersonManager.getArr()));
                    menu();
                    break;
                }

                default:
                    System.out.println("Your choice is wrong");
                    menu();
                    break;
            }
        }
    }
}
