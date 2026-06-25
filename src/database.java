import java.util.ArrayList;
import java.util.HashMap;

public class database {



    public static HashMap<Integer, user> users = new HashMap<>();
    public static HashMap<Integer, subject> subjects = new HashMap<>();
    public static HashMap<Integer, section> sections = new HashMap<>();
    public static HashMap<Integer, grade> grades = new HashMap<>();





    static user _admin = new user(

            "admin",
            "-----",
            "admin",
            "admin",
            "-----",
            "admin",
            "-----"
    );



    users.put(_admin.id, _admin);




























}
