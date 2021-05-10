package homework_20.academy;

public class Lessons {
    private String date;
    private int attendingStudents;
    private Course course;
    private String timeOfStart;
    private boolean homework;
    private boolean exam;

    public Lessons(String date, int attendingStudents, Course course, String timeOfStart, boolean homework, boolean exam) {
        this.date = date;
        this.attendingStudents = attendingStudents;
        this.course = course;
        this.timeOfStart = timeOfStart;
        this.homework = homework;
        this.exam = exam;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAttendingStudents() {
        return attendingStudents;
    }

    public void setAttendingStudents(int attendingStudents) {
        this.attendingStudents = attendingStudents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return String.format("date: %s\nattending students: %s\ncourse: %s\nstart time: %s\nhomework: %s\nexam: %s",
                this.date, this.attendingStudents, this.course.getName(), this.timeOfStart, this.homework, this.exam);
    }
}
