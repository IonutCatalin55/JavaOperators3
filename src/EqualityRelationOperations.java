public class EqualityRelationOperations {

    public static void main(String[] args) {

        // == operator care verifica egalitatea
        int a = 5;
        int b = 7;
        System.out.println(a == b); //operator de egalitate
        System.out.println(a <= b); // mai mic sau egal
        System.out.println(a < b); // mai mic
        System.out.println(a >= b); //mai mare sau egal
        System.out.println(a > b); // mai mare
        System.out.println( " Nu este egal : " + (a != b)); //peratorul "nu este egal" notat cu " != "
        System.out.println((a > b) ? true : false);
    }
}
