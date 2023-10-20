package coding.mentor.data;
import java.util.ArrayList;

import static Db.Database.courses_db;
import static Db.Database.mentors_db;

public class Course {
    private int id;
    private String courseName;
    private int grade;
    private int fee;
    private ArrayList<Mentor> teachingMentors;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Course(int id, String courseName, int fee,ArrayList<Mentor> teachingMentors) {
        this.id = id;
        this.courseName = courseName;
        this.fee = fee;
        this.teachingMentors = teachingMentors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public ArrayList<Mentor> getTeachingMentors() {
        return teachingMentors;
    }

    public void setTeachingMentors(ArrayList<Mentor> teachingMentors) {
        this.teachingMentors = teachingMentors;
    }

    public Course() {
    }
}
