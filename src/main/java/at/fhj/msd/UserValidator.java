package at.fhj.msd;

public class UserValidator {
    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.length() <= 12;
    }
}
