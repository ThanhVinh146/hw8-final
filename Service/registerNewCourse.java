package Service;


import Db.Database;
import coding.mentor.data.Course;
import coding.mentor.data.Mentor;

import static Db.Database.*;

public class registerNewCourse {
    public void registerNewCourse(int choice,int number) {
        registeredCourses.add(courses_db.get(choice));
        userAccount_db.get(number);
    }
    public static void  showRegisteredCourse(int number){
        System.out.println("List of course you register:");
        System.out.print("Your id:"+userAccount_db.get(number).id+"    "+userAccount_db.get(number).name);
        System.out.print("------Course name:"+courses_db.get(number).getCourseName());
        System.out.println();
        }
    }

