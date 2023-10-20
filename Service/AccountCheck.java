package Service;

import Db.Database;
import coding.mentor.data.User;

import static Db.Database.userAccount_db;

public class AccountCheck {
    static int failedCount = 0;
    public static int orderNumber = 0;

    public AccountCheck() {
    }

    public static boolean checkAccount(int no, int pass) {
        for (int i = 0; i < userAccount_db.size(); i++) {
            if (no == userAccount_db.get(i).id && pass == userAccount_db.get(i).password) {
                failedCount += 1;
                orderNumber = i;
                System.out.println("You are login");
                System.out.println("hello " + userAccount_db.get(i).name);
                return true;
            }
        }
        System.out.println("Your number card or your pin are not correct , please try again!");
        return false;
    }

    public static boolean checkRegAccount(int no, int pass) {
        for (int i = 0; i < userAccount_db.size(); i++) {
            if (no == userAccount_db.get(i).id && pass == userAccount_db.get(i).password) {
                System.out.println("Your number card or your pin are already used, pls try another !");
                return false;
            }
        }
        return true;
    }
}
