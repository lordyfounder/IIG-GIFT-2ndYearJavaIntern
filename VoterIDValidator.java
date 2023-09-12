class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class InvalidAgeException extends AgeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}


class NegativeAgeException extends InvalidAgeException {
    public NegativeAgeException(String message) {
        super(message);
    }
}

class ZeroAgeException extends InvalidAgeException {
    public ZeroAgeException(String message) {
        super(message); 
    }
}

class AgeCeilingException extends AgeException {
    public AgeCeilingException(String message) {
        super(message);
    }
}

class TooYoungAgeException extends AgeCeilingException {
    public TooYoungAgeException(String message) {
        super(message);
    }
}

class TooOldAgeException extends AgeCeilingException {
    public TooOldAgeException(String message) {
        super(message);
    }
}

public class VoterIDValidator {
    public static void main(String[] args) {
        int ages[] = { 24, 35, 15, 54, 11, 71, 88, 0, 63, 19, -33, 45, 28, 91, -31, 75 };

        for (int age : ages) {
            try {
                validateAge(age);
                System.out.println("Age " + age + " is eligible to vote.");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validateAge(int age) throws AgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        } else if (age == 0) {
            throw new ZeroAgeException("Age cannot be zero.");
        } else if (age < 18) {
            throw new TooYoungAgeException("Too young to vote: " + age);
        } else if (age > 80) {
            throw new TooOldAgeException("Too old to vote: " + age);
        }
    }
}
