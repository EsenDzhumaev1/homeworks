package homework_19.Task_A;

public class Group {
    Student[] students;
    Course course;
    String dateOfStart;
    int monthsDuration;

    public Group(Student[] students, Course course, String dateOfStart, int monthsDuration) {
        this.students = students;
        this.course = course;
        this.dateOfStart = dateOfStart;
        this.monthsDuration = monthsDuration;
    }

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
    public Student[] getStudents() {
        return students;
    }

    public Course getCourse() {
        return course;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public int getMonthsDuration() {
        return monthsDuration;
    }

    public int getStudentsCount(){
        return this.students.length;
    }

    @Override
    public String toString() {
        return String.format("students: %s, course: %s, date of start: %s, month duration: %s",
                this.students.length, this.course.getName(), this.dateOfStart, this.monthsDuration);
    }
}
