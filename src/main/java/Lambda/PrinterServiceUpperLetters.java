public class PrinterServiceUpperLetters implements IPrintService {
    @Override
    public void printText(String text) {
        System.out.println(text.toUpperCase());
    }
}
