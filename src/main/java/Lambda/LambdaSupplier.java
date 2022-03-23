import java.time.LocalDate;
import java.util.function.Supplier;

public class LambdaSupplier {

    public static void main(String[] args) {

        //interface funkcyjny
        Supplier<String> supplier;

//        @FunctionalInterface
//        public interface Supplier<T> {
//            /**
//             * Gets a result.
//             *
//             * @return a result
//             */
//            T get(); UWAGA TE METODE IMPLEMENTUJEMY!!! ARGUMENTY W NAWIASIE
//        }

        //1 skopiuj argumenty
        //2 postaw znaczek lambda ->
        //3 dodaj implementacje
        supplier = () -> "Hello! lambda";
        supplier = () -> LocalDate.now().toString();


        Supplier<String> anotherSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello Klasa anonimowa";
            }
        };

        System.out.println(supplier.get());


    }


}
