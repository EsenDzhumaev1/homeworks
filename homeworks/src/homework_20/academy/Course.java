package homework_20.academy;

public class Course {
    private String name;
    private String dateOfCreation;
    private int id;
    private String nameOfTeacher;

    public Course(String name, String dateOfCreation, int id, String nameOfTeacher) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.id = id;
        this.nameOfTeacher = nameOfTeacher;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDateOfCreation(String date){
        this.dateOfCreation = date;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNameOfTeacher(String fullName){
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
