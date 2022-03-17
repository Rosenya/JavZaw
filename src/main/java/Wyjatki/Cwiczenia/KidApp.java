package Wyjatki.Cwiczenia;

public class KidApp {
    public static void main(String[] args) {

        Kid kasia = new Kid("kasia", 12, 155, 35);
        Kid basia = new Kid("basia", 11, 138, 33);
        Kid pawel = new Kid("pawel", 9, 140, 28);

        IKidRepo repo = new KidList();
        repo.addKid(kasia);
        repo.addKid(basia);
        repo.addKid(pawel);
        repo.showList();
        repo.sortByHeigth();
        repo.showList();
      //  repo.sortByAge();
       // repo.showList();
    }
}