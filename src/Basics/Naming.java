package Basics;

import java.io.File;

public class Naming {
    public static void main(String[] args) {
        /**
         * In clean code; names will be clean.
         * Use english names,
         * Write understandable abbreviation,
         *It is easy to say that names should reveal intent. What we want to impress upon you is that
         * we are serious about this. Choosing good names takes time but saves more than it takes.
         * So take care with your names and change them when you find better ones. Everyone who
         * reads your code (including you) will be happier if you do.
         */
        int nofInst;
        int numberOfInstances;

        /**
         * Kodun ilk hali
         * public List<int[]> getThem() {
         * List<int[]> list1 = new ArrayList<int[]>();
         * for (int[] x : theList)
         * if (x[0] == 4)
         * list1.add(x);
         * return list1;
         * }
         *
         *
         * public List<int[]> getFlaggedCells() {
         * List<int[]> flaggedCells = new ArrayList<int[]>();
         * for (int[] cell : gameBoard)
         * if (cell[STATUS_VALUE] == FLAGGED)
         * flaggedCells.add(cell);
         * return flaggedCells;
         * }
         * Notice that the simplicity of the code has not changed. It still has exactly the same number
         * of operators and constants, with exactly the same number of nesting levels. But the code
         * has become much more explicit.
         * We can go further and write a simple class for cells instead of using an array of ints.
         * It can include an intention-revealing function (call it isFlagged) to hide the magic numbers.
         * It results in a new version of the function:
         *
         * public List<Cell> getFlaggedCells() {
         * List<Cell> flaggedCells = new ArrayList<Cell>();
         * for (Cell cell : gameBoard)
         * if (cell.isFlagged())
         * flaggedCells.add(cell);
         * return flaggedCells;
         * }
         */

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
         * Make Meaningful
         * Distinctions
         * Number-series naming (a1, a2, .. aN) is the opposite of intentional naming. Such
         * names are not disinformative—they are noninformative; they provide no clue to the
         * author’s intention. Consider:
         * public static void copyChars(char a1[], char a2[]) {
         * for (int i = 0; i < a1.length; i++) {
         * a2[i] = a1[i];
         * }
         * }
         * This function reads much better when source and destination are used for the argument
         * names.
         */

        File fileToReadFromClientToConfigureServer;

        /**
         * Do not refer to a grouping of accounts as an accountList unless it’s actually a List.
         * The word list means something specific to programmers. If the container holding the
         * accounts is not actually a List, it may lead to false conclusions.1 So accountGroup or
         * bunchOfAccounts or just plain accounts would be better.
         */

        /**
         *  Use Pronounceable Names
         * Humans are good at words. A significant part of our brains is dedicated to the concept of
         * words. And words are, by definition, pronounceable.
         * A company I know has genymdhms (generation date, year, month, day, hour, minute,
         * and second) so they walked around saying “gen why emm dee aich emm ess”. I have an
         * annoying habit of pronouncing everything as written, so I started saying “gen-yah-muddahims.”


         /**
         *Use Searchable Names
         * Single-letter names and numeric constants have a particular problem in that they are not
         * easy to locate across a body of text.
         * [N5]. If a variable or constant might be seen or used in multiple places in a body of code,
         * it is imperative to give it a search-friendly name. Once again compare
         * for (int j=0; j<34; j++) {
         * s += (t[j]*4)/5;
         * }
         * to
         * int realDaysPerIdealDay = 4;
         * const int WORK_DAYS_PER_WEEK = 5;
         * int sum = 0;
         * for (int j=0; j < NUMBER_OF_TASKS; j++) {
         * int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
         * int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
         * sum += realTaskWeeks;
         * }
         * Note that sum, above, is not a particularly useful name but at least is searchable.
         */

        /**
         *
         */

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
