public class UnariPrefixPostfix {

    public static void main(String[] args) {
        int number = 1;
        System.out.println(number++); //Varianta postfixata
        //mai intai evalueaza variabila si abia dupa aceea adauga 1 pt urmatoarea operatie ex:
        System.out.println(number);
        System.out.println(++number); //Vaianta prefixata
        // mai intai adauga 1 si dupa aceea evalueaza variabila si o afiseaza

        System.out.println(number--);//mai intai foloseste variabila in afisare apoi scade 1 ex:
        System.out.println(number);
        System.out.println(--number);// mai intai scade 1 si dupa aceea afiseaza
    }
}
