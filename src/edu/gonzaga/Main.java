package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);

        System.out.println("Imporant improvement 1");
        System.out.println("Important improvement 2");
        Ststem.out.println("Last improvement");
        System.out.println("App finished.");
    }
}