package Dziedziczenie;
import java.util.Random;

public class Window {

    //klasa to szablon do tworzenia obiektow
    //klasa posiada pola(stan obiektu) i funkcje (metody)
    //pola informuja nas o stanie obiektu
    private int size;
    private String company;

    public int getSize() {
        return size;
    }

    //metoda niestatyczna, zeby uzyc metody potrzebujemy obiektu
    //metody niestatyczne moga zmieniac stan obiektu
    //w przypadku obiektow immutable(niemutowalnych, niezmiennych) nie zachodzi zmiana stanu
    //czasem metoda poprostu nie zmienia stanu

    public void setSize(int size) {
        this.size = size;
    }

    public static int generateRandomWindowSize() {
        //metody statyczne nie zmieniaja stanu obiektu
        //metoda statyczna, zeby uzyc metody statycznej nie potrzebujemy instatncji obiektu
        //metody statyczne sa przymiote klasy/szablonu
        return new Random().nextInt();
    }

    public static void main(String[] args) {

        //kazdy obiekt tej klasy ma swoj stan, ma swoje wartosci pol size i company

        Window randomWindow = new Window();
        randomWindow.setSize(22); //metody zmieniaja stan obiektu

    }

}