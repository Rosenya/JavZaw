package Cwiczenia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidList implements IKidRepo{
    List <Kid> kids = new ArrayList<>();

    @Override
    public void addKid(Kid kid) {
        kids.add(kid);
    }

    @Override
    public void showList() {
        System.out.println(kids);
    }

    @Override
    public void sortingByName() {
        Collections.sort(kids, new KidsComparatorByName());
    }

    @Override
    public void sortByAge() {
    Collections.sort(kids, new KidsComparatorByAge());
    }

    @Override
    public void sortByHeigth() {
    Collections.sort(kids);
    }

    @Override
    public void sortByShoeSize() {

    }
}
