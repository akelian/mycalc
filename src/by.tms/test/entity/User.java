package by.tms.test.entity;

public class User {
    private String login;
    private String name;
    private String lastname;
    private String password;
    private static int userCounter = 0;
    private final static String DEFAULTPASS = "Pa$$w0rd";
    private final static String DEFAULTNAME = "Олег";
    private final static String DEFAULTLNAME = "Костюмович";

//    public final List<User> bd = new ArrayList<>();

    public User(String name, String password) {
        userCounter++;
        this.name = name;
        this.password = password;
    }

    public User(){
        userCounter++;
    }

    public void setName(String name) {
        if(name == null){this.name = DEFAULTNAME;}
        this.name = name;
    }

    public void setLastname(String lastname) {
        if(lastname == null){this.lastname = DEFAULTLNAME;}
        this.lastname = lastname;
    }

    public void setLogNameName(String logName) {
        if(logName == null){this.login = "User" + userCounter;}
        this.login = logName;
    }
    public void setPassword(String password) {
        if(password == null){this.password = DEFAULTPASS;}
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getPassword() {
        return password;
    }
}
