import java.util.function.Predicate;

public class Predykat {

    public static void main(String[] args) {

        Predicate<String> stringPredicate;
        Predicate<String> stringPredicate2;
        Predicate<String> stringPredicate3;

//        @FunctionalInterface
//        public interface Predicate<T> {
//             * Evaluates this predicate on the given argument.
//             *
//             * @param t the input argument
//             * @return {@code true} if the input argument matches the predicate,
//             * otherwise {@code false}
//             */
//            boolean test(T t); TU JEST IMPLEMENTOWA METODA
        //argumentem jest tym przypadku String, czyli word reprezentuje String
        //metoda test zwraca typ boolean i to tez musi zwracac lambda

        stringPredicate = word -> true;
        stringPredicate2 = word -> word.isEmpty();
        stringPredicate3 = word -> word.contains("rambo");

        System.out.println(stringPredicate.test("zawsze zwroci true"));
        System.out.println(stringPredicate2.test("zwroci false, bo zwraca true, tylko dla empty argument"));
        System.out.println(stringPredicate3.test("ramboooo"));


    }
}
