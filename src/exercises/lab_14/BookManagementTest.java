package exercises.lab_14;

public class BookManagementTest {
    public static void main(String[] args) {
        String inputFileRelativePath = "/src/exercises/lab_14/book.txt";
        String projectLocation = System.getProperty("user.dir");
        String inputFileAbsolutePath = projectLocation.concat(inputFileRelativePath);

        BookManagement.selectOptionFromMenu(inputFileAbsolutePath);
    }
}
