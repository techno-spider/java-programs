package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private Map<Integer, String> userDatabase = new HashMap<>();

    public Optional<String> findUserById(int id) {
        return Optional.ofNullable(userDatabase.get(id));
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.userDatabase.put(1, "Alice");

        String user = service.findUserById(1)
                             .orElse("User not found");
        System.out.println("User name: " + user);

        String nonuser = service.findUserById(2)
                                .orElse("User not found");
        System.out.println("nonuser = " + nonuser);
    }
}
