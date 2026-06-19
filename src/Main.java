import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Integer param = RandomGenerator.getDefault().nextInt();
        boolean emailUserPresent = verificationEmail(param);
        String msg = emailUserPresent ? "l'utilisateur a un email" : "l'utilisateur n'a pas d'amil";
        System.out.println(msg);
    }

    private static boolean verificationEmail(Integer param) {
        return param > 500;
    }
}

