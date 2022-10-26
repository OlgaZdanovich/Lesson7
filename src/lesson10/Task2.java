package lesson10;
/*
 * Для заданного текста (как ArrayList) `text`  построить множество встречающихся в нем слов (множество - это набор уникальных элементов)
 */
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> text = new ArrayList<>(
                List.of("Geeks",
                        "for",
                        "Geeks",
                        "for",
                        "for",
                        "for",
                        "Geeks",
                        "Name"
                        ));

        HashSet<String > words = new HashSet<>();
        for(  String r  : text) {
            if ( ! words.contains(r)   ) {
                words.add(r);
            }

        }
        for(String word: words) {
            System.out.printf("Word: %s %n",word);
        }

    }
}
