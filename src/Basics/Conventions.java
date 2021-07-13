package Basics;

public class Conventions {
    private static final double VALUE_ADDED_TAX_RATIO = 0.18;

    public static void main(String[] args) {
        /**
         * Use camelCase or CamelCase
         * snake_case
         *
         */

        /**
         * Your codes should fit xml,web service ,db naming conventions.
         */

        /**
         * Write documentation your codes.
         *
         */
        double p=0;
        double tp= p *1.18; //Multiply price with 1.18

        double tp1=p * 1.18; //0.18 is the ratio of tax

        double price=0;
        double tp2=price * (1+VALUE_ADDED_TAX_RATIO); //great code


    }
}
