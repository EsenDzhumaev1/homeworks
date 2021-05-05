package homework_18;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cow[] cows1 = new Cow[5];
        Sheep[] sheeps1 = new Sheep[3];
        Horse[] horses1 = new Horse[2];
        Farm farm1 = new Farm("some address", cowsRandom(cows1),
                sheepsRandom(sheeps1), horsesRandom(horses1), "owner's name");
        Cow[] cows2 = new Cow[1];
        Sheep[] sheeps2 = new Sheep[1];
        Horse[] horses2 = new Horse[1];
        Farm farm2 = new Farm("some address", cowsRandom(cows2),
                sheepsRandom(sheeps2), horsesRandom(horses2), "owner's name");
        System.out.println(farm1);
        System.out.println("=".repeat(30));
        System.out.println(farm2);
        System.out.println("=".repeat(30));
        System.out.println(farm1.getCows()[4]); //пятая корова первой фермы
        System.out.println(farm2.getHorses()[0]); //лошадь второй фермы
        //Все рандомы для авто-заполнения
    }
    public static Cow[] cowsRandom(Cow[] cows){
        Random random = new Random();
        for (int i = 0; i < cows.length; i++) {
            boolean tmp = random.nextBoolean();
            String gender;
            if (tmp) gender = "Male";
            else gender = "Female";
            cows[i] = new Cow(random.nextInt(400 - 200) - 1 + 200, random.nextInt(15 - 2) - 1 + 2,
                    gender, String.valueOf(i + 1));
        }
        return cows;
    }
    public static Sheep[] sheepsRandom(Sheep[] sheeps){
        Random random = new Random();
        for (int i = 0; i < sheeps.length; i++) {
            boolean tmp = random.nextBoolean();
            String gender;
            if (tmp) gender = "Male";
            else gender = "Female";
            sheeps[i] = new Sheep(random.nextInt(160 - 45) - 1 + 45, random.nextInt(12 - 2) - 1 + 2,
                    gender, String.valueOf(i + 1));
        }
        return sheeps;
    }
    public static Horse[] horsesRandom(Horse[] horses){
        Random random = new Random();
        for (int i = 0; i < horses.length; i++) {
            boolean tmp = random.nextBoolean();
            String gender;
            if (tmp) gender = "Male";
            else gender = "Female";
            horses[i] = new Horse(random.nextInt(500 - 300) - 1 + 300,random.nextInt(20 - 2) - 1 + 2,
                    "Black", gender, String.valueOf(i + 1));
        }
        return horses;
    }
}
