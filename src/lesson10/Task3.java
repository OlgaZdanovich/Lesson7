package lesson10;
/* Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
 * Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {

        public static void main(String[] args) {
            // Расчет для LinkedList
            List<Integer> listLinked = new LinkedList<>();

            long start = System.currentTimeMillis();
            addElementList(listLinked);
            System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start));

            long startChoice = System.currentTimeMillis();
            choiceRandEl(listLinked);
            System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-startChoice));

            // Расчет для ArrayList
            ArrayList<Integer> listArr = new ArrayList<>();

            long startArr = System.currentTimeMillis();
            addElementList(listArr);
            System.out.println("Время работы для ArrayList (в милисекундах) = " + (System.currentTimeMillis()-startArr));

            long startChoiceArr = System.currentTimeMillis();
            choiceRandEl(listArr);
            System.out.println("Время работы для ArrayList (в милисекундах) = " + (System.currentTimeMillis()-startChoiceArr));
        }
        public static void choiceRandEl(List list) {
            Random rand = new Random();
            for (int i = 0; i < 100000; i++) {
                list.get((rand.nextInt(1000)*3));
            }
        }
        public static void addElementList(List list) {
            for (int i = 0; i < 1000000; i++) {
                list.add(i,i);
            }
    }
    }

