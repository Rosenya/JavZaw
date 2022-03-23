
@FunctionalInterface //adnotacja interface funkcyjny - interface z jedna metoda
//adnotacja @FunctionalInterface nie jest obligatoryjna
//ilosc metod decyduje o tym, czy interface jest funkcyjny
//adnotacja powoduje, ze w trakcie kompilacja java sprawdzy ilosc metod
public interface IPrintService {

    void printText(String text);

}
