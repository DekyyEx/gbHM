import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавление контактов в телефонную книгу
        addContact(phoneBook, "John", "1234567890");
        addContact(phoneBook, "Bob", "9876543210");
        addContact(phoneBook, "John", "5555555555");
        addContact(phoneBook, "Bob", "1111111111");
        addContact(phoneBook, "Alice", "2222222222");

        // Вывод телефонной книги, отсортированной по убыванию числа телефонов
        printPhoneBook(phoneBook);
    }

    static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    static void printPhoneBook(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        Collections.reverse(sortedEntries);

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers.size() + " phones");

            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }

            System.out.println();
        }
    }
}