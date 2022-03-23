import java.util.function.Consumer;

public class LambdaConsumer {

    public static void main(String[] args) {

        Consumer<String> stringConsumer;
//        @FunctionalInterface
//        public interface Consumer<T> {
//             * Performs this operation on the given argument.
//             *
//             * @param t the input argument
//             */
//            void accept(T t); IMPLEMENTUJEMY TE METODE
        //T zastepujemy Stringiem czyli argumentem lambdy bedzie String

        stringConsumer = x -> System.out.print(x);
        stringConsumer = (String x) -> System.out.print(x.toUpperCase());

        //tym razem nie wywolujemy metody interfejsu funkcyjnego przy nawiasie metody System.out.print
        //poniewaz metoda tego interfejsu nic nie zwraca

        //metoda interfejsu funkcyjnego
        stringConsumer.accept("psikus");


    }

}
