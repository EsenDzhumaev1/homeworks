package homework_19.Task_B;

public class Lavash extends Bread{
    String name;
    public Lavash(double weight, int value, String name) {
        super(weight, value);
        this.name = name;
    }
    void wrap(){
        System.out.println("wrapped");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Я лаваш, меня испекли");
    }
}
