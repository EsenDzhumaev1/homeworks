package homework_20.academy;

import homework_20.object.Student;

public class Group {
    private Student[] students;
    private Course course;
    private String dateOfStart;
    private int monthsDuration;

    public Group(Student[] students, Course course, String dateOfStart, int monthsDuration) {
        this.students = students;
        this.course = course;
        this.dateOfStart = dateOfStart;
        this.monthsDuration = monthsDuration;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public void setDateOfStart(String date){
        dateOfStart = date;
    }
    public void setMonthsDuration(int n){
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
