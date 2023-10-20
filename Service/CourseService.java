package Service;

import Db.Database;
import coding.mentor.data.Mentor;
import static Db.Database.courses_db;
public abstract class CourseService {
    public abstract int login(int id,int password,String name);
    public void welcomeMessage(){
        System.out.println("Hello student to table of course register");
    };
    public void  showCourse(){
        System.out.println("List of course you can register:");
        for(int i=0;i<courses_db.size();i++){
            System.out.print(courses_db.get(i).getId()+"    "+courses_db.get(i).getCourseName());
            for(Mentor mentor : Database.courses_db.get(i).getTeachingMentors()){
                System.out.print("------mentor name:"+mentor.getName());
            }
            System.out.println();
        }
        System.out.println("Choose Your course");
    }
    public static CourseService getCourseBasedOnGrade(String Grade){
        switch (Grade){
            case "third grade":{
                return new ThirdStudentService();

            }
            case "fourth grade":{
                return new FouthStudentService();
            }
        }
        return null;
    };
}
