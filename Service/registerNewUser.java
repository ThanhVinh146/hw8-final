package Service;

import coding.mentor.data.User;

import static Db.Database.userAccount_db;

public class registerNewUser {
    int id;
    int passWord;
    String userName;
    public void RegAccount(int id, int passWord,String userName){
        User user=new User(id, passWord, userName);
        this.id = id;
        this.passWord = passWord;
        this.userName = userName;
        userAccount_db.add(user);
}}
