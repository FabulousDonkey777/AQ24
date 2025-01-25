import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] words = {"book", "fig", "pen", "range", "book", "grape", "pen", "fruit",
                "fig", "range", "fruit", "grape", "zeal", "fake", "zeal",
                "range", "book", "grape", "apple", "zeal"};

        Counter wordCounter = new Counter(words);
        Map<String, Integer> wordCount = wordCounter.countWords();

        System.out.println("Уникальные слова и их частота:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-456-789");
        phoneBook.add("Petrov", "987-654-321");
        phoneBook.add("Sidorov", "555-555-555");
        phoneBook.add("Ivanov", "624-245-005");
        phoneBook.add("Fedorov", "993-352-535");
        phoneBook.add("Valiev", "535-545-999");
        phoneBook.add("Petrov", "524-245-888");
        phoneBook.add("Fedorov", "001-424-577");

        System.out.println();
        System.out.println();
        System.out.println("Ivanov's phone numbers: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov's phone numbers: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov's phone numbers: " + phoneBook.get("Sidorov"));
        System.out.println("Valiev's phone numbers: " + phoneBook.get("Valiev"));
        System.out.println("Fedorov's phone numbers: "+ phoneBook.get("Fedorov"));

    }
}