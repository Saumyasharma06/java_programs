import java.util.*;
import java.lang.*;

class IllegalAgeException extends Exception {
    public IllegalAgeException(String message) {
        super(message);
    }
}

public class ExceptionThrow0 {
    static void validateAge(int age) throws IllegalAgeException {
        if (age < 18) {
            throw new IllegalAgeException("Age is less than 18");
        } else {
            System.out.println("valid age is=" + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalAgeException e) {
            System.out.println(e);
        }
    }
}