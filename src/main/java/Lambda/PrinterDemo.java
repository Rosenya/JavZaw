public class PrinterDemo {

    public static void main(String[] args) {

        IPrintService printService = new PrinterServiceUpperLetters();
        printService.printText("pozdrowienia z kodu");

        //klasa anonimowa
        IPrintService anotherPrinterToLowerCase = new IPrintService() {
            @Override
            public void printText(String text) {
                System.out.println(text.toLowerCase());
            }
        };

        anotherPrinterToLowerCase.printText("HEHEHEH");


//        @FunctionalInterface
//        public interface IPrintService {
//            void printText(String text);
        IPrintService lambdaPrinter = text -> System.out.println(text.toUpperCase());
        lambdaPrinter.printText("heheszki");
    }

}
