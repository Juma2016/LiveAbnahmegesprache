package at.fhj.msd;

public class UserValidator {
    public static boolean isValidUsername(String username) {
        if(username==null||username.isBlank())
        throw new IllegalArgumentException();
        
        return username.length() > 5 && username.length() <= 12;
    }
}
