package exercises.lab_14;

import java.io.*;
import java.util.*;

public class BookManagement {
    private static void printMenu() {
        System.out.println("======= Book Management Program (RCUD) =======\n" +
                "1. New book\n" +
                "2. Find a book (ISBN)\n" +
                "3. Update a book\n" +
                "4. Delete a book\n" +
                "5. Print the book list\n" +
                "0. Exit"
        );
    }

    public static void selectOptionFromMenu(String filePath) {
        boolean isContinuing = true;
        do {
            printMenu();
            System.out.println("=> Please select your option!");
            int userOption = inputANumber();

            switch (userOption) {
                case 1:
                    addNewBook(filePath);
                    break;
                case 2:
                    findABook(filePath);
                    break;
                case 3:
                    updateABook(filePath);
                    break;
                case 4:
                    deleteABook(filePath);
                    break;
                case 5:
                    printBookList(filePath);
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Please input a number from 0 to 5!!!");
                    break;
            }
        } while (isContinuing);
    }

    private static void printBookList(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException("The filePath can't be null!!");
        }

        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;

        try {
            fileInputStream = new FileInputStream(filePath);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String dataLine = bufferedReader.readLine();
            int order = 1;
            while (dataLine != null) {
                final int ISBN_INDEX = 0;
                final int TITLE_INDEX = 1;
                final int AUTHOR_INDEX = 2;
                final int YEAR_INDEX = 3;
                String[] bookData = dataLine.split(", ");
                String ISBN = bookData[ISBN_INDEX];
                String title = bookData[TITLE_INDEX];
                String author = bookData[AUTHOR_INDEX];
                int year = Integer.parseInt(bookData[YEAR_INDEX]);

                System.out.println("Book " + order + ": " + title + "\n" +
                        "\t" + "ISBN: " + ISBN + "\n" +
                        "\t" + "author: " + author + "\n" +
                        "\t" + "year: " + year + "\n");
                order++;
                dataLine = bufferedReader.readLine();
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new CustomFileNotFoundException(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading data file");
        }
    }

    private static void deleteABook(String filePath) {
        HashMap<String, String> oldBookList = convertDataIntoHashMap(filePath);

        System.out.println("Please input ISBN: ");
        String ISBN = inputAString();
        if (oldBookList.containsKey(ISBN)) {
            oldBookList.remove(ISBN);
            convertHashMapDataIntoDB(oldBookList, filePath);
        } else {
            System.out.println("The book is not existing!");
        }
    }

    private static void updateABook(String filePath) {
        HashMap<String, String> oldBookList = convertDataIntoHashMap(filePath);

        System.out.println("Please input ISBN: ");
        String ISBN = inputAString();
        if (oldBookList.containsKey(ISBN)) {
            System.out.println("Please input title: ");
            String title = inputAString();

            System.out.println("Please input author: ");
            String author = inputAString();

            System.out.println("Please input year: ");
            int year = inputANumber();

            String bookInfo = title + ", " + author + ", " + year;
            oldBookList.put(ISBN, bookInfo);
            convertHashMapDataIntoDB(oldBookList, filePath);
            System.out.println("The book is now updated with new content: Book {" +
                    ISBN + ", " + title + ", " + author + ", " + year + "}");
        } else {
            System.out.println("The book is not existing!");
        }
    }

    private static void findABook(String filePath) {
        HashMap<String, String> bookInHashMap = convertDataIntoHashMap(filePath);
        System.out.println("Please input ISBN: ");
        String ISBN = inputAString();

        if (bookInHashMap.containsKey(ISBN)) {
            System.out.println("The book found: " + "{" + ISBN + ", " + bookInHashMap.get(ISBN) + "}");
        } else {
            System.out.println("Book with ISBN <" + ISBN + "> is not found");
        }
    }

    private static void addNewBook(String filePath) {
        System.out.println("Please input ISBN: ");
        String ISBN = inputAString();

        System.out.println("Please input title: ");
        String title = inputAString();

        System.out.println("Please input author: ");
        String author = inputAString();

        System.out.println("Please input year: ");
        int year = inputANumber();

        addNewBookIntoDB(ISBN, title, author, year, filePath);

        System.out.println("The book is saved into DB with info: Book {" +
                ISBN + ", " + title + ", " + author + ", " + year + "}");

    }

    private static int inputANumber() {
        return new Scanner(System.in).nextInt();
    }

    private static String inputAString() {
        return new Scanner(System.in).nextLine();
    }

    private static HashMap<String, String> convertDataIntoHashMap(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException("The filePath can't be null!!");
        }

        HashMap<String, String> bookList = new HashMap<>();
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;

        try {
            fileInputStream = new FileInputStream(filePath);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                final int ISBN_INDEX = 0;
                final int TITLE_INDEX = 1;
                final int AUTHOR_INDEX = 2;
                final int YEAR_INDEX = 3;
                String[] bookData = dataLine.split(", ");
                String ISBN = bookData[ISBN_INDEX];
                String title = bookData[TITLE_INDEX];
                String author = bookData[AUTHOR_INDEX];
                int year = Integer.parseInt(bookData[YEAR_INDEX]);

                bookList.put(ISBN, title + ", " + author + ", " + year);
                dataLine = bufferedReader.readLine();
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new CustomFileNotFoundException(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading data file");
        }

        return bookList;
    }

    private static void addNewBookIntoDB(String ISBN, String title, String author, int year, String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException("The filePath can't be null!!");
        }

        HashMap<String, String> oldBookList = convertDataIntoHashMap(filePath);
        String bookInfo = title + ", " + author + ", " + year;
        oldBookList.put(ISBN, bookInfo);
        convertHashMapDataIntoDB(oldBookList, filePath);
    }

    private static void convertHashMapDataIntoDB(HashMap<String, String> oldBookList, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            Set<String> allKeys = oldBookList.keySet();
            for (String key : allKeys) {
                String dataLine = key + ", " + oldBookList.get(key);
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new CustomFileNotFoundException(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing data file");
        }
    }
}
