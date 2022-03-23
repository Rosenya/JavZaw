public class WhyNotUseDoubleForMoney {

    public static void main(String[] args) {

//        int result = 9 / 0; //bedzie blad przy dzieleniu przez zero
        double resultt = 4d / 0d; //przy typach zmiennoprzecinkowych mozemy dzielic przez 0 i dostaniemy jako rezultat Infinity
        System.out.println(resultt);

        //na co dzien uzywamy do liczenia systemu dziesietnego
        //komputer uzywa systemu binarnego 0 1
        //do wartosci pienieznych uzywamy np BigDecimal
        System.out.println(1.03 - 0.42);
    }

}
