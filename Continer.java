public class Continer extends AbsPortCapt {
private String id;
private String description;
private double weight;

public Continer(String id, String description, double weight) {
    this.id = id;
    this.description = description;
    this.weight = weight;
}

@Override
public String toString() {
    return id + " | " + description + " | " + (int) weight + "kg";
    }
}
