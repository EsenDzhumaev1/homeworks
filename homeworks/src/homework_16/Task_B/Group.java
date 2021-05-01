package homework_16.Task_B;

public class Group {
    Student[] students;
    Course course;
    String dateOfStart;
    int monthsDuration;
    void setStudents(Student[] students){
        this.students = students;
    }
    void setCourse(Course course){
        this.course = course;
    }
    void setDateOfStart(String date){
        dateOfStart = date;
    }
    void setMonthsDuration(int n){
        monthsDuration = n;
    }
    String getStudents() { //Если бы я ввел большее кол-во студентов в массиве
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getInfo() == null) return "Error";
            sb.append(students[i].getInfo()).append("=".repeat(30)).append("\n");
        }
        return sb.toString();
    }
    String getInfo(){
        if (monthsDuration < 0) return "Error";
        else return String.format("Студенты:\n%sКурс:\n%sДата начала: %s\nДлительность: %s мес.\n",
                getStudents(), course.getInfo(), dateOfStart, monthsDuration);
    }
}
