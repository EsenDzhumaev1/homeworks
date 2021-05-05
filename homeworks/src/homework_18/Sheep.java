package homework_18;

public class Sheep {
    int weight;
    int age;
    String gender;
    String name;

    public Sheep(int weight, int age, String gender, String name) {
        this.weight = weight;
        if (age > 0) this.age = age;
        else System.err.println("Error");
        this.gender = gender;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.err.println("Error");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("weight: %skg, age: %s, gender: %s, name: %s",
                this.weight, this.age, this.gender, this.name);
    }
}
