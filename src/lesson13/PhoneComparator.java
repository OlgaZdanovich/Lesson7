package lesson13;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {

        if(o1.getPrice()> o2.getPrice())
            return 1;
        else if(o1.getPrice()< o2.getPrice())
            return -1;
        else
            return 0;
    }
}
