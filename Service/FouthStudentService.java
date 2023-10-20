package Service;

import Db.Database;
import coding.mentor.data.Mentor;

import static Db.Database.courses_db;

public class FouthStudentService extends CourseService {
    @Override
    public int login(int id, int password, String name) {
        System.out.println("Your id:" + id);
        int grade = 4;
        return grade;
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Hello 4th grade student");
    }

    @Override
    public void showCourse() {
        System.out.println("List of course you can register in 4th grade:");
        for (int i = 0; i < courses_db.size(); i++) {
            if (courses_db.get(i).getId() == 4) {
                System.out.println(courses_db.get(i).getId() + "    " + courses_db.get(i).getCourseName());
                for (Mentor mentor : Database.courses_db.get(i).getTeachingMentors()) {
                    System.out.print("------mentor name:" + mentor.getName());
                }
            }
        }
    }
}
