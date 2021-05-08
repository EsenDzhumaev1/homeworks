package homework_19.Task_B;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread(200, 20);
        Lepeshka lepeshka = new Lepeshka(200, 20);
        Lavash lavash = new Lavash(100, 30, "Элитный лаваш из Дилижан");
        Baget baget = new Baget(200, 40, 50, 5, "Провансальский багет");
        bread.bake();
        bread.pack();
        lepeshka.pattern();
        lepeshka.bake();
        lepeshka.varnish();
        lavash.bake();
        lavash.wrap();
        lavash.pack();
        baget.scar();
        baget.bake();
        baget.pack();
        //Задание странное, если честно, наверное я неправильно его понял
    }
}
