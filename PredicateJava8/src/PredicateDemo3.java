import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo3 {

    public static void main(String args[]) {
        Predicate<User> userPredicate = user -> user.userName.equals("Jane") && user.password.equals("aa123");
        System.out.println("Enter user name: ");
        Scanner sc = new Scanner(System.in);
        String u = sc.next();

        System.out.println("Enter Password");
        String p = sc.next();

        if (userPredicate.test(new User(u, p))) {
            System.out.println("Auth success");
        } else {
            System.out.println("Auth fail");
        }
    }

}

class User {
    String userName;
    String password;

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
