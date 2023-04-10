
public class Toy {
    private int id;
    private String name;
    private int quanty;
    private int weight;

    /**
     * Конструктор
     * 
     * @param id     идентификатор
     * @param name   название
     * @param quanty кол-во
     * @param weight частота выпадения (вес)
     */
    public Toy(int id, String name, int quanty, int weight) {
        this.id = id;
        this.name = name;
        this.quanty = quanty;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuanty() {
        return quanty;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void decreaseQuanty() {
        quanty--;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", quanty=" + quanty + ", weight=" + weight + "]";
    }

}