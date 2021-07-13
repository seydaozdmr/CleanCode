package Basics;

import java.io.File;

public class Naming {
    public static void main(String[] args) {
        /**
         * In clean code; names will be clean.
         * Use english names,
         * Write understandable abbreviation,
         *
         */
        int nofInst;
        int numberOfInstances;

        /**
         * in loops we use i,j,k in local variables.
         *
         */
        for(int i=0;i<10;i++){
            int k=i+1;
            System.out.println(k);
        }
        /**
         * Use descriptive names
         */

        File fileToReadFromClientToConfigureServer;


        /**
         * Use abstract and inclusive names.
         * don't use int hour;
         * use :
         * int timeToCook
         *
         * don't use int calculateKm(City c1,City c2)
         * use int calculateDistanceBetween(City from,City to)
         */

        /**
         * Don't use generic names
         * class Util{}
         * void process() {}
         *
         * use class DateUtil{}
         * void processDailyEarningReportRequest()
         */

        /**
         * Example
         * class -> StudentRegistration
         * about all process Student Registration
         *
         * method -> startStudentRegistration()
         * registerStudent()
         *
         * variable -> studentRegistered
         * studentRegistration
         *
         * constant -> STUDENT_REGISTRATION_PRICE
         *
         */

        /**
         * Use same name about transactions
         * fetchStudent()
         * getStudent()
         * retrieveAllStudents()
         *
         * don't use different names about transactions
         *
         * also don't use
         * cost
         * total
         * price
         * if means same data.
         */

        /**
         * Never use English and Turkish names together.
         */

        /**
         * Use enums for type safety
         */

        /**
         * use common names
         * findById()
         * findByName()
         * findByDateBetween()
         *
         * save(User user)
         * updateAllFirstNames(String firstName)
         */

        /**
         * Don't use meaningless abbreviation
         * double rs=a+ ++b * c/a *b ;
         * what is rs?
         *  you can use
         *  double resultOfTaxPrice;
         *
         */



    }
}
