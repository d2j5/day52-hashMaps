import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
HashMap<String, String> nicknameMap = new HashMap<>();
nicknameMap.put("matthew", "matt");
nicknameMap.put("michael", "mix");
nicknameMap.put("arthur", "artie");

String getName = nicknameMap.get("matthew");
        System.out.println("Matthew's nickname is: " + getName);

    }
}