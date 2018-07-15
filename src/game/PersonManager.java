package game;

  class PersonManager {
    private static Person[]arr = new Person[1];
    private static int size = 0;

    static void add(int id, String name, String describe, int hp) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = new Person(id, name, describe, hp);
    }

    private static void extendArray() {
        Person[] newArr = new Person[size + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

     static Person[] getArr() {
        return arr.clone();
    }

     static void search(int id) {
        for (Person tmp : arr) {
            if (tmp.getId() == id) {
                System.out.println(tmp.toString());
            }
        }
    }

    private static int searchIndex(int id) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

     static void removeById(int id) {
        if (searchIndex(id) < arr.length) {
            Person[] newArr = new Person[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, searchIndex(id));
            System.arraycopy(arr, searchIndex(id) + 1, newArr, searchIndex(id), arr.length - 1 - searchIndex(id));
            arr = newArr;
        } else
            throw new IndexOutOfBoundsException();
    }

    static void set(int id, String name, String describe, int year) {
        if (searchIndex(id) < arr.length) {
            for (Person tmp : arr) {
                if (tmp.getId() == id) {

                    arr[searchIndex(id)].setName(name);
                    arr[searchIndex(id)].setYear(year);
                }
            }
        } else
            throw new IndexOutOfBoundsException();
    }

}


