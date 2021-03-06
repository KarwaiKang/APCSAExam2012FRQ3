public class Mustang implements Horse {
    private String name, type;
    private int weight;

    public Mustang(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.type = this.getClass().toString().substring(6);
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String toString() {
        return name + ", " + type + ", weighs " + weight + ".";
    }
}
