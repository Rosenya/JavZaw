package Cwiczenia.Kids;

import java.util.Comparator;

public class KidsComparatorByAge implements Comparator<Kid> {
    @Override
    public int compare(Kid o1, Kid o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
