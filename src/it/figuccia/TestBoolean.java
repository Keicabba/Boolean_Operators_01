package it.figuccia;

public class TestBoolean {
    public static void main(String[] args) {
        System.out.println(2 <= 2 && !true); // false
        System.out.println(!false && 3 > 2); // true
        boolean t = false;
        boolean f = true;
        System.out.println(!(!t || f)); // false
        System.out.println(6 > 6 ^ !(true && true)); // false
    }
}
