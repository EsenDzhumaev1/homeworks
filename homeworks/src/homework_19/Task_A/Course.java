package homework_19.Task_A;

public class Course {
    String name;
    String dateOfCreation;
    int id;
    String nameOfTeacher;

    public Course(String name, String dateOfCreation, int id, String nameOfTeacher) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.id = id;
        this.nameOfTeacher = nameOfTeacher;
    }

    void setName(String name){
        this.name = name;
    }
    void setDateOfCreation(String date){
        this.dateOfCreation = date;
    }
    void setId(int id){
        this.id = id;
    }
    void setNameOfTeacher(String fullName){
        this.nameOfTeacher = fullName;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public int getId() {
        return id;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    @Override
    public String toString() {
        return String.format("name: %s, date of creation: %s, id: %s, teacher's name: %s",
                this.name, this.dateOfCreation, this.id, this.nameOfTeacher);
    }
}
