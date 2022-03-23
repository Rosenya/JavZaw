public class ComparePOC {

    public static void main(String[] args) {

        String adam = "Adam";
        String zygmunt = "Zygmunt";
        String franek = "Franek";

        System.out.println(adam.compareTo(zygmunt)); //Adam ma byc pierwszy metoda zwraca wartosc ujemna
        System.out.println(zygmunt.compareTo(adam)); //Zygmunt ma byc za Adamem przy porwnaniu zwraca wartosc dodatnia
        System.out.println(adam.compareTo(adam)); //takie same Stringi przy porownaniu daja 0

    }

}
