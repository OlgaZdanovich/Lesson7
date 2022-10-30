package lesson13;

import java.util.ArrayList;
import java.util.List;
/*
Написать класс, у которого метод принимает лямбду,  создать ArrayList типизированным этим классом,
и преобразовать данные:Класс телефон. Принимает лямбду, которая считает актуальную цену.
В классе телефон есть поле цена. Лямбда использует эту цену, и в зависимости от сезона
 возвращает увеличенную или уменьшенную цену. Таким образом, передавая лямбду, можно изменять
 цену как на процент от текущего значения, так и на число.Используя стрим апи, отсротировать
 коллекцию телефонов по поле цена, не учитывая скидку. Также вывести результат отсортированной
 коллекции с учетом скидки.
 (Подсказка, для сортировки с учетом скидки лучше написать свой компаратор)
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>(List.of(new Phone(1700.0, "NewSung S20"),
                                                          new Phone(900.0, "NewApp S12 Pro" ),
                                                          new Phone(2100.0, "NewNok SA209")));
        System.out.printf("----------------------------------------------------\n");
        System.out.println("Sorted price without discount");
        phones.stream().sorted(new PhoneComparator()).forEach(p ->
                System.out.printf("Model: %s - price: %f\n", p.getName(), p.getPrice()));
        System.out.printf("----------------------------------------------------\n");
        System.out.println();
        System.out.println("Sorted price with discount");
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.printf("winter" +
                " price: %s - %f$\n", p.getName(), p.calcSeasonPrice("winter")));
        System.out.printf("----------------------------------------------------\n");
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.printf("summer" +
                " price: %s - %f$\n", p.getName(), p.calcSeasonPrice("summer")));
        System.out.printf("----------------------------------------------------\n");
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.printf("autumn" +
                " price: %s - %f$\n", p.getName(), p.calcSeasonPrice("autumn")));
        System.out.printf("----------------------------------------------------\n");
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.printf("spring" +
                " price: %s - %f$\n", p.getName(), p.calcSeasonPrice("spring")));

    }
}
