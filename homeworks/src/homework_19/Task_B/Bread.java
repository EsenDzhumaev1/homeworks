package homework_19.Task_B;

public class Bread {
    double weight;
    int value;

    public Bread(double weight, int value) {
        if (weight <= 0) System.out.println("poddelka");
        else {
            this.weight = weight;
            this.value = value;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void bake(){
        System.out.println("baked");
    }
    public void pack(){
        System.out.println("packed");
    }
}
