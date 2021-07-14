package OOP;

import OOP.AddressExample.*;

public class Cohesion {
    public static void main(String[] args) {
        /**
         * Coincidental - > a lot of unrelated methods come together
         * example: utility classes
         * public String maskUrl()
         * public void setBankDao()
         *
         */

        /**
         * Logical -> In the real life unrelated but developer consider relational
         * void cutHair()
         * void cutTalk()
         */

        /**
         * Sequential -> in class level, each method output feeds another method input.
         * File fileFile()
         * ParseTree parse()
         * SyntaxFree doSemanticAnalysis()
         * IntermediateCode generateIntermediateCode();
         */

        /**
         * Functional -> solely, well designed, small and focused on responsibility.
         *
         */

        Address address=new Address();
        address.setCity(new City());
        address.setStreetNumber("1094");
        address.setProvince(new Province());
        address.setPostalCode(new PostalCode("07900"));
        address.setStreet(new Street());

    }
}
