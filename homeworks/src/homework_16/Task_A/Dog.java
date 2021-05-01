package homework_16.Task_A;

public class Dog {
    String name;
    int age;
    double weight;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setWeight(double weight){
        this.weight = weight;
    }
    String getInfo(){
        if (age < 0 || weight < 0) return "Error";
        else return String.format("Имя: %s\nВозраст: %s\nВес: %s кг",
                name, age, weight);
    }
}
