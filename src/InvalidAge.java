public class InvalidAge{

    public static void main(String[] args){
        try {
            checkAge(20);
            checkAge(15);
        }
        catch (InvalidAgeException e ){
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}