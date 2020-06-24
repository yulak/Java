package HW_2_3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String[] words = new String[]{"hello", "hi", "apple", "java", "home", "good", "orange", "jump", "hello", "hello", "home", "good", "orange", "jump"};
        HashMap<String, Integer> word = new HashMap<>();
        for (String x : words) {
            word.put(x, word.getOrDefault(x,0)+1);
        }
        System.out.println(word);

        PhoneBook book = new PhoneBook();
        book.add("Ласточкин", "11111");
        book.add("Синицин", "22222");
        book.add("Голубев", "33333");
        book.add("Коршунов", "44444");
        book.add("Орел", "55555");
        book.add("Чайкин", "66666");
        book.add("Ласточкин", "77777");
        book.add("Синицин", "88888");

        System.out.println("Телефон: "+book.get("Синицин"));

    }
}
