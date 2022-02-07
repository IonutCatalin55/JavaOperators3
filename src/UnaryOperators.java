// Operatori unari sunt operatorii care au un singur operand

public class UnaryOperators {
    public static void main(String[] args) {
        // Unary plus operator " + "
        int number  = +10;
        System.out.println("Valoarea variabilei este : " + number);
        //Cand refolosim variabile ex. " number " nu mai trebuie declarat tipul de data ex. " int "
        //Opertorul " - " unar
        number = -3;
        System.out.println("Valoarea variabilei este : " + number);

        number = -number;
        System.out.println("Valoarea variabilei este : " + number);

        //INCREMENTAREA = " ++ "
        number++; // Incrementez cu 1 valoarea variabilei number
        System.out.println("Valoarea variabilei cu incrementare este : " + number);

        // Operatorul de decrementare " -- "
        number--;// decrementez cu 1 valoarea variabilei mele
        System.out.println("Valoarea variabilei cu decrementare este : " + number);

        // Operatorul " not " - negare reprezentat prin " ! "
        boolean notOperator = true;
        notOperator = !notOperator;
        System.out.println("Valoarea variabilei este : " + notOperator);

    }
}
