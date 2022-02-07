public class ConditionalOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // && = "si logic"
        // || = "sau logic "
        System.out.println("(a == 5) && (b == 7) = " + ((a == 5) && (b == 7))); //returneaza adevarat daca ambele valori sunt adevarate
        System.out.println("(a == 5) && (b == 10) = " + ((a == 5) && (b == 10)));

        System.out.println("(a == 5) || (b ==7) = " + ((a == 5) || (b ==7))); //returneaza adevarat daca cel putin una din conditii este adevarata
        System.out.println("(a == 5) || (b == 10) = " + ((a == 5) || (b == 10)));
        System.out.println("(a == 4) || (b == 9) = " + ((a == 4) || (b == 9)));
    }
}
