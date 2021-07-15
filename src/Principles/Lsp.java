package Principles;

public class Lsp {
    public static void main(String[] args) {
        /**
         *Liskov Substitution Principle
         * Functions thar user pointers or references to base classes must be able to use objects of derived classes
         * without knowing it.
         */

        doMyWork(new Lsp().new SubClass());
        doMyWork(new Lsp().new MySub());
    }

    interface GreatWork{
        void doWork();
    }

    class SubClass implements GreatWork{
        @Override
        public void doWork(){
            System.out.println("doing work");
        }
    }

    class MySub implements GreatWork{

        @Override
        public void doWork(){
            System.out.println("doing mySub work");
        }
    }

    static void doMyWork(GreatWork greatWork){
        greatWork.doWork();
    }
}
