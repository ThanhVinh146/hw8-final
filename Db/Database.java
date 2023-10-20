package Db;

import coding.mentor.data.Course;
import coding.mentor.data.Mentor;
import coding.mentor.data.User;

import java.util.ArrayList;
public class Database {
    public static ArrayList<User> userAccount_db=new ArrayList<>();
    public static ArrayList<Mentor> mentors_db=new ArrayList<Mentor>();
    public static ArrayList<Course> courses_db=new ArrayList<Course>();
    public static ArrayList<Course> registeredCourses=new ArrayList<Course>();

    public static void initDB(){
        // init Mentor Db
        mentors_db.add(new Mentor(1,"Dung","dung@gmail.com","0909"));
        mentors_db.add(new Mentor(2,"Jayden","jayden@gmail.com","0808"));
        mentors_db.add(new Mentor(3,"Toni","toni@gmail.com","0707"));
        // init userAccount db
        userAccount_db.add(new User(952468663, 14062002, "Vinh",registeredCourses,"third grade"));
        userAccount_db.add(new User(933883762, 12062002, "Linh",registeredCourses,"fourth grade"));
        // init Course db
        ArrayList<Mentor> teachingMentors=new ArrayList<Mentor>();
        teachingMentors.add(mentors_db.get(1));
        teachingMentors.add(mentors_db.get(0));
        courses_db.add(new Course(3,"Be 1",3000,teachingMentors));

        teachingMentors=new ArrayList<Mentor>();
        teachingMentors.add(mentors_db.get(2));
        courses_db.add(new Course(4,"Be 5",3000,teachingMentors));

        teachingMentors=new ArrayList<Mentor>();
        teachingMentors.add(mentors_db.get(1));
        teachingMentors.add(mentors_db.get(2));
        courses_db.add(new Course(3,"Be 2",2000,teachingMentors));


    }

    }





