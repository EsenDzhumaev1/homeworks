package homework_14;

public class Student {
    String name;
    int age;
    String sex; //имеется ввиду пол :D
    String direction;
    boolean isStudyingOffline;
    void displayInfo(){
        System.out.printf("Name: %s\nAge: %s\nGender: %s\nDirection: %s\n", name, age, sex, direction);
        if (isStudyingOffline) System.out.println("Учится оффлайн");
        else System.out.println("Учится онлайн");
    }
}
