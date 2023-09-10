package GB.Java.Model;

public class Toy {
    private int id;
    private String name;
    private int chance;

    public Toy(int id, String name, int chance) {
        this.id = id;
        this.name = name;
        this.chance = chance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return name;
    }
}