package Users;

import java.util.ArrayList;
import java.util.List;

public class DataUser {
    public static List<User> data = new ArrayList<>() ;
    static {
        User admin = new User("admin", "00000");
        User user = new User("user", "11111");
        data.add(admin);
        data.add(user);
    }
}
