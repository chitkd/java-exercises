package exercises.lab_14;

public class CustomFileNotFoundException extends RuntimeException{
    public CustomFileNotFoundException(String fileName) {
        super("FileNotFound " + fileName);
    }
}
