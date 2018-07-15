package game;

public class Person {
    private int id;
    private String describe;
    private String name;
    private int hp;

    public Person(){}

  Person(int id,String describe , String name, int hp) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.hp = hp;
    }

   int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public String getDescribe() {
        return describe;
    }


     void setName(String name) {
        this.name = name;
    }

    public int getPh() {
        return hp;
    }

     void setYear(int hp) {
        this.hp = hp;
    }

    public String toString() {
        return this.id + " " + this.name + " " +this.describe+" "  + this.hp;
    }

}
