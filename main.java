import Db.Database;
import Service.AccountCheck;
import Service.CourseService;
import Service.registerNewUser;
import coding.mentor.data.Course;

import java.util.Scanner;
public class main {

    static int id;
    static int passWord;
    static String name;
    static int choice;
    static Scanner input = new Scanner(System.in);
    Course courseDatabase = new Course();
    AccountCheck check=new AccountCheck();

    public static void main(String[] args) {
        Database database = new Database();
        boolean run = true;
        String again = null;
        database.initDB();
        showMenu();
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    loginStep();
                    // check your info in database
                    CourseService CourseCheck=CourseService.getCourseBasedOnGrade(database.userAccount_db.get(AccountCheck.orderNumber).grade);
                    CourseCheck.login(id,passWord,name);
                    CourseCheck.welcomeMessage();
                    //Show your course you can register in your grade
                    //Choice your course that you want to register
                    CourseCheck.showCourse();
                    //
                    System.exit(0);
                    break;
                case 2:
                    regStep();
                    System.out.println("come back to main menu(yes/no)");
                    again = input.next();
                    showMenu();
                    choice = input.nextInt();
            }
            if ("yes".equals(again)) {
                continue;
            } else {
                run = false;
                break;
            }

        } while (run);
        System.exit(0);
    }
    public static void loginStep() {
        do {
            System.out.println("Enter Your Login id:");
            id = input.nextInt();
            System.out.println("Enter your password:");
            passWord = input.nextInt();
            input.nextLine();

        } while (AccountCheck.checkAccount(id, passWord) == false);
    }
    public static void regStep() {
        registerNewUser registerAccount=new registerNewUser();
        do {
            System.out.println("Enter Your Register id:");
            id = input.nextInt();
            System.out.println("Enter your password:");
            passWord = input.nextInt();
            System.out.println("Enter your user name:");
            name = input.nextLine();
        } while (AccountCheck.checkRegAccount(id, passWord) == false);
        if (AccountCheck.checkRegAccount(id, passWord) == true) {
            registerAccount.RegAccount(id, passWord, name);
        }
    }
    public static void showMenu() {
        System.out.println("Main Menu");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("--------------------------");
    }
}




