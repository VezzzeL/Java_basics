package Lesson_12;

public class Student {
    private String name="Unnamed",group="FIA-";
    private int course=1, rating=0;

    public Student(String name, int course, int rating) {
        this.name = name;
        group=this.group+course;
        this.course = course;
        this.rating = rating;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        group=this.group+course;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getRating() {
        return rating;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void nextCourse() {
        this.course = this.course+1;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", rating=" + rating;
    }
}
