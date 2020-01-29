package by.tms.test.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private static int userCounter = 0;



//    public User(){
//        userCounter++;
//    }
    public User(String login, String password){
        this.login = login;
        this.password = password;
        userCounter++;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setLogName(String logName) {
        this.login = logName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static int getUserCounter() {return userCounter;}
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
