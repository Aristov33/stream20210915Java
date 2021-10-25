package HW4;
import java.io.IOException;
import java.util.*;
public class Homework4 {
        static final String FILE_NAME1 = "C://JAVA/Java2Lesson4Homework4.txt";
        static final String FILE_NAME2 = "Java2Lesson4Homework4.txt";
        public static void main(String[] args) {
            List<String> wordArray = new ArrayList<String>();
            wordArray = OperationArray.fillTheArray(wordArray);
            System.out.println(wordArray + "\n");
            OperationArray.printUniqueWords(wordArray);
            wordArray.clear();
            try {
                wordArray = OperationArray.fillTheArrayFromFile(wordArray, FILE_NAME2);
            } catch (IOException e) {
                System.out.println("Failed to fill array from file!\n");
            }
            try {
                wordArray = OperationArray.fillTheArrayFromFile(wordArray, FILE_NAME1);
            } catch (IOException e) {
                System.out.println("Failed to fill array from file!\n");
            }
            System.out.println(wordArray + "\n");
            OperationArray.printUniqueWords(wordArray);
            // second homework item
            Phonebook phonebook = new Phonebook();

            phonebook.add(1234567, "Ivanov");
            phonebook.add(5678456, "Ivanov");
            phonebook.add(1478300, "Petrov");
            phonebook.add(1458423, "Petrov");
            phonebook.add(1234859, "Sidorov");
            phonebook.add(6475893, "Kuzmin");
            phonebook.get("Ivanov");
            phonebook.get("Petrov");
            phonebook.get("Sidorov");
            phonebook.get("Amirjan");
        }
}
