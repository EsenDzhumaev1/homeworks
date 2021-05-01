package homework_16.Task_A;

public class Parrot {
    String name;
    int age;
    String species; //Вид
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSpecies(String species){
        this.species = species;
    }
    String getInfo(){
        if (age < 0) return "Error";
        else return String.format("Имя: %s\nВозраст: %s\nВид: %s",
                name, age, species);
    }
}
