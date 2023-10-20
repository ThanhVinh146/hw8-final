package coding.mentor.data;

import java.util.ArrayList;

public class User {
    public int id;
    public int password;
    public String grade;
    public String name;
    public ArrayList<Course> registeredCourses=new ArrayList<Course>();

    public User() {
    }

    public User(int id, int password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public User(int id, int password, String name, ArrayList<Course> registeredCourses,String grade) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.grade=grade;
        this.registeredCourses = registeredCourses;
    }
}