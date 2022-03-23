package Cwiczenia.Kids;

import java.util.Comparator;

public class KidsComparatorByName implements Comparator<Kid> {
    @Override
    public int compare(Kid o1, Kid o2) {

        return  o1.getName().compareTo(o2.getName());
    }
}
