package lesson10;
import java.util.*;

/*
 Найти в заданном списке (ArrayList) повторяющиеся элементы и вернуть
 ассоциативный массив с информацией о числе повторений
 для каждого повторяющегося элемента.
 Если элемент встречается только один раз, включать его в результат
 не следует.
 */
public class Task1 {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3, 5, 8, 31,31,31,
                    21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765));

            Map<Integer ,Integer> map = new HashMap<>();

            for(  Integer r  : list) {
                if(  map.containsKey(r)   ) {
                    map.put(r, map.get(r) + 1);
                }
                else {
                    map.put(r, 1);
                }
            }

            Iterator<Integer> it = map.keySet().iterator();
            while(it.hasNext()) {
                Integer key = it.next();
                Object val = map.get(key);
                if (val.equals(1)) {
                    it.remove();
                }
            }

            System.out.println(map);
        }

}
