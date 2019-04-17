import java.util.UUID;

public class _48_UUID_generator {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
