package homework_16.Task_B;

public class Student {
    String birthDate;
    String surname;
    String name;
    String sex; //gender
    int age;
    void setBirthDate(String date){
        this.birthDate = date;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    void setName(String name){
        this.name = name;
    }
    void setSex(String sex){
        this.sex = sex;
    }
    void setAge(int age){
        this.age = age;
    }
    String getInfo(){
        if (age < 0) return null;
        else return String.format("Дата рождения: %s\nФамилие: %s\nИмя: %s\nПол: %s\nВозраст: %s\n",
                birthDate, surname, name, sex, age);
    }
}
