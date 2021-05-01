package homework_16.Task_A;

public class Main {
    public static void separation(){
        System.out.println("=".repeat(30));
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Parrot parrot = new Parrot();

        Fish fish1 = new Fish();
        Fish fish2 = new Fish();

        cat1.setName("Барсик");
        cat1.setAge(4);
        cat1.setWeight(3.5f);

        cat2.setName("Тимоша");
        cat2.setAge(10);
        cat2.setWeight(5);

        dog1.setName("Шарик");
        dog1.setAge(-2);
        dog1.setWeight(8);

        dog2.setName("Белый");
        dog2.setAge(8);
        dog2.setWeight(15);

        parrot.setName("Кеша");
        parrot.setAge(3);
        parrot.setSpecies("Желтобрюхий");

        fish1.setQuantity(6);
        fish1.setSpecies("Гуппи");
        fish1.setFreshwater(true);

        fish2.setQuantity(3);
        fish2.setSpecies("Золотая рыбка");
        fish2.setFreshwater(true);

        System.out.println("Cat:\n" + cat1.getInfo());
        separation();
        System.out.println("Cat:\n" + cat2.getInfo());
        separation();
        System.out.println("Dog:\n" + dog1.getInfo());
        separation();
        System.out.println("Dog:\n" + dog2.getInfo());
        separation();
        System.out.println("Parrot:\n" + parrot.getInfo());
        separation();
        System.out.println("Fish:\n" + fish1.getInfo());
        separation();
        System.out.println("Fish:\n" + fish2.getInfo());
    }
}
