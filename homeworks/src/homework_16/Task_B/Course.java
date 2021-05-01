package homework_16.Task_B;

public class Course {
    String name;
    String dateOfCreation;
    int id;
    String nameOfTeacher;
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
    String getInfo(){
        return String.format("Название курса: %s\nДата создания: %s\nId: %s\nФИ преподавателя: %s",
                name, dateOfCreation, id, nameOfTeacher + "\n" + "=".repeat(30) + "\n");
    }
}
