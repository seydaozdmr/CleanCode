package Principles;

public class Srp {
    public static void main(String[] args) {
        /**
         * Single responsibility principle
         */

        int a=5;
        int b=10;
        int c =49;
        double w = a + ++b * c/a * b;
        //in this case we have to use method
        calculateW(a,b,c);

    }
    static double calculateW(int a, int b, int c){
        b++;
        double w = a + b * b * c / a;
        return w;
    }

    /**
     * DRY - > Don't repeat yourself
     */

    /**
     * Methods - >
     * constructor
     * set/get (validation)
     * toString , hashcode,
     * coordinative methods -> manage process
     * runs more than one atomic method and coordinate process.
     */
}
