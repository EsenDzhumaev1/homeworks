package homework_20.object;

public class Student {
    private String birthDate;
    private String surname;
    private String name;
    private String sex; //gender
    int age;

    public Student(String birthDate, String surname, String name, String sex, int age) {
        if (age < 0) System.err.println("Error");
        else {
            this.birthDate = birthDate;
            this.surname = surname;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
    }

    public void setBirthDate(String date){
        this.birthDate = date;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        if (age < 0) System.err.println("Error");
        else this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("birthdate: %s, surname: %s, name: %s, gender: %s, age: %s",
                this.birthDate, this.surname, this.name, this.sex, this.age);
    }
}
