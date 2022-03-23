package Kolekcje.Lista;

public class RepoApp {

    public static void main(String[] args) {

        NamesRepository repository = new NamesRepoImpl();
        Menu menu = new Menu();
        menu.runMenu(repository);

    }

}
