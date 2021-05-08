package homework_19.Task_B;

public class Baget extends Bread{
    String name;
    double length;
    int countOfScars;
    public Baget(double weight, int value, double length, int countOfScars, String name) {
        super(weight, value);
        this.length = length;
        this.countOfScars = countOfScars;
        this.name = name;
    }
    void scar(){
        System.out.println("scared");
    }

    @Override
    public void pack() {
        super.pack();
        System.out.println("Только в экологичный пакет");
    }
}
